package itc;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    //---private double area;

    public Rectangulo(){}

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

    public double CalcularArea(){
        //----return this.area = this.base * this.altura;
        setArea(this.base*this.altura);
        return getArea();
    }
}
