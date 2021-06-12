package practica4;

public class Main {
    public static void main(String[] args){
        Libro libro1 = new Libro();

        libro1.setAutor("Edgar Allan Poe");
        libro1.setTitulo("Recopilación de Relatos");
        libro1.setEjemplares(30);
        libro1.setPrestados(12);

        Libro libro2 = new Libro();

        libro2.setAutor("Juan Sepúlveda");
        libro2.setTitulo("Un viejo que leía noovelas de amor");
        libro2.setEjemplares(14);
        libro2.setPrestados(4);

        //---------- objeto 1
        System.out.println("Autor: "+ libro1.getAutor());
        System.out.println("Título: "+ libro1.getTitulo());
        System.out.println("Ejemplares: "+ libro1.getEjemplares());
        System.out.println("Prestados: "+libro1.getPrestados());
        System.out.println("En estante: "+ libro1.Existencia());

        System.out.println();

        //--------- objeto 2
        System.out.println("Autor: "+ libro2.getAutor());
        System.out.println("Título: "+ libro2.getTitulo());
        System.out.println("Ejemplares: "+ libro2.getEjemplares());
        System.out.println("Prestados: "+libro2.getPrestados());
        System.out.println("En estante: "+ libro2.Existencia());



    }
}
