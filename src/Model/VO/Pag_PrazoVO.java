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
public class Pag_PrazoVO {
 
    private String Data_PagPrazo;
    private String ParcelaPrazo;
    private Float Valor_Pago;
    
    private int IdVendaPrazo;

    /**
     * @return the Data_PagPrazo
     */
    public String getData_PagPrazo() {
        return Data_PagPrazo;
    }

    /**
     * @param Data_PagPrazo the Data_PagPrazo to set
     */
    public void setData_PagPrazo(String Data_PagPrazo) {
        this.Data_PagPrazo = Data_PagPrazo;
    }

    /**
     * @return the ParcelaPrazo
     */
    public String getParcelaPrazo() {
        return ParcelaPrazo;
    }

    /**
     * @param ParcelaPrazo the ParcelaPrazo to set
     */
    public void setParcelaPrazo(String ParcelaPrazo) {
        this.ParcelaPrazo = ParcelaPrazo;
    }

    /**
     * @return the Valor_Pago
     */
    public Float getValor_Pago() {
        return Valor_Pago;
    }

    /**
     * @param Valor_Pago the Valor_Pago to set
     */
    public void setValor_Pago(Float Valor_Pago) {
        this.Valor_Pago = Valor_Pago;
    }

    /**
     * @return the IdVendaPrazo
     */
    public int getIdVendaPrazo() {
        return IdVendaPrazo;
    }

    /**
     * @param IdVendaPrazo the IdVendaPrazo to set
     */
    public void setIdVendaPrazo(int IdVendaPrazo) {
        this.IdVendaPrazo = IdVendaPrazo;
    }
    
    
}
