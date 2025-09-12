Algoritmo Fibonacci
    Definir A, B, I, N, SUMA, CONTADOR Como Entero
    
    Escribir "=== GENERADOR DE SUCESI�N DE FIBONACCI ==="
    Escribir "Ingrese el n�mero de elementos de la serie a generar (N): " Sin Saltar
    Leer N
    
    A <- 0  // Primer n�mero de Fibonacci
    B <- 1  // Segundo n�mero de Fibonacci
    CONTADOR <- 1
    
    Escribir ""
    Escribir "Sucesi�n de Fibonacci:"
    
    // Casos especiales para los primeros n�meros
    Si N >= 1 Entonces
        Escribir "F[", CONTADOR, "] = ", A
        CONTADOR <- CONTADOR + 1
    FinSi
    
    Si N >= 2 Entonces
        Escribir "F[", CONTADOR, "] = ", B
        CONTADOR <- CONTADOR + 1
    FinSi
    
    // Generar el resto de la serie
    Mientras CONTADOR <= N Hacer
        SUMA <- A + B
        Escribir "F[", CONTADOR, "] = ", SUMA
        
        // Actualizar los valores para la siguiente iteraci�n
        A <- B
        B <- SUMA
        
        CONTADOR <- CONTADOR + 1
    FinMientras
    
    Escribir ""
    Escribir "=== FIN DE LA SERIE ==="
FinAlgoritmo