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
public class Cadastro_CombustivelVO {
    
    private int id_comvustivel;
    private String tipo_combustivel;

    private int id_comb;
    private String Pesquisa_Comb;
    
    /**
     * @return the id_comvustivel
     */
    public int getId_comvustivel() {
        return id_comvustivel;
    }

    /**
     * @param id_comvustivel the id_comvustivel to set
     */
    public void setId_comvustivel(int id_comvustivel) {
        this.id_comvustivel = id_comvustivel;
    }

    /**
     * @return the tipo_combustivel
     */
    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    /**
     * @param tipo_combustivel the tipo_combustivel to set
     */
    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    /**
     * @return the id_comb
     */
    public int getId_comb() {
        return id_comb;
    }

    /**
     * @param id_comb the id_comb to set
     */
    public void setId_comb(int id_comb) {
        this.id_comb = id_comb;
    }

    /**
     * @return the Pesquisa_Comb
     */
    public String getPesquisa_Comb() {
        return Pesquisa_Comb;
    }

    /**
     * @param Pesquisa_Comb the Pesquisa_Comb to set
     */
    public void setPesquisa_Comb(String Pesquisa_Comb) {
        this.Pesquisa_Comb = Pesquisa_Comb;
    }
    
}
