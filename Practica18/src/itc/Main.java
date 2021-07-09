package itc;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String datoLeido;
        String auxiliar = null;
        int datoConvertido;

        datoLeido = JOptionPane.showInputDialog(null, "Escribe algo");
        if(datoLeido.length() > 5){
            auxiliar = "Java";

        }

        try{
            int longitud = auxiliar.length(); //---puede disparar una excepción del tipo NullPointer
            datoConvertido = Integer.parseInt(datoLeido); //---puede disparar una excepción del tipo NumberFormat
            JOptionPane.showMessageDialog(null, "Sucessful!");
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "¡Trabajando con un valor nulo!");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Imposible convertir a entero ");

        }
    }
}