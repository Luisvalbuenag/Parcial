package com.example.informacion_vehiculo;

public class Carro {

    private String color;
    private int peso;
    private int tamano;
    private int n_sillas;
    private int ano;
    private String placa;
    private int kilometraje;

    Carro(){
        this.color = "";
        this.peso = 0;
        this.ano = 0;
        this.n_sillas = 0;
        this.tamano = 0;
        this.placa = "";
        this.kilometraje = 0;

    }

    Carro(String color,int tamano, int peso,int n_sillas,int ano,String placa,int kilometraje){

        this.color = color;
        this.peso = peso;
        this.ano = ano;
        this.n_sillas = n_sillas;
        this.tamano = tamano;
        this.placa = placa;
        this.kilometraje = kilometraje;
    }

    public void andar(){

        kilometraje=kilometraje+1;
    }

    public int getKilometraje() {return kilometraje;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getN_sillas() {
        return n_sillas;
    }

    public void setN_sillas(int n_sillas) {
        this.n_sillas = n_sillas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
