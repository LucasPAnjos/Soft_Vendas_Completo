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
public class Estoque_PecasVO {

    private float QuantidadePecas_Estoque;
    private float EstoquePecas_Restante;
    private float QuantidadePecas_Vendida;
    
    private int IdPecas_Estoque;

    /**
     * @return the QuantidadePecas_Estoque
     */
    public float getQuantidadePecas_Estoque() {
        return QuantidadePecas_Estoque;
    }

    /**
     * @param QuantidadePecas_Estoque the QuantidadePecas_Estoque to set
     */
    public void setQuantidadePecas_Estoque(float QuantidadePecas_Estoque) {
        this.QuantidadePecas_Estoque = QuantidadePecas_Estoque;
    }

    /**
     * @return the EstoquePecas_Restante
     */
    public float getEstoquePecas_Restante() {
        return EstoquePecas_Restante;
    }

    /**
     * @param EstoquePecas_Restante the EstoquePecas_Restante to set
     */
    public void setEstoquePecas_Restante(float EstoquePecas_Restante) {
        this.EstoquePecas_Restante = EstoquePecas_Restante;
    }

    /**
     * @return the QuantidadePecas_Vendida
     */
    public float getQuantidadePecas_Vendida() {
        return QuantidadePecas_Vendida;
    }

    /**
     * @param QuantidadePecas_Vendida the QuantidadePecas_Vendida to set
     */
    public void setQuantidadePecas_Vendida(float QuantidadePecas_Vendida) {
        this.QuantidadePecas_Vendida = QuantidadePecas_Vendida;
    }

    /**
     * @return the IdPecas_Estoque
     */
    public int getIdPecas_Estoque() {
        return IdPecas_Estoque;
    }

    /**
     * @param IdPecas_Estoque the IdPecas_Estoque to set
     */
    public void setIdPecas_Estoque(int IdPecas_Estoque) {
        this.IdPecas_Estoque = IdPecas_Estoque;
    }

    
}
