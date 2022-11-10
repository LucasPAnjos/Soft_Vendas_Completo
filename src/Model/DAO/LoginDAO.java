/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_LoginVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iniciar
 */
public class LoginDAO {
    
    
    Cadastro_LoginVO ModLogin = new Cadastro_LoginVO();
    Conecta_Banco Conexao = new Conecta_Banco();
    
    
    
    public void Cadastrar_novoLogin (Cadastro_LoginVO ModLogin){
        
        Conexao.conexao();
        
        try {
            
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.login (`Nome_acesso`, `Senha`, `Permissao`, `Funcionario_Dados_idFuncionario`) \n" +
"	VALUES (?,?,?,?)");
        
            pst.setString(1, ModLogin.getNome_acesso());
            pst.setString(2, ModLogin.getSenha());
            pst.setString(3, ModLogin.getPermissao());
            
            pst.setInt(4, ModLogin.getIdFuncionario());
            
        pst.execute();
            
    
            JOptionPane.showMessageDialog(null, "Novo Login Cadastrado Com Sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        JOptionPane.showMessageDialog(null, ex);
        }
        

        
    }
    
    
    public Cadastro_LoginVO ConsultarLogin (Cadastro_LoginVO ModLogin){
        
        Conexao.conexao();
        
        Conexao.executaSQL("SELECT * FROM login inner join funcionario_dados on login.`Funcionario_Dados_idFuncionario` = funcionario_dados.`idFuncionario` where login.`Funcionario_Dados_idFuncionario` ='"+ModLogin.getIdFuncionario()+"'");
        
        try {
            Conexao.rs.first();
                        
            ModLogin.setIdFuncionario(Conexao.rs.getInt("idFuncionario"));
            ModLogin.setNome_funcionario(Conexao.rs.getString("Nome_Funcionario"));
            ModLogin.setSenha(Conexao.rs.getString("Senha"));
            ModLogin.setPermissao(Conexao.rs.getString("Permissao"));
            ModLogin.setNome_acesso(Conexao.rs.getString("Nome_acesso"));
            
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Não à login cadastrado");
        
             ModLogin.setIdFuncionario(0);
            ModLogin.setNome_funcionario("");
            ModLogin.setSenha("");
            ModLogin.setPermissao("");
            ModLogin.setNome_acesso("");
            
        
        }
        
        return ModLogin;
    }
    
    
    public void Atualizar_login (Cadastro_LoginVO ModLogin){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update login set Nome_acesso=?,Senha=?,Permissao=? where Funcionario_Dados_idFuncionario='"+ModLogin.getIdFuncionario()+"'");
        
        pstAtualizar.setString(1, ModLogin.getNome_acesso());
        pstAtualizar.setString(2, ModLogin.getSenha());
        pstAtualizar.setString(3, ModLogin.getPermissao());
        
        pstAtualizar.execute();
        
        JOptionPane.showMessageDialog(null, "Login Atualizado Com Suecesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        JOptionPane.showMessageDialog(null, "Erro ao Atualizar!"+ex);
            
        }
        
    }
  
    public Cadastro_LoginVO Pesquisar_Funcionario (Cadastro_LoginVO ModLogin){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from funcionario_dados where idFuncionario='"+ModLogin.getIdFuncionario()+"'");
        try {
            Conexao.rs.first();
            
            ModLogin.setIdFuncionario(Conexao.rs.getInt("idFuncionario"));
            ModLogin.setNome_funcionario(Conexao.rs.getString("Nome_Funcionario"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ModLogin;
    }
    
}
