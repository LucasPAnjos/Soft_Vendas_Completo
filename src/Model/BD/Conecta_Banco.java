/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Conecta_Banco {
    
    public Statement stm; //Prepara e realiza pesquisa no banco de dados 
    public ResultSet rs; //Armazenar o resultado de uma pesquisa passada para o statemente
    private String driver = "com.mysql.jdbc.Driver"; //Identificar o tipo de banco (serviço mysql e etc)
    private String caminho = "jdbc:mysql://localhost:3306/lojaautomoveis"; //Localização di banco
    private String usuario = "root"; //Usuário definido
    private String senha = ""; //Senha definida
    public Connection conn; //Realizar conexao com banco de dados
    
    
    //Metodo que gerencia e conecta com banco
    public void conexao (){
        
        System.setProperty("jdbc.Drives", driver);
        try {
            conn = DriverManager.getConnection(caminho, usuario, senha);
       
        //JOptionPane.showMessageDialog(null, "Conectado com Sucesso!");
            
        } catch (SQLException ex) {
          //  JOptionPane.showMessageDialog(null, "Erro Conexão!" + ex.getMessage());
        }
        
    }


    //Metodo para realizar operações no banco
    public void executaSQL (String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de executaSQL! \n Erro:" + ex.getMessage());
        }
        
    }
    
    public void executaSQLupdates (String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
        stm.executeUpdate(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro de executaSQL! \n Erro:" + ex.getMessage());
        }
        
    }
    

// Para desconectar o banco    
    public void desconecta (){
        
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Denconectado com Sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Denconectado com Sucesso!\n Erro: "+ex.getMessage());
        }
        
    }
    
    
 
}


    

