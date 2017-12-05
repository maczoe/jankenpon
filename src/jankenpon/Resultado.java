package jankenpon;

public class Resultado {
    public int gana;
    public int pierde;
    public int empate;
    private int totalPartidas;
    
    public Resultado(int total) {
        this.totalPartidas = total;
        gana = 0;
        pierde = 0;
        empate = 0;
    }
    
    public float getPorcentajeGanadas() {
        return ((float)gana/(float)totalPartidas)*100;
    }
    
    public float getPorcentajePerdidas() {
        return ((float)pierde/(float)totalPartidas)*100;
    }
    
    public float getPorcentajeEmpate() {
        return ((float)empate/(float)totalPartidas)*100;
    }
}
