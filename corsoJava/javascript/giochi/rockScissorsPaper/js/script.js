
var sceltaPC 	= document.getElementById("scelta_pc");
var risultato 	= document.getElementById("risultato");
var playAgaing 	= document.getElementById("play_again");

var btnRock 	= document.getElementById("btn_rock");
var btnScissors = document.getElementById("btn_scissors");
var btnPaper 	= document.getElementById("btn_paper");

var mossaPC="";

function btnPlayAgain(){
	console.log("qui implementare logica per resettare il gioco");
	
	document.getElementById("scelta_utente").innerHTML='<button onClick="testRock" id="btn_rock" class="btn_scelta">ROCK</button><button onClick="testScissors" id="btn_scissors" class="btn_scelta">SCISSORS</button><button onClick="testPaper"  id="btn_paper" class="btn_scelta">PAPER</button>';
	}
	
function sceltaComputer(){
	var numeroRandom=Math.random();
	
	if(numeroRandom<0.34){
		mossaPc="ROCK";
		}else if(numeroRandom <=0.67){
			mossaPc="SCISSORS"}else{
				mossaPc="PAPER"}	
	sceltaPC.innerHTML="<h1>" + mossaPc + "</h1>";
	}	
	
function comparaScelte(player1,player2) {
	
	if(player1===player2) 
		risultato.innerHTML="<h1>Pareggio</h1>";
	//caso 1	
	else if(player1==="ROCK" && player2==="SCISSORS") 
		risultato.innerHTML="<h1>Vince Player1</h1>";
	//caso 2
	else if(player1==="ROCK" && player2==="PAPER") 
		risultato.innerHTML="<h1>Vince Player2</h1>";
	//caso 3
	else if(player1==="SCISSORS" && player2==="ROCK") 
		risultato.innerHTML="<h1>Vince Player2</h1>";
		
	else if(player1==="SCISSORS" && player2==="PAPER") 
		risultato.innerHTML="<h1>Vince Player1</h1>";
		
	else if(player1==="PAPER" && player2==="ROCK") 
		risultato.innerHTML="<h1>Vince Player1</h1>";
		
	else if(player1==="PAPER" && player2==="SCISSORS") 
		risultato.innerHTML="<h1>Vince Player2</h1>";	
}


function testCompleto(){
	var sceltaTemp=this.innerHTML;
	console.log("click su "+ sceltaTemp);
	document.getElementById("scelta_utente").innerHTML+="<h1>"+sceltaTemp+"</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp,mossaPc);
	}

function testRock(){
	var sceltaTemp=btnRock.innerHTML;
	console.log("click su "+ sceltaTemp);
	document.getElementById("scelta_utente").innerHTML+="<h1>"+sceltaTemp+"</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp,mossaPc);
	}

function testScissors(){
	var sceltaTemp=btnScissors.innerHTML;
	console.log("click su "+sceltaTemp);
	document.getElementById("scelta_utente").innerHTML+="<h1>"+sceltaTemp+"</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp,mossaPc);
	}
	
function testPaper(){
	var sceltaTemp=btnPaper.innerHTML;
	console.log("click su "+sceltaTemp);
	document.getElementById("scelta_utente").innerHTML+="<h1>"+sceltaTemp+"</h1>";
	sceltaComputer();
	comparaScelte(sceltaTemp,mossaPc);
	}
	
	
//eventi utente
	//1. attributo onclick direttamente sull'elemento html
	//2. evento onclick collegato alla variabile js dell'elemento	
	//3.uso del listener
	
	

//btnRock.onclick	= test(); la funzione viene eseguita subito al caricamento della pagina

btnRock.addEventListener ("click",testRock); 
btnScissors.addEventListener ("click",testScissors);
btnPaper.addEventListener ("click",testPaper);
