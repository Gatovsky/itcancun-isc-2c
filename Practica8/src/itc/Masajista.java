package itc;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){super();}

    public void setTitulacion(String titulacion){
        this.titulacion = titulacion;
    }

    public String getTitulacion(){
        return this.titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia(){
        return this.aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Dando masaje");
    }
}
