Algoritmo tablasdemultiplicar
	Definir numero Como Entero
	Definir i Como Entero
	Definir resultado Como Entero
	Escribir generador, de, tablas, de, multiplicar
	Escribir 'ingresa 0 para terminar el programa'
	Repetir
		Escribir 'ingrese un numero para generar du tabla'Sin Saltar
		Leer numero
		Si numero<>0 Entonces
			Escribir 'tabla de multiplicar del ', numero
			Escribir '---------------------------'
			Para i<-1 Hasta 10 Con Paso 1 Hacer
				resultado <- numero*i
				Escribir numero, 'x', i, '=', resultado
			FinPara
			Escribir ''
		FinSi // linea en blanco para separar
	Hasta Que numero=0
FinAlgoritmo
