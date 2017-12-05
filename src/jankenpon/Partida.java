package jankenpon;

import java.util.Date;

public class Partida {

    private Jugada jugadaUsuario;
    private Jugada jugadaCpu;
    public Date fechaHora;
    public static final int GANA = 1;
    public static final int PIERDE = 2;
    public static final int EMPATE = 0;

    public Partida(Jugada jugadaUsuario, Jugada jugadaCpu) {
        this.jugadaUsuario = jugadaUsuario;
        this.jugadaCpu = jugadaCpu;
        fechaHora = new Date();
    }

    public int getResultado() {
        Jugador ganador = calcularGanador();
        if (ganador == null) {
            return EMPATE;
        } else if (ganador.tipo == Jugador.USUARIO) {
            return GANA;
        } else {
            return PIERDE;
        }
    }

    public void mostrarResultado(int numero) {
        Jugador ganador = calcularGanador();
        System.out.println("USUARIO: "+jugadaUsuario.getSeleccion()+" - CPU: "+jugadaCpu.getSeleccion());
        if (ganador != null) {
            System.out.println("Partida #"+numero+"("+fechaHora+").El ganador de la partida es: " + ganador.nombre);
        } else {
            System.out.println("Partida #"+numero+"("+fechaHora+").La partida es un empate");
        }
    }

    private Jugador calcularGanador() {
        switch (jugadaUsuario.seleccion) {
            case Jugada.PIEDRA:
                switch (jugadaCpu.seleccion) {
                    case Jugada.PAPEL:
                        return jugadaCpu.jugador;
                    case Jugada.TIJERA:
                        return jugadaUsuario.jugador;
                    default:
                        return null;
                }
            case Jugada.PAPEL:
                switch (jugadaCpu.seleccion) {
                    case Jugada.PIEDRA:
                        return jugadaUsuario.jugador;
                    case Jugada.TIJERA:
                        return jugadaCpu.jugador;
                    default:
                        return null;
                }
            case Jugada.TIJERA:
                switch (jugadaCpu.seleccion) {
                    case Jugada.PAPEL:
                        return jugadaUsuario.jugador;
                    case Jugada.PIEDRA:
                        return jugadaCpu.jugador;
                    default:
                        return null;
                }
            default:
                return null;
        }
    }
}
