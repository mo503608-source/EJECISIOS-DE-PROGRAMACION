Algoritmo NumerosPares
    Definir N Como Entero
    
    Escribir "=== N�MEROS PARES ENTRE 0 Y 100 ==="
    Escribir "Generando n�meros pares del 0 al 100:"
    Escribir ""
    
    // Inicializar N
    N <- 0
    
    Mientras N <= 100 Hacer
        // Verificar si N es par
        Si N MOD 2 = 0 Entonces
            Escribir N
        FinSi
        
        N <- N + 1
    FinMientras
    
    Escribir ""
    Escribir "=== FIN DE LA GENERACI�N ==="
FinAlgoritmo