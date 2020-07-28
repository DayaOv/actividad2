import java.util.InputMismatchException;
import java. util. Scanner;

public class Menu {

    private static Scanner leer = new Scanner(System.in);
        private static void menuOpciones(){
            System.out.println("******** MENU ********");
            System.out.println(" 1 - Agregar Empleado");
            System.out.println(" 2 - Eliminar Empleado por ID");
            System.out.println(" 3 - Actualizar Empleado");
            System.out.println(" 4 - Mostrar todos los Empleados");
            System.out.println(" 5 - Mostrar empleado con mayor salario");
            System.out.println(" 6 - Mostrar empleado con menor salario");
            System.out.println(" 7 - Orden de empleados por nombre");
            System.out.println(" 8 - Suma de salarios de todos los empleados cuyo salario es mayor a 700000");
            System.out.println(" 9 - Número total de empleados cuyo apellido comienza por la letra ‘A’ o ‘a’");
            System.out.println(" 10 - Los 5 primeros empleados con el mayor salario");
            System.out.println(" 11 - SALIR\n");
        }
    public static void menu() {
        int opc = 0;

        do {
            menuOpciones();

            System.out.print("\nIntroduzca opcion: ");
            opc = validarOpcion();
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
                    listas.mayorsalario();
                    break;
                case 6:
                    listas.menorsalario();
                    break;
                case 7:
                    listas.orden();
                    break;
                case 8:
                    listas.sumasalarios();
                    break;
                case 9:
                    listas.numerototal();
                    break;
                case 10:
                    listas.cincoprimeros();
                    break;
                case 11:
                    listas.salir();
                    System.out.println("Fin");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opc != 11);

    }

        private static int validarOpcion () {
            try {
                return leer.nextInt();
            } catch (InputMismatchException exception) {
                leer.nextLine();
                return 0;
            }
        }
    }