'use strict';
(function(angular) {
  var app = angular.module('PoolTest', ['ng', 'ngRoute', 'ngResource']);
  
  app.controller('indexController', function($scope, $http) {
    var index = this;
    
    index.autos = [];
    
    index.schedules = [];
    
    function refreshData() {
      $http.get('/listAuto').then(function(data) {
        index.autos = data.data;
      });
      
      $http.get('/listSchedule').then(function(data) {
        index.schedules = data.data;
      });

    }
    
    index.requestAutoClick = function(auto) {
      $http.get('/requestAuto?user=1&auto='+auto.id).then(function(data) {
        refreshData()
      });
    };
    
    index.cancelRequest = function(scheduleId) {
      $http.get('/cancelRequest?schedule='+scheduleId).then(function(data) {
        refreshData()
      });
    };
    
    
    refreshData();
  });
})(angular);