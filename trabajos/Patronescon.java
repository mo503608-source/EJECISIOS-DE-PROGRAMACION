import java.util.Scanner;

public class PatronesCon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Ingrese un número entero positivo para n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next();
                System.out.print("Ingrese un número entero positivo para n: ");
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Error: El número debe ser positivo.");
            }
        } while (n <= 0);
        
        System.out.println("\nTriángulo rectángulo:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nTriángulo invertido:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nPirámide:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nRombo:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}