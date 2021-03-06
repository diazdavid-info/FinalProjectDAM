/**
 * 
 */


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
 * en función del curso, instituto y tutor
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

/**
 * Función que hace una petición ajax para recuperaar los modulos
 * en función del curso, instituto y ciclo.
 */
function getModuleByCourseSchoolCycle() {
	var course = (!$('#course').val()) ? 0 : $('#course').val();
	var school = (!$('#schools').val()) ? 0 : $('#schools').val();
	var cycle = (!$('#cycle').val()) ? 0 : $('#cycle').val();
	$.ajax({
		url: '../webServices/apiServices/getModuleByCourseSchoolCycle?course='+course+'&school='+school+'&cycle='+cycle,
		type: 'GET',
		success: function(result) {
			console.log(result);
			$('#module').find('option').remove();
			$('#module').append('<option disabled="disabled" selected="selected">Seleccione un módulo ...</option>');
			console.log(result);
			$.each(result, function(key, value){
				$('#module').append('<option value="'+value.mId+'">'+value.mName+'</option>');
			});
		}
	})
}

function getChapterByModule(value) {
	$.ajax({
		url: '../webServices/apiServices/getChapterByModule?module='+value,
		type: 'GET',
		success: function(result) {
			console.log(result);
			$('#chapter').find('option').remove();
			$('#chapter').append('<option disabled="disabled" selected="selected">Seleccione un Tema ...</option>');
			console.log(result);
			$.each(result, function(key, value){
				$('#chapter').append('<option value="'+value.mId+'">'+value.mName+'</option>');
			});
		}
	})
}

var randomScalingFactor = function(){ return Math.round(Math.random()*100)};

var barChartData = {
	labels : ["Base de datos","Formación y orientación laboral","Desarrollo"],
	datasets : [
		{
			fillColor : "rgba(220,220,220,0.5)",
			strokeColor : "rgba(220,220,220,0.8)",
			highlightFill: "rgba(220,220,220,0.75)",
			highlightStroke: "rgba(220,220,220,1)",
			data : [205,90,100]
		},
		{
			fillColor : "rgba(151,187,205,0.5)",
			strokeColor : "rgba(151,187,205,0.8)",
			highlightFill : "rgba(151,187,205,0.75)",
			highlightStroke : "rgba(151,187,205,1)",
			data : [randomScalingFactor(),randomScalingFactor(),randomScalingFactor()]
		}
	]

}


window.onload = function(){
	if(document.getElementById("canvas")){
		sendAjax('webServices/apiServices/getDataGraphic?teacher='+$('#userId').val(), printGraphic);
	}
}

function printGraphic(result) {
	console.log(result);
	var ctx2 = document.getElementById("canvas").getContext("2d");
	window.myBar = new Chart(ctx2).Bar(result, {
		responsive : true
	});
}

function sendAjax(url, callBack) {
	$.ajax({
		url: url,
		type: 'GET',
		success: callBack
	})
}