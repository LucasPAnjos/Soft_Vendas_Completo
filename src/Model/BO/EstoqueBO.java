/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.EstoqueDAO;
import Model.VO.Cadastro_NFVO;
import Model.VO.Estoque_ProdutosVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class EstoqueBO {
    
    EstoqueDAO EstoqueBO = new EstoqueDAO();
    
    
    public void Adicionar_Estoque (Estoque_ProdutosVO ModEstoque, Cadastro_NFVO ModNF){
        
        SimpleDateFormat Verificar_Data = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data.setLenient(false);
        
        SimpleDateFormat Verificar_Data2 = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data2.setLenient(false);
        
        SimpleDateFormat Verificar_Data3 = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data3.setLenient(false);
        
        SimpleDateFormat Verificar_Data4 = new SimpleDateFormat("yyyy-MM-dd");
        Verificar_Data4.setLenient(false);
        

        //Data Nascimento Para Sql Emissão
        String dia = ModNF.getData_emissao_NF().substring(0,2);
        String mes = ModNF.getData_emissao_NF().substring(3,5);
        String ano = ModNF.getData_emissao_NF().substring(6);
        String DataEmissao_Sql = ModNF.getData_emissao_NF();
        
        //Data Nascimento Para Sql Vencimento
        String diav = ModEstoque.getData_vencimento().substring(0,2);
        String mesv = ModEstoque.getData_vencimento().substring(3,5);
        String anov = ModEstoque.getData_vencimento().substring(6);
        String DataVemcimento_Sql = ModEstoque.getData_vencimento();
                
        //Data Nascimento Para Sql Fabricação
        String diaf = ModEstoque.getData_fabr().substring(0,2);
        String mesf = ModEstoque.getData_fabr().substring(3,5);
        String anof = ModEstoque.getData_fabr().substring(6);
        String DataFabricacao_Sql = ModEstoque.getData_fabr();
        
        //Data Nascimento Para Sql Vencimento NF
        String diavn = ModNF.getData_vencimento_NF().substring(0,2);
        String mesvn = ModNF.getData_vencimento_NF().substring(3,5);
        String anovn = ModNF.getData_vencimento_NF().substring(6);
        String DataVencimentoNF_Sql = ModNF.getData_vencimento_NF();
        
        
        
       if(ModEstoque.getEstoque_minimo() <=1){
           
           JOptionPane.showMessageDialog(null, "Estoque mínimo não pode ser menor que 1");
       
       }else{
           
           
           if(ModEstoque.getEstoque_maximo() <=1){
               
               JOptionPane.showMessageDialog(null, "Estoque máximo não pode ser menor que 1");
               
           }else{           
           
           if(ModEstoque.getEstoque_minimo() > ModEstoque.getEstoque_maximo()){
               
               JOptionPane.showMessageDialog(null, "Estoque minimo não pode ser maior que estoque máximo");
               
           }else{
               
               
               if(ModNF.getNumero_NF().equals("")){
                   
                   JOptionPane.showMessageDialog(null, "Número da NF não pode ser nulo");
                   
               }else{
                   
                   if(ModNF.getValor_total_NF() < 0){
                       
                       JOptionPane.showMessageDialog(null, "Valor da NF não pode ser menor que 0");
                       
                   }else{
                       
                       
                       
                       if(ModNF.getData_emissao_NF().trim().length() != 10){
                           
                           JOptionPane.showMessageDialog(null, "Data de emissão não pode ser nulo");
                       
                       }else{
                           
                           if(ModEstoque.getData_vencimento().trim().length() != 10){
                               
                               JOptionPane.showMessageDialog(null, "Data de Vencimento não pode ser nulo");
                               
                           }else{
                               
                               if(ModEstoque.getData_fabr().trim().length() != 10){
                                   
                                   JOptionPane.showMessageDialog(null, "Data de Fábricação não pode ser nulo");
                                   
                               }else{
                                   
                                   if(ModNF.getData_vencimento_NF().trim().length() != 10){
                                       
                                   
                                 JOptionPane.showMessageDialog(null, "Data Vencimento NF não pode ser nulo");     
                               
                           }else{                                       
                                       
                                       if(ModNF.getFornecedor().equals("-Sel-")){
                                           
                                           JOptionPane.showMessageDialog(null, "Selecione um fornecedor");
                                       
                                       }else{
                                           
                                           if(ModEstoque.getQuantidade_adicionar() <=0){                                               
                                               
                                           JOptionPane.showMessageDialog(null, "Quantidade NF não pode ser menor que 0");
                                           
                                       }else{
                                               
                                               if(ModEstoque.getUnidade_medida().equals("-Sel-")){
                                                   
                                               JOptionPane.showMessageDialog(null, "Selecione uma unidade de medida");
                                               
                                           }else{
                                                   
                                                   if(ModEstoque.getMargem_lucro() <0){
                                                       
                                                       
                                                       JOptionPane.showMessageDialog(null, "Margem de lucro não pode ser menor que 0");
                                                                                                         
                                               }else{
                                                                    
                           
                           if(ModNF.getData_emissao_NF().trim().length() == 10){
                               
                               
                               try{
                                   
                                   Date Data_Emissao = Verificar_Data.parse(DataEmissao_Sql);
                                           
                               if(ModEstoque.getData_vencimento().trim().length() == 10){
                                   
                                   try{
                                       
                                       Date Data_Vencimento = Verificar_Data2.parse(DataVemcimento_Sql);
                                       
                                      
                                       if(ModEstoque.getData_fabr().trim().length() == 10){
                                           
                                       try{
                                           
                                       Date Data_Fabricacao = Verificar_Data3.parse(DataFabricacao_Sql);
                                       
                                       
                                       if(ModNF.getData_vencimento_NF().trim().length() == 10){
                                           
                                       try{    
                                           
                                           Date Data_VencimentoNF = Verificar_Data4.parse(DataVencimentoNF_Sql);
                                       
                                       
                                           if(Data_Emissao.after(Data_VencimentoNF) ){
                                           
                                               JOptionPane.showMessageDialog(null, "Data de emissão não pode ser maior que o Vencimento");
                                           
                                           }else{
                                               
                                               if(Data_Fabricacao.after(Data_Vencimento)){
                                                   
                                                   JOptionPane.showMessageDialog(null, "Data de fabricação não pode ser maior que a validade");
                                                   
                                               }else{
                                               
                                               EstoqueBO.Cadastrar_Estoque(ModEstoque);
                                           EstoqueBO.Cadastrar_NotaFiscal_Estoque(ModNF);
                                           
                                                }
                                           }
                                           
                                   }catch (ParseException e){
                                       
                                       JOptionPane.showMessageDialog(null, "Informe Uma Data de Vencimento NF Válida "+Data_Vencimento);
                                       
                                   }
                                   
                               }        
                                   
                                       
                                       
                               }catch (ParseException f){
                                   
                                   JOptionPane.showMessageDialog(null, "Informe Uma Data de Fábricação Válida "+DataFabricacao_Sql);
                                   
                               }
                               
                           }
                               
                               
                                       
                               }catch (ParseException g){
                                   
                                   JOptionPane.showMessageDialog(null, "Informe Uma Data de Validade Válida");
                                   
                               }
                               
                           }
                               
                               
                               
                               }catch (ParseException h){
                                   
                                   JOptionPane.showMessageDialog(null, "Informe Uma Data de Emissão Válida ");
                                   
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


