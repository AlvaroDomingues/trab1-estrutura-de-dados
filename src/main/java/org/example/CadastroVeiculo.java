package org.example;

public class CadastroVeiculo {
    private NoVeiculo inicio;
    private NoVeiculo fim;

    public void adicionarVeiculo(Veiculo v){
        NoVeiculo novo = new NoVeiculo(v);
        if (inicio == fim){
            inicio = fim = novo;
        }
        else{
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        System.out.println("Veiculo adicionado! + veiculo: " + v);
    }
    public void listarVeiculosInicio() {
        NoVeiculo atual = inicio;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.proximo;
        }
    }
    public void listarVeiculosFim() {
        NoVeiculo atual = fim;
        while (atual != null) {
            System.out.println(atual);
            atual = atual.anterior;
        }
    }


}
