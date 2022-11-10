/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_NFVO;
import Model.VO.ContasPagarVO;
import Model.VO.Estoque_ProdutosVO;
import Model.VO.Fechamento_CaixaVO;
import Model.VO.SCadastro_Fornecedores;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ContasPagarDAO {
    
    ContasPagarVO ModContasPagar = new ContasPagarVO();
    SCadastro_Fornecedores ModFornecedor = new SCadastro_Fornecedores();
    
    Conecta_Banco Conexao = new Conecta_Banco();
    Conecta_Banco ConexaoBuscas = new Conecta_Banco();
    Conecta_Banco ConexaoLiquido = new Conecta_Banco();
    
    int Cod_Fornecedor;
    String Nome_Fornecedor;
    
    public void Valor_Dsponivel (ContasPagarVO ModContas){
  
        //Atualizar Liquido (A Vista)
        ConexaoLiquido.conexao();
        ConexaoLiquido.executaSQL("SELECT SUM(`Total_venda`) FROM venda_pecas WHERE `Forma_Pagamento` ='"+"A Vista"+"'");
            try {
                ConexaoLiquido.rs.first();
                
                ModContas.setValor_Disponivel(ConexaoLiquido.rs.getFloat("SUM(`Total_venda`)"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex);
            }
        

        
    }
    
  
      public void Valor_DsponivelPrazo (ContasPagarVO ModContas){
  
        //Atualizar Liquido (Prazo)
        ConexaoLiquido.conexao();
        ConexaoLiquido.executaSQL("SELECT SUM(`Total_Liquido`) FROM venda_pecas WHERE venda_pecas.`Forma_Pagamento`=\"A Prazo\"");
            try {
                ConexaoLiquido.rs.first();
                
                ModContas.setValor_Disponivel2(ConexaoLiquido.rs.getFloat("SUM(`Total_Liquido`)"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex);
            }
        

        
    }
  

          public void Valor_Dsponivel_Dia (ContasPagarVO ModContas){
  
        //Atualizar Liquido (Prazo)
        ConexaoLiquido.conexao();
        ConexaoLiquido.executaSQL("SELECT SUM(`Total_venda`) FROM venda_pecas WHERE `Forma_Pagamento` ='"+"A Vista"+"' and data_venda>'"+ModContas.getData_Pagamento()+"'");
            try {
                ConexaoLiquido.rs.first();
                
                ModContas.setValor_Disponivel(ConexaoLiquido.rs.getFloat("SUM(`Total_venda`)"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex);
            }
        

        
    }
    
  
      public void Valor_DsponivelPrazo_Dia (ContasPagarVO ModContas){
  
        //Atualizar Liquido (Prazo)
        ConexaoLiquido.conexao();
        ConexaoLiquido.executaSQL("SELECT SUM(`Valor_pago`) FROM pag_prazo WHERE `Data_pag`>'"+ModContas.getData_Pagamento()+"'");
            try {
                ConexaoLiquido.rs.first();
                
                ModContas.setValor_Disponivel2(ConexaoLiquido.rs.getFloat("SUM(`Valor_pago`)"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex);
            }
        

        
    }

      
      public void Valor_Pagamentos (ContasPagarVO ModContas){
  
        //Atualizar Liquido (Prazo)
        ConexaoLiquido.conexao();
        ConexaoLiquido.executaSQL("SELECT SUM(`Valor_total_NF`) FROM nota_fiscal WHERE `Pagamento`='"+"Pago"+"'");
            try {
                ConexaoLiquido.rs.first();
                
                ModContas.setValor_Disponivel3(ConexaoLiquido.rs.getFloat("SUM(`Valor_total_NF`)"));
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: "+ex);
            }
        

        
    }
      
    
    public void Pesquisar_Contas (Estoque_ProdutosVO ModEstoque, Cadastro_NFVO ModNF){
        
        Conexao.conexao();
        
        Conexao.executaSQL("SELECT * FROM estoque inner join fornecedor on estoque.fornecedor_idfornecedor = fornecedor.idfornecedor inner join pecas on estoque.`Pecas_idPecas` = pecas.`idPecas` inner join nota_fiscal on pecas.`idPecas` = nota_fiscal.`Pecas_idPecas` where nota_fiscal.`Numero_NF` ='"+ModNF.getNumero_NF()+"'");
        try {
            Conexao.rs.first();
            
            //Dados NF
            ModNF.setSituacao(Conexao.rs.getString("Pagamento"));
            ModNF.setNumero_NF(Conexao.rs.getString("Numero_NF"));
            ModNF.setValor_total_NF(Conexao.rs.getFloat("Valor_total_NF"));
            
            //Dados Fornecedor
            ModEstoque.setFornecedor(Conexao.rs.getInt("idfornecedor"));
            ModEstoque.setForncedor(Conexao.rs.getString("nome_fornecedor"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void PesquisarValor_Pagar (ContasPagarVO ModContas, SCadastro_Fornecedores ModFornecedor){
        
        Conexao.conexao();
//        Conexao.executaSQL("SELECT * FROM estoque inner join pecas on estoque.`Pecas_idPecas` = pecas.`idPecas` inner join nota_fiscal on pecas.`idPecas` = nota_fiscal.`Pecas_idPecas` inner join fornecedor on nota_fiscal.fornecedor_idfornecedor = fornecedor.idfornecedor where nota_fiscal.`Numero_NF`='"+ModContas.getNumero_NF_Contas()+"' and fornecedor.idfornecedor ='"+ModContas.getCod_Fornecedor()+"'");
        Conexao.executaSQL("SELECT * FROM nota_fiscal inner join pecas on nota_fiscal.`Pecas_idPecas` = pecas.`idPecas` inner join fornecedor on nota_fiscal.fornecedor_idfornecedor = fornecedor.idfornecedor where nota_fiscal.`Numero_NF`='"+ModContas.getNumero_NF_Contas()+"' and fornecedor.idfornecedor ='"+ModContas.getCod_Fornecedor()+"'");
        try {
            Conexao.rs.first();
            
            ModContas.setValor_Total_Pagar(Conexao.rs.getFloat("Valor_total_NF"));
            ModContas.setCod_Fornecedor(Conexao.rs.getInt("fornecedor_idfornecedor"));
            ModContas.setNumero_NF_Contas(Conexao.rs.getInt("Numero_NF"));
            ModFornecedor.setNome_fornecedor(Conexao.rs.getString("nome_fornecedor"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public void Atualizar_SituacaoPagamento (ContasPagarVO ModContas){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.nota_fiscal SET `Pagamento` =?, `Data_Pagamento` =? WHERE `Numero_NF` ='"+ModContas.getNumero_NF_Contas()+"' and fornecedor_idfornecedor='"+ModContas.getCod_Fornecedor()+"'");
            
            pst.setString(1, ModContas.getSituacao_Pagamento());
            pst.setString(2, ModContas.getData_Pagamento());
            
            pst.execute();
                        
            JOptionPane.showMessageDialog(null, "Pagamento Baixado Com Sucesso!");
            
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro! "+ex);
        }
    
}
    

public void Buscar_LoginFechamento(Fechamento_CaixaVO ModLogin_Fechamento){
    
    Conexao.conexao();
    
    //Conexao.executaSQL(sql);
    
}

public void Fechar_Caixa (Fechamento_CaixaVO ModFechar_Caixa){
    
    Conexao.conexao();
    
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.fechamento_caixa (`Data_fechamento`, `Valor_Fechamento`, `Vl_retirado`, `Login_idLogin`) \n" +
                    "	VALUES (?, ?, ?, ?)");
            
            
            pst.setString(1, ModFechar_Caixa.getData_Fechamento());
            pst.setFloat(2, ModFechar_Caixa.getValor_Fechamento());
            pst.setFloat(3, ModFechar_Caixa.getVL_Retirada());
            pst.setInt(4, ModFechar_Caixa.getId_LoginFechamento());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Caixa Fechado com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Fechamento"+ ex);
        }
    
    
}


public void Cadastrar_NotaFiscal_Estoque (Cadastro_NFVO ModNF){
      
        BuscarCodFornecedor(ModNF.getFornecedor());
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.nota_fiscal (`Numero_NF`, `Icms`, `Ipi`, `Valor_total_NF`, `Data_Emissao`, `Data_vencimento`, `Quantidade_NF`, `Pecas_idPecas`, `Pagamento`, `fornecedor_idfornecedor`)"+"values(?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, ModNF.getNumero_NF());
            pst.setFloat(2, ModNF.getIcms());
            pst.setFloat(3, ModNF.getIpi());
            pst.setFloat(4, ModNF.getValor_total_NF());
            pst.setString(5, ModNF.getData_emissao_NF());
            pst.setString(6, ModNF.getData_vencimento_NF());
            pst.setFloat(7, ModNF.getQuantidade_NF());
            
            pst.setInt(8, ModNF.getId_Prod());
            
            pst.setString(9, ModNF.getSituacao());
            
            pst.setInt(10, Cod_Fornecedor);
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Conta Cadastrada Com Sucesso!");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado "+ex); 
        }
        
    }
    

public void BuscarCodFornecedor (String Nome_Fornecedor){
    
//    Conecta_Banco Conexao = new Conecta_Banco ();
    
    ConexaoBuscas.conexao();
    ConexaoBuscas.executaSQL("select * from fornecedor where nome_fornecedor='"+Nome_Fornecedor+"'");
    
        try {
            ConexaoBuscas.rs.first();
            
            Cod_Fornecedor = ConexaoBuscas.rs.getInt("idfornecedor");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    ConexaoBuscas.desconecta();
}


public void Pesquisar_VendasPecas(Cadastro_NFVO ModNF){
       
       Conexao.conexao();
       
       Conexao.executaSQL("select * from pecas where idPecas='"+ModNF.getId_Prod()+"'");
       
        try {
            Conexao.rs.first();
            
            ModNF.setId_Prod(Conexao.rs.getInt("idPecas"));
            ModNF.setDescrição(Conexao.rs.getString("nome_peca"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Registro Não Localizado!");
            
            ModNF.setDescrição("");
            //ModPecas.setValor_vendaunit_pecas(0);
            
        }
   
   Conexao.desconecta();
   }


    

}
