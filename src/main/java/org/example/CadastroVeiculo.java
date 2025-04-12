package org.example;

public class CadastroVeiculo {
    private LDE listaVeiculos;

    public CadastroVeiculo() {
        listaVeiculos = new LDE();
    }

    public void incluirVeiculo(Veiculo veiculo) {
        listaVeiculos.insereFim(veiculo);
        System.out.println("Veículo incluído com sucesso!");
    }

    public boolean excluirVeiculo(String placa) {
        Veiculo v = buscarVeiculo(placa);
        if (v != null) {
            // Aqui você pode colocar uma verificação com a lista de locações
            // Exemplo: if (estaLocado(v)) return false;
            return listaVeiculos.remove(v);
        }
        return false;
    }

    public Veiculo buscarVeiculo(String placa) {
        LDE.Node atual = listaVeiculos.getHead();
        while (atual != null) {
            Veiculo v = (Veiculo) atual.data;
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
            atual = atual.next;
        }
        return null;
    }

    public boolean editarVeiculo(String placa, String novoModelo, String novaMarca, String novaCategoria,
                                 int novoAno, int novaPotencia, int novosLugares) {
        Veiculo v = buscarVeiculo(placa);
        if (v != null) {
            v.setModelo(novoModelo);
            v.setMarca(novaMarca);
            v.setCategoria(novaCategoria);
            v.setAno(novoAno);
            v.setPotencia(novaPotencia);
            v.setLugares(novosLugares);
            return true;
        }
        return false;
    }

    public void listarInicioFim() {
        listaVeiculos.imprimeInicioFim();
    }

    public void listarFimInicio() {
        listaVeiculos.imprimeFimInicio();
    }
}
