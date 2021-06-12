package itc;

public class Main {
   public static void main(String[] args){
       // Crear instancia de objeto
       Cliente hector = new Cliente("HEAH910404536", "hector", "hernandez", 20, 'H', "R234 M51");

       // acceder a los atributos a través de encapsulamiento
       System.out.println(hector.getNombre());
       System.out.println(hector.getApellido());
       System.out.println(hector.getEdad() + " años");
       System.out.println(hector.getGenero());
       System.out.println(hector.getDireccion());

   }


}
