package practica14;

public interface InterfaceVehiculo {
    final int VELOCIDAD_MAXIMA=160;
    public void frenar();
    public void acelerar(int velocidad);
    public void encender();
    public void apagar();
}
