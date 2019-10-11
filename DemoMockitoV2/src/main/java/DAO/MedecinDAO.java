/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.MedecinBO;
import Connection.BDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public class MedecinDAO implements ImedecinDAO{
    
     
       @Override
      public ArrayList<MedecinBO> SelectAll(Statement stm) throws SQLException {
        ArrayList<MedecinBO> List = new ArrayList<MedecinBO>();

        ResultSet res = stm.executeQuery("SELECT * FROM medecin");
        while (res.next()) {
            MedecinBO b = new MedecinBO();
            b.setId(Integer.parseInt(res.getString("id")));
            b.setNom(res.getString("nom"));
            b.setPrenom(res.getString("prenom"));
            b.setIdPatient(res.getInt("idPatient"));
            List.add(b);
        }

        return List;

    }
      @Override
      public void createMedecin(MedecinBO m , Connection conn, int id) throws SQLException {
        Statement stm = conn.createStatement();
        stm.executeUpdate("INSERT INTO medecin(id, nom, prenom,idPatient ) values (" +id + ", '" 
                + m.getNom() + "' , '" +m.getPrenom()+ "' , "+m.getIdPatient()+  ")");
    }
      
      @Override
    public int MaxIdTable(String table , Statement stm) throws SQLException
    {
        int id = 0;
         ResultSet res = stm.executeQuery("SELECT max(id) as total FROM "+table);
       
        while (res.next()) {
           id = res.getInt("total");

        }
        return id + 1;
    }

    @Override
    public MedecinBO getElementById(int id) throws SQLException {
        MedecinBO bo = new MedecinBO();
        BDD bdd =new BDD();
        Statement stm = bdd.Connection().createStatement();
     ResultSet res = stm.executeQuery("SELECT * FROM medecin WHERE id="+id);
        while (res.next()) {
            
            bo.setId(res.getInt("id"));
            bo.setNom(res.getString("nom"));
            bo.setPrenom(res.getString("prenom"));
            bo.setIdPatient(res.getInt("idPatient"));
           
        
       

    
    } 
        return bo;
    }
    
}
