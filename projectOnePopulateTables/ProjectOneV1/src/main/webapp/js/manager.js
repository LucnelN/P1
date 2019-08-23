/**
 * 
 */

let openTicketsTable = document.getElementById('openTickets');
let openTicketsTableBody = openTicketsTable.getElementsByTagName("tbody");
let openTicketsRows = openTicketsTableBody[0].getElementsByTagName('tr');

window.onload = function(){
	getTickets();
}

function getTickets(){
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if(xhttp.readyState == 4 && xhttp.status == 200) {
			let tickets = JSON.parse(xhttp.responseText);
			setValues(tickets);
		}
	}
	
	xhttp.open("GET", 'http://LocalHost:8080/ProjectOneV1/html/Manager.go', true);
	xhttp.send();
};

function setValues(tickets) {
	for(i=0;i<tickets.length;i++){
		populate(tickets[i]);
	}
}

function populate(ticket) {
	let row = document.createElement('tr');
	
	let header = document.createElement('th');
	header.setAttribute('scope','row');
	header.appendChild(document.createTextNode(ticket.ticket_ID));
	
	row.appendChild(header);
	
	let colUser = document.createElement('td');
	colUser.appendChild(document.createTextNode(ticket.employee_username));
	
	let colAmnt = document.createElement('td');
	colAmnt.appendChild(document.createTextNode(ticket.amount));
	
	let colType = document.createElement('td');
	colType.appendChild(document.createTextNode(ticket.type));
	
	let colStatus = document.createElement('td');
	colStatus.appendChild(document.createTextNode(ticket.status));
	
	row.appendChild(colUser);
	row.appendChild(colAmnt);
	row.appendChild(colType);
	row.appendChild(colStatus);
	
	
	openTicketsTableBody[0].appendChild(row);
}