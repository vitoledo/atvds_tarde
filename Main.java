//classe driver

public class Main {
    public static void main(String[] args) {

        // aqui delcaramos dois objetos do tipo FIGURA
        Figura fig1 = new Figura();
        Figura fig2 = new Figura();
        // aqui delcaramos dois objetos do tipo QUADRADO
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado();
        // aqui delcaramos dois objetos do tipo TRIANGULO
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        // chamamos as variaveis
        System.out.println(fig1.calculoArea(10.0, 2.0, 3));
        System.out.println(fig2.calculoArea(10.0, 10.0, 4));

        System.out.println(quadrado1.calculoArea(10.0, 10.0, 4));
        System.out.println(quadrado2.calculoArea(10.0, 10.0, 4));

        System.out.println(triangulo1.calculoArea(10.0, 10.0, 3));
        System.out.println(triangulo2.calculoArea(10.0, 10.0, 3));

    }
}
