Algoritmo CarreraConObstaculos
	Escribir "comienza la carreara";
	Definir valla, tunel, laguna, respuesta Como Caracter;
	Escribir "¿hay una valla? (si/no)..";
	Leer valla;
	si valla = "si" Entonces
		escribir"salta la valla";
	SiNo
		escribir"continua la carrera";
	FinSi
	Escribir"¿hay un tunel? (si/no)";
	leer tunel;
	si tunel = "si" Entonces
		Escribir "atraviesa el tunel";
	sino
		Escribir "continua la carrera";
	FinSi	
	Escribir "¿hay una laguna? (si/no)";
	leer laguna;
	si laguna = "si" Entonces
		Escribir "nadas atravez, pero te agotas y no terminas la carrera";
	SiNo
		Escribir "felicidades has completado la carrera";
	FinSi
FinAlgoritmo