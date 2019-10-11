/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import BO.MedecinBO;
import DAO.ImedecinDAO;
import DAO.MedecinDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */

public class MedecinService {
    
    public ImedecinDAO dao;

    public MedecinService(ImedecinDAO dao) {
        this.dao = dao;
    }
    
    

    public ImedecinDAO getDao() {
        return dao;
    }

    public void setDao(ImedecinDAO dao) {
        this.dao = dao;
    }

    
    
    
    
    public void ajouterMedecin(MedecinBO m,  Connection conn) throws SQLException
    {
      
        Statement stm = conn.createStatement();
        int id = dao.MaxIdTable("medecin", stm);
        dao.createMedecin(m, conn, id);
    }
    
    
    public ArrayList<MedecinBO> liste (Statement stm) throws SQLException
    {
        ArrayList<MedecinBO> liste = new ArrayList<>();
     
        liste = dao.SelectAll(stm);
                 
                 
                 return liste;
    }

    
    public MedecinBO getElementById(int id) throws SQLException
    {
        MedecinBO  bo = dao.getElementById(id);
        return bo;
        
    }
    
    
}
