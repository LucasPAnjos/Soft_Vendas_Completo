/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_ClienteVO;
import Model.VO.Cadastro_FuncionarioVO;
import Model.VO.Estoque_PecasVO;
import Model.VO.Estoque_ProdutosVO;
import Model.VO.ItensVenda_Pecas;
import Model.VO.SCadastro_PecasVO;
import Model.VO.VItens_VendaVO;
import Model.VO.VendasPecasVO;
import Model.VO.VendasVO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iniciar
 */
public class VendasPecasDAO {
    
    
    Conecta_Banco Conexao = new Conecta_Banco();
    ItensVenda_Pecas ModItens_Pecas = new ItensVenda_Pecas();
    
    public void IniciarVenda_Pecas (VendasPecasVO ModVenda_Pecas){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO venda_pecas (data_venda, Funcionario_Dados_idFuncionario, Cadastro_cliente_idCadastro_cliente, Total_venda, Total_desconto, Total_venda_bruto, Situacao_Venda)"+"VALUES (?,?,?,?,?,?,?)");
            
            pst.setString(1, ModVenda_Pecas.getData_VendaPecas());
            pst.setInt(2, ModVenda_Pecas.getIDFuncionario_Vendedor());
            pst.setInt(3, ModVenda_Pecas.getIDCliente());
            pst.setFloat(4, ModVenda_Pecas.getTotal_Venda());
            pst.setFloat(5, ModVenda_Pecas.getTotal_desconto());
            pst.setFloat(6, ModVenda_Pecas.getTotal_venda_bruto());
            pst.setString(7, ModVenda_Pecas.getSituacao());
            
            pst.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
     
            JOptionPane.showMessageDialog(null, "erro: "+ex);
        
        }
        Conexao.desconecta();
        
    }
    
    
    public void AtualizarVenda_Pecas (VendasPecasVO ModVenda_Pecas){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE venda_pecas set data_venda=?, Funcionario_Dados_idFuncionario=?, Cadastro_cliente_idCadastro_cliente=?, Total_venda=?, Total_desconto=?, Total_venda_bruto=?, Forma_Pagamento=?, Valor_Entrada=?, Percentual_Juros_AM=?, Quant_Parcelas=?, Total_Prazo=?, Valor_Parcelas=?, Vencimento1=?, Vencimento2=?, Vencimento3=?, Situacao_Venda=? where idVenda_pecas='"+ModVenda_Pecas.getIdVenda_Pecas()+"'");
            
            pst.setString(1, ModVenda_Pecas.getData_VendaPecas());
            pst.setInt(2, ModVenda_Pecas.getIDFuncionario_Vendedor());
            pst.setInt(3, ModVenda_Pecas.getIDCliente());
            pst.setFloat(4, ModVenda_Pecas.getTotal_Venda());
            pst.setFloat(5, ModVenda_Pecas.getTotal_desconto());
            pst.setFloat(6, ModVenda_Pecas.getTotal_venda_bruto());
            pst.setString(7, ModVenda_Pecas.getForma_pagamento());
            
            pst.setFloat(8, ModVenda_Pecas.getValor_Entrada());
            pst.setFloat(9, ModVenda_Pecas.getPercentual_Juros_AM());
            pst.setInt(10, ModVenda_Pecas.getQuant_Parcelas());
            pst.setFloat(11, ModVenda_Pecas.getTotal_Prazo());
            pst.setFloat(12, ModVenda_Pecas.getValor_Parcelas());
            
            pst.setString(13, ModVenda_Pecas.getVencimento1());
            pst.setString(14, ModVenda_Pecas.getVencimento2());
            pst.setString(15, ModVenda_Pecas.getVencimento3());
            pst.setString(16, ModVenda_Pecas.getSituacao());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Venda Salva"); 
            
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "erro: "+ex);
        
        }
        
        Conexao.desconecta();
    }
    
    public void Atualizar_Liquido (VendasPecasVO ModVenda_Pecas){
        
        Conexao.conexao();
        
        PreparedStatement pstLiquido;
        try {
        
            pstLiquido = Conexao.conn.prepareStatement("UPDATE venda_pecas set Total_Liquido=?  where idVenda_pecas='"+ModVenda_Pecas.getIdVenda_Pecas()+"'");
        
            pstLiquido.setFloat(1, ModVenda_Pecas.getLiquido());
            
            pstLiquido.execute();
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
        
    }
    
    //Verificar
    public void AtualizarItensVenda_Pecas (VendasPecasVO ModVenda_Pecas){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE venda_pecas set data_venda=?, Funcionario_Dados_idFuncionario=?, Cadastro_cliente_idCadastro_cliente=?, Total_venda=?, Total_desconto=?, Total_venda_bruto=?, Forma_Pagamento=? where idVenda_pecas='"+ModVenda_Pecas.getIdVenda_Pecas()+"', and '"+ModItens_Pecas.getId_Peca()+"'");
            
            pst.setString(1, ModVenda_Pecas.getData_VendaPecas());
            pst.setInt(2, ModVenda_Pecas.getIDFuncionario_Vendedor());
            pst.setInt(3, ModVenda_Pecas.getIDCliente());
            pst.setFloat(4, ModVenda_Pecas.getTotal_Venda());
            pst.setFloat(5, ModVenda_Pecas.getTotal_desconto());
            pst.setFloat(6, ModVenda_Pecas.getTotal_venda_bruto());
            pst.setString(7, ModVenda_Pecas.getForma_pagamento());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Venda Salva"); 
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
     
            JOptionPane.showMessageDialog(null, "erro: "+ex);
        
        }
        
        Conexao.desconecta();
    }
    
    
    public void Adicionar_Itens_VendasPecas (ItensVenda_Pecas ModItensVenda_Pecas){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAdicionar = Conexao.conn.prepareStatement("insert into itensvenda_pecas (Quantidade_pecas, ValorVenda_Pecas, Venda_pecas_idVenda_pecas, Pecas_idPecas, desconto_pecas, ValorTotal_parcial)"+"values(?,?,?,?,?,?)");
        
        pstAdicionar.setFloat(1, ModItensVenda_Pecas.getQuantidade_pecas());
        pstAdicionar.setFloat(2, ModItensVenda_Pecas.getValorvenda_pecas());
        pstAdicionar.setInt(3, ModItensVenda_Pecas.getId_venda());
        pstAdicionar.setInt(4, ModItensVenda_Pecas.getId_Peca());
        pstAdicionar.setFloat(5, ModItensVenda_Pecas.getDeconto());
        pstAdicionar.setFloat(6, ModItensVenda_Pecas.getValortotal_parcial());
        
        pstAdicionar.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        JOptionPane.showMessageDialog(null, "erro: "+ex);
        
        }
        Conexao.desconecta();
    }

    
    public void Atualizar_Adicionar_Itens_VendasPecas (ItensVenda_Pecas ModItens_Pecas){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAdicionar = Conexao.conn.prepareStatement("update itensvenda_pecas set Quantidade_pecas=?, ValorVenda_Pecas=?, desconto_pecas=?, ValorTotal_parcial=? where Venda_pecas_idVenda_pecas='"+ModItens_Pecas.getId_venda()+"' and Pecas_idPecas='"+ModItens_Pecas.getId_Peca()+"'");
        
        pstAdicionar.setFloat(1, ModItens_Pecas.getQuantidade_pecas());
        pstAdicionar.setFloat(2, ModItens_Pecas.getValorvenda_pecas());
        //pstAdicionar.setInt(3, ModItens_Pecas.getId_venda());
        //pstAdicionar.setInt(4, ModItens_Pecas.getId_Peca());
        pstAdicionar.setFloat(3, ModItens_Pecas.getDeconto());
        pstAdicionar.setFloat(4, ModItens_Pecas.getValortotal_parcial());
        
        pstAdicionar.execute();
        
        } catch (SQLException ex) {
            //Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        JOptionPane.showMessageDialog(null, "erro: "+ex);
        
        }
        Conexao.desconecta();
    }
    

   public void Pesquisar_Vendedor (Cadastro_FuncionarioVO ModFuncionario){
       
       Conexao.conexao();
       
       Conexao.executaSQL("select * from funcionario_dados where idFuncionario='"+ModFuncionario.getID_Funcionario()+"'");
       
        try {
            Conexao.rs.first();
            
            ModFuncionario.setID_Funcionario(Conexao.rs.getInt("idFuncionario"));
            ModFuncionario.setNome_Funcionario(Conexao.rs.getString("Nome_Funcionario"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Registro Não Localizado!");
            ModFuncionario.setNome_Funcionario("");
                        
            
        }
       
        Conexao.desconecta();
        
   } 

    
   public void Pesquisar_Cliente_VendasPecas (Cadastro_ClienteVO ModCliente){
       
       Conexao.conexao();
       
       Conexao.executaSQL("select * from cadastro_cliente where idCadastro_cliente ='"+ModCliente.getPesquisa_Cliente()+"'");
       
        try {
            Conexao.rs.first();
            
            ModCliente.setId_cliente(Conexao.rs.getInt("idCadastro_cliente"));
            ModCliente.setNome_cliente(Conexao.rs.getString("nome_cliente"));
            ModCliente.setCpf(Conexao.rs.getString("cpf"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Registro Não Localizado!");
            
            ModCliente.setNome_cliente("");
            ModCliente.setCpf("");
            
            
        }
       
        Conexao.desconecta();
   }
   
   
   public void Pesquisar_VendasPecas(SCadastro_PecasVO ModPecas, Estoque_ProdutosVO ModEstoque2){
       
       Conexao.conexao();
       
       Conexao.executaSQL("select * from pecas inner join estoque on pecas.`idPecas` = estoque.`Pecas_idPecas` where pecas.`idPecas` ='"+ModPecas.getId_pecas()+"'");
       
        try {
            Conexao.rs.first();
            
            ModPecas.setId_pecas(Conexao.rs.getInt("idPecas"));
            ModPecas.setNome_pecas(Conexao.rs.getString("nome_peca"));
            ModPecas.setAplicacao(Conexao.rs.getString("Cod_Barras"));
            ModEstoque2.setValor_venda_unitario(Conexao.rs.getFloat("Valor_venda_unitario"));   
            ModEstoque2.setQuantidade_em_Estoque(Conexao.rs.getFloat("Quant_em_estoque"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Registro Não Localizado!");
            
            ModPecas.setNome_pecas("");
            ModEstoque2.setValor_venda_unitario(0);
            ModEstoque2.setQuantidade_em_Estoque(0);
        }
   
   Conexao.desconecta();
   }

   
public void Finalizar_Venda (VendasPecasVO ModVenda_Pecas){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("update venda_pecas set data_venda=?, Funcionario_Dados_idFuncionario=?, Cadastro_cliente_idCadastro_cliente=?, Total_venda=? where idVenda_pecas='"+ModVenda_Pecas.getIdVenda_Pecas()+"'");
        
        pst.setString(1, ModVenda_Pecas.getData_VendaPecas());
        pst.setInt(2, ModVenda_Pecas.getIDFuncionario_Vendedor());
        pst.setInt(3, ModVenda_Pecas.getIDCliente());
        pst.setFloat(4, ModVenda_Pecas.getTotal_Venda());
        
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Venda Salva");
        
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    Conexao.desconecta();
}
   
   
public VendasPecasVO Pesquisar_Venda (VendasPecasVO ModVendas_Pecas, ItensVenda_Pecas Mod_ItensVendas, SCadastro_PecasVO ModPecas, Cadastro_ClienteVO ModCliente, Estoque_ProdutosVO ModEstoque2){
    
    Conexao.conexao();
    
    Conexao.executaSQL("SELECT * FROM itensvenda_pecas inner join pecas on itensvenda_pecas.`Pecas_idPecas` = pecas.`idPecas` inner join venda_pecas on itensvenda_pecas.`Venda_pecas_idVenda_pecas` = venda_pecas.`idVenda_pecas` inner join cadastro_cliente on venda_pecas.`Cadastro_cliente_idCadastro_cliente` = cadastro_cliente.`idCadastro_cliente` inner join estoque on pecas.`idPecas` = estoque.`Pecas_idPecas` where itensvenda_pecas.`Venda_pecas_idVenda_pecas` ='"+ModVendas_Pecas.getIdVenda_Pecas()+"'");
    
        try {
            Conexao.rs.first();
            //Venda
            ModVendas_Pecas.setData_VendaPecas(Conexao.rs.getString("data_venda"));
            ModVendas_Pecas.setIDFuncionario_Vendedor(Conexao.rs.getInt("Funcionario_Dados_idFuncionario"));
            ModVendas_Pecas.setIDCliente(Conexao.rs.getInt("Cadastro_cliente_idCadastro_cliente"));
            ModVendas_Pecas.setTotal_Venda(Conexao.rs.getFloat("Total_venda"));
            ModVendas_Pecas.setTotal_desconto(Conexao.rs.getFloat("Total_desconto"));
            ModVendas_Pecas.setTotal_venda_bruto(Conexao.rs.getFloat("Total_venda_bruto"));
            ModVendas_Pecas.setForma_pagamento(Conexao.rs.getString("Forma_Pagamento"));
            
            ModVendas_Pecas.setValor_Entrada(Conexao.rs.getFloat("Valor_Entrada"));
            ModVendas_Pecas.setPercentual_Juros_AM(Conexao.rs.getFloat("Percentual_Juros_AM"));
            ModVendas_Pecas.setQuant_Parcelas(Conexao.rs.getInt("Quant_Parcelas"));
            ModVendas_Pecas.setTotal_Prazo(Conexao.rs.getFloat("Total_Prazo"));
            ModVendas_Pecas.setValor_Parcelas(Conexao.rs.getFloat("Valor_Parcelas"));
           
            ModVendas_Pecas.setVencimento1(Conexao.rs.getString("Vencimento1"));

            ModVendas_Pecas.setSituacao(Conexao.rs.getString("Situacao_Venda"));
            
            //Itens venda
           Mod_ItensVendas.setQuantidade_pecas(Conexao.rs.getInt("Quantidade_pecas"));
           Mod_ItensVendas.setValorvenda_pecas(Conexao.rs.getFloat("ValorVenda_Pecas"));
           Mod_ItensVendas.setId_Peca(Conexao.rs.getInt("Pecas_idPecas"));
           Mod_ItensVendas.setDeconto(Conexao.rs.getFloat("desconto_pecas"));
           Mod_ItensVendas.setValortotal_parcial(Conexao.rs.getFloat("ValorTotal_parcial"));
           
           //Peças
           ModPecas.setNome_pecas(Conexao.rs.getString("nome_peca"));

           //Estoque
           ModEstoque2.setValor_venda_unitario(Conexao.rs.getFloat("Valor_venda_unitario"));
           
           //Cliente
           ModCliente.setNome_cliente(Conexao.rs.getString("nome_cliente"));
           ModCliente.setCpf(Conexao.rs.getString("cpf"));
           
           
           
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Conexao.desconecta();
        
    return ModVendas_Pecas;
}


public VendasPecasVO Pesquisar_VendaSemItens (VendasPecasVO ModVendas_Pecas, Cadastro_ClienteVO ModCliente){
    
    Conexao.conexao();
    
    Conexao.executaSQL("SELECT * FROM venda_pecas inner join cadastro_cliente on venda_pecas.`Cadastro_cliente_idCadastro_cliente` = cadastro_cliente.`idCadastro_cliente` inner join funcionario_dados on venda_pecas.`Funcionario_Dados_idFuncionario` = funcionario_dados.`idFuncionario` where `idVenda_pecas` ='"+ModVendas_Pecas.getIdVenda_Pecas()+"'");
    
        try {
            Conexao.rs.first();
            //Venda
            ModVendas_Pecas.setData_VendaPecas(Conexao.rs.getString("data_venda"));
            ModVendas_Pecas.setIDFuncionario_Vendedor(Conexao.rs.getInt("Funcionario_Dados_idFuncionario"));
            ModVendas_Pecas.setIDCliente(Conexao.rs.getInt("Cadastro_cliente_idCadastro_cliente"));
//            ModVendas_Pecas.setTotal_Venda(Conexao.rs.getFloat("Total_venda"));
//            ModVendas_Pecas.setTotal_desconto(Conexao.rs.getFloat("Total_desconto"));
//            ModVendas_Pecas.setTotal_venda_bruto(Conexao.rs.getFloat("Total_venda_bruto"));
//            ModVendas_Pecas.setForma_pagamento(Conexao.rs.getString("Forma_Pagamento"));
            
//            ModVendas_Pecas.setValor_Entrada(Conexao.rs.getFloat("Valor_Entrada"));
//            ModVendas_Pecas.setPercentual_Juros_AM(Conexao.rs.getFloat("Percentual_Juros_AM"));
//            ModVendas_Pecas.setQuant_Parcelas(Conexao.rs.getInt("Quant_Parcelas"));
//            ModVendas_Pecas.setTotal_Prazo(Conexao.rs.getFloat("Total_Prazo"));
//            ModVendas_Pecas.setValor_Parcelas(Conexao.rs.getFloat("Valor_Parcelas"));
           
//            ModVendas_Pecas.setVencimento1(Conexao.rs.getString("Vencimento1"));

            ModVendas_Pecas.setSituacao(Conexao.rs.getString("Situacao_Venda"));
            
           
           //Cliente
           ModCliente.setNome_cliente(Conexao.rs.getString("nome_cliente"));
           ModCliente.setCpf(Conexao.rs.getString("cpf"));
           
           
           
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Conexao.desconecta();
        
    return ModVendas_Pecas;
}



public void Atualizar_EstoquePecas (SCadastro_PecasVO ModPecas, Estoque_ProdutosVO ModEstoque2){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.estoque SET `Quant_em_estoque` =? WHERE `idEstoque` ='"+ModPecas.getId_pecas()+"'");
        
        
        pst.setFloat(1, ModEstoque2.getQuantidade_em_Estoque());
        
        pst.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Conexao.desconecta();

}

public void ConsultarEstoque (Estoque_PecasVO ModPesquisa_Estoque){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from pecas where idPecas ='"+ModPesquisa_Estoque.getIdPecas_Estoque()+"'");
        
        try {
            Conexao.rs.first();
            
            ModPesquisa_Estoque.setQuantidadePecas_Estoque(Conexao.rs.getInt("quantidade_pecas"));
            
            ModPesquisa_Estoque.setEstoquePecas_Restante(ModPesquisa_Estoque.getQuantidadePecas_Estoque() - ModPesquisa_Estoque.getQuantidadePecas_Vendida());
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstEstoque = Conexao.conn.prepareStatement("update pecas set quantidade_pecas=? where idPecas='"+ModPesquisa_Estoque.getIdPecas_Estoque()+"'");
            
            pstEstoque.setFloat(1, ModPesquisa_Estoque.getEstoquePecas_Restante());
            
            pstEstoque.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }


public void Atualizar_ItensVenda_Pecas (ItensVenda_Pecas ModItens_Pecas){
    
    Conexao.conexao();

try {    
    PreparedStatement pstCadastrarItens = Conexao.conn.prepareStatement("update itensvenda_pecas set Quantidade_pecas=?, ValorVenda_Pecas=?, desconto_pecas=?, ValorTotal_parcial=? where Venda_pecas_idVenda_pecas='"+ModItens_Pecas.getId_venda()+"' and Pecas_idPecas ='"+ModItens_Pecas.getId_Peca()+"'");
            
            pstCadastrarItens.setFloat(1, ModItens_Pecas.getQuantidade_pecas());
            pstCadastrarItens.setFloat(2, ModItens_Pecas.getValorvenda_pecas());
           // pstCadastrarItens.setInt(3, ModItensVendas.getID_Venda());
            //pstCadastrarItens.setInt(3, ModItensVendas.getIDAutomovel());
            
            pstCadastrarItens.setFloat(3, ModItens_Pecas.getDeconto());
            pstCadastrarItens.setFloat(4, ModItens_Pecas.getValortotal_parcial());
            
            pstCadastrarItens.execute();
            
            JOptionPane.showMessageDialog(null, "Item Atualizado");
            
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
    
}


public void Devolver_ItemEstoque (ItensVenda_Pecas ModItens_Pecas){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.estoque SET `Quant_em_estoque` =? WHERE `Pecas_idPecas` ='"+ModItens_Pecas.getId_Peca()+"'");
       
            pst.setFloat(1, ModItens_Pecas.getQuantidade_pecas());
            pst.execute();
        
        } catch (SQLException ex) {
            Logger.getLogger(VendasPecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    Conexao.desconecta();
}





}
