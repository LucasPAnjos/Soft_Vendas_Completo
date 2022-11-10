/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.ContasReceberVO;
import Model.VO.Pag_PrazoVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Lucas
 */
public class ContasReceberDAO {

Conecta_Banco Conexao = new Conecta_Banco();
Conecta_Banco ConexaoParcela2 = new Conecta_Banco();
Conecta_Banco ConexaoParcela = new Conecta_Banco();
ContasReceberVO ModContas_Receber = new ContasReceberVO();


public void Pesquisar_Compras(ContasReceberVO ModContas_Receber){
    
    Conexao.conexao();
    
    Conexao.executaSQL("SELECT * FROM venda_pecas inner join cadastro_cliente on venda_pecas.`Cadastro_cliente_idCadastro_cliente` = cadastro_cliente.`idCadastro_cliente` WHERE venda_pecas.`Forma_Pagamento`='"+"A Prazo"+"' and venda_pecas.`idVenda_pecas`='"+ModContas_Receber.getId_Venda()+"'");
    
    try {
        Conexao.rs.first();
        
        ModContas_Receber.setVl_Entrada(Conexao.rs.getFloat("Valor_Entrada"));
        ModContas_Receber.setJuros(Conexao.rs.getFloat("Percentual_Juros_AM"));
        ModContas_Receber.setQuantidade_Parcelas(Conexao.rs.getInt("Quant_Parcelas"));
        ModContas_Receber.setTotal_Prazo(Conexao.rs.getFloat("Total_Prazo"));
        ModContas_Receber.setValor_Parcelas(Conexao.rs.getFloat("Valor_Parcelas"));
        ModContas_Receber.setVenc_Parcela1(Conexao.rs.getString("Vencimento1"));
        ModContas_Receber.setVenc_Parcela2(Conexao.rs.getString("Vencimento2"));
        ModContas_Receber.setVenc_Parcela3(Conexao.rs.getString("Vencimento3"));
        this.ModContas_Receber.setId_Venda(Conexao.rs.getInt("idVenda_pecas"));
        
        ModContas_Receber.setId_Cliente_ContasReceber(Conexao.rs.getInt("idCadastro_cliente"));
        ModContas_Receber.setNome_Cliente_ContasReceber(Conexao.rs.getString("nome_cliente"));
        ModContas_Receber.setRG(Conexao.rs.getString("rg"));
        ModContas_Receber.setCpf_ContasReceber(Conexao.rs.getString("cpf"));
        
    } catch (SQLException ex) {
        Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}

public void Baixar_Pagamento(ContasReceberVO ModContas_Receber, Pag_PrazoVO ModPrazo) {

Conexao.conexao();

    try {
        PreparedStatement pst = Conexao.conn.prepareStatement("UPDATE lojaautomoveis.venda_pecas SET `Total_Liquido` =?, `Pag_vencimento1` =?, `Pag_vencimento2` =?, `Pag_vencimento3` =? WHERE `idVenda_pecas` ='"+ModContas_Receber.getId_Venda()+"'");
        
        pst.setFloat(1, ModContas_Receber.getValor_Liquido());
        pst.setString(2, ModContas_Receber.getVenc_Parcela1());
        pst.setString(3, ModContas_Receber.getVenc_Parcela2());
        pst.setString(4, ModContas_Receber.getVenc_Parcela3());
        
        pst.execute();
        
        //Parcela Prazo
        PreparedStatement pst2 = Conexao.conn.prepareStatement("INSERT INTO lojaautomoveis.pag_prazo (`Data_pag`, `Parcela`, `Valor_pago`, `Venda_pecas_idVenda_pecas`)"+"VALUES (?,?,?,?)");
        
        pst2.setString(1, ModPrazo.getData_PagPrazo());
        pst2.setString(2, ModPrazo.getParcelaPrazo());
        pst2.setFloat(3, ModPrazo.getValor_Pago());
        
        pst2.setInt(4, ModPrazo.getIdVendaPrazo());
        
        pst2.execute();
        
        JOptionPane.showMessageDialog(null, "Baixa Realizada Com Sucesso!");
        
    } catch (SQLException ex) {
        Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}


public void Buscar_1ªParcela (ContasReceberVO ModContas_ReceberBusca){
    
    ConexaoParcela.conexao();
    
    ConexaoParcela.executaSQL("SELECT * FROM venda_pecas where `idVenda_pecas` ='"+ModContas_ReceberBusca.getId_Venda()+"'");
    
    try {
        ConexaoParcela.rs.first();
        
        ModContas_ReceberBusca.setVenc_Parcela1(ConexaoParcela.rs.getString("Pag_vencimento1"));
        
    } catch (SQLException ex) {
        Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public void Buscar_2ªParcela (ContasReceberVO ModContas_ReceberBusca){
    
    ConexaoParcela2.conexao();
    
    ConexaoParcela2.executaSQL("SELECT * FROM venda_pecas where `idVenda_pecas` ='"+ModContas_ReceberBusca.getId_Venda()+"'");
    
    try {
        ConexaoParcela2.rs.first();
        
        ModContas_ReceberBusca.setVenc_Parcela2(ConexaoParcela2.rs.getString("Pag_vencimento2"));
        
    } catch (SQLException ex) {
        Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public void Valor_Pago (ContasReceberVO ModContas_Receber){
    
    Conexao.conexao();
    
    Conexao.executaSQL("SELECT * FROM venda_pecas where `idVenda_pecas` ='"+ModContas_Receber.getId_Venda()+"'");
    try {
        Conexao.rs.first();
        
        ModContas_Receber.setValor_Liquido(Conexao.rs.getFloat("Total_Liquido"));
        
    } catch (SQLException ex) {
        Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}