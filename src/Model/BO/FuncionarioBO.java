/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.FuncionarioDAO;
import Model.VO.Cadastro_FuncionarioVO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class FuncionarioBO {
    
    FuncionarioDAO Funcionario = new FuncionarioDAO();
    
    
    
    public void FuncionarioBO (Cadastro_FuncionarioVO ModFuncionario){
    
        int Idade = Integer.parseInt(ModFuncionario.getIdade_Funcionario());
        
        if(ModFuncionario.getNome_Funcionario().equals("")){
            
            JOptionPane.showMessageDialog(null, "Nome não pode ser nulo");
            
        }else{
            
            if(ModFuncionario.getData_Funcionario().trim().length() != 10){
                
                JOptionPane.showMessageDialog(null, "Data Nascimento não pode ser nulo");
                
            }else{
                
                if(Idade == 0){
                    
                    JOptionPane.showMessageDialog(null, "Informe a idade");
                    
                }else{
                    
                    if(Idade < 18){
                        
                        JOptionPane.showMessageDialog(null, "Idade não pode ser menor que 18");
                        
                    }else{
                        
                        if(ModFuncionario.getCPF_funcionario().trim().length() != 14){
                            
                            JOptionPane.showMessageDialog(null, "CPF não pode ser nulo");
                            
                        }else{
                            
                            if(ModFuncionario.getRG_funcionario().trim().length() != 11){
                                
                                JOptionPane.showMessageDialog(null, "RG não pode ser nulo");
                                
                            }else{
                                
                                if(ModFuncionario.getEndereco_Funcionario_Contato().equals("")){
                                    
                                    JOptionPane.showMessageDialog(null, "Endereço não pode ser nulo");
                                    
                                }else{
                                    
                                    if(ModFuncionario.getNumero_Funcionario_Contato().equals("")){
                                        
                                        JOptionPane.showMessageDialog(null, "Número não pode ser nulo");
                                        
                                    }else{
                                        
                                        if(ModFuncionario.getBairro_Funcionario_Contato().equals("")){
                                            
                                            JOptionPane.showMessageDialog(null, "Bairro não pode ser nulo");
                                            
                                        }else{
                                            
                                            if(ModFuncionario.getTelefone_Funcionario_Contato().trim().length() != 13){
                                                
                                                JOptionPane.showMessageDialog(null, "Telefone não pode ser nulo");
                                                
                                            }else{
                                                
                                                if(ModFuncionario.getCelular_Funcionario_Contato().trim().length() != 14){
                                                    
                                                    JOptionPane.showMessageDialog(null, "Celular não pode ser nulo");
                                                    
                                                }else{
                                                    
                                                    if(ModFuncionario.getCep_Funcionario_Contato().trim().length() != 10){
                                                        
                                                        JOptionPane.showMessageDialog(null, "Cep não pode ser nulo");
                                                        
                                                    }else{
                                                        
                                                        if(ModFuncionario.getEstado_NomeFuncionario_Contato().equals("-Sel-")){
                                                            
                                                            JOptionPane.showMessageDialog(null, "Selecione um estado");
                                                            
                                                        }else{
                                                            
                                                            if(ModFuncionario.getEmail_Funcionario().equals("")){
                                                                
                                                                JOptionPane.showMessageDialog(null, "Email não pode ser nulo");
                                                                
                                                            }else{
                                                                
                                                                if(ModFuncionario.getCidade_Funcionario_Contato().equals("")){
                                                                    
                                                                    JOptionPane.showMessageDialog(null, "Cidade não pode ser nulo");
                                                                    
                                                                }else{
                                                                    
                                                                    if(ModFuncionario.getFormacao_NomeFuncionario().equals("-Sel-")){
                                                                        
                                                                        JOptionPane.showMessageDialog(null, "Selecione uma Formação");
                                                                        
                                                                    }else{
                                                                        
                                                                        if(ModFuncionario.getCargo_NomeFuncionario().equals("")){
                                                                            
                                                                            JOptionPane.showMessageDialog(null, "Selecione um cargo");
                                                                            
                                                                        }else{
                                                                            
                                                                            if(ModFuncionario.getSetor_NomeFuncionario().equals("-Sel-")){
                                                                                
                                                                                JOptionPane.showMessageDialog(null, "Selecione um setor");
                                                                                
                                                                            }else{
                                                                                
                                                                                Funcionario.Cadastrar_FuncionarioDados(ModFuncionario);
                                                                                Funcionario.Cadastrar_FuncionarioContato(ModFuncionario);
                                                                                   
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
