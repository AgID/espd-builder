angular.module('espdApp').directive(
    'dateInput',
    function (dateFilter) {
        return {
            require: 'ngModel',
            scope: {
                ngModel: '='
            },
            link: function (scope, elem, attr, modelCtrl) {

                function updateView(value) {
                    modelCtrl.$viewValue = value;
                    modelCtrl.$render();
                }

                function updateModel(value) {
                    modelCtrl.$modelValue = value;
                    scope.ngModel = value; // overwrites ngModel value
                }

                modelCtrl.$formatters.push(function (modelValue) {
                    if (modelValue != null) {
                        var date = new Date(moment(modelValue).toDate());
                        var value = new Date(new moment(new Date(date.getTime())));
                        updateModel(value);
                        return value;
                    }
                    else {
                        return null;
                    }
                })
            }
        }
    });
