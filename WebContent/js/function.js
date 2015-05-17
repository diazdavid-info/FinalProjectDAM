/**
 * 
 */

window.onload = function(){
	
}

function getSchool(value) {
	$.ajax({
		url: '../webServices/apiServices/getSchoolByCourseId?course='+value,
		type: 'POST',
		success: function(result) {
			$('#schools').find('option').remove();
			$('#schools').append('<option disabled="disabled" selected="selected">Selecione un Instituto ...</option>');
			console.log(result);
			$.each(result, function(key, value){
				$('#schools').append('<option value"'+value.mId+'">'+value.mName+'</option>');
			});
			
		}
	})
}