import java.util.Scanner;

public class AhorroMensual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double AH = 0;  
        int M = 1;     
        int CA;         
        
        System.out.println("=== CALCULADORA DE AHORRO ANUAL ===");
        System.out.println("Ingrese la cantidad a ahorrar cada mes:");
        
        // Ciclo mientras M <= 12
        while (M <= 12) {
            System.out.print("Mes " + M + " - Cantidad a ahorrar: $");
            CA = scanner.nextInt();
            
            // Acumular el ahorro
            AH = AH + CA;
            
            // Mostrar el ahorro acumulado hasta este mes
            System.out.println("El ahorro del mes " + M + " es: $" + AH);
            
            // Incrementar el contador del mes
            M = M + 1;
        }
        
        // Mostrar el ahorro final
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("El ahorro final es: $" + AH);
        
        scanner.close();
    }
}