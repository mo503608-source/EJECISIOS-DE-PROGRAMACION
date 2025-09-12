Algoritmo Fibonacci
    Definir A, B, I, N, SUMA, CONTADOR Como Entero
    
    Escribir "=== GENERADOR DE SUCESIÓN DE FIBONACCI ==="
    Escribir "Ingrese el número de elementos de la serie a generar (N): " Sin Saltar
    Leer N
    
    A <- 0  // Primer número de Fibonacci
    B <- 1  // Segundo número de Fibonacci
    CONTADOR <- 1
    
    Escribir ""
    Escribir "Sucesión de Fibonacci:"
    
    // Casos especiales para los primeros números
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
        
        // Actualizar los valores para la siguiente iteración
        A <- B
        B <- SUMA
        
        CONTADOR <- CONTADOR + 1
    FinMientras
    
    Escribir ""
    Escribir "=== FIN DE LA SERIE ==="
FinAlgoritmo