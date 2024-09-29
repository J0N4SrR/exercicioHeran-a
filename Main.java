public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Quadrado", 2, 6, 6);
        quadrado.print();
        
        TrianguloEquilatero triangulo = new TrianguloEquilatero("Triângulo Equilátero", 2, 6, 6);
        triangulo.print();
        
        Cubo cubo = new Cubo("Cubo", 3, 6, 6, 6);
        cubo.print();
        
        Tetraedro tetraedro = new Tetraedro("Tetraedro", 3, 6, 0, 0);
        tetraedro.print();
    }
}
