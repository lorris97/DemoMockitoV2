/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import BO.PatientBO;

/**
 *
 * @author lorris
 */
public class MedecinBO extends PersonneBO{

    public PatientBO p;
    public int idPatient;

    public PatientBO getP() {
        return p;
    }

    public void setP(PatientBO p) {
        this.p = p;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

   
    
    
    
    
    
            
    
    
    
    
}
