Algoritmo PiramideNumeros
	Definir n, i, j Como Entero
	Escribir '===================================='
	Escribir '      GENERADOR DE PIR�MIDE'
	Escribir '===================================='
	Escribir ''
	// Solicitar el n�mero de l�neas al usuario
	Escribir 'Ingrese el n�mero de l�neas (n): 'Sin Saltar
	Leer n
	Escribir ''
	Escribir 'Pir�mide de ', n, ' l�neas:'
	Escribir '----------------------'
	Escribir ''
	// Generar la pir�mide
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta i Hacer
			Escribir j, ' 'Sin Saltar
		FinPara
		Escribir ''
	FinPara // Salto de l�nea despu�s de cada fila
	Escribir ''
	Escribir '===================================='
	Escribir '        PIR�MIDE COMPLETADA'
	Escribir '===================================='
FinAlgoritmo
