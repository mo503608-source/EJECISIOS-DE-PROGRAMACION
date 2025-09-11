import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double lado, base, altura, radio, area;

        do {
            // Mostrar menú
            System.out.println("==== MENÚ DE CÁLCULO DE ÁREAS ====");
            System.out.println("1. Área de un Cuadrado");
            System.out.println("2. Área de un Rectángulo");
            System.out.println("3. Área de un Triángulo");
            System.out.println("4. Área de un Círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el lado del cuadrado: ");
                    lado = scanner.nextDouble();
                    area = lado * lado;
                    System.out.println("Área del cuadrado: " + area);
                    break;

                case 2:
                    System.out.print("Introduce la base del rectángulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Introduce la altura del rectángulo: ");
                    altura = scanner.nextDouble();
                    area = base * altura;
                    System.out.println("Área del rectángulo: " + area);
                    break;

                case 3:
                    System.out.print("Introduce la base del triángulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    altura = scanner.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("Área del triángulo: " + area);
                    break;

                case 4:
                    System.out.print("Introduce el radio del círculo: ");
                    radio = scanner.nextDouble();
                    area = Math.PI * Math.pow(radio, 2);
                    System.out.println("Área del círculo: " + area);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }

            System.out.println(); // Espacio entre ciclos

        } while (opcion != 5);
    }
}
