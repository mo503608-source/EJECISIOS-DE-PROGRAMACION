import java.util.Scanner;

public class patrones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        
        System.out.println("====================================");
        System.out.println("      GENERADOR DE PIRÁMIDE");
        System.out.println("====================================");
        System.out.println();
        
        // Solicitar el número de líneas al usuario
        System.out.print("Ingrese el número de líneas (n): ");
        n = scanner.nextInt();
        System.out.println();
        
        System.out.println("Pirámide de " + n + " líneas:");
        System.out.println("----------------------");
        System.out.println();
        
        // Generar la pirámide
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        
        System.out.println();
        System.out.println("====================================");
        System.out.println("        PIRÁMIDE COMPLETADA");
        System.out.println("====================================");
        
        scanner.close();
    }
}