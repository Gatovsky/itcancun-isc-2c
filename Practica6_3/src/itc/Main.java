/* Área de figuras con clase herencia y while*/

package itc;
import javax.swing.JOptionPane;



public class Main {

     static void crearFigura(int entrada){

        switch (entrada){
            case 1 -> {
                Circulo c1 = new Circulo();

                c1.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Radio del Círculo")));
                c1.calcularArea();
                JOptionPane.showMessageDialog(null, "El área del círculo con radio " + c1.getRadio() + " es de " + c1.getArea());
            }
            case 2 -> {
                Rectangulo r1 = new Rectangulo();

                r1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura")));
                r1.setBase(Double.parseDouble(JOptionPane.showInputDialog("Base")));
                r1.CalcularArea();
                JOptionPane.showMessageDialog(null, "El área del rectángulo es " + r1.getArea());
            }
            case 3 -> {
                Triangulo t1 = new Triangulo();

                t1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura")));
                t1.setBase(Double.parseDouble(JOptionPane.showInputDialog("Base")));
                t1.calcularArea();
                JOptionPane.showMessageDialog(null, "El área del triángulo es "+ t1.getArea());
            }

        }
    }

    public static void main(String[] args){

        int entrada = 0;
        boolean escape = false;

        do{
            do {
                try {
                    entrada = Integer.parseInt(JOptionPane.showInputDialog("Seleccionar 1. Círculo, 2. Rectángulo, 3. Triángulo ó 4. Salir"));
                    crearFigura(entrada);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Error tipo de dato");
                }
            }while(entrada < 0 || entrada > 4);

            if (entrada == 4){
                escape = true;
            }
        }while(!escape);


    }
}
