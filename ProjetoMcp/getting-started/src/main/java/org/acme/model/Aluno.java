package org.acme.model;

public class Aluno {
    private int id;
    private String nome;
    private String email;
    private double notaProva;
    private double notaTrabalho;
    private double mediaFinal;

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getNotaProva() {
        return notaProva;
    }
    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }
    public double getNotaTrabalho() {
        return notaTrabalho;
    }
    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
    public double getMediaFinal() {
        return mediaFinal;
    }
    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    public double calcularMediaFinal(){
        return (this.notaProva + this.notaTrabalho) /2;
    }
    @Override
    public String toString() {
        return "Aluno [id=" + id + ", nome=" + nome + ", email=" + email + ", notaProva=" + notaProva
                + ", notaTrabalho=" + notaTrabalho + ", mediaFinal=" + mediaFinal + "]";
    }
    

    




}
