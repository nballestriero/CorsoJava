/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulo2.Lezione7;

/**
 * Classe semplice per rappresentare una persona con nome ed età.
 */
public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Persona persona = (Persona) obj;
        return eta == persona.eta && nome.equals(persona.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + eta;
    }

    @Override
    public String toString() {
        return nome + " (" + eta + ")";
    }
}