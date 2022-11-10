/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.VendasPecasDAO;
import Model.VO.ItensVenda_Pecas;
import Model.VO.VItens_VendaVO;
import Model.VO.VendasPecasVO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class VendasBO {
    
    
    VendasPecasDAO VendasBO = new VendasPecasDAO();
    
    //Iniicar Venda
    public void IniciarVendasBO (VendasPecasVO ModVenda_Pecas){
        
        if(ModVenda_Pecas.getData_VendaPecas().trim().length() != 16){
            
    
                JOptionPane.showMessageDialog(null, "Data da venda não pode ser nulo");
            
            
            
        }else{
            
            if(ModVenda_Pecas.getIDFuncionario_Vendedor() < 1){
                
                JOptionPane.showMessageDialog(null, "Cód. do funcionário não pode ser nulo");
                
            }else{
                
                if(ModVenda_Pecas.getIDCliente() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. do cliente não pode ser nulo");
                    
                }else{
                    
                    if(ModVenda_Pecas.getTotal_Venda() < 0){
                        
                        JOptionPane.showMessageDialog(null, "Total da venda não pode ser menor que 0");
                        
                    }else{
                      
     
                            VendasBO.IniciarVenda_Pecas(ModVenda_Pecas);
                                                              
                    
                }
                
            }
            
        }
        
    }
    
    }
    
    //Adicionar Itens 
    public void ItensVendaBO (ItensVenda_Pecas ModItens_Pecas){
        
        if(ModItens_Pecas.getQuantidade_pecas() < 1) {
            
            JOptionPane.showMessageDialog(null, "Informe uma quantidade válida!");
            
        }else{
            
            if(ModItens_Pecas.getValorvenda_pecas() < 0){
                
                JOptionPane.showMessageDialog(null, "Informe um valor válido!");
                
            }else{
                
                if(ModItens_Pecas.getId_venda() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. de venda não pode ser nulo!");
                    
                }else{
                    
                    
                if(ModItens_Pecas.getId_Peca() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. do produto não pode ser nulo!");
                    
                }else{
                
                
                if(ModItens_Pecas.getDeconto() < 0){
                    
                    JOptionPane.showMessageDialog(null, "Informe um desconto válido!");
                    
                }else{
                    
                    if(ModItens_Pecas.getValortotal_parcial() < 0){
                        
                        JOptionPane.showMessageDialog(null, "Informe um valor válido!");
                        
                    }else{
                        
                        VendasBO.Adicionar_Itens_VendasPecas(ModItens_Pecas);

                        
                            }
                    
                        }
                
                    }
            
            
                }
            }
            
        }
            
        
    }



    public void FinalizarVenda_Avista (VendasPecasVO ModVenda_Pecas){
        
        
        if(ModVenda_Pecas.getData_VendaPecas().trim().length() != 16){
            
    
                JOptionPane.showMessageDialog(null, "Data da venda não pode ser nulo");
                  
            
        }else{
            
            
            if(ModVenda_Pecas.getIDFuncionario_Vendedor() < 1){
                
                JOptionPane.showMessageDialog(null, "Cód. do funcionário não pode ser nulo");
                
            }else{
                
                if(ModVenda_Pecas.getIDCliente() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. do cliente não pode ser nulo");
                    
                }else{
                    
                    if(ModVenda_Pecas.getTotal_Venda() < 0){
                        
                        JOptionPane.showMessageDialog(null, "Total da venda não pode ser menor que 0");
                        
                            
                        }else{
                        
                        if(ModVenda_Pecas.getForma_pagamento().equals("A Vista")){
                        
                        VendasBO.AtualizarVenda_Pecas(ModVenda_Pecas);
                        
                        }else{
                            
                            JOptionPane.showMessageDialog(null, "Erro ao finalizar venda. Verifique forma de pagamento!");
                            
                            }
                        }
                        
                    }
                    
                
                
            }
            
        }
        
    }
    


    
    public void FinalizarVenda_Cartaocredito (VendasPecasVO ModVenda_Pecas){
        
        
        if(ModVenda_Pecas.getData_VendaPecas().trim().length() != 16){
            
    
                JOptionPane.showMessageDialog(null, "Data da venda não pode ser nulo");
                  
            
        }else{
            
            
            if(ModVenda_Pecas.getIDFuncionario_Vendedor() < 1){
                
                JOptionPane.showMessageDialog(null, "Cód. do funcionário não pode ser nulo");
                
            }else{
                
                if(ModVenda_Pecas.getIDCliente() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. do cliente não pode ser nulo");
                    
                }else{
                    
                    if(ModVenda_Pecas.getTotal_Venda() < 0){
                        
                        JOptionPane.showMessageDialog(null, "Total da venda não pode ser menor que 0");
                        
                    }else{
                        
                        
                        
                        if(ModVenda_Pecas.getForma_pagamento().equals("Cartão de Credito")){
                        
                        VendasBO.AtualizarVenda_Pecas(ModVenda_Pecas);
                        
                        }else{
                            
                            JOptionPane.showMessageDialog(null, "Erro ao finalizar venda. Verifique forma de pagamento!");
                            
                            }
                        }
                    }
                    
                }
                
            }
            
        }
        
    
    

   

     public void FinalizarVenda_Prazo (VendasPecasVO ModVenda_Pecas){
        
        
        if(ModVenda_Pecas.getData_VendaPecas().trim().length() != 16){
            
    
                JOptionPane.showMessageDialog(null, "Data da venda não pode ser nulo");
                  
            
        }else{
            
            
            if(ModVenda_Pecas.getIDFuncionario_Vendedor() < 1){
                
                JOptionPane.showMessageDialog(null, "Cód. do funcionário não pode ser nulo");
                
            }else{
                
                if(ModVenda_Pecas.getIDCliente() < 1){
                    
                    JOptionPane.showMessageDialog(null, "Cód. do cliente não pode ser nulo");
                    
                }else{
                    
                    
                    if(ModVenda_Pecas.getIDCliente() == 1){
                    
                    JOptionPane.showMessageDialog(null, "Venda a Prazo Não é Possivel Para Clientes Diversos!");
                    
                }else{
                    
                    
                    if(ModVenda_Pecas.getTotal_Venda() < 0){
                        
                        JOptionPane.showMessageDialog(null, "Total da venda não pode ser menor que 0");
                        
                    }else{
                        
                        
                        //Prazo parcela 1
                        if(ModVenda_Pecas.getForma_pagamento().equals("A Prazo")){
                        
                        VendasBO.AtualizarVenda_Pecas(ModVenda_Pecas);
                        
                        }else{
                            
                            JOptionPane.showMessageDialog(null, "Erro ao finalizar venda. Verifique forma de pagamento!");
                            
                        }
                        
                    }
                    
                }
                
            }
                
        }
        
    }
   
  }
    
    
}
