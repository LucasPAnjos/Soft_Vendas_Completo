/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.ContasReceberDAO;
import Model.VO.ContasReceberVO;
import Model.VO.Fechamento_CaixaVO;
import Model.VO.Pag_PrazoVO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Contas_ReceberVO {
    

    ContasReceberDAO  ContasReceberBO = new ContasReceberDAO();
    
    
    
    public void Baixar_Pagamento (ContasReceberVO ModContas_Receber, Pag_PrazoVO ModPrazo){
//    JOptionPane.showMessageDialog(null, "Dentro do BO");
        
        if(ModPrazo.getParcelaPrazo().equals("-Sel-")){
            
            JOptionPane.showMessageDialog(null, "Não hà parcelas para pagamento!");
            
        }else{
        
        if(ModContas_Receber.getValor_Liquido() > ModContas_Receber.getValor_dinheiro()){
            
            JOptionPane.showMessageDialog(null, "Valor menor que o total a pagar!");
            
        }else{
            
            ContasReceberBO.Baixar_Pagamento(ModContas_Receber, ModPrazo);
            
        }
        
        }
        
    
    }
    
    
    
    
}
