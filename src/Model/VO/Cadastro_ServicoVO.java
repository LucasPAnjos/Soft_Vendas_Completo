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
public class Cadastro_ServicoVO {
    
    private int id_servico;
    private String descricao_servico;
    private float preco_servico;
    private int quantidade_servico;

    /**
     * @return the id_servico
     */
    public int getId_servico() {
        return id_servico;
    }

    /**
     * @param id_servico the id_servico to set
     */
    public void setId_servico(int id_servico) {
        this.id_servico = id_servico;
    }

    /**
     * @return the descricao_servico
     */
    public String getDescricao_servico() {
        return descricao_servico;
    }

    /**
     * @param descricao_servico the descricao_servico to set
     */
    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    /**
     * @return the preco_servico
     */
    public float getPreco_servico() {
        return preco_servico;
    }

    /**
     * @param preco_servico the preco_servico to set
     */
    public void setPreco_servico(float preco_servico) {
        this.preco_servico = preco_servico;
    }

    /**
     * @return the quantidade_servico
     */
    public int getQuantidade_servico() {
        return quantidade_servico;
    }

    /**
     * @param quantidade_servico the quantidade_servico to set
     */
    public void setQuantidade_servico(int quantidade_servico) {
        this.quantidade_servico = quantidade_servico;
    }
    
    
}
