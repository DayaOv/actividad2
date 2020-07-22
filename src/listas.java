import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java. util. Scanner;

public class listas {
    private static Scanner leer = new Scanner(System.in);
    private static List<Empleado> listaempleado = new LinkedList<>();

    public static boolean validarId(int id) {
        for (Empleado empleado : listaempleado){
            if (empleado.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public static void agregarempleado() {
        System.out.println("Introduce Id:");
        try {
            int id = leer.nextInt();
            if (validarId(id)) {
                System.out.println("el Id: " + id + " ya existe");
            } else {
                leer.nextLine();
                System.out.println("Introduce el nombre:");
                String nombre = leer.nextLine();
                System.out.println("Introduce el apellido:");
                String apellido = leer.nextLine();
                System.out.println("Introduce el salario:");
                int salario = leer.nextInt();
                Empleado newEmpleado = new Empleado(id, nombre, apellido, salario);
                listaempleado.add(newEmpleado);
                }
        } catch (NumberFormatException ex) {
            System.out.println(" El valor no es un entero ");
            agregarempleado();

        }
        Menu.menu();
    }
    public static void eliminarempleado() {
        int indice = 0;
        for (Empleado empleado : listaempleado) {
            System.out.println(listaempleado);
        }
        System.out.println("Introduce Id:");
        int id = leer.nextInt();
        if (validarId(id)) {
            for (Empleado empleado: listaempleado){
                if (empleado.getId() == id) {
                    listaempleado.remove(empleado);
                }
            }
        }
        Menu.menu();

    }
    public static void actualizarempleado() {
        for (Empleado empleado : listaempleado) {
            System.out.println(listaempleado);
        }
        System.out.println("Introduce el id a actualizar:");
        int id = leer.nextInt();

        if (validarId(id)) {
            for (Empleado empleado : listaempleado) {
                if (empleado.getId() == id) {
                    System.out.println("Introduce Nombre de empleado: ");
                    leer.nextLine();
                    String nombre = leer.nextLine();
                    System.out.println("Introduce Apellidode empleado: ");
                    String apellido = leer.nextLine();
                    System.out.println("Introduce Salario");
                    int salario = leer.nextInt();
                    empleado.setId(id);
                    empleado.setNombre(nombre);
                    empleado.setApellido(apellido);
                    empleado.setSalario(salario);
                    System.out.println("El empleado con el id: " + id + " se ha actualizado.");
                }
            }
        }
        else{ System.out.println("No existe el id: " +id+ " vinculado");
        actualizarempleado();}
        Menu.menu();
    }

    public static void mostrarempleados() {
        for (int i = 0; i < listaempleado.size(); i++) {
            System.out.println((i + 1) + ". " + listaempleado.get(i));
        }
        Menu.menu();
    }

        public static void salir(){
                    System.exit(0);
                }
        }



