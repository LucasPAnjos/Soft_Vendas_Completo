/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_NFVO;
import Model.VO.Estoque_ProdutosVO;
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
public class EstoqueDAO {
    
    Estoque_ProdutosVO ModEstoque = new Estoque_ProdutosVO();
    
    Conecta_Banco Conexao = new Conecta_Banco();
    Conecta_Banco ConexaoBuscas = new Conecta_Banco();
    
    int Cod_Fornecedor;
    String Nome_Fornecedor;
    
    //Cadastrar Estoque
    public void Cadastrar_Estoque (Estoque_ProdutosVO ModEstoque){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.estoque (`Estoque_minimo`, `Estoque_maximo`, `Quant_em_estoque`, `Valor_em_estoque`, `Valor_compra_unitario`, `Margem_lucro`, `Valor_venda_unitario`, `Pecas_idPecas`, `data_fabr`, `data_vencimento`, `unidade_medida`)"+"values(?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setFloat(1, ModEstoque.getEstoque_minimo());
            pst.setFloat(2, ModEstoque.getEstoque_maximo());
            pst.setFloat(3, ModEstoque.getQuantidade_adicionar());
            pst.setFloat(4, ModEstoque.getValor_em_Estoque());
            pst.setFloat(5, ModEstoque.getValor_compra_unitario());
            pst.setFloat(6, ModEstoque.getMargem_lucro());
            pst.setFloat(7, ModEstoque.getValor_venda_unitario());
            pst.setInt(8, ModEstoque.getId_Peca_Estoque());
                   
            pst.setString(9, ModEstoque.getData_fabr());
            pst.setString(10, ModEstoque.getData_vencimento());
            pst.setString(11, ModEstoque.getUnidade_medida());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Produto Cadastrado Com Sucesso!");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado "+ex); 
        }
        
    }

    //Cadastrar NF de Estoque
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
            
            pst.setInt(8, ModNF.getId_PecaEstoque());
            
            pst.setString(9, ModNF.getSituacao());
            
            pst.setInt(10, Cod_Fornecedor);
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto Cadastrado Com Sucesso!");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado "+ex); 
        }
        
    }
    

    public void Atualizar_Estoque (Estoque_ProdutosVO ModEstoque, Cadastro_NFVO ModNF){

//        BuscarCodFornecedor(ModNF.getFornecedor());
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.estoque SET `Estoque_minimo` =?, `Estoque_maximo` =?, `Quant_em_estoque` =?, `Valor_em_estoque` =?, `Valor_compra_unitario` =?, `Margem_lucro` =?, `Valor_venda_unitario` =?, `data_fabr` =?, `data_vencimento` =?, `unidade_medida` =? where Pecas_idPecas='"+ModEstoque.getId_Peca_Estoque()+"'");
            
            pst.setFloat(1, ModEstoque.getEstoque_minimo());
            pst.setFloat(2, ModEstoque.getEstoque_maximo());
            pst.setFloat(3, ModEstoque.getQuantidade_adicionar());
            pst.setFloat(4, ModEstoque.getValor_em_Estoque());
            pst.setFloat(5, ModEstoque.getValor_compra_unitario());
            pst.setFloat(6, ModEstoque.getMargem_lucro());
            pst.setFloat(7, ModEstoque.getValor_venda_unitario());

                       
            pst.setString(8, ModEstoque.getData_fabr());
            pst.setString(9, ModEstoque.getData_vencimento());
            pst.setString(10, ModEstoque.getUnidade_medida());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto Cadastrado Com Sucesso!");

            
            
            //Atualizar Dados da NF
        BuscarCodFornecedor(ModNF.getFornecedor());


            PreparedStatement pstNF = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.nota_fiscal SET `Numero_NF` =?, `Icms` =?, `Ipi` =?, `Valor_total_NF` =?, `Data_Emissao` =?, `Data_vencimento` =?, `Quantidade_NF` =?, `fornecedor_idfornecedor` =? WHERE `Pecas_idPecas` ='"+ModEstoque.getId_Peca_Estoque()+"'");
        
            
            pstNF.setString(1, ModNF.getNumero_NF());
            pstNF.setFloat(2, ModNF.getIcms());
            pstNF.setFloat(3, ModNF.getIpi());
            pstNF.setFloat(4, ModNF.getValor_total_NF());
            pstNF.setString(5, ModNF.getData_emissao_NF());
            pstNF.setString(6, ModNF.getData_vencimento_NF());
            pstNF.setFloat(7, ModNF.getQuantidade_NF());
            
            pstNF.setInt(8, Cod_Fornecedor);
            
            pstNF.execute();
            JOptionPane.showMessageDialog(null,"NF Produto Cadastrado Com Sucesso!");

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Alterado "+ex);
        }
        
    }
    
    
    public void Pesquisar_VendasPecas(SCadastro_PecasVO ModPecas){
       
       Conexao.conexao();
       
       Conexao.executaSQL("select * from pecas where idPecas='"+ModPecas.getId_pecas()+"'");
       
        try {
            Conexao.rs.first();
            
            ModPecas.setId_pecas(Conexao.rs.getInt("idPecas"));
            ModPecas.setNome_pecas(Conexao.rs.getString("nome_peca"));
            ModPecas.setFabricante(Conexao.rs.getString("fabricante_pecas_idfabricante_pecas"));            
            ModPecas.setCod_Barras(Conexao.rs.getString("Cod_Barras"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Registro Não Localizado!");
            
            ModPecas.setNome_pecas("");
            //ModPecas.setValor_vendaunit_pecas(0);
            
        }
   
   Conexao.desconecta();
   }

    
    public void BuscarCodNomeFornecedor (int Consulta_Fornecedor){
    
    ConexaoBuscas.conexao();
    
    ConexaoBuscas.executaSQL("select * from fornecedor where idfornecedor='"+Consulta_Fornecedor+"'");
    
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Fornecedor = ConexaoBuscas.rs.getString("nome_fornecedor");
            
        } catch (SQLException ex) {
            Logger.getLogger(PecasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        ConexaoBuscas.desconecta();
        
}
    
    public void Pesquisar_PordutoEstoque (SCadastro_PecasVO ModProdutos, Estoque_ProdutosVO ModEstoque){
        
        Conexao.conexao();
        Conexao.executaSQL("select * from estoque inner join pecas on estoque.`Pecas_idPecas` = pecas.`idPecas` inner join nota_fiscal on estoque.`Pecas_idPecas` = nota_fiscal.`Pecas_idPecas` where pecas.`idPecas` ='"+ModProdutos.getId_pecas()+"'");
        
        try {
            Conexao.rs.first();
            
            //Produtos
            ModProdutos.setId_pecas(Conexao.rs.getInt("idPecas"));
            ModProdutos.setNome_pecas(Conexao.rs.getString("nome_peca"));
            ModProdutos.setFabricante(Conexao.rs.getString("fabricante_pecas_idfabricante_pecas"));            
            ModProdutos.setCod_Barras(Conexao.rs.getString("Cod_Barras"));
           
            //Estoque
            ModEstoque.setEstoque_minimo(Conexao.rs.getFloat("Estoque_minimo"));  
            ModEstoque.setEstoque_maximo(Conexao.rs.getFloat("Estoque_maximo"));
            ModEstoque.setQuantidade_em_Estoque(Conexao.rs.getFloat("Quant_em_estoque"));
            ModEstoque.setValor_em_Estoque(Conexao.rs.getFloat("Valor_em_estoque"));
            ModEstoque.setNumero_NF(Conexao.rs.getString("Numero_NF"));
            ModEstoque.setIcms(Conexao.rs.getFloat("icms"));
            ModEstoque.setIpi(Conexao.rs.getFloat("ipi"));
            ModEstoque.setValor_total_NF(Conexao.rs.getFloat("Valor_total_NF"));
            
            ModEstoque.setData_emissao_NF(Conexao.rs.getString("Data_Emissao"));
            ModEstoque.setData_vencimento_NF(Conexao.rs.getString("Data_vencimento"));
            
            ModEstoque.setValor_compra_unitario(Conexao.rs.getFloat("Valor_compra_unitario"));
            ModEstoque.setMargem_lucro(Conexao.rs.getFloat("Margem_lucro"));
            ModEstoque.setValor_venda_unitario(Conexao.rs.getFloat("Valor_venda_unitario"));
            
            BuscarCodNomeFornecedor(Conexao.rs.getInt("fornecedor_idfornecedor"));
            ModEstoque.setForncedor(Nome_Fornecedor);
            
            ModEstoque.setQuantidade_NF(Conexao.rs.getFloat("Quantidade_NF"));
            
            ModEstoque.setData_fabr(Conexao.rs.getString("data_fabr"));
            ModEstoque.setData_vencimento(Conexao.rs.getString("data_vencimento"));
            ModEstoque.setUnidade_medida(Conexao.rs.getString("unidade_medida"));
            
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    
    
}
