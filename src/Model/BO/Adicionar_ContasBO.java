/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.ContasPagarDAO;
import Model.VO.Cadastro_NFVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author Lucas
 */
public class Adicionar_ContasBO {
    
    
    ContasPagarDAO AdicionarContas = new ContasPagarDAO();
    
    
    public void Adicionar_Contas (Cadastro_NFVO ModNF){
    
        float Teste_float = ModNF.getQuantidade_NF();
        
        SimpleDateFormat Verificar_Data = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data.setLenient(false);  
        
        Date Data_Atual = new Date();
        Verificar_Data.format(Data_Atual);
        
//        Date Emissao = Verificar_Data.parse(ModNF.getData_emissao_NF());
        
        if(ModNF.getNumero_NF().equals("")){
            
            JOptionPane.showMessageDialog(null, "Número NF Não Polde Ser Nulo");
    
        }else{
            
            if(ModNF.getFornecedor().equals("-Sel-")){
            
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor");
            
            }else{
                    
                    if(ModNF.getData_emissao_NF().trim().length() != 10){
                    
                        JOptionPane.showMessageDialog(null, "Informe a Data de Emissão");
                        
                    }else{
                        
                        if(ModNF.getData_vencimento_NF().trim().length() !=10){
                        
                            
                            JOptionPane.showMessageDialog(null, "Informe a Data de Vencimento");
                            
                    }else{
                            
                            if(ModNF.getData_emissao_NF().trim().length() == 10){
                                
                                try{
                                    Date Data = Verificar_Data.parse(ModNF.getData_emissao_NF());
                                
                                    
                                    if(Data.after(Data_Atual)){
                                        
                                        JOptionPane.showMessageDialog(null, "Data de Emissão Não Pode Ser Postetior a Atual");
                                        
                                    }else{
                                        
                                    if(ModNF.getData_vencimento_NF().trim().length() == 10){
                                        
                                    try{
                                    Date DataVencimento = Verificar_Data.parse(ModNF.getData_vencimento_NF());

                                    //data
                                    Date Emissao = Verificar_Data.parse(ModNF.getData_emissao_NF());
                                    Date Vencimento = Verificar_Data.parse(ModNF.getData_vencimento_NF());
                                    
                                    if(Emissao.after(Vencimento)){
                                    
                                        JOptionPane.showMessageDialog(null, "Data de Emissão Não Pode Ser Postetior ao Vencimento");
                                        
                                    }else{
                                    
                                    AdicionarContas.Cadastrar_NotaFiscal_Estoque(ModNF);
                                    
                                    }
                                    
                                    
                                    
                                    
                                    }catch (ParseException d){
                                        
                                        JOptionPane.showMessageDialog(null, "Informe Uma Data de Vencimento Válida");
                                        
                                           }
                                        
                                        }
                                    }
                                    
                                            }catch (ParseException e){
                                    
                                                JOptionPane.showMessageDialog(null, "Informe Uma Data de Emissão Válida");
                                }                  
                            
                            
                            
                        
                        
                        
              }
                            
         }
               
    }
    
                    
         }
    }

}


     
    
}