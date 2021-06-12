package itc;

import javax.swing.JOptionPane;

public class Cliente extends Persona{
    private final String telefono_de_contacto;


    public Cliente(String telefono_de_contacto, String nombre, int edad){
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono(){
        return this.telefono_de_contacto;
    }

    @Override
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nTelefono: " +getTelefono());
    }
}
