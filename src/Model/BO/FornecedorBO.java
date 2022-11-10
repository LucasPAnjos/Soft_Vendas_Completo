/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.PecasDAO;
import Model.VO.SCadastro_Fornecedores;
import View.JI_Fornecedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class FornecedorBO {
    
    PecasDAO Fornecedor = new PecasDAO();
    
    
    public void Fornecedor_BO (SCadastro_Fornecedores ModFornecedor){
        
    
        if(ModFornecedor.getNome_fornecedor().equals("")){
        
            JOptionPane.showMessageDialog(null, "Nome do fornecedor não pode ser nulo!");
            
    }else{
            
            if(ModFornecedor.getCnpj_fornecedor().trim().length() != 18){
                
                JOptionPane.showMessageDialog(null, "O CNPJ não pode ser nulo!");
                
            }else{
                
                if(ModFornecedor.getEndereco_fornecedor().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "O endereço não pode ser nulo!");
                    
                }else{
                    
                    if(ModFornecedor.getBairro_fornecedor().equals("")){
                        
                       JOptionPane.showMessageDialog(null, "Bairro não pode ser nulo!"); 
                        
                    }else{
                        
                        if(ModFornecedor.getTelefone_fornecedor().trim().length() != 13){
                            
                            JOptionPane.showMessageDialog(null, "Telefone não pode ser nulo!");
                            
                        }else{
                            
                            if(ModFornecedor.getObservacao_fornecedor().equals("")){
                                
                                JOptionPane.showMessageDialog(null, "O campo observação não pode ser nulo!");
                                
                            }else{
                                
                                Fornecedor.CadastroFornecedores(ModFornecedor);
                                
                                
                            }
                            
                        }
                        
                    }
                }
                
            }
            
        }
        
        
    }
    
    
    
    
    
}
