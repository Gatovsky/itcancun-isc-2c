package menu;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.InputMismatchException;

public class MenuApp {

    public static void main(String[] args)throws Exception{
        byte sel;
        boolean salir = false;

        do {
            try{
                sel = Byte.parseByte(JOptionPane.showInputDialog("1 - Programas Herencia\n" +
                        "2 - Programas Polimorfismo\n" +
                        "3 - Programas Interfaces\n"+
                        "4 - Programas Excepciones\n" +
                        "5 - Programas Archivos\n" +
                        "6 - Finalizar Programa"));
                if(sel == 6){
                    salir = true;
                }
                if(sel >= 1 && sel <=5){
                    MenuProcess.menu(sel);
                }
            }catch (NumberFormatException | InputMismatchException | InterruptedException |IndexOutOfBoundsException | IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (!salir);
    }
}
