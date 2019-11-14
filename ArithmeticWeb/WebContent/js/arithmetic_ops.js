function divide() {
			var a = document.getElementById('a').value;
			var b = document.getElementById('b').value;
			var sum = parseInt(a) / parseInt(b);
			document.getElementById('result').innerHTML = "Result is " + sum

		}

function multiply() {
	var a = document.getElementById('a').value;
	var b = document.getElementById('b').value;
	var sum = parseInt(a) * parseInt(b);
	document.getElementById('result').innerHTML = "Result is " + sum

}

function subtract() {
	var a = document.getElementById('a').value;
	var b = document.getElementById('b').value;
	var sum = parseInt(a) - parseInt(b);
	document.getElementById('result').innerHTML = "Result is " + sum

}

function add() {
	var a = document.getElementById('a').value;
	var b = document.getElementById('b').value;
	var sum = parseInt(a) + parseInt(b);
	document.getElementById('result').innerHTML = "Result is " + sum

}

