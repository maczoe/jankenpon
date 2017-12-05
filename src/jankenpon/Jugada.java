package jankenpon;


public class Jugada {
    public Jugador jugador;
    public int seleccion;
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    
    public String getSeleccion() {
        switch (seleccion) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                throw new AssertionError();
        }
    }
}
