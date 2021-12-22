import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int qtdVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos;

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        listaDeVeiculos.add(new Carros(velocidade, aceleracao, anguloDeGiro, patente, 1000, 4));
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        listaDeVeiculos.add(new Motos(velocidade, aceleracao, anguloDeGiro, patente, 300, 2));
    }

    public void removerVeiculo(Veiculo v) {
        listaDeVeiculos.remove(v);
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaDeVeiculos.removeIf(e -> e.getPlaca().equalsIgnoreCase(placa));
    }

    public void vencedorDaCorrida() {
        // double formulaGanhadora = velocidade * aceleracao / ( anguloDeGiro * (peso -
        // qtdRodas * 100));

        // Implementação parecida em JavaScript
        /*
         * const arr = listaVeiculos.reduce((prev, nextElem) -> {
         *  const obj = {
         *      placa: proxElement.placa,
         *      valor: formula
         *  }
         * 
         *  prev.push(obj);
         * 
         *  return prev;
         * }, []);
         */

        Map<String, Double> participantes = new HashMap<>();
        
        // Para cada iteração, tentar adicionar dentro do HashMap "participantes"
        listaDeVeiculos
                .stream()
                .reduce(0.0, (partialResult, veiculo) -> {
                    return partialResult + veiculo.getPeso();
                }, Double::sum);
            
    }
}
