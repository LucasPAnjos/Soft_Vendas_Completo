/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author Iniciar
 */
public class ItensVenda_Pecas {

private float quantidade_pecas;
private float valorvenda_pecas;

private int Id_venda;
private int Id_Peca;

private float deconto;
private float valortotal_parcial;

private float Estoque_Pecas;

    /**
     * @return the quantidade_pecas
     */
    public float getQuantidade_pecas() {
        return quantidade_pecas;
    }

    /**
     * @param quantidade_pecas the quantidade_pecas to set
     */
    public void setQuantidade_pecas(float quantidade_pecas) {
        this.quantidade_pecas = quantidade_pecas;
    }

    /**
     * @return the valorvenda_pecas
     */
    public float getValorvenda_pecas() {
        return valorvenda_pecas;
    }

    /**
     * @param valorvenda_pecas the valorvenda_pecas to set
     */
    public void setValorvenda_pecas(float valorvenda_pecas) {
        this.valorvenda_pecas = valorvenda_pecas;
    }

    /**
     * @return the Id_venda
     */
    public int getId_venda() {
        return Id_venda;
    }

    /**
     * @param Id_venda the Id_venda to set
     */
    public void setId_venda(int Id_venda) {
        this.Id_venda = Id_venda;
    }

    /**
     * @return the Id_Peca
     */
    public int getId_Peca() {
        return Id_Peca;
    }

    /**
     * @param Id_Peca the Id_Peca to set
     */
    public void setId_Peca(int Id_Peca) {
        this.Id_Peca = Id_Peca;
    }

    /**
     * @return the deconto
     */
    public float getDeconto() {
        return deconto;
    }

    /**
     * @param deconto the deconto to set
     */
    public void setDeconto(float deconto) {
        this.deconto = deconto;
    }

    /**
     * @return the valortotal_parcial
     */
    public float getValortotal_parcial() {
        return valortotal_parcial;
    }

    /**
     * @param valortotal_parcial the valortotal_parcial to set
     */
    public void setValortotal_parcial(float valortotal_parcial) {
        this.valortotal_parcial = valortotal_parcial;
    }

    /**
     * @return the Estoque_Pecas
     */
    public float getEstoque_Pecas() {
        return Estoque_Pecas;
    }

    /**
     * @param Estoque_Pecas the Estoque_Pecas to set
     */
    public void setEstoque_Pecas(float Estoque_Pecas) {
        this.Estoque_Pecas = Estoque_Pecas;
    }
    
}
