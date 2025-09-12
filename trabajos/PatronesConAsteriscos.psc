Algoritmo PatronesConAsteriscos
    Definir n Como Entero
    Definir entrada Como Cadena
    Definir esNumero Como Logico
    
    Repetir
        esNumero <- Verdadero
        Escribir "Ingrese un n�mero entero positivo para n: "
        Leer entrada
        
        // Verificar si la entrada es un n�mero
        Si Longitud(entrada) = 0 Entonces
            esNumero <- Falso
        Sino
            Para i <- 1 Hasta Longitud(entrada) Hacer
                Segun Subcadena(entrada, i, i) Hacer
                    "0","1","2","3","4","5","6","7","8","9": 
                    De Otro Modo:
                        esNumero <- Falso
                FinSegun
            FinPara
        FinSi
        
        Si esNumero Entonces
            n <- ConvertirANumero(entrada)
            Si n <= 0 Entonces
                Escribir "Error: El n�mero debe ser positivo."
            FinSi
        Sino
            Escribir "Error: Debe ingresar un n�mero entero."
            n <- 0
        FinSi
    Hasta Que n > 0
    
    Escribir ""
    Escribir "Tri�ngulo rect�ngulo:"
    Para i <- 1 Hasta n Hacer
        asteriscos <- ""
        Para j <- 1 Hasta i Hacer
            asteriscos <- asteriscos + "*"
        FinPara
        Escribir asteriscos
    FinPara
    
    Escribir ""
    Escribir "Tri�ngulo invertido:"
    Para i <- n Hasta 1 Con Paso -1 Hacer
        asteriscos <- ""
        Para j <- 1 Hasta i Hacer
            asteriscos <- asteriscos + "*"
        FinPara
        Escribir asteriscos
    FinPara
    
    Escribir ""
    Escribir "Pir�mide:"
    Para i <- 1 Hasta n Hacer
        linea <- ""
        // Espacios
        Para j <- 1 Hasta n - i Hacer
            linea <- linea + " "
        FinPara
        // Asteriscos
        Para j <- 1 Hasta 2*i - 1 Hacer
            linea <- linea + "*"
        FinPara
        Escribir linea
    FinPara
    
    Escribir ""
    Escribir "Rombo:"
    // Parte superior
    Para i <- 1 Hasta n Hacer
        linea <- ""
        Para j <- 1 Hasta n - i Hacer
            linea <- linea + " "
        FinPara
        Para j <- 1 Hasta 2*i - 1 Hacer
            linea <- linea + "*"
        FinPara
        Escribir linea
    FinPara
    // Parte inferior
    Para i <- n-1 Hasta 1 Con Paso -1 Hacer
        linea <- ""
        Para j <- 1 Hasta n - i Hacer
            linea <- linea + " "
        FinPara
        Para j <- 1 Hasta 2*i - 1 Hacer
            linea <- linea + "*"
        FinPara
        Escribir linea
    FinPara
FinAlgoritmo