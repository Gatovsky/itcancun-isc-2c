package itc;

import javax.swing.JOptionPane;

public class Cliente extends Persona{
    private String telefono_de_contacto;

    public Cliente(){}

    public void setTelefono(String telefono_de_contacto){
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono(){
        return this.telefono_de_contacto;
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+ getNombre() + "\nEdad: "+
                getEdad() + "\nTelefono: " +getTelefono());
    }
}
