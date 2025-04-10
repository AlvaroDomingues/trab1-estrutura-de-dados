package org.example;

public class Cliente {
    private String nome;
    private String cnh;
    private String telefone;
    private String cpf;

    public Cliente(String nome, String cnh, String telefone, String cpf) {
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CNH: " + cnh + "\n" +
                "Telefone: " + telefone + "\n" +
                "CPF: " + cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente outro = (Cliente) obj;
        return this.cpf.equals(outro.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
