package www.cibertec;

import java.util.Scanner;

public class Main {

    public static double descuento(double total) {
        if (total >= 200) {
            return total * 0.15;
        } else if (total >= 100) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cliente;
        int opcion, cantidad;
        double precio = 0;
        double total, desc;
        boolean tieneDescuento;

        System.out.print("Nombre: ");
        cliente = sc.nextLine();

        System.out.println("1. Polo S/50");
        System.out.println("2. Pantalon S/100");
        System.out.println("3. Zapatillas S/200");

        System.out.print("Producto: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                precio = 50;
                break;
            case 2:
                precio = 100;
                break;
            case 3:
                precio = 200;
                break;
            default:
                System.out.println("Opcion incorrecta");
                sc.close();
                return;
        }

        System.out.print("Cantidad: ");
        cantidad = sc.nextInt();

        total = precio * cantidad;
        desc = descuento(total);

        tieneDescuento = desc > 0;
        total = total - desc;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Producto " + i);
        }

        System.out.println("Cliente: " + cliente);
        System.out.println("Total: S/ " + total);
        System.out.println("Tiene descuento: " + tieneDescuento);

        sc.close();
    }
   }

