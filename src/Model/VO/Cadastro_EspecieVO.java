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
public class Cadastro_EspecieVO {
    
    
    private int Id_Especie;
    
    private String Especie_Descricao;

    /**
     * @return the Especie_Descricao
     */
    public String getEspecie_Descricao() {
        return Especie_Descricao;
    }

    /**
     * @param Especie_Descricao the Especie_Descricao to set
     */
    public void setEspecie_Descricao(String Especie_Descricao) {
        this.Especie_Descricao = Especie_Descricao;
    }

    /**
     * @return the Id_Especie
     */
    public int getId_Especie() {
        return Id_Especie;
    }

    /**
     * @param Id_Especie the Id_Especie to set
     */
    public void setId_Especie(int Id_Especie) {
        this.Id_Especie = Id_Especie;
    }
    
    
}
