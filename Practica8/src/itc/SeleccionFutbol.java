package itc;

public class SeleccionFutbol {
    private int id;
    private int edad;
    private String nombre;
    private String apellidos;

    public SeleccionFutbol(){}


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void Concentrarse(){
        System.out.println("Concentrado...");
    }

    public void Viajar(){
        System.out.println("Viajando...");
    }
}
