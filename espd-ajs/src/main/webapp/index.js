angular.module('espdApp', ['ui.router','ui.mask','ui.multiselect','angular-uuid'])

    .config(function ($stateProvider, $urlRouterProvider) {

        // UI-ROUTER ROUTES
        $urlRouterProvider.otherwise('/start');

        $stateProvider
            .state('home', {
                url: '',
                abstract: true
            })
            // .state('home.languages', {
            //     url: '/languages',
            //     controller: 'LanguagesController',
            //     templateUrl: 'views/languagesSelection.html',
            // })
            .state('home.start', {
                url: '/start',
                controller: 'StartController',
                templateUrl: 'views/start.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(1)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(1);
                    }
                }
            })
            .state('home.procedure', {
                url: '/procedure',
                controller: 'ProcedureController',
                templateUrl: 'views/procedure.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(2)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(2);
                    }
                }
            })
            .state('home.exclusion', {
                url: '/exclusion',
                controller: 'ExclusionController',
                templateUrl: 'views/exclusion.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(3)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(3);
                    }
                }
            })
            .state('home.selection', {
                url: '/selection',
                controller: 'SelectionController',
                templateUrl: 'views/selection.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(4)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(4);
                    }
                }
            })
            .state('home.conclusion', {
                url: '/conclusion',
                controller: 'ConclusionController',
                templateUrl: 'views/conclusion.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(5)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(5);
                    }
                }
            })
            .state('home.overview', {
                url: '/overview',
                controller: 'OverviewController',
                templateUrl: 'views/overview.html',
                resolve: {
                    setIndex: function (MainService) {
                        MainService.setCountProgress(5)
                    },
                    setMaxIndex:function (MainService) {
                        MainService.setMaxActiveCountProgress(5);
                    }
                }
            })
    })
    .run(function ($rootScope, $templateCache) {
        // $rootScope.$on('$viewContentLoaded', function (event, next, current) {
        //     $templateCache.removeAll();
        // });
    })
