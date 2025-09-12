import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        // Variable del algoritmo según la tabla
        int N;  
        
        System.out.println("=== NÚMEROS PARES ENTRE 0 Y 100 ===");
        System.out.println("Generando números pares del 0 al 100:\n");
        
        // Inicializar N
        N = 0;
        
        while (N <= 100) {
            // Verificar si N es par
            if (N % 2 == 0) {
                System.out.println(N);
            }
            
            N = N + 1;
        }
        
        System.out.println("\n=== FIN DE LA GENERACIÓN ===");
    }
}