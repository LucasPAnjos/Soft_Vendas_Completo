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
public class SCadastro_Fabricante {
    
    
  private int id_Fabricante;
  private String nome_Fabricante;
  
  private String Buscar_NomeFabricante;

    /**
     * @return the id_Fabricante
     */
    public int getId_Fabricante() {
        return id_Fabricante;
    }

    /**
     * @param id_Fabricante the id_Fabricante to set
     */
    public void setId_Fabricante(int id_Fabricante) {
        this.id_Fabricante = id_Fabricante;
    }

    /**
     * @return the nome_Fabricante
     */
    public String getNome_Fabricante() {
        return nome_Fabricante;
    }

    /**
     * @param nome_Fabricante the nome_Fabricante to set
     */
    public void setNome_Fabricante(String nome_Fabricante) {
        this.nome_Fabricante = nome_Fabricante;
    }

    /**
     * @return the Buscar_NomeFabricante
     */
    public String getBuscar_NomeFabricante() {
        return Buscar_NomeFabricante;
    }

    /**
     * @param Buscar_NomeFabricante the Buscar_NomeFabricante to set
     */
    public void setBuscar_NomeFabricante(String Buscar_NomeFabricante) {
        this.Buscar_NomeFabricante = Buscar_NomeFabricante;
    }

  
}
