package Polimorfismo;


import javax.swing.JOptionPane;

public abstract class Operaciones {
    protected int valor1, valor2, resultado;

    public void pedirDatos(){
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
    }

    public abstract void operaciones();

    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null, "el resultado es: "+ resultado);
    }

}
