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
public class Cadastro_LoginVO {
    
    
  private int IdLogin;
  private String nome_acesso;
  private String senha;
  private String permissao;

  private int IdFuncionario;
  private String nome_funcionario;
  
    /**
     * @return the IdLogin
     */
    public int getIdLogin() {
        return IdLogin;
    }

    /**
     * @param IdLogin the IdLogin to set
     */
    public void setIdLogin(int IdLogin) {
        this.IdLogin = IdLogin;
    }

    /**
     * @return the nome_acesso
     */
    public String getNome_acesso() {
        return nome_acesso;
    }

    /**
     * @param nome_acesso the nome_acesso to set
     */
    public void setNome_acesso(String nome_acesso) {
        this.nome_acesso = nome_acesso;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the permissao
     */
    public String getPermissao() {
        return permissao;
    }

    /**
     * @param permissao the permissao to set
     */
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    /**
     * @return the IdFuncionario
     */
    public int getIdFuncionario() {
        return IdFuncionario;
    }

    /**
     * @param IdFuncionario the IdFuncionario to set
     */
    public void setIdFuncionario(int IdFuncionario) {
        this.IdFuncionario = IdFuncionario;
    }

    /**
     * @return the nome_funcionario
     */
    public String getNome_funcionario() {
        return nome_funcionario;
    }

    /**
     * @param nome_funcionario the nome_funcionario to set
     */
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

}
