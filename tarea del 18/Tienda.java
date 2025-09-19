import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = {"Pan", "leche", "HUEVOS", "Cereal", "jugo"};
        double[] precios = {15.5, 22.0, 40.0, 55.5, 30.0};
        int[] cantidades = new int[productos.length];

        System.out.println("=== TIENDA ===");

        // Mostrar productos con características del nombre
        for (int i = 0; i < productos.length; i++) {
            String nombreOriginal = productos[i];
            int caracteres = nombreOriginal.length();
            boolean esMinuscula = nombreOriginal.equals(nombreOriginal.toLowerCase());
            boolean esMayuscula = nombreOriginal.equals(nombreOriginal.toUpperCase());

            // Convertir el nombre
            String nombreConvertido;
            if (esMinuscula) {
                nombreConvertido = nombreOriginal.toUpperCase();
            } else {
                nombreConvertido = nombreOriginal.toLowerCase();
            }

            System.out.println((i + 1) + ". " + nombreOriginal + " - $" + precios[i]);
            System.out.println("   -> Caracteres: " + caracteres);
            System.out.println("   -> Convertido: " + nombreConvertido);
        }

        System.out.println("\nIngresa las cantidades deseadas:");
        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i] + ": ");
            cantidades[i] = sc.nextInt();
        }

        double total = 0;
        System.out.println("\n=== DETALLE DE COMPRA ===");
        for (int i = 0; i < productos.length; i++) {
            double subtotal = precios[i] * cantidades[i];
            total += subtotal;
            System.out.println(productos[i] + " x " + cantidades[i] + " = $" + subtotal);
        }

        System.out.println("\nTotal a pagar: $" + total);
        sc.close();
    }
}
