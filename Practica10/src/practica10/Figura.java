package practica10;


/*Programa de polimorfismo donde se usa sobre carga de método*/
import javax.swing.JOptionPane;

public class Figura {
    private final double area;

    public Figura(int base, int altura){
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es: "+area );
    }
    public Figura(double radio){
        area=3.14*(radio*radio);
        JOptionPane.showMessageDialog(null, "El área del círculo es: "+area );

    }
}
