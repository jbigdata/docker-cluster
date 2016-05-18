'use strict';

angular.module('dockerswarmUI')
  .controller('ContainersCtrl',function(ContainerFactory, $scope){
    ContainerFactory.containers().then(function(containers){
    $scope.containers=containers.data;
    for(var i=0;i<$scope.containers.length;i++){
      var d = new Date(0);
      d.setUTCSeconds($scope.containers[i].Created);
      $scope.containers[i].Created=d.toLocaleString();

      var name=$scope.containers[i].Names[0];
      var c=name.slice(1,name.length);
      var no=c.slice(0,c.indexOf('/'));
      var co=c.slice(c.indexOf('/')+1,c.length);

      $scope.containers[i].Name=co;
      $scope.containers[i].Node=no;

    }

    containers=$scope.containers;
    var arr = [];
    for (var prop in containers) {
      arr.push(containers[prop]);
    }
    $scope.data={
      nodes:arr,
      links:[]
    };

    drawGraph($scope.data);


  },function(){
     toastr.error('Server is not responding', 'DockerSwarm UI');
  });
  });
