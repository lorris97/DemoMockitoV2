/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import BO.MedecinBO;
import DAO.ImedecinDAO;
import Service.MedecinService;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author lorris
 */
public class DemoMockitoV2 {
    
    public DemoMockitoV2() {
    }
    
  @Mock
    ImedecinDAO dao;
 

    
    
    
    
    
    @org.junit.jupiter.api.Test
    public void testMockito() throws SQLException 
    {
        MockitoAnnotations.initMocks(this);
        
        MedecinService service = new MedecinService(dao);
        
        MedecinBO bo = new MedecinBO(); 
        bo.setPrenom("test");
        
        when(dao.getElementById(1)).thenReturn(bo);
        
        MedecinBO boTest = service.getElementById(1);
        

        Assertions.assertEquals(bo.getPrenom(),boTest.getPrenom());
                
        
        
    }  
}
