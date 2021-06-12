package itc;

public class Circulo extends Figura {
    private double radio;
    //----private double area;

    public Circulo(){}

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double calcularArea(){
        //----return this.area = Math.PI*Math.pow(this.radio,2);
        setArea(Math.PI*Math.pow(this.radio,2));
        return getArea();
    }

}
