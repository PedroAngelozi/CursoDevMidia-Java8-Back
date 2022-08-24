package UsandoNossasClassesAbstract.plana;

public abstract class FiguraPlana {
    
    public int lado1;
    public int lado2;


    public FiguraPlana() {
        lado2 = 10;
        lado1 = 10;
    }

    public FiguraPlana(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }    
    
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    public String getDadosFormatados() {
        return lado1 + " - " + lado2;
    }
    
    @Override
    public String toString() {
        return getDadosFormatados();
    }
    
    public abstract double getAreaPlana();
    
    public abstract double getPerimetroPlana();
    
}
