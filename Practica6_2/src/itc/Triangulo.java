package itc;

public class Triangulo extends Figura{
    private double base;
    private double altura;
    //----private double area;

    public Triangulo(){};

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea() {
        //----return this.area = (this.base * this.altura) / 2;
        setArea((this.base * this.altura)/2 );
        return getArea();
    }
}
