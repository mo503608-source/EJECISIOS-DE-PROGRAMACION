Algoritmo AhorroMensual
    Definir AH Como Real
    Definir M Como Entero
    Definir CA Como Entero
    
    AH <- 0
    M <- 1
    
    Escribir "=== CALCULADORA DE AHORRO ANUAL ==="
    Escribir "Ingrese la cantidad a ahorrar cada mes:"
    
    // Ciclo mientras M <= 12
    Mientras M <= 12 Hacer
        Escribir "Mes ", M, " - Cantidad a ahorrar: $" Sin Saltar
        Leer CA
        
        // Acumular el ahorro
        AH <- AH + CA
        
        // Mostrar el ahorro acumulado hasta este mes
        Escribir "El ahorro del mes ", M, " es: $", AH
        
        // Incrementar el contador del mes
        M <- M + 1
    FinMientras
    
    // Mostrar el ahorro final
    Escribir ""
    Escribir "=== RESULTADO FINAL ==="
    Escribir "El ahorro final es: $", AH
FinAlgoritmo