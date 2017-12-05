package jankenpon;

import java.util.ArrayList;

public class Historial {
    private ArrayList<Partida> historial;
    
    public Historial() {
        historial = new ArrayList();
    }
    
    public int getTotalPartidas() {
        return historial.size();
    }
    
    public void agregarAlHistorial(Partida partida) {
        historial.add(partida);
    }
    
    public void mostrarHistorial() {
        int i = 0;
        System.out.println("");
        System.out.println("-------HISTORIAL---------");
        for(Partida p : historial) {
            p.mostrarResultado(i+1);
            i++;
        }
        Resultado resultado = calcularPorcentaje();
        System.out.println("-------RESULTADOS---------");
        System.out.println("Ganadas: "+resultado.gana+" => "+resultado.getPorcentajeGanadas()+"%");
        System.out.println("Perdidas: "+resultado.pierde+" => "+resultado.getPorcentajePerdidas()+"%");
        System.out.println("Empate:" +resultado.empate+" => "+resultado.getPorcentajeEmpate()+"%");
        System.out.println("--------------------------");
    }
    
    private Resultado calcularPorcentaje() {
        Resultado resultado = new Resultado(historial.size());
        for(Partida p : historial) {
            switch (p.getResultado()) {
                case Partida.GANA:
                    resultado.gana++;
                    break;
                case Partida.PIERDE:
                    resultado.pierde++;
                    break;
                default:
                    resultado.empate++;
                    break;
            }
        }
        return resultado;
    }
}
