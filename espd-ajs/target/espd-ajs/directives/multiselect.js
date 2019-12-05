angular.module('ui.multiselect', [])

//from bootstrap-ui typeahead parser
  .factory('optionParser', ['$parse', function ($parse) {

    //                      00000111000000000000022200000000000000003333333333333330000000000044000
    var TYPEAHEAD_REGEXP = /^\s*(.*?)(?:\s+as\s+(.*?))?\s+for\s+(?:([\$\w][\$\w\d]*))\s+in\s+(.*)$/;

    return {
      parse: function (input) {

        var match = input.match(TYPEAHEAD_REGEXP), modelMapper, viewMapper, source;
        if (!match) {
          throw new Error(
            "Expected typeahead specification in form of '_modelValue_ (as _label_)? for _item_ in _collection_'" +
            " but got '" + input + "'.");
        }

        return {
          itemName: match[3],
          source: $parse(match[4]),
          viewMapper: $parse(match[2] || match[1]),
          modelMapper: $parse(match[1])
        };
      }
    };
  }])

  .directive('multiselect', ['$parse', '$document', '$compile', 'optionParser',

    function ($parse, $document, $compile, optionParser) {
      return {
        restrict: 'E',
        require: 'ngModel',
        link: function (originalScope, element, attrs, modelCtrl) {
          var originalScope = originalScope;
          originalScope.cardinality = attrs.cardinality;
          var exp = attrs.options,
            parsedResult = optionParser.parse(exp),
            isMultiple = attrs.multiple == "true" ? true : false,
            required = false,
            scope = originalScope.$new(),
            changeHandler = attrs.change || anguler.noop;

          scope.items = [];
          scope.header = attrs.customplaceholder;
          scope.multiple = isMultiple;
          scope.disabled = false;

          originalScope.$on('$destroy', function () {
            scope.$destroy();
          });

          var popUpEl = angular.element('<multiselect-popup></multiselect-popup>');

          //required validator
          // if (attrs.required || attrs.ngRequired) {
          //     required = scope.valid();
          // }
          attrs.$observe('required', function (newVal) {
            required = newVal;
          });

          // watch disabled state
          scope.$watch(function () {
            if (attrs.disabled) {
              element[0].classList.add('espd-pointerNoEvents');
            }
            else if (!attrs.disabled) {
              element[0].classList.remove('espd-pointerNoEvents');
            }
          }, function (newVal) {
            scope.disabled = newVal;
          });


          //watch single/multiple state for dynamically change single to multiple
          scope.$watch(function () {
            return $parse(attrs.multiple)(originalScope);
          }, function (newVal) {
            isMultiple = newVal || false;
          });

          //watch option changes for options that are populated dynamically
          scope.$watch(function () {
            return parsedResult.source(originalScope);
          }, function (newVal) {
            if (angular.isDefined(newVal))
              parseModel();
          });

          //watch model change
          scope.$watch(function () {
            return modelCtrl.$modelValue;
          }, function (newVal, oldVal) {
            //when directive initialize, newVal usually undefined. Also, if model value already set in the controller
            //for preselected list then we need to mark checked in our scope item. But we don't want to do this every time
            //model changes. We need to do this only if it is done outside directive scope, from controller, for example.
            if (angular.isDefined(newVal)) {
              markChecked(newVal);
              scope.$eval(changeHandler);
              // getHeaderText(originalScope);
              modelCtrl.$setValidity('required', scope.valid());
            }
          }, true);

          originalScope.$watch('tryNextValidity', function (oldValue, newValue) {
            modelCtrl.$setValidity('required', scope.valid());
          });

          //watch for translation
          originalScope.$watch('variablesTranslate', function (oldValue, newValue) {
            if (modelCtrl.$modelValue != undefined && modelCtrl.$modelValue.length > 0) {
              scope.header = attrs.customplaceholder + ': ' + modelCtrl.$modelValue.length + ' ' + originalScope.variablesTranslate.selectedOption;
            }
            scope.checkAll = originalScope.variablesTranslate.critCheckAll;
            scope.uncheckAll = originalScope.variablesTranslate.critUncheckAll;
            scope.filter = originalScope.variablesTranslate.crit_filter;
            getHeaderText(originalScope);
          })

          function parseModel() {
            scope.items.length = 0;
            var model = parsedResult.source(originalScope);
            for (var i = 0; i < model.length; i++) {
              var local = {};
              local[parsedResult.itemName] = model[i];
              if (model.length != 0) {
                scope.items.push({
                  label: parsedResult.viewMapper(local),
                  model: model[i],
                  checked: false
                });
              }
            }
          }

          parseModel();

          element.append($compile(popUpEl)(scope));

          function getHeaderText(originalScope) {
            if (!modelCtrl.$modelValue || !modelCtrl.$modelValue.length) {
              scope.header = attrs.customplaceholder;
              scope.checkAll = originalScope.variablesTranslate.critCheckAll;
              scope.uncheckAll = originalScope.variablesTranslate.critUncheckAll;
              scope.filter = originalScope.variablesTranslate.crit_filter;
            }
            if (isMultiple) {
              if (modelCtrl.$modelValue != undefined) {
                scope.header = attrs.customplaceholder + ': ' + modelCtrl.$modelValue.length + ' ' + originalScope.variablesTranslate.selectedOption;
              }
              else {
                scope.header = attrs.customplaceholder;
              }
              scope.checkAll = originalScope.variablesTranslate.critCheckAll;
              scope.uncheckAll = originalScope.variablesTranslate.critUncheckAll;
              scope.filter = originalScope.variablesTranslate.crit_filter;
            } else {
              if (modelCtrl.$modelValue != undefined) {
                if (angular.isArray(modelCtrl.$modelValue)) {
                  if (attrs.typelist == 'LOTS') {
                    if (attrs.role == 'ca') {
                      scope.header = modelCtrl.$modelValue[0].expectedIDModel.expectedID;
                    }else{
                      scope.header = modelCtrl.$modelValue[0].responseIdModel.responseId;
                    }
                  }
                  else if (attrs.typelist == 'CPVS' && modelCtrl.$modelValue.length>0) {
                    if (attrs.role == 'ca') {
                      scope.header = modelCtrl.$modelValue[0].expectedCodeModel.expectedCode;
                    }
                    else {
                      scope.header = modelCtrl.$modelValue[0].responseCodeModel.responseCode;
                    }
                  }
                  
                } else {
                  if (attrs.typelist == 'LOTS') {
                    if (attrs.role == 'ca') {
                      scope.header = modelCtrl.$modelValue.expectedIDModel.expectedID;
                    }else{
                      scope.header = modelCtrl.$modelValue.responseIdModel.responseId;
                    }
                  }
                  else if (attrs.typelist == 'CPVS') {
                    if (attrs.role == 'ca') {
                      scope.header = modelCtrl.$modelValue.expectedCodeModel.expectedCode;
                    }
                    else {
                      scope.header = modelCtrl.$modelValue.responseCodeModel.responseCode;
                    }
                  }
                }
              }
            }
          }

          scope.valid = function validModel() {
            if (!required) return true;
            var value = modelCtrl.$modelValue;
            var searchBox = element.find('input')[0];
            if (originalScope.tryNextValidity && originalScope.criterionSelection[attrs.ngRequired]) {
              if ((angular.isArray(value) && value.length > 0) || (!angular.isArray(value) && value != null && value != "")) {
                element[0].classList.add('ng-valid');
                element[0].classList.add('ng-valid-required');
                element[0].classList.remove('ng-invalid');
                element[0].classList.remove('ng-invalid-required');
                return true;
              }
              else {
                element[0].classList.remove('ng-valid');
                element[0].classList.remove('ng-valid-required');
                element[0].classList.add('ng-invalid');
                element[0].classList.add('ng-invalid-required');
                return false;
              }
            }
            else {
              element[0].classList.add('ng-valid');
              element[0].classList.add('ng-valid-required');
              element[0].classList.remove('ng-invalid');
              element[0].classList.remove('ng-invalid-required');
              return true;
            }
          };

          function selectSingle(item) {
            if (item.checked) {
              scope.uncheckAllValues();
            } else {
              scope.uncheckAllValues();
              item.checked = !item.checked;
            }
            setModelValue(false);
            getHeaderText(originalScope);
          }

          function selectMultiple(item) {
            item.checked = !item.checked;
            setModelValue(true);
          }

          function setModelValue(isMultiple) {
            var value;

            if (isMultiple) {
              value = [];
              angular.forEach(scope.items, function (item) {
                if (item.checked) value.push(item.model);
              })
            } else {
              angular.forEach(scope.items, function (item) {
                if (item.checked) {
                  value = item.model;
                  return false;
                }
              })
            }
            modelCtrl.$setViewValue(value);
          }

          function markChecked(newVal) {
            if (!angular.isArray(newVal)) {
              angular.forEach(scope.items, function (item) {
                if (angular.equals(item.model, newVal)) {
                  item.checked = true;
                  return false;
                }
              });
            } else {
              angular.forEach(newVal, function (i) {
                angular.forEach(scope.items, function (item) {
                  if (originalScope.startVariables.userRole == 'ca') {
                    switch (attrs.typelist) {
                      case 'CPVS':
                        if (angular.equals(item.model.expectedCodeModel.expectedCode, i.expectedCodeModel.expectedCode) && item.model.expectedCodeModel.expectedCode != "") {
                          item.checked = true;
                        }
                        break;
                      case 'LOTS':
                        if (angular.equals(item.model.expectedIDModel.expectedID, i.expectedIDModel.expectedID) && item.model.expectedIDModel.expectedID != "") {
                          item.checked = true;
                        }
                        break;
                      default:
                        if (angular.equals(item.model, i)) {
                          item.checked = true;
                        }
                    }
                  }
                  else if (originalScope.startVariables.userRole == 'eo') {
                    switch (attrs.typelist) {
                      case 'CPVS':
                        if (angular.equals(item.model.responseCodeModel.responseCode, i.responseCodeModel.responseCode) && item.model.responseCodeModel.responseCode != "") {
                          item.checked = true;
                        }
                        break;
                      case 'LOTS':
                        if (angular.equals(item.model.responseIdModel.responseId, i.responseIdModel.responseId) && item.model.responseIdModel.responseId != "") {
                          item.checked = true;
                        }
                        break;
                      default:
                        if (angular.equals(item.model, i)) {
                          item.checked = true;
                        }
                    }
                  }

                });
              });
              getHeaderText(originalScope);
            }
          }

          scope.checkAllValues = function () {
            if (!isMultiple) return;
            angular.forEach(scope.items, function (item) {
              item.checked = true;
            });
            setModelValue(true);
          };

          scope.uncheckAllValues = function () {
            angular.forEach(scope.items, function (item) {
              item.checked = false;
            });
            setModelValue(true);
          };

          scope.select = function (item) {
            if (isMultiple === false) {
              selectSingle(item);
              scope.toggleSelect();
            } else {
              selectMultiple(item);
            }
          }
        }
      };
    }])

  .directive('multiselectPopup', ['$document', function ($document) {
    return {
      restrict: 'E',
      scope: false,
      replace: true,
      templateUrl: './views/multiselectTemplate/multiselect.temp.html',
      link: function (scope, element, attrs) {

        scope.isVisible = false;

        scope.toggleSelect = function () {
          if (element.hasClass('open')) {
            element.removeClass('open');
            $document.unbind('click', clickHandler);
          } else {
            element.addClass('open');
            scope.focus();
            $document.bind('click', clickHandler);
          }
        };

        function clickHandler(event) {
          if (elementMatchesAnyInArray(event.target, element.find(event.target.tagName)))
            return;
          element.removeClass('open');
          $document.unbind('click', clickHandler);
          scope.$digest();
        }

        scope.focus = function focus() {
          var searchBox = element.find('input')[0];
          searchBox.focus();
        }

        var elementMatchesAnyInArray = function (element, elementArray) {
          for (var i = 0; i < elementArray.length; i++)
            if (element == elementArray[i])
              return true;
          return false;
        }
      }
    }
  }]);