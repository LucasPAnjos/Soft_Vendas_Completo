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
public class VendedorVO {
    
    private int id_vendedor;
    private String nome_vendedor;
    private String cpf_vendedor;
    private String rg_vendedor;
    /**
     * @return the id_vendedor
     */
    public int getId_vendedor() {
        return id_vendedor;
    }

    /**
     * @param id_vendedor the id_vendedor to set
     */
    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    /**
     * @return the nome_vendedor
     */
    public String getNome_vendedor() {
        return nome_vendedor;
    }

    /**
     * @param nome_vendedor the nome_vendedor to set
     */
    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    /**
     * @return the cpf_vendedor
     */
    public String getCpf_vendedor() {
        return cpf_vendedor;
    }

    /**
     * @param cpf_vendedor the cpf_vendedor to set
     */
    public void setCpf_vendedor(String cpf_vendedor) {
        this.cpf_vendedor = cpf_vendedor;
    }

    /**
     * @return the rg_vendedor
     */
    public String getRg_vendedor() {
        return rg_vendedor;
    }

    /**
     * @param rg_vendedor the rg_vendedor to set
     */
    public void setRg_vendedor(String rg_vendedor) {
        this.rg_vendedor = rg_vendedor;
    }
    
}
