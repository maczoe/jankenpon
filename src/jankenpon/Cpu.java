package jankenpon;

import java.util.Random;

public class Cpu extends Jugador {
    
    private Random generador;
    
    public Cpu() {
        super(Jugador.CPU);
        this.nombre = "CPU";
        generador = new Random();
    }
    
    public Jugada jugar() {
        Jugada jugada = new Jugada();
        jugada.jugador = this;
        jugada.seleccion = generador.nextInt(3) + 1;
        return jugada;
    }
}
