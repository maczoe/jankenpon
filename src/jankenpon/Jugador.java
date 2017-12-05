package jankenpon;

public class Jugador {
    public int tipo;
    public String nombre;
    public static final int CPU = 1;
    public static final int USUARIO = 2;
    
    public Jugador(int tipo) {
        this.tipo = tipo;
    }
    
    public void mostrarNombre() {
        System.out.println(nombre);
    }
}
