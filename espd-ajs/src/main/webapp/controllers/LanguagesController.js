angular.module('espdApp').controller('LanguagesController',['$scope','MainService','$state',function ($scope,MainService,$state) {

    const getLanguageList = function () {
        MainService.languageList()
            .then(function (response) {
                $scope.languages = response.data.payload;
            })
    }

    getLanguageList();
    MainService.setJsonStart({});

    $scope.redirectToStart = function(){
        $state.go('home.start');
    };
    // $scope.$emit('showLoading');
    // angular.element(document).ready(function () {
    //     $scope.$emit('hideLoading');
    // });
}]);
