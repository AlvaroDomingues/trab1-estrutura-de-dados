package org.example;

public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String categoria;
    private int ano;
    private int potencia;
    private int lugares;

    public Veiculo(String placa, String modelo, String marca, String categoria, int ano, int potencia, int lugares ) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.categoria = categoria;
        this.ano = ano;
        this.potencia = potencia;
        this.lugares = lugares;
    }
    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAno() {
        return ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getLugares() {
        return lugares;
    }

    // Setters
    public void setPlaca(String placa) {
    }

    public void setModelo(String modelo) {
    }

    public void setMarca(String marca) {

    }

    public void setCategoria(String categoria) {

    }

    public void setAno(int ano) {

    }

    public void setPotencia(int potencia) {
    }

    public void setLugares(int lugares) {
    }

    public String toString() {
        return "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Marca: " + marca + "\n" +
                "Ano: " + ano + "\n" +
                "Potencia: " + potencia + "\n" +
                "Lugares: " + lugares + "\n" +
                "Categoria" + categoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Veiculo outro = (Veiculo) obj;
        return placa.equals(outro.placa);
    }

}


