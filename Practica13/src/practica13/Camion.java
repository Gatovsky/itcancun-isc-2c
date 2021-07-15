package practica13;

public class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(int v, boolean e, String ns, int ll, int p, String c, int cp, int ve, int cc) {
        this.velocidades = v;
        this.encendido = e;
        this.numeroSerie = ns;
        this.llantas = ll;
        this.puertas = p;
        this.color = c;
        this.capPersonas = cp;
        this.velocidad = ve;
        this.setCapacidadCarga(cc);
    }

    public void setCapacidadCarga(int capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}