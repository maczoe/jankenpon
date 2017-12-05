package jankenpon;

import java.util.Scanner;

public class Jankenpon {

    public static void main(String[] args) {
        Historial historial = new Historial();
        Cpu cpu = new Cpu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido introduzca su nombre: ");
        String nombre = sc.nextLine();
        Usuario usuario = new Usuario(nombre);
        int opcion = 0;
        while (opcion != 3) {
            imprimirMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Jugada del usuario
                    int jugar;
                    imprimirJugar();
                    jugar = sc.nextInt();
                    Jugada jugada = new Jugada();
                    jugada.jugador = usuario;
                    jugada.seleccion = jugar;
                    
                    //Jugada del CPU
                    Jugada jugarCpu = cpu.jugar();
                    
                    //Guardar la partida en el historial
                    Partida partida = new Partida(jugada, jugarCpu);
                    historial.agregarAlHistorial(partida);
                    partida.mostrarResultado(historial.getTotalPartidas());
                    break;
                case 2:
                    historial.mostrarHistorial();
                    break;
                default:
                    opcion = 3;
                    break;
            }
        }
    }

    public static void imprimirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("1. Jugar");
        System.out.println("2. Ver historial");
        System.out.println("3. Salir");
        System.out.println("------------------------");
    }
    
    public static void imprimirJugar() {
        System.out.println("----------JUGAR----------");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("------------------------");
    }

}
