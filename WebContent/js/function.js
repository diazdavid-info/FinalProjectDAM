/**
 * 
 */

window.onload = function(){
	
}

/**
 * Función que hace una petición ajax para recuperar los institutos
 * @param value
 */
function getSchool(value) {
	$.ajax({
		url: '../webServices/apiServices/getSchoolByCourseId?course='+value,
		type: 'POST',
		success: function(result) {
			$('#schools').find('option').remove();
			$('#schools').append('<option disabled="disabled" selected="selected">Seleccione un Instituto ...</option>');
			console.log(result);
			$.each(result, function(key, value){
				$('#schools').append('<option value="'+value.mId+'">'+value.mName+'</option>');
			});
			
		}
	})
}

/**
 * Función que hace una petición ajax para recuperar los ciclos
 */
function getCycles() {
	var course = (!$('#course').val()) ? 0 : $('#course').val();
	var school = (!$('#schools').val()) ? 0 : $('#schools').val();
	var tutor = (!$('#tutor').val()) ? 0 : $('#tutor').val();
	$.ajax({
		url: '../webServices/apiServices/getCycleByCourseIdSchoolIdTutorId?course='+course+'&school='+school+'&tutor='+tutor,
		type: 'GET',
		success: function(result) {
			console.log(result);
			$('#table-cycles').find('tr').remove();
			$('#table-cycles').append('<tr><th>ID Ciclo</th><th>Nombre</th><th>Año</th><th>Instituto</th><th>Tutor</th></tr>');
			$.each(result, function(key, value){
				$('#table-cycles').append('<tr><td>'+value.mId+'</td><td>'+value.mName+'</td><td>'+value.mCourse.mStartYear+' / '+value.mCourse.mFinishYear+'</td><td>'+value.mSchool.mName+'</td><td>'+value.mTutor.mUsername+'</td></tr>');
			});
		}
	})
}

/**
 * Función que hace una petición ajax para recuperar los ciclos
 */
function getCyclesByModule() {
	var course = (!$('#course').val()) ? 0 : $('#course').val();
	var school = (!$('#schools').val()) ? 0 : $('#schools').val();
	$.ajax({
		url: '../webServices/apiServices/getCycleByCourseIdSchoolId?course='+course+'&school='+school,
		type: 'GET',
		success: function(result) {
			console.log(result);
			$('#cycle').find('option').remove();
			$('#cycle').append('<option disabled="disabled" selected="selected">Seleccione un ciclo ...</option>');
			console.log(result);
			$.each(result, function(key, value){
				$('#cycle').append('<option value="'+value.mId+'">'+value.mName+'</option>');
			});
		}
	})
}