/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author Lucas
 */
public class EstoqueVO {
    
    
    private int Quantidade_Estoque;
    private int Estoque_Restante;
    private int Quantidade_Vendida;
    
    private int IdVeiculo;

    /**
     * @return the Quantidade_Estoque
     */
    public int getQuantidade_Estoque() {
        return Quantidade_Estoque;
    }

    /**
     * @param Quantidade_Estoque the Quantidade_Estoque to set
     */
    public void setQuantidade_Estoque(int Quantidade_Estoque) {
        this.Quantidade_Estoque = Quantidade_Estoque;
    }

    /**
     * @return the Estoque_Restante
     */
    public int getEstoque_Restante() {
        return Estoque_Restante;
    }

    /**
     * @param Estoque_Restante the Estoque_Restante to set
     */
    public void setEstoque_Restante(int Estoque_Restante) {
        this.Estoque_Restante = Estoque_Restante;
    }

    /**
     * @return the Quantidade_Vendida
     */
    public int getQuantidade_Vendida() {
        return Quantidade_Vendida;
    }

    /**
     * @param Quantidade_Vendida the Quantidade_Vendida to set
     */
    public void setQuantidade_Vendida(int Quantidade_Vendida) {
        this.Quantidade_Vendida = Quantidade_Vendida;
    }

    /**
     * @return the IdVeiculo
     */
    public int getIdVeiculo() {
        return IdVeiculo;
    }

    /**
     * @param IdVeiculo the IdVeiculo to set
     */
    public void setIdVeiculo(int IdVeiculo) {
        this.IdVeiculo = IdVeiculo;
    }
    
    
}
