import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables del algoritmo según la tabla
        int A, B;           
        int I;              
        int N;             
        int SUMA;           
        int CONTADOR;       
        
        System.out.println("=== GENERADOR DE SUCESIÓN DE FIBONACCI ===");
        System.out.print("Ingrese el número de elementos de la serie a generar (N): ");
        N = scanner.nextInt();
        
       
        A = 0;  // Primer número de Fibonacci
        B = 1;  // Segundo número de Fibonacci
        CONTADOR = 1;
        
        System.out.println("\nSucesión de Fibonacci:");
        
        // Casos especiales para los primeros números
        if (N >= 1) {
            System.out.println("F[1] = " + A);
            CONTADOR++;
        }
        
        if (N >= 2) {
            System.out.println("F[2] = " + B);
            CONTADOR++;
        }
        
        // Generar el resto de la serie
        while (CONTADOR <= N) {
            SUMA = A + B;  
            System.out.println("F[" + CONTADOR + "] = " + SUMA);
            
            // Actualizar los valores para la siguiente iteración
            A = B;     
            B = SUMA;   
            
            CONTADOR++;
        }
        
        System.out.println("\n=== FIN DE LA SERIE ===");
        scanner.close();
    }
}
