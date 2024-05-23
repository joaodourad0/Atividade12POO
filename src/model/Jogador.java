package model;

import java.util.Date;

public class Jogador {
    private int id;
    private String nome;
    private Date dataNasc;
    private double altura;
    private double peso;
    private int timeCodigo;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTimeCodigo() {
        return timeCodigo;
    }

    public void setTimeCodigo(int timeCodigo) {
        this.timeCodigo = timeCodigo;
    }
}