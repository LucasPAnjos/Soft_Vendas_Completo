/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BD.Conecta_Banco;
import Model.VO.VItens_VendaVO;
import Model.VO.VendasVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ControleVenda {
    
    
    Conecta_Banco Conexao = new Conecta_Banco();
    
     
     int Cod_Venda, Cod_Gerente;
    
    public void Adicionar_Itens (VendasVO Mod_Itens){
        
        BuscarIDGerente(Mod_Itens.getCadastroGerente());
        
      Conexao.conexao();
        try {
            PreparedStatement pstItens = Conexao.conn.prepareStatement("insert into venda_automoveis (data_venda,Valor_venda,Vendedor_idVendedor,Cadastro_cliente_idCadastro_cliente,placa_venda)values(?,?,?,?,?)");
            
            pstItens.setString(1, Mod_Itens.getData_venda());
            pstItens.setFloat(2, Mod_Itens.getValor_Venda());
            pstItens.setInt(3, Mod_Itens.getVendedor());
            pstItens.setInt(4, Cod_Gerente);
            pstItens.setInt(4, Mod_Itens.getCliente());
            //pstItens.setInt(6, Mod_Itens.getForma_pagamento());
            pstItens.setString(5, Mod_Itens.getPlaca_vandas());
            pstItens.execute();
            
            JOptionPane.showMessageDialog(null,"Produto adicionado!");
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao realizar venda"+ex);
        }
        
    }   
 
    
    public void adicionaitem(VItens_VendaVO ModVendas){
        
        BuscarIDVenda(ModVendas.getCadastro_Vendas());
        
        Conexao.conexao();
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("insert into itens_venda (Venda_automoveis_idVenda_automoveis,Cadastro_automovel_idCadastro_automovel,QuantidadeItens_venda)values(?,?,?)");
            
            pst.setInt(1, Cod_Venda);
            pst.setInt(2, ModVendas.getIDAutomovel());
            pst.setInt(3, ModVendas.getQuantidade_venda());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Produto adicionado!");
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao realizar venda"+ex);
        }
        
    }
    
    
    public void BuscarIDVenda (String IDVenda){
        Conexao.conexao();
        Conexao.executaSQL("select * from venda_automoveis where placa_venda='"+IDVenda+"'");
        try {
            Conexao.rs.last();
            Cod_Venda=Conexao.rs.getInt("idVenda_automoveis");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca cliente" +ex);
        }
            
        Conexao.desconecta();
        
        }
    
    public void BuscarIDGerente (String IDGerente){
        Conexao.conexao();
        Conexao.executaSQL("select * from gerente where nome_gerente='"+IDGerente+"'");
        try {
            Conexao.rs.first();
            Cod_Gerente=Conexao.rs.getInt("idGerente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca gerente" +ex);
        }
            
        Conexao.desconecta();
        
        }

    
}
       
    

