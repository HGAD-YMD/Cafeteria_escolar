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
            System.out.println("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("\nPor favor, ingrese un número válido.\n");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n========================================");
                    System.out.println("          REGISTRAR COMPRA              ");
                    System.out.println("========================================");
                    System.out.println("Nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.println("¿Cuántos productos comprará?: ");
                    int numProductos = scanner.nextInt();

                    double subtotal = 0.0;

                    for (int i = 1; i <= numProductos; i++) {
                        System.out.println("Producto " + i);
                        System.out.println("Precio: ");
                        double precio = scanner.nextDouble();
                        System.out.println("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        double importe = precio * cantidad;
                        subtotal += importe;

                        // Usando println con concatenación pura
                        System.out.println("Importe: $" + importe);
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
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("Total: $" + total);
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
