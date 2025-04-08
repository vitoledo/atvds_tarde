//superclasse

public class Figura {
    private double base;
    private double altura;
    private int numeroLados;
    private String cor;

    // funções contrutoras
    public Figura() {
    }

    public Figura(double base, double altura, int numeroLados, String cor) {
        this.base = base;
        this.altura = altura;
        this.numeroLados = numeroLados;
        this.cor = cor;
    }

    public Figura(double base, double altura, int numeroLados) {
        this.base = base;
        this.altura = altura;
        this.numeroLados = numeroLados;
    }

    public Figura(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // getters e setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // função calcular area, com um if pra ver se é quadrado ou triangulo
    public double calculoArea(double base, double altura, int numeroLados) {
        double area;
        if (numeroLados > 3) {
            area = base * base;
            return area;
        } else {
            area = (base * altura) / 2;
            return area;
        }
    }
}