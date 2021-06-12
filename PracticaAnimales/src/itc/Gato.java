package itc;

import javax.swing.JOptionPane;

public class Gato extends Animal {
    public Gato(){}

    @Override
    public void ruido(){
        JOptionPane.showMessageDialog(null, "Nyan, Nyan");

    }
}
