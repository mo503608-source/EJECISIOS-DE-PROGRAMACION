import java.util.Scanner;


public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas capturar? ");
        int n = scanner.nextInt();

        double[] calificaciones = new double[n];

        // Lectura de calificaciones
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        float suma = 0;
        double max = calificaciones[0];
        double min = calificaciones[0];

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }

        float promedio = suma / calificaciones.length;

        System.out.println("=== CALIFICACIONES ===");
        for (double cal : calificaciones) {
            System.out.print(cal + " ");
        }

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación máxima: " + max);
        System.out.println("Calificación mínima: " + min);

        scanner.close();
    }
}
