package practica4;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro(){}

    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    public int getEjemplares(){
        return this.ejemplares;
    }
    public void setPrestados(int prestados){
        this.prestados = prestados;
    }
    public int getPrestados(){
        return this.prestados;
    }
    //--------- determinar libros restantes
    public int Existencia(){
        return this.ejemplares - this.prestados;
    }

}
