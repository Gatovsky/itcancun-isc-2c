package itc;

import javax.swing.JOptionPane;

public class Perro extends Animal{

    public Perro(){}
    @Override
    public void ruido(){
        JOptionPane.showMessageDialog(null, "Guau, Guau");
    }
}
