/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.ContasPagarDAO;
import Model.VO.ContasPagarVO;
import Model.VO.Fechamento_CaixaVO;
import javax.swing.JOptionPane;

/**
 * 
 * @author Lucas
 */
public class Contas_PagarBO {
    
    
    ContasPagarDAO ContasPagarBO = new ContasPagarDAO();
    
    
    public void Fechar_Caixa (Fechamento_CaixaVO ModFechamento){
        
        if(ModFechamento.getData_Fechamento().trim().length() != 16){
            
            JOptionPane.showMessageDialog(null, "Data do fechamento não pode ser nulo");
            
        }else{
            
            if(ModFechamento.getValor_Fechamento() < 0){
                
                JOptionPane.showMessageDialog(null, "Valor do fechamento não pode ser menor que 0");
                
            }else{
                
                if(ModFechamento.getVL_Retirada() < 0){
                    
                    JOptionPane.showMessageDialog(null, "Valor da retirada não pode ser nulo");
                    
                }else{
                    
                    if(ModFechamento.getNome_Usuario().equals("")){
                        
                        JOptionPane.showMessageDialog(null, "Login usuário não pode ser nulo");
                        
                    }else{
                        
                        if(ModFechamento.getValor_Fechamento() < ModFechamento.getVL_Retirada()){
                            
                            JOptionPane.showMessageDialog(null, "Valor da retirada não pode ser maior que valor do fechamento!");
                            
                        }else{
                            
                            ContasPagarBO.Fechar_Caixa(ModFechamento);
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
    }



    public void Pagar_Conta (ContasPagarVO ModContas) {
        
    if(ModContas.getTotal_Pagamento() > ModContas.getTotal_disponivel()){
        
        JOptionPane.showMessageDialog(null, "Valor disponível em caixa menor que total do débito!");
        
    }else{
        
        ContasPagarBO.Atualizar_SituacaoPagamento(ModContas);
        
    }    
        
        
    }
    
    
    
}
