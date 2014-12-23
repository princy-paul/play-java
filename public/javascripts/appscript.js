

			function enableAcceptButton() {
				var acceptBtn = document.getElementById("acceptRadioButton");
				var declineBtn = document.getElementById("declineRadioButton");
				if (acceptBtn.disabled == true) {
					var textArea = document.getElementById("textAreaContainer");
					declineBtn.disabled = acceptBtn.disabled = !(textArea.scrollHeight <= (Math
							.abs(textArea.scrollTop + 10) + textArea.clientHeight));
				}
			}



function UserController($scope,$http) {
  $scope.init = function() {

			$http(
					{
						method : 'POST',
						url : 'http://localhost:9000/CurrentAddress',
						headers : {
							'Content-Type' : 'application/json'
						},
						data :$scope
					}).success(function(Response) {
				$scope.status = Response;
			});
		}

$scope.formError = {}
    $scope.register = function() {

        $http({
            method: 'POST',
            url: 'http://localhost:9000/register',
            headers: {'Content-Type': 'application/json'},
            data: $scope.user
        }).success(function (response) {

            alert(hi);

        }).error(function (response) {

                $scope.formError = angular.copy(response);

        });
    }
}