package jankenpon;


public class Usuario extends Jugador {
    
    public Usuario(String nombre) {
        super(Jugador.USUARIO);
        this.nombre = nombre;
    }
}
