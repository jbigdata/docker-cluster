'use strict';

angular.module('dockerswarmUI')
.controller('MainCtrl',function($scope, DockerFactory){
  setTimeout(function() {
    toastr.options = {
      closeButton: true,
      progressBar: true,
      showMethod: 'slideDown',
      timeOut: 2000
    };
    toastr.success('管理您的集群', '提示信息');

  }, 1300);



  DockerFactory.infos().then(function(info){
    $scope.info=info.data;
    console.log($scope.info.SystemStatus[3]);
  },function(){
    toastr.error('服务器没有响应', '提示信息');
  });

  DockerFactory.version().then(function(version){
    $scope.version=version.data;
  },function(){
    toastr.error('服务器没有响应', '提示信息');
  });
});
