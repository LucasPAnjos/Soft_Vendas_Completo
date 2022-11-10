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
public class VItens_VendaVO {
    
    private int id_itens_vendas;
    private int IDAutomovel;
    private int ID_Venda;
    
    private String Cadastro_Vendas;
    
    private int quantidade_venda;

    private float Valor_Total;
    
    private float Valor_total_parcial;
    private float desconto_venda;
    
    /**
     * @return the id_itens_vendas
     */
    public int getId_itens_vendas() {
        return id_itens_vendas;
    }

    /**
     * @param id_itens_vendas the id_itens_vendas to set
     */
    public void setId_itens_vendas(int id_itens_vendas) {
        this.id_itens_vendas = id_itens_vendas;
    }

    /**
     * @return the IDAutomovel
     */
    public int getIDAutomovel() {
        return IDAutomovel;
    }

    /**
     * @param IDAutomovel the IDAutomovel to set
     */
    public void setIDAutomovel(int IDAutomovel) {
        this.IDAutomovel = IDAutomovel;
    }

    /**
     * @return the ID_Venda
     */
    public int getID_Venda() {
        return ID_Venda;
    }

    /**
     * @param ID_Venda the ID_Venda to set
     */
    public void setID_Venda(int ID_Venda) {
        this.ID_Venda = ID_Venda;
    }

    /**
     * @return the quantidade_venda
     */
    public int getQuantidade_venda() {
        return quantidade_venda;
    }

    /**
     * @param quantidade_venda the quantidade_venda to set
     */
    public void setQuantidade_venda(int quantidade_venda) {
        this.quantidade_venda = quantidade_venda;
    }

    /**
     * @return the Cadastro_Vendas
     */
    public String getCadastro_Vendas() {
        return Cadastro_Vendas;
    }

    /**
     * @param Cadastro_Vendas the Cadastro_Vendas to set
     */
    public void setCadastro_Vendas(String Cadastro_Vendas) {
        this.Cadastro_Vendas = Cadastro_Vendas;
    }

    /**
     * @return the Valor_Total
     */
    public float getValor_Total() {
        return Valor_Total;
    }

    /**
     * @param Valor_Total the Valor_Total to set
     */
    public void setValor_Total(float Valor_Total) {
        this.Valor_Total = Valor_Total;
    }

    /**
     * @return the Valor_total_parcial
     */
    public float getValor_total_parcial() {
        return Valor_total_parcial;
    }

    /**
     * @param Valor_total_parcial the Valor_total_parcial to set
     */
    public void setValor_total_parcial(float Valor_total_parcial) {
        this.Valor_total_parcial = Valor_total_parcial;
    }

    /**
     * @return the desconto_venda
     */
    public float getDesconto_venda() {
        return desconto_venda;
    }

    /**
     * @param desconto_venda the desconto_venda to set
     */
    public void setDesconto_venda(float desconto_venda) {
        this.desconto_venda = desconto_venda;
    }

    public void setIDAutomovel(String Id_Veiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
