package Figuras;
public class PrismaRectangular extends FiguraGeometrica {
    private double largo;
    private double altura;
    private double ancho;
    public PrismaRectangular(double largo, double altura, double ancho) {
        this.largo = largo;
        this.altura = altura;
        this.ancho = ancho;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie()); 
    }
    public double calcularVolumen() {
        double volumen = largo*ancho*altura;
        return volumen;
    }
    public double calcularSuperficie() {
        double areaBase = 2*ancho*largo;
        double areaLado1 = 2*altura*largo;
        double areaLado2 = 2*altura*ancho;
        return areaBase + areaLado1 + areaLado2;
    }
}