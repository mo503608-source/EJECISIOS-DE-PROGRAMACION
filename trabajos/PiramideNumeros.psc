Algoritmo PiramideNumeros
	Definir n, i, j Como Entero
	Escribir '===================================='
	Escribir '      GENERADOR DE PIRÁMIDE'
	Escribir '===================================='
	Escribir ''
	// Solicitar el número de líneas al usuario
	Escribir 'Ingrese el número de líneas (n): 'Sin Saltar
	Leer n
	Escribir ''
	Escribir 'Pirámide de ', n, ' líneas:'
	Escribir '----------------------'
	Escribir ''
	// Generar la pirámide
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta i Hacer
			Escribir j, ' 'Sin Saltar
		FinPara
		Escribir ''
	FinPara // Salto de línea después de cada fila
	Escribir ''
	Escribir '===================================='
	Escribir '        PIRÁMIDE COMPLETADA'
	Escribir '===================================='
FinAlgoritmo
