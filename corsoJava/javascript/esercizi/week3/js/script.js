//alert("Hello, World!");
var titoloPrincipale	=	document.getElementById("titolo_principale")

var campo1				= 	document.getElementById("campo1");
var campo2				= 	document.getElementById("campo2");
var mioBottone			= 	document.getElementById("mio_bottone");

var risultato			=	document.getElementById("risultato");


console.log("variabile principale contiene:"+titolo_principale.innerHTML); //ritorna il contenuto di titolo_principale

console.log("Hello, World!");
console.info("Andiamo in pausa");

var a,b;
a=5; //number
b=3;
b="angelo" //stringa tra 1 o 2 apici è indifferente
c=true; //boolean
c=false;
c=3.14; //double
d= ["uno","due"];//array
e={nome : "mauro", cognome : "bogliaccino"}; //oggetto
f=function(){};//funzione
var studenti=[
				{	nome : "mauro", cognome : "bogliaccino", data :new Date()	},
				{	nome : "angelo", cognome : "nicosia"	}
];//oggetto dentro gli array


console.info(a*b);

a=3;
b="angelo";

function saluta (){
	var salut_italico="ciao";
	console.info("ciao mondo" +b);
	
	}


saluta();


console.log("provo ad usare la variabile" + a);




mioBottone.onclick=
function(){

	/*
	var somma=parseInt (campo1.value) + parseInt(campo2.value);//ritorna un intero
	risultato.innerHTML= 	somma

*/
	
	if(campo1.value=="mauro" && campo2.value=="12345")
		risultato.innerHTML	=	"benvenuto mauro";
	else
		risultato.innerHTML	=	"login errato, non puoi entrare";
};


for(var i=0; i < studenti.length; i++){
	console.log(studenti[i].nome);
	};