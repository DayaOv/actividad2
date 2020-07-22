import java. util. Scanner;

public class Menu {
    public static void menu() {
        try {
        Scanner leer = new Scanner(System.in);
            int opc;
            do {
                System.out.println("******** MENU ********");
                System.out.println(" 1 - Agregar Empleado");
                System.out.println(" 2 - Eliminar Empleado por ID");
                System.out.println(" 3 - Actualizar Empleado");
                System.out.println(" 4 - Mostrar todos los Empleados");
                System.out.println(" 5 - Salir\n");
                System.out.print("\nIntroduzca opcion: ");
                opc = leer.nextInt();
                if (opc < 1 || opc > 5) {
                    System.out.println("Opción inválida");
                }
            }
            while (opc < 1 || opc > 5);

            switch (opc) {
                case 1:
                    listas.agregarempleado();
                    break;
                case 2:
                    listas.eliminarempleado();
                    break;
                case 3:
                    listas.actualizarempleado();
                    break;
                case 4:
                    listas.mostrarempleados();
                    break;
                case 5:
                    listas.salir();
                    System.out.println("Fin");
            }
        } catch (Exception ex) {
            System.out.println("Error. Introduzca solo numeros, entre 1 y 5.");
            menu();
        }
    }
}
