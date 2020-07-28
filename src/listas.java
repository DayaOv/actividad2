import javax.swing.*;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                System.out.println("AGREGADO");
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

    private static Stream<Empleado> filtrarEmpleados() {
        return listaempleado.stream()
                .filter(empleado -> empleado.getSalario() > 700000);
    }

    public static void mayorsalario(){
        System.out.println("Empleado con mayor salario: ");
        System.out.println(listaempleado.stream()
                .max(Comparator.comparing(Empleado::getSalario)).get());
        Menu.menu();
    }
    public static void menorsalario(){
        System.out.println("Empleado con menor salario: ");
        System.out.println(listaempleado.stream()
                .min(Comparator.comparing(Empleado::getSalario)).get());
        Menu.menu();
    }

    public static void orden(){
        System.out.println("Orden de los empleados por NOMBRE: ");
        listaempleado.stream()
                .sorted(Comparator.comparing(Empleado::getNombre))
                .forEach(System.out::println);
                Menu.menu();
    }
    public static void sumasalarios(){
        System.out.println("suma de los salarios de todos los empleados cuyo salario es mayor a 700000.");
        filtrarEmpleados()
                .map(Empleado::getSalario);
                 Menu.menu();
    }
    public static void numerototal(){
        System.out.println(" Los empleados son los siguientes: ");
        listaempleado.stream()
                .filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
                .forEach(System.out::println);
                Menu.menu();
    }
    public static void cincoprimeros(){
        System.out.println(" 5 primeros empleados con el mayor salario: ");
        listaempleado.stream()
                .sorted(Comparator.comparing(Empleado::getSalario).reversed())
                .limit(5)
                .forEach(System.out::println);
        Menu.menu();
    }
        public static void salir(){
                    System.exit(0);
                }
        }



