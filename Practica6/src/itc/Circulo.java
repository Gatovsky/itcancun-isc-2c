package itc;

public class Circulo {
    private double radio;
    private double area;

    public double getRadio(){
        return this.radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double area(){
        return this.area = Math.PI*Math.pow(this.radio,2);
    }

}
