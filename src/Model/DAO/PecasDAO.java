/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.SCadastro_Fabricante;
import Model.VO.SCadastro_Fornecedores;
import Model.VO.SCadastro_PecasVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class PecasDAO {
    
    SCadastro_PecasVO ModPecas = new SCadastro_PecasVO();
    
    SCadastro_Fornecedores ModFornecedor = new SCadastro_Fornecedores();
    SCadastro_Fabricante ModFabricante = new SCadastro_Fabricante();
    
    Conecta_Banco Conexao = new Conecta_Banco ();
    Conecta_Banco ConexaoBuscas = new Conecta_Banco();
    
    
    int Cod_Fornecedor, Cod_Fabricante;
    String Nome_Combustivel, Nome_Marca, Nome_Modelo,Nome_Fabricante,Nome_Fornecedor; 
    
public void CadastroPecas (SCadastro_PecasVO ModPecas) {

//    Conecta_Banco Conexao = new Conecta_Banco ();
            
    Conexao.conexao();
    
        try {
            PreparedStatement pstPecas = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.pecas (nome_peca, aplicacao, fabricante_pecas_idfabricante_pecas, `Cod_Barras`)"+" values(?,?,?,?)");
        
            pstPecas.setString(1, ModPecas.getNome_pecas());
            pstPecas.setString(2, ModPecas.getAplicacao());
            pstPecas.setString(3, ModPecas.getFabricante());
            pstPecas.setString(4, ModPecas.getCod_Barras());
            
            pstPecas.execute();
            JOptionPane.showMessageDialog(null,"Peça Cadastrada Com Sucesso!");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    Conexao.desconecta();
}

public void AtualizarRegistro (SCadastro_PecasVO ModPecas){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.pecas SET `nome_peca` =?, `aplicacao` =?, `fabricante_pecas_idfabricante_pecas` =?, `Cod_Barras` =? where idPecas='"+ModPecas.getPesquisaIDPecas()+"'");
       
        pstAtualizar.setString(1, ModPecas.getNome_pecas());
        pstAtualizar.setString(2, ModPecas.getAplicacao());
        
        pstAtualizar.setString(3, ModPecas.getFabricante());
        pstAtualizar.setString(4, ModPecas.getCod_Barras());
        
        pstAtualizar.execute();
        
        JOptionPane.showMessageDialog(null, "Registro Atualizado com Sucesso!");
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
}

public SCadastro_PecasVO ConsultarPecasID (SCadastro_PecasVO ModPecas){
      
    Conexao.conexao();
    
    Conexao.executaSQL("select * from pecas where idPecas='"+ModPecas.getPesquisaIDPecas()+"'");
    
        try {

            Conexao.rs.first();
            
            ModPecas.setId_pecas(Conexao.rs.getInt("idPecas"));
            ModPecas.setNome_pecas(Conexao.rs.getString("nome_peca"));
            ModPecas.setAplicacao(Conexao.rs.getString("Aplicacao"));
            ModPecas.setFabricante(Conexao.rs.getString("fabricante_pecas_idfabricante_pecas"));
            ModPecas.setCod_Barras(Conexao.rs.getString("Cod_Barras"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    Conexao.desconecta();
    
    return ModPecas;
} 

//Conexao.executaSQL("select * from marca_automovel where nome_marca='"+nome_marca+"'");

public SCadastro_PecasVO Pesquisar_NomePecas (SCadastro_PecasVO ModPecas){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from pecas where nome_peca like '%"+ModPecas.getPesquisaNomePeca()+"%'");
    
        try {
            Conexao.rs.first();
            
            ModPecas.setId_pecas(Conexao.rs.getInt("idPecas"));
            ModPecas.setNome_pecas(Conexao.rs.getString("nome_peca"));
            ModPecas.setAplicacao(Conexao.rs.getString("Aplicacao"));
            ModPecas.setFabricante(Conexao.rs.getString("fabricante_pecas_idfabricante_pecas"));
            ModPecas.setCod_Barras(Conexao.rs.getString("Cod_Barras"));            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
        Conexao.desconecta();
        
    return ModPecas;
}

public void BuscarCodNomeFabricante (int Consulta_FabricantePecas){
    
    ConexaoBuscas.conexao();
    
    ConexaoBuscas.executaSQL("select * from fabricante_pecas where idfabricante_pecas='"+Consulta_FabricantePecas+"'");
    
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Fabricante = ConexaoBuscas.rs.getString("nome_fabricante");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        ConexaoBuscas.desconecta();
        
}

public void BuscarCodNomeFornecedor (int Buscar_NomeFornecedor){
    
    ConexaoBuscas.conexao();
    
    ConexaoBuscas.executaSQL("select * from fornecedor where idfornecedor='"+Buscar_NomeFornecedor+"'");
    
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Fornecedor = ConexaoBuscas.rs.getString("nome_fornecedor");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    ConexaoBuscas.desconecta();
}

public void BuscarCodFornecedor (String Nome_Fornecedor){
    
//    Conecta_Banco Conexao = new Conecta_Banco ();
    
    Conexao.conexao();
    Conexao.executaSQL("select * from fornecedor where nome_fornecedor='"+Nome_Fornecedor+"'");
    
        try {
            Conexao.rs.first();
            
            Cod_Fornecedor = Conexao.rs.getInt("idfornecedor");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    Conexao.desconecta();
}



public void BuscarCodFabricante (String Nome_Fabricante){
    
// Conecta_Banco Conexao = new Conecta_Banco ();
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from fabricante_pecas where nome_fabricante='"+Nome_Fabricante+"'");
    
        try {
            Conexao.rs.first();
            
            Cod_Fabricante = Conexao.rs.getShort("idfabricante_pecas");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    Conexao.desconecta();
}


//Fornecedores de Peças

public void CadastroFornecedores (SCadastro_Fornecedores ModFornecedor){
    
//    Conecta_Banco Conexao = new Conecta_Banco ();
    
    Conexao.conexao();
    
        try {
            PreparedStatement pstfornecedor = Conexao.conn.prepareStatement("insert into fornecedor (nome_fornecedor,cnpj_fornecedor,endereco_fornecedor,bairro_fornecedor,telefone_fornecedor,ramal_fornecedor,celular1_fornecedor,celular2_fornecedor,observacao_fornecedor )"+"values (?,?,?,?,?,?,?,?,?)");
            
            pstfornecedor.setString(1, ModFornecedor.getNome_fornecedor());
            pstfornecedor.setString(2, ModFornecedor.getCnpj_fornecedor());
            pstfornecedor.setString(3, ModFornecedor.getEndereco_fornecedor());
            pstfornecedor.setString(4, ModFornecedor.getBairro_fornecedor());
            pstfornecedor.setString(5, ModFornecedor.getTelefone_fornecedor());
            pstfornecedor.setString(6, ModFornecedor.getRamal_fornecedor());
            pstfornecedor.setString(7, ModFornecedor.getRamal_fornecedor());
            pstfornecedor.setString(8, ModFornecedor.getCelular1_fornecedor());
            pstfornecedor.setString(9, ModFornecedor.getCelular2_fornecedor());
            
            pstfornecedor.execute();
            
            JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso!");
            
        } catch (SQLException ex) {
        
        Conexao.desconecta();
        
        }
    
}


public SCadastro_Fornecedores ConsultarIDFornecedor (SCadastro_Fornecedores ModFornecedor){
    
    
    Conexao.conexao();
    
 
    Conexao.executaSQL("select * from fornecedor where idfornecedor='"+ModFornecedor.getPesquisaFornecedor()+"'");
    
    
    try{    
            if(Conexao.rs.first()){
    
            
            ModFornecedor.setId_fornecedor(Conexao.rs.getInt("idfornecedor"));
            ModFornecedor.setNome_fornecedor(Conexao.rs.getString("nome_fornecedor"));
            ModFornecedor.setCnpj_fornecedor(Conexao.rs.getString("cnpj_fornecedor"));
            ModFornecedor.setEndereco_fornecedor(Conexao.rs.getString("endereco_fornecedor"));
            ModFornecedor.setBairro_fornecedor(Conexao.rs.getString("bairro_fornecedor"));
            ModFornecedor.setTelefone_fornecedor(Conexao.rs.getString("telefone_fornecedor"));
            ModFornecedor.setRamal_fornecedor(Conexao.rs.getString("ramal_fornecedor"));
            ModFornecedor.setCelular1_fornecedor(Conexao.rs.getString("celular1_fornecedor"));
            ModFornecedor.setCelular2_fornecedor(Conexao.rs.getString("celular2_fornecedor"));
            ModFornecedor.setObservacao_fornecedor(Conexao.rs.getString("observacao_fornecedor"));
            
            
            
            }else{
                JOptionPane.showMessageDialog(null, "Não cadastrado");
            
                           ModFornecedor.setId_fornecedor(0);
            ModFornecedor.setNome_fornecedor("");
            ModFornecedor.setCnpj_fornecedor("");
            ModFornecedor.setEndereco_fornecedor("");
            ModFornecedor.setBairro_fornecedor("");
            ModFornecedor.setTelefone_fornecedor("");
            ModFornecedor.setRamal_fornecedor("");
            ModFornecedor.setCelular1_fornecedor("");
            ModFornecedor.setCelular2_fornecedor("");
            ModFornecedor.setObservacao_fornecedor("");

                
            }
        } catch (SQLException ex) {
                    
            ModFornecedor.setId_fornecedor(0);
            ModFornecedor.setNome_fornecedor("");
            ModFornecedor.setCnpj_fornecedor("");
            ModFornecedor.setEndereco_fornecedor("");
            ModFornecedor.setBairro_fornecedor("");
            ModFornecedor.setTelefone_fornecedor("");
            ModFornecedor.setRamal_fornecedor("");
            ModFornecedor.setCelular1_fornecedor("");
            ModFornecedor.setCelular2_fornecedor("");
            ModFornecedor.setObservacao_fornecedor("");

                    
        }
    
        Conexao.desconecta();
        
    return ModFornecedor;
            
}


public SCadastro_Fornecedores PesquisaNomeFornecedor (SCadastro_Fornecedores ModFornecedor){
  
    Conexao.conexao();
    
    Conexao.executaSQL("select * from fornecedor where nome_fornecedor like '%"+ModFornecedor.getPesquisaNomeFornecedor()+"%'");
    
        try {
                       if(Conexao.rs.first()){
 
            ModFornecedor.setId_fornecedor(Conexao.rs.getInt("idfornecedor"));
            ModFornecedor.setNome_fornecedor(Conexao.rs.getString("nome_fornecedor"));
            ModFornecedor.setCnpj_fornecedor(Conexao.rs.getString("cnpj_fornecedor"));
            ModFornecedor.setEndereco_fornecedor(Conexao.rs.getString("endereco_fornecedor"));
            ModFornecedor.setBairro_fornecedor(Conexao.rs.getString("bairro_fornecedor"));
            ModFornecedor.setTelefone_fornecedor(Conexao.rs.getString("telefone_fornecedor"));
            ModFornecedor.setRamal_fornecedor(Conexao.rs.getString("ramal_fornecedor"));
            ModFornecedor.setCelular1_fornecedor(Conexao.rs.getString("celular1_fornecedor"));
            ModFornecedor.setCelular2_fornecedor(Conexao.rs.getString("celular2_fornecedor"));
            ModFornecedor.setObservacao_fornecedor(Conexao.rs.getString("observacao_fornecedor"));
  
            }else{
                JOptionPane.showMessageDialog(null, "Não cadastrado");
            
                           ModFornecedor.setId_fornecedor(0);
            ModFornecedor.setNome_fornecedor("");
            ModFornecedor.setCnpj_fornecedor("");
            ModFornecedor.setEndereco_fornecedor("");
            ModFornecedor.setBairro_fornecedor("");
            ModFornecedor.setTelefone_fornecedor("");
            ModFornecedor.setRamal_fornecedor("");
            ModFornecedor.setCelular1_fornecedor("");
            ModFornecedor.setCelular2_fornecedor("");
            ModFornecedor.setObservacao_fornecedor("");

                
            }
            
           
        } catch (SQLException ex) {

                        ModFornecedor.setId_fornecedor(0);
            ModFornecedor.setNome_fornecedor("");
            ModFornecedor.setCnpj_fornecedor("");
            ModFornecedor.setEndereco_fornecedor("");
            ModFornecedor.setBairro_fornecedor("");
            ModFornecedor.setTelefone_fornecedor("");
            ModFornecedor.setRamal_fornecedor("");
            ModFornecedor.setCelular1_fornecedor("");
            ModFornecedor.setCelular2_fornecedor("");
            ModFornecedor.setObservacao_fornecedor("");


        }
    
    
    return ModFornecedor;
}


public void AtualizarFornecedor (SCadastro_Fornecedores ModFornecedor){
   
//    Conecta_Banco Conexao = new Conecta_Banco ();
    
    if(JOptionPane.showConfirmDialog(null, "Confirmar Alteração do Registro?","Pergunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
      
    Conexao.conexao();
    
    
        try {
            PreparedStatement pstfornecedor = Conexao.conn.prepareStatement("update fornecedor set nome_fornecedor=?,cnpj_fornecedor=?,endereco_fornecedor=?,bairro_fornecedor=?,telefone_fornecedor=?,ramal_fornecedor=?,celular1_fornecedor=?,celular2_fornecedor=?,observacao_fornecedor=? where idfornecedor='"+ModFornecedor.getAlterarFornecedor()+"' ");
            
            pstfornecedor.setString(1, ModFornecedor.getNome_fornecedor());
            pstfornecedor.setString(2, ModFornecedor.getCnpj_fornecedor());
            pstfornecedor.setString(3, ModFornecedor.getEndereco_fornecedor());
            pstfornecedor.setString(4, ModFornecedor.getBairro_fornecedor());
            pstfornecedor.setString(5, ModFornecedor.getTelefone_fornecedor());
            pstfornecedor.setString(6, ModFornecedor.getRamal_fornecedor());
            pstfornecedor.setString(7, ModFornecedor.getRamal_fornecedor());
            pstfornecedor.setString(8, ModFornecedor.getCelular1_fornecedor());
            pstfornecedor.setString(9, ModFornecedor.getCelular2_fornecedor());
            
            pstfornecedor.execute();
            
            JOptionPane.showMessageDialog(null, "Fornecedor Alterado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Fornecedor "+ex);
        
        
            }
        }
   Conexao.desconecta();
}



}
