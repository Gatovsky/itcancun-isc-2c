package itc;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(){super();}

    public void setIdFederacion(int idFederacion){
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion(){
        return this.idFederacion;
    }
    public void DirigirPartido(){
        System.out.println("Dirigiendo partido");
    }
    public void DirigirEntrenamiento(){
        System.out.println("Dirirgiendo entrenamiento");
    }
}
