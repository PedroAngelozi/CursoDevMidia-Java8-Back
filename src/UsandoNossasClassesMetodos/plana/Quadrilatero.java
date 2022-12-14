package UsandoNossasClassesMetodos.plana;


public class Quadrilatero {
    
    private int lado1;
    private int lado2;
    
    public Quadrilatero() {
        lado1 = 10;
        lado2 = 10;
    }
    
    public Quadrilatero( int l1, int l2 ) {
        lado1 = l1;
        lado2 = l2;
    }
    
    public int getLado1() {
        return lado1;
    }
    
    public int getLado2() {
        return lado2;
    }
    
    public void setLado1( int l1 ) {
        if ( l1 > 0 ) {
            lado1 = l1;
        } else {
            lado1 = 0;
        }
    }
    
    public void setLado2( int l2 ) {
        if ( l2 > 0 ) {
            lado2 = l2;
        } else {
            lado2 = 0;
        }
    }
    
    public String getDadosFormatados() {
        return lado1 + " - " + lado2;
    }
    
    public String toString() {
       return getDadosFormatados(); 
    }
    
    public double getAreaPlana() {
        return lado1 * lado2 ;
    }
    
    public double getPerimetroPlana() {
        return (2 * lado1) + (2 * lado2);
    }
    
    public boolean isQuadradoPlana() {
        if ( lado1 == lado2 ) {
            return true;
        } else {
            return false;
        } 
    }
    
    public boolean isRetanguloPlana() {
        return ! isQuadradoPlana();        
    }
}
