package Figuras;
public class Cubo extends FiguraGeometrica {
    private double lado; 
    public Cubo(double lado) {
        this.lado = lado;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    public double calcularVolumen() {
        double volumen = lado*lado*lado;
        return volumen;
    }
    public double calcularSuperficie() {
        double areaLado = lado*lado;;
        areaLado = areaLado*6;
        return areaLado;
    }
}