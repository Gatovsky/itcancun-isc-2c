package itc;

public class Cliente {
    private String RFC;
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String direccion;

    public Cliente(String rfc, String nombre, String apellido, int edad, char genero, String direccion){
        this.RFC = rfc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }
    public String getRFC(){
        return this.RFC;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad >= this.edad){
            this.edad = edad;
        }
    }
    public char getGenero(){
        return this.genero = genero;
    }
    public String getDireccion(){
        return this.direccion = direccion;
    }
    public void setDireccion(String direccion){
        if (direccion.equalsIgnoreCase(this.direccion)){
            System.out.println("@Error. No puede renovar su dirección si es la misma que la anterior");
        }else {
            this.direccion = direccion;
        }
    }
}
