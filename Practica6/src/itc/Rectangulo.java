package itc;

public class Rectangulo {
    private double base;
    private double altura;
    private double area;

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area(){
        return this.area = this.base * this.altura;
    }
}
