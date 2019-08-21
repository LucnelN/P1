/**
 * 
 */

let tbl = document.getElementsByClassName("table");

let tbl_body = tbl[0].getElementsByTagName("tbody");

let tbl_rows = tbl_body[0].getElementsByTagName("tr");

for(i=0;i<tbl_rows.length;i++){
	let x = i;
	tbl_rows[i].addEventListener('click', function(){
		//console.log(tbl_rows[x].getElementsByTagName("th")[0].innerText);
		doGet(tbl_rows[x]);
	});
}

function doGet(row){
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(xhttp.readyState == 4 && xhttp.status == 200){
			setValues(row);
		}
	}
	
	xhttp.open("GET", "http://LocalHost:8080/ProjectOneV1/html/Ticket.go", true);
	xhttp.send();
}

function setValues(row){
	let h = document.createElement("H2");
	h.innerHTML = "OKAY";
	document.body.appendChild(h);
}