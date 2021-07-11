package practica14;

import javax.swing.*;

public class Persona implements Cantante {

    @Override
    public void cantar(){
        JOptionPane.showMessageDialog(null, "Nya! Ichi - Ni - San, Arigato");
    }
}
