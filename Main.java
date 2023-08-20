
public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Circulo", 67);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 34, 89);
        Triangulo triangulo = new Triangulo("Triángulo", 64, 80);

        System.out.println("Área del " + circulo.nombre + ": " + circulo.calcularArea());
        System.out.println("Área del " + rectangulo.nombre + ": " + rectangulo.calcularArea());
        System.out.println("Área del " + triangulo.nombre + ": " + triangulo.calcularArea());
    }
}