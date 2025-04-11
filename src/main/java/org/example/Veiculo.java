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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {

    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {

    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {

    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
    }
    public int getLugares() {
        return lugares;
    }
    public void setLugares(int lugares) {
    }

    public String toString() {
        return placa + " - " + modelo + " (" + marca + ", " + ano + "), Potência: " + potencia +
                ", Lugares: " + lugares + ", Categoria: " + categoria;
    }



}


