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
public class Fechamento_CaixaVO {
    
    
    private String Data_Fechamento;
    private float Valor_Fechamento;
    
    private int Id_LoginFechamento;

    private String Nome_Usuario;

    private float VL_Retirada;
    
    /**
     * @return the Data_Fechamento
     */
    public String getData_Fechamento() {
        return Data_Fechamento;
    }

    /**
     * @param Data_Fechamento the Data_Fechamento to set
     */
    public void setData_Fechamento(String Data_Fechamento) {
        this.Data_Fechamento = Data_Fechamento;
    }

    /**
     * @return the Valor_Fechamento
     */
    public float getValor_Fechamento() {
        return Valor_Fechamento;
    }

    /**
     * @param Valor_Fechamento the Valor_Fechamento to set
     */
    public void setValor_Fechamento(float Valor_Fechamento) {
        this.Valor_Fechamento = Valor_Fechamento;
    }

    /**
     * @return the Id_LoginFechamento
     */
    public int getId_LoginFechamento() {
        return Id_LoginFechamento;
    }

    /**
     * @param Id_LoginFechamento the Id_LoginFechamento to set
     */
    public void setId_LoginFechamento(int Id_LoginFechamento) {
        this.Id_LoginFechamento = Id_LoginFechamento;
    }

    /**
     * @return the Nome_Usuario
     */
    public String getNome_Usuario() {
        return Nome_Usuario;
    }

    /**
     * @param Nome_Usuario the Nome_Usuario to set
     */
    public void setNome_Usuario(String Nome_Usuario) {
        this.Nome_Usuario = Nome_Usuario;
    }

    /**
     * @return the VL_Retirada
     */
    public float getVL_Retirada() {
        return VL_Retirada;
    }

    /**
     * @param VL_Retirada the VL_Retirada to set
     */
    public void setVL_Retirada(float VL_Retirada) {
        this.VL_Retirada = VL_Retirada;
    }
    
    
}
