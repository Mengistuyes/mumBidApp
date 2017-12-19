$(document).ready(function() {
	
	approveUser = function(userId){
		$.ajax({
	 		url: '' + userId,
	 		type: 'PUT',
			dataType: "json",
			success: function(response){
 		 		alert("User approved");

			},
			error: function(){						
				alert('Error while request..');
			}
		});
	}
	
	declineUser = function(userId) {
		$.ajax({
			url: ''+ productId,
	 		type: 'PUT',
			dataType: "json",
		 	 success: function (response) {
	 		 		location.reload(true);
				},
				error: function(){						
					alert('Error while request..');
		 	 } 
	   });
   }
});
