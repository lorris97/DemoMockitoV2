/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author lorris
 */
public class PatientBO extends PersonneBO{
    
    
    public String symptomes;
    public MedecinBO m;

    public MedecinBO getM() {
        return m;
    }

    public void setM(MedecinBO m) {
        this.m = m;
    }
    
    
    
   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSymptomes() {
        return symptomes;
    }

    public void setSymptomes(String symptomes) {
        this.symptomes = symptomes;
    }

    @Override
    public String toString() {
        return "PatientBO{" + "symptomes=" + symptomes+'}';
    }

    
    
    
    
    
}
