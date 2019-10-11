/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import BO.MedecinBO;
import BO.PatientBO;

/**
 *
 * @author lorris
 */
public class ConsultationService {
    
    public String consulter(PatientBO p,MedecinBO m )
    {
       String s = "" ;
       
       
       s = "Le medecin " + m.getPrenom() + " " + m.getNom() + " consulte le patient " + p.getPrenom() + " " + p.getNom() + 
               " pour les problèmes de santé suivant  : " + p.getSymptomes();
       
       return s ; 
    }
    
}
