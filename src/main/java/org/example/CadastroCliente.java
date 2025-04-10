package org.example;

public class CadastroCliente {
    private LDE clientes;

    public CadastroCliente() {
        clientes = new LDE();
    }

    public boolean adicionarCliente(Cliente cliente) {
        if (buscarPorCpf(cliente.getCpf()) != null) {
            System.out.println("CPF já cadastrado.");
            return false;
        }
        clientes.insereFim(cliente);
        return true;
    }

    public boolean editarCliente(String cpf, String novoNome, String novaCnh, String novoTelefone) {
        Cliente cliente = buscarPorCpf(cpf);
        if (cliente == null) return false;

        cliente.setNome(novoNome);
        cliente.setCnh(novaCnh);
        cliente.setTelefone(novoTelefone);
        return true;
    }

    public boolean removerCliente(String cpf, boolean possuiLocacao) {
        Cliente cliente = buscarPorCpf(cpf);
        if (cliente == null) return false;

        if (possuiLocacao) {
            System.out.println("Este cliente possui locações atreladas e não pode ser removido.");
            return false;
        }

        return clientes.remove(cliente);
    }

    public Cliente buscarPorCpf(String cpf) {
        try {
            java.lang.reflect.Field headField = LDE.class.getDeclaredField("head");
            headField.setAccessible(true);
            Object head = headField.get(clientes);

            while (head != null) {
                java.lang.reflect.Field dataField = head.getClass().getDeclaredField("data");
                dataField.setAccessible(true);
                Object data = dataField.get(head);

                if (data instanceof Cliente) {
                    Cliente c = (Cliente) data;
                    if (c.getCpf().equals(cpf)) {
                        return c;
                    }
                }

                java.lang.reflect.Field nextField = head.getClass().getDeclaredField("next");
                nextField.setAccessible(true);
                head = nextField.get(head);
            }

        } catch (Exception e) {
            System.out.println("Erro ao acessar elementos da lista: " + e.getMessage());
        }

        return null;
    }

    public void listarClientesDireto() {
        System.out.println("=== Lista de Clientes (Ordem Direta) ===");
        clientes.imprimeInicioFim();
    }

    public void listarClientesReverso() {
        System.out.println("=== Lista de Clientes (Ordem Reversa) ===");
        clientes.imprimeFimInicio();
    }
}
