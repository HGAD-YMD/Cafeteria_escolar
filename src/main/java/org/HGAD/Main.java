import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;


        while (opcion != 2) {
            System.out.println("========================================");
            System.out.println("          CAFETERÍA ESCOLAR             ");
            System.out.println("========================================");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            System.out.println("========================================");
            System.out.print("Seleccione una opción: ");


            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("          REGISTRAR COMPRA              ");
                    System.out.println("========================================");
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("¿Cuántos productos comprará?: ");
                    int numProductos = scanner.nextInt();

                    double subtotal = 0;
                    for (int i = 1; i <= numProductos; i++) {
                        System.out.println("Producto " + i);
                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        double importe = precio * cantidad;
                        subtotal += importe;

                        System.out.printf("Importe: $%.2f", importe);
                    }

                    double descuento = 0.0;
                    if (subtotal < 100) {
                        descuento = 0.0;
                    } else if (subtotal >= 100 && subtotal < 300) {
                        descuento = subtotal * 0.05;
                    } else {
                        descuento = subtotal * 0.10;
                    }

                    double total = subtotal - descuento;


                    System.out.println("========================================");
                    System.out.println("          RESUMEN DE COMPRA             ");
                    System.out.println("========================================");
                    System.out.println("Cliente: " + cliente);
                    System.out.printf("Subtotal: $%.2f", subtotal);
                    System.out.printf("Descuento: $%.2f", descuento);
                    System.out.printf("Total: $%.2f", total);
                    System.out.println("========================================");
                    break;

                case 2:
                    System.out.println("¡Gracias por utilizar el sistema de la cafetería!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}
