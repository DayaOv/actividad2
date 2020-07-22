public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int id, String nombre, String apellido, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public Integer getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public int getSalario() {

        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;

    }
    @Override
    public String toString(){
        return " Id: " + getId() + " - Nombre: " + getNombre() + " - Apellido: " + getApellido() + " -  Salario: " + getSalario();
    }
}
