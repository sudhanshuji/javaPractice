function validateTeamName() {
	var teamName = document.getElementById('teamName').value;
	var regex = /^[A-Z]+$/;
	if (regex.test(teamName)) {
		// alert("Valid Team Name");
		document.getElementById('errorTeamName').innerHTML = "";
		document.getElementById("mysubmit").disabled = false;
	} else {
		// alert("Invalid Team Name");
		// document.getElementById('errorTeamName').style.visibility =
		// "visible";
		document.getElementById('errorTeamName').innerHTML = "<font color=red>Invalid Team Name</font>";
		document.getElementById("mysubmit").disabled = true;
	}

}

function validatePlayerName() {
	document.getElementById('errorPlayerName').innerHTML = "";
	var playerName = document.getElementById('playerName').value;
	var regex = /^[A-Z][a-z]*(\s[A-Z][a-z]*)*$/;
	if (regex.test(playerName)) {

		// alert("Valid Player Name");
		document.getElementById('errorPlayerName').innerHTML = "";
		document.getElementById("mysubmit").disabled = false;

		// document.getElementById('lblPlayerName').style.visibility = "hidden";
	} else {
		console.error("Invalid Player Name");
		document.getElementById('errorPlayerName').innerHTML = "<font color=red>Invalid Player Name</font>";
		document.getElementById("mysubmit").disabled = true;
		// document.getElementById('lblPlayerName').style.visibility =
		// "visible";
	}

}

function validateCategory() {
	var category = document.getElementById('category').value;
	// var regex = /["batsman"|"bowler"|"allrounder"]/i;
	if (category == 'select') {
		// alert("Invalid category");
		document.getElementById('errorCategory').innerHTML = "<font color=red>Invalid Category</font>";
		document.getElementById("mysubmit").disabled = true;
	} else {
		document.getElementById('errorCategory').innerHTML = "";
		document.getElementById("mysubmit").disabled = false;
		// alert("Valid category");
	}

}

function validateHighestScore() {
	var highestScore = document.getElementById('highestScore').value;
	if (highestScore <= 0 || highestScore == "") {
		document.getElementById('errorHighestScore').innerHTML = "<font color=red>Invalid Highest Score</font>";
		document.getElementById("mysubmit").disabled = true;
	} else if (document.getElementById('category').value == "batsman") {
		if (highestScore <= 50) {
			document.getElementById('errorHighestScore').innerHTML = "<font color=red>Invalid Highest Score</font>";
			document.getElementById("mysubmit").disabled = true;
		} else {
			document.getElementById('errorHighestScore').innerHTML = "";
			document.getElementById("mysubmit").disabled = false;
		}
	} else {
		document.getElementById('errorHighestScore').innerHTML = "";
		document.getElementById("mysubmit").disabled = false;
	}

}

function validateBestFigure() {
	var bestFigure = document.getElementById('bestFigure').value;
	var regx = /^\d{1,2}\/\d{1,3}$/;
	if (!regx.test(bestFigure)) {
		document.getElementById('errorBestFigure').innerHTML = "<font color=red>Invalid Best Figure</font>";
		document.getElementById("mysubmit").disabled = true;
	} else {
		document.getElementById('errorBestFigure').innerHTML = "";
		document.getElementById("mysubmit").disabled = false;
	}
}

function loadData() {

	var url = "getCategories";
	var url1 = "getTeamName";
	var method = "GET";
	// practice $.ajax yourself
	$.get(url, function(data) {
		// $(".result").html(data);
		// alert("Data was received.");
		// alert(data);
		// console.log(data);
		var dataText = "";
		dataText += "<option value='select'>Select</option>";
		for ( var key in data) {
			// console
			// .log(data[key].categoryKey + " : "
			// + data[key].categoryValue);
			// console.log();
			dataText += "<option value='" + data[key].categoryKey + "'>"
					+ data[key].categoryValue + "</option>"
		}

		// console.log(dataText);
		$('#category').html(dataText);

	});

	/*
	 * $.get(url1, function(data, textStatus, jqXHR) { //
	 * $(".result").html(data); // alert("Data was received."); // alert(data); //
	 * console.log(data); console.log(textStatus); console.log(jqXHR.status); if
	 * (jqXHR.status == 500) { alert("Some error"); console.err(data.error[0]);
	 * $('#errorTeamName').html( "<font color=red>" + data.error[0] + "</font>"); }
	 * 
	 * var dataText = ""; dataText += "<option value='select'>Select</option>";
	 * for ( var key in data.data) { // console // .log(data[key].categoryKey + " : " // +
	 * data[key].categoryValue); // console.log(); dataText += "<option
	 * value='" + data.data[key].teamNameKey + "'>" +
	 * data.data[key].teamNameValue + "</option>" }
	 * 
	 * console.log(dataText); $('#teamName').html(dataText);
	 * 
	 * });
	 * 
	 */

	$.get(
			url1,
			function(data, status) {
				var dataText = "";
				dataText += "<option value='select'>Select</option>";
				for ( var key in data.data) {
					// console
					// .log(data[key].categoryKey + " : "
					// + data[key].categoryValue);
					// console.log();
					dataText += "<option value='" + data.data[key].teamNameKey
							+ "'>" + data.data[key].teamNameValue + "</option>"
				}

				// console.log(dataText);
				$('#teamName').html(dataText);
			}).fail(
			function(data) {
				// alert("Some error");
				console.error(data.responseJSON);
				$('#errorTeamName').html(
						"<font color=red>" + data.responseJSON.error[0]
								+ "</font>");
			});

}

function setPlayerData() {
	var url = "setPlayerDetails";
	var playerName = $("#playerName").val();
	var category = $("#category").val();
	var highestScore = $("#highestScore").val();
	var bestFigure = $("#bestFigure").val();
	var teamName = $("#teamName").val();

	var player = {
		playerName : $("#playerName").val(),
		category : $("#category").val(),
		highestScore : $("#highestScore").val(),
		bestFigure : $("#bestFigure").val(),
		teamName : $("#teamName").val()
	};

	// {
	// playerName : playerName,
	// category : category,
	// highestScore : highestScore,
	// bestFigure : bestFigure,
	// teamName : teamName
	// }
	console.log(player);
	// practice $.ajax yourself
	$.post(url, player, function(data, status) {
		alert(data.data);
	}).fail(function(data) {
		alert("Some error");
		console.error(data);

	});

}
