package itc;

/**
 *
 * @author vanit
 */
public class Taxi extends Vehiculo {
    private int numLicencia;
    
    public Taxi(){}
    
    public void setNumLicencia(int numLicencia){
        this.numLicencia = numLicencia;
    }
    
    public int getNumLicencia(){
        return this.numLicencia;
    }
    
}
