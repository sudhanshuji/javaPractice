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

function loadData() {

	var url1 = "getTeamName";
	// practice $.ajax yourself

	$.get(
			url1,
			function(data, status) {
				var dataText = "";
				dataText += "<option value='select'>Select</option>";
				for ( var key in data.data) {
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

function getPlayerData() {

	var url = "displayPlayerDetails";
	// practice $.ajax yourself
	var teamName = $("#teamName").val();
	$.get(
			url,
			{
				teamName : teamName
			},
			function(data, status) {
				var table = "<table>"
						+ "<tr><th>Player Name</th><th>Category</th></tr>";
				data.data.forEach(function(element) {
					console.log(element.playerName);
					table += "<tr><td>" + element.playerName + "</td><td>"
							+ element.category + "</td></tr>";
				});
				table += "</table>";
				console.log(table);
				$('#result').html(table);

			}).fail(
			function(data) {
				// alert("Some error");
				console.error(data.responseJSON);
				$('#errorTeamName').html(
						"<font color=red>" + data.responseJSON.error[0]
								+ "</font>");
			});

}
