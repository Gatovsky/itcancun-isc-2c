package practica14;

public class Automovil extends Vehiculo {
    public Automovil(int v, boolean e, String ns, int ll, int p, String c, int cp, int ve) {
        this.velocidades = v;
        this.encendido = e;
        this.numeroSerie = ns;
        this.llantas = ll;
        this.puertas = p;
        this.color = c;
        this.capPersonas = cp;
        this.velocidad = ve;
    }
}