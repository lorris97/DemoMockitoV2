/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.MedecinBO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lorris
 */
public interface ImedecinDAO {
    
    public void createMedecin(MedecinBO m , Connection conn, int id) throws SQLException;   

    public int MaxIdTable(String medecin, Statement stm) throws SQLException;
    
    public ArrayList<MedecinBO> SelectAll(Statement stm) throws SQLException;
    
    public MedecinBO getElementById(int id) throws SQLException;
    
}
