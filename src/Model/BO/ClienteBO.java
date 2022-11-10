/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.ClienteDAO;
import Model.VO.Cadastro_ClienteVO;
import Model.VO.Cadastro_Cliente_ComercVO;
import Model.VO.Cadastro_Cliente_ContatoVO;
import Model.VO.Cadastro_Cliente_ProfVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ClienteBO {
    
    ClienteDAO Cliente =  new ClienteDAO();
    
    
    //Cadastrar Novo Cliente    
    public void CadastrarCliente (Cadastro_ClienteVO ModCliente, Cadastro_Cliente_ContatoVO ModContato, Cadastro_Cliente_ProfVO ModProfissional, Cadastro_Cliente_ComercVO ModComercial){
        
        //Cadastro Cliente
        SimpleDateFormat Verificar_Data = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data.setLenient(false);
        SimpleDateFormat Verificar_Data2 = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data2.setLenient(false);
        
        //Data Nascimento Para Sql
        String dia = ModCliente.getData_nascimento().substring(0,2);
        String mes = ModCliente.getData_nascimento().substring(3,5);
        String ano = ModCliente.getData_nascimento().substring(6);
        String Data_Sql = (ano+"-"+mes+"-"+dia);
        
        //Data Emissao RG Para Sql
        String diaE = ModCliente.getData_emisao_rg().substring(0,2);
        String mesE = ModCliente.getData_emisao_rg().substring(3,5);
        String anoE = ModCliente.getData_emisao_rg().substring(6);
        String Data_SqlE = (anoE+"-"+mesE+"-"+diaE);
        
        
        
        if(ModCliente.getNome_cliente().equals("")){
        
            JOptionPane.showMessageDialog(null, "O Nome do Cliente Não pode ser Nulo!");
       
        }else{
            
       if(ModCliente.getEstado_civil().equals("-Sel-")){
           
       JOptionPane.showMessageDialog(null, "Selecione o Estado Civil!");
           
       }else{
           
           if(ModCliente.getOrgao_emissor().equals("-Sel-")){
               
           JOptionPane.showMessageDialog(null, "Selecione o Orgão Emissor/RG!");
     
           }else{
               
               if(ModCliente.getNome_pai().equals("")){
                   
                   JOptionPane.showMessageDialog(null, "O Nome do Pai Não Pode Ser Nulo!");
                   
               }else{
                   
                   if(ModCliente.getNome_mae().equals("")){
                       
                       JOptionPane.showMessageDialog(null, "O Nome da Mãe Não Pode Ser Nulo!");
                       
                   }else{
               
               if(ModCliente.getSexo().equals("-Sel-")){
           
                   JOptionPane.showMessageDialog(null, "Selecione o Sexo!");
         
               }else{
                   //Independente da quantidade digitada é considerado 14 itens campos mais separadores
                   //Trim limpa os espaços (Caso não use o trim vão ser considerados todos os campos da mascara
                   if(ModCliente.getCpf().trim().length() != 14){
                   
                       JOptionPane.showMessageDialog(null, "Informe um CPF Válido!");
                       
                   }else{
                       
                       
                       
                       if(ModCliente.getRg().trim().length() != 11){
                       
                           JOptionPane.showMessageDialog(null, "Informe um RG Válido!");
                           
                }else{
                           
                           if(ModCliente.getData_nascimento().length() == 10){
                               
                               try{
                                   
                                   Date Data_Nascimento = Verificar_Data.parse(Data_Sql);
                                           
                               if(ModCliente.getData_emisao_rg().length() == 10){
                                   
                                   try{
                                       
                                       Date Data_Emissao = Verificar_Data2.parse(Data_SqlE);
                                       
                                                                             
                                   }catch (ParseException e){
                                       
                                       JOptionPane.showMessageDialog(null, "Informe Uma Data de Emissão Válida");
                                       
                                   }
                                   
                               }        
                                   
                               }catch (ParseException c){
                                   
                                   JOptionPane.showMessageDialog(null, "Informe Uma Data de Nascimento Válida");
                                   
                               }
                               
    
    
        //Cliente Contato
        
        if(ModContato.getEndereco_contato().equals("")){
        
            JOptionPane.showMessageDialog(null, "O Endereço Não pode ser Nulo!");
       
        }else{
            
            if(ModContato.getNumero_casa().equals("")){
                
                JOptionPane.showMessageDialog(null, "O Número Não pode ser Nulo!");
                
            }else{
                
                if(ModContato.getBairro_cliente().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "O Bairro Não pode ser Nulo!");
            
                }else{
                  
                    if(ModContato.getTelefone_cliente().trim().length() != 13){
                        
                    JOptionPane.showMessageDialog(null, "O Telefone Não pode ser Nulo! " +ModContato.getTelefone_cliente());
                    
                    }else{
                        
                        if(ModContato.getCep().trim().length() != 10){
                            
                         JOptionPane.showMessageDialog(null, "O Cep Não pode ser Nulo!");
                            
        }else{
                            
                            if(ModContato.getEstado().equals("-Sel-")){
                                
                                JOptionPane.showMessageDialog(null, "Selecione um Estado");
                                
                            }else{
                                
                                if(ModContato.getCidade_cliente().equals("")){
                                    
                                    JOptionPane.showMessageDialog(null, "O Campo Cidade Não pode ser Nulo!");
                                    
                                }else{
                            
         
         //Cliente Profissional
         if(ModProfissional.getProfissao().equals("")){
            
            JOptionPane.showMessageDialog(null, "Profissão Não pode ser Nulo!");
            
        }else{
            
            
        if(ModProfissional.getOcupacao().equals("")){
            
            JOptionPane.showMessageDialog(null, "Ocupação Não pode ser Nulo!");
            
        }else{
           
            if(ModProfissional.getRenda_principal() <= 0){
              
                JOptionPane.showMessageDialog(null, "Renda Não Pode Ser Menor Que Igual Zero!");
         
    }else{
                if(ModProfissional.getTempo_servico() <= 0 ){
                    
                    JOptionPane.showMessageDialog(null, "Tempo de Serviço Não Pode Ser Menor Que Igual Zero!");
                    
                }else{
                                        
               
        //Cliente comercial
        if(ModComercial.getNome_empresa().equals("")){
          
          JOptionPane.showMessageDialog(null, "O Nome da Empresa Não Pode Ser Nulo!");
          
      }else{
          
          if(ModComercial.getEndereco_comercial().equals("")){
              
              JOptionPane.showMessageDialog(null, "O Endereço Não Pode Ser Nulo!");
              
          }else{
              
              if(ModComercial.getNumero_comercial().equals("")){
                  
                  JOptionPane.showMessageDialog(null, "O Número Não Pode Ser Nulo!");
                  
              }else{
                  
                  
                  if(ModComercial.getTelefone_comercial().trim().length() != 13){
                      
                      
                      JOptionPane.showMessageDialog(null, "O Telefone Não Pode Ser Nulo!");
                      
                  }else{
                      
                      if(ModComercial.getBairro_comercial().equals("")){
                          
                          JOptionPane.showMessageDialog(null, "O Bairro Não Pode Ser Nulo!");
                          
                      }else{
                          
                          if(ModComercial.getCidade_comercial().equals("")){
                              
                              JOptionPane.showMessageDialog(null, "Cidade Não Pode Ser Nulo!");
                              
                          }else{
                              
                              if(ModComercial.getCep_comercial().trim().length() !=10){
                                  
                                  JOptionPane.showMessageDialog(null, "O Cep Não Pode Ser Nulo!");
                                  
                              }else{
                                  
                                  if(ModComercial.getEstado_comercial().equals("-Sel-")){
                                
                                JOptionPane.showMessageDialog(null, "Selecione um Estado");
                                
                              }else{
                                       
                                       Cliente.Inserir_Cliente(ModCliente);
                                       Cliente.InserirClienteContato(ModContato);
                                       Cliente.InserirClienteProficional(ModProfissional);
                                       Cliente.InserirClienteComercial(ModComercial);

                                      
                                  }
      
                
    
                          }
                       }
                    }
                 }   
              }   
           }
        }
//    }
    

                       }
                
                           
                           
                        }
                    }    
                }
            }
        }
    }
  }
 }   
}

               
                           }
                }
            }  
        }
    
               

                   
                              }
                          
                          
                          
                      }
                      
                  }
                  
                  
                  
                  
              }              
          }
          
          }
      }
      
  


}  
    


                   