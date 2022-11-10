/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.BO;

import Model.DAO.PecasDAO;
import Model.VO.SCadastro_PecasVO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Adicionar_ProdutosBO {
    
    
    PecasDAO AdicionarProdutos = new PecasDAO();
//    JI_Pecas JI_PecasCadastro = new JI_Pecas();
    
    public void Verificar_Produtos (SCadastro_PecasVO ModPecas){
        
        if(ModPecas.getNome_pecas().equals("")){
            
            JOptionPane.showMessageDialog(null, "Nome do Produto Não Polde Ser Nulo");
            
        }else{
            
            if(ModPecas.getCod_Barras().equals("")){
                
                JOptionPane.showMessageDialog(null, "Cód. de Barras Não Polde Ser Nulo");
                
            }else{
                
                if(ModPecas.getFabricante().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Fabricante Não Polde Ser Nulo");
                    
                }else{
                    
                    if(ModPecas.getAplicacao().equals("-Sel-")){
                        
                        JOptionPane.showMessageDialog(null, "Selecione uma Categoria");
                        
                    }else{
                        
                        AdicionarProdutos.CadastroPecas(ModPecas);
                        
//                                               JI_PecasCadastro.Registo_Cadastro();
                        
                    }
                    
                }
                
            }
            
        }
        
        
    }
    
    
}
