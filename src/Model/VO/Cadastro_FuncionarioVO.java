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
public class Cadastro_FuncionarioVO {
    
 //Funcionario Dados    
    private int ID_Funcionario;
    private String Nome_Funcionario;
    private String Data_Funcionario;
    private String Idade_Funcionario;
    private String CPF_funcionario;
    private String RG_funcionario;
    
    private String PesquisaNomeFuncionario;
    
    private int Profissao_Funcionario;
    private int Formacao_Funcionario;
    private int Setor_Funcionario;
    private int Cargo_Funcionario;
    
    private String Profissao_NomeFuncionario;
    private String Formacao_NomeFuncionario;
    private String Setor_NomeFuncionario;
    private String Cargo_NomeFuncionario;
    
    private String IDFuncionario_Dados;
    
    private int CodFuncionario_Dados;
    
    private String Login_Funcionario;
    
 //Funcionario_Contato
    private int idFuncionario_Contato;
    private String Endereco_Funcionario_Contato;
    private String Numero_Funcionario_Contato;
    private String Bairro_Funcionario_Contato;
    private String Complemento_Funcionario_Contato;
    private String Telefone_Funcionario_Contato;
    private String Celular_Funcionario_Contato;
    private String Cep_Funcionario_Contato;
    private String Cidade_Funcionario_Contato;
    private String Email_Funcionario;
    
    private String Estado_NomeFuncionario_Contato;
    
    private int Estado_Funcionario_Contato;

    
    //Complementares
    
    private int idEstado;
    private String Nome_Estado;
    
    private int idFormacao;
    private String Nome_Formacao;
    
    private int idSetor;
    private String Nome_Setor;
    
    
    private int idCargo;
    private String Nome_Cargo;
    
    private int idProfissao;
    private String Nome_Profissao;
    
    
    /**
     * @return the ID_Funcionario
     */
    public int getID_Funcionario() {
        return ID_Funcionario;
    }

    /**
     * @param ID_Funcionario the ID_Funcionario to set
     */
    public void setID_Funcionario(int ID_Funcionario) {
        this.ID_Funcionario = ID_Funcionario;
    }

    /**
     * @return the Nome_Funcionario
     */
    public String getNome_Funcionario() {
        return Nome_Funcionario;
    }

    /**
     * @param Nome_Funcionario the Nome_Funcionario to set
     */
    public void setNome_Funcionario(String Nome_Funcionario) {
        this.Nome_Funcionario = Nome_Funcionario;
    }

    /**
     * @return the Data_Funcionario
     */
    public String getData_Funcionario() {
        return Data_Funcionario;
    }

    /**
     * @param Data_Funcionario the Data_Funcionario to set
     */
    public void setData_Funcionario(String Data_Funcionario) {
        this.Data_Funcionario = Data_Funcionario;
    }

    /**
     * @return the Idade_Funcionario
     */
    public String getIdade_Funcionario() {
        return Idade_Funcionario;
    }

    /**
     * @param Idade_Funcionario the Idade_Funcionario to set
     */
    public void setIdade_Funcionario(String Idade_Funcionario) {
        this.Idade_Funcionario = Idade_Funcionario;
    }

    /**
     * @return the CPF_funcionario
     */
    public String getCPF_funcionario() {
        return CPF_funcionario;
    }

    /**
     * @param CPF_funcionario the CPF_funcionario to set
     */
    public void setCPF_funcionario(String CPF_funcionario) {
        this.CPF_funcionario = CPF_funcionario;
    }

    /**
     * @return the RG_funcionario
     */
    public String getRG_funcionario() {
        return RG_funcionario;
    }

    /**
     * @param RG_funcionario the RG_funcionario to set
     */
    public void setRG_funcionario(String RG_funcionario) {
        this.RG_funcionario = RG_funcionario;
    }

    /**
     * @return the Profissao_Funcionario
     */
    public int getProfissao_Funcionario() {
        return Profissao_Funcionario;
    }

    /**
     * @param Profissao_Funcionario the Profissao_Funcionario to set
     */
    public void setProfissao_Funcionario(int Profissao_Funcionario) {
        this.Profissao_Funcionario = Profissao_Funcionario;
    }

    /**
     * @return the Formacao_Funcionario
     */
    public int getFormacao_Funcionario() {
        return Formacao_Funcionario;
    }

    /**
     * @param Formacao_Funcionario the Formacao_Funcionario to set
     */
    public void setFormacao_Funcionario(int Formacao_Funcionario) {
        this.Formacao_Funcionario = Formacao_Funcionario;
    }

    /**
     * @return the Setor_Funcionario
     */
    public int getSetor_Funcionario() {
        return Setor_Funcionario;
    }

    /**
     * @param Setor_Funcionario the Setor_Funcionario to set
     */
    public void setSetor_Funcionario(int Setor_Funcionario) {
        this.Setor_Funcionario = Setor_Funcionario;
    }

    /**
     * @return the Cargo_Funcionario
     */
    public int getCargo_Funcionario() {
        return Cargo_Funcionario;
    }

    /**
     * @param Cargo_Funcionario the Cargo_Funcionario to set
     */
    public void setCargo_Funcionario(int Cargo_Funcionario) {
        this.Cargo_Funcionario = Cargo_Funcionario;
    }

    /**
     * @return the idFuncionario_Contato
     */
    public int getIdFuncionario_Contato() {
        return idFuncionario_Contato;
    }

    /**
     * @param idFuncionario_Contato the idFuncionario_Contato to set
     */
    public void setIdFuncionario_Contato(int idFuncionario_Contato) {
        this.idFuncionario_Contato = idFuncionario_Contato;
    }

    /**
     * @return the Endereco_Funcionario_Contato
     */
    public String getEndereco_Funcionario_Contato() {
        return Endereco_Funcionario_Contato;
    }

    /**
     * @param Endereco_Funcionario_Contato the Endereco_Funcionario_Contato to set
     */
    public void setEndereco_Funcionario_Contato(String Endereco_Funcionario_Contato) {
        this.Endereco_Funcionario_Contato = Endereco_Funcionario_Contato;
    }

    /**
     * @return the Numero_Funcionario_Contato
     */
    public String getNumero_Funcionario_Contato() {
        return Numero_Funcionario_Contato;
    }

    /**
     * @param Numero_Funcionario_Contato the Numero_Funcionario_Contato to set
     */
    public void setNumero_Funcionario_Contato(String Numero_Funcionario_Contato) {
        this.Numero_Funcionario_Contato = Numero_Funcionario_Contato;
    }

    /**
     * @return the Bairro_Funcionario_Contato
     */
    public String getBairro_Funcionario_Contato() {
        return Bairro_Funcionario_Contato;
    }

    /**
     * @param Bairro_Funcionario_Contato the Bairro_Funcionario_Contato to set
     */
    public void setBairro_Funcionario_Contato(String Bairro_Funcionario_Contato) {
        this.Bairro_Funcionario_Contato = Bairro_Funcionario_Contato;
    }

    /**
     * @return the Complemento_Funcionario_Contato
     */
    public String getComplemento_Funcionario_Contato() {
        return Complemento_Funcionario_Contato;
    }

    /**
     * @param Complemento_Funcionario_Contato the Complemento_Funcionario_Contato to set
     */
    public void setComplemento_Funcionario_Contato(String Complemento_Funcionario_Contato) {
        this.Complemento_Funcionario_Contato = Complemento_Funcionario_Contato;
    }

    /**
     * @return the Telefone_Funcionario_Contato
     */
    public String getTelefone_Funcionario_Contato() {
        return Telefone_Funcionario_Contato;
    }

    /**
     * @param Telefone_Funcionario_Contato the Telefone_Funcionario_Contato to set
     */
    public void setTelefone_Funcionario_Contato(String Telefone_Funcionario_Contato) {
        this.Telefone_Funcionario_Contato = Telefone_Funcionario_Contato;
    }

    /**
     * @return the Celular_Funcionario_Contato
     */
    public String getCelular_Funcionario_Contato() {
        return Celular_Funcionario_Contato;
    }

    /**
     * @param Celular_Funcionario_Contato the Celular_Funcionario_Contato to set
     */
    public void setCelular_Funcionario_Contato(String Celular_Funcionario_Contato) {
        this.Celular_Funcionario_Contato = Celular_Funcionario_Contato;
    }

    /**
     * @return the Cep_Funcionario_Contato
     */
    public String getCep_Funcionario_Contato() {
        return Cep_Funcionario_Contato;
    }

    /**
     * @param Cep_Funcionario_Contato the Cep_Funcionario_Contato to set
     */
    public void setCep_Funcionario_Contato(String Cep_Funcionario_Contato) {
        this.Cep_Funcionario_Contato = Cep_Funcionario_Contato;
    }

    /**
     * @return the Cidade_Funcionario_Contato
     */
    public String getCidade_Funcionario_Contato() {
        return Cidade_Funcionario_Contato;
    }

    /**
     * @param Cidade_Funcionario_Contato the Cidade_Funcionario_Contato to set
     */
    public void setCidade_Funcionario_Contato(String Cidade_Funcionario_Contato) {
        this.Cidade_Funcionario_Contato = Cidade_Funcionario_Contato;
    }

    /**
     * @return the Estado_Funcionario_Contato
     */
    public int getEstado_Funcionario_Contato() {
        return Estado_Funcionario_Contato;
    }

    /**
     * @param Estado_Funcionario_Contato the Estado_Funcionario_Contato to set
     */
    public void setEstado_Funcionario_Contato(int Estado_Funcionario_Contato) {
        this.Estado_Funcionario_Contato = Estado_Funcionario_Contato;
    }

    /**
     * @return the Profissao_NomeFuncionario
     */
    public String getProfissao_NomeFuncionario() {
        return Profissao_NomeFuncionario;
    }

    /**
     * @param Profissao_NomeFuncionario the Profissao_NomeFuncionario to set
     */
    public void setProfissao_NomeFuncionario(String Profissao_NomeFuncionario) {
        this.Profissao_NomeFuncionario = Profissao_NomeFuncionario;
    }

    /**
     * @return the Formacao_NomeFuncionario
     */
    public String getFormacao_NomeFuncionario() {
        return Formacao_NomeFuncionario;
    }

    /**
     * @param Formacao_NomeFuncionario the Formacao_NomeFuncionario to set
     */
    public void setFormacao_NomeFuncionario(String Formacao_NomeFuncionario) {
        this.Formacao_NomeFuncionario = Formacao_NomeFuncionario;
    }

    /**
     * @return the Setor_NomeFuncionario
     */
    public String getSetor_NomeFuncionario() {
        return Setor_NomeFuncionario;
    }

    /**
     * @param Setor_NomeFuncionario the Setor_NomeFuncionario to set
     */
    public void setSetor_NomeFuncionario(String Setor_NomeFuncionario) {
        this.Setor_NomeFuncionario = Setor_NomeFuncionario;
    }

    /**
     * @return the Cargo_NomeFuncionario
     */
    public String getCargo_NomeFuncionario() {
        return Cargo_NomeFuncionario;
    }

    /**
     * @param Cargo_NomeFuncionario the Cargo_NomeFuncionario to set
     */
    public void setCargo_NomeFuncionario(String Cargo_NomeFuncionario) {
        this.Cargo_NomeFuncionario = Cargo_NomeFuncionario;
    }

    /**
     * @return the IDFuncionario_Dados
     */
    public String getIDFuncionario_Dados() {
        return IDFuncionario_Dados;
    }

    /**
     * @param IDFuncionario_Dados the IDFuncionario_Dados to set
     */
    public void setIDFuncionario_Dados(String IDFuncionario_Dados) {
        this.IDFuncionario_Dados = IDFuncionario_Dados;
    }

    /**
     * @return the Estado_NomeFuncionario_Contato
     */
    public String getEstado_NomeFuncionario_Contato() {
        return Estado_NomeFuncionario_Contato;
    }

    /**
     * @param Estado_NomeFuncionario_Contato the Estado_NomeFuncionario_Contato to set
     */
    public void setEstado_NomeFuncionario_Contato(String Estado_NomeFuncionario_Contato) {
        this.Estado_NomeFuncionario_Contato = Estado_NomeFuncionario_Contato;
    }

    /**
     * @return the CodFuncionario_Dados
     */
    public int getCodFuncionario_Dados() {
        return CodFuncionario_Dados;
    }

    /**
     * @param CodFuncionario_Dados the CodFuncionario_Dados to set
     */
    public void setCodFuncionario_Dados(int CodFuncionario_Dados) {
        this.CodFuncionario_Dados = CodFuncionario_Dados;
    }

    /**
     * @return the Email_Funcionario
     */
    public String getEmail_Funcionario() {
        return Email_Funcionario;
    }

    /**
     * @param Email_Funcionario the Email_Funcionario to set
     */
    public void setEmail_Funcionario(String Email_Funcionario) {
        this.Email_Funcionario = Email_Funcionario;
    }

    /**
     * @return the PesquisaNomeFuncionario
     */
    public String getPesquisaNomeFuncionario() {
        return PesquisaNomeFuncionario;
    }

    /**
     * @param PesquisaNomeFuncionario the PesquisaNomeFuncionario to set
     */
    public void setPesquisaNomeFuncionario(String PesquisaNomeFuncionario) {
        this.PesquisaNomeFuncionario = PesquisaNomeFuncionario;
    }

    /**
     * @return the idEstado
     */
    public int getIdEstado() {
        return idEstado;
    }

    /**
     * @param idEstado the idEstado to set
     */
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    /**
     * @return the Nome_Estado
     */
    public String getNome_Estado() {
        return Nome_Estado;
    }

    /**
     * @param Nome_Estado the Nome_Estado to set
     */
    public void setNome_Estado(String Nome_Estado) {
        this.Nome_Estado = Nome_Estado;
    }

    /**
     * @return the idFormacao
     */
    public int getIdFormacao() {
        return idFormacao;
    }

    /**
     * @param idFormacao the idFormacao to set
     */
    public void setIdFormacao(int idFormacao) {
        this.idFormacao = idFormacao;
    }

    /**
     * @return the Nome_Formacao
     */
    public String getNome_Formacao() {
        return Nome_Formacao;
    }

    /**
     * @param Nome_Formacao the Nome_Formacao to set
     */
    public void setNome_Formacao(String Nome_Formacao) {
        this.Nome_Formacao = Nome_Formacao;
    }

    /**
     * @return the idSetor
     */
    public int getIdSetor() {
        return idSetor;
    }

    /**
     * @param idSetor the idSetor to set
     */
    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    /**
     * @return the Nome_Setor
     */
    public String getNome_Setor() {
        return Nome_Setor;
    }

    /**
     * @param Nome_Setor the Nome_Setor to set
     */
    public void setNome_Setor(String Nome_Setor) {
        this.Nome_Setor = Nome_Setor;
    }

    /**
     * @return the idCargo
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * @param idCargo the idCargo to set
     */
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    /**
     * @return the Nome_Cargo
     */
    public String getNome_Cargo() {
        return Nome_Cargo;
    }

    /**
     * @param Nome_Cargo the Nome_Cargo to set
     */
    public void setNome_Cargo(String Nome_Cargo) {
        this.Nome_Cargo = Nome_Cargo;
    }

    /**
     * @return the idProfissao
     */
    public int getIdProfissao() {
        return idProfissao;
    }

    /**
     * @param idProfissao the idProfissao to set
     */
    public void setIdProfissao(int idProfissao) {
        this.idProfissao = idProfissao;
    }

    /**
     * @return the Nome_Profissao
     */
    public String getNome_Profissao() {
        return Nome_Profissao;
    }

    /**
     * @param Nome_Profissao the Nome_Profissao to set
     */
    public void setNome_Profissao(String Nome_Profissao) {
        this.Nome_Profissao = Nome_Profissao;
    }

    /**
     * @return the Login_Funcionario
     */
    public String getLogin_Funcionario() {
        return Login_Funcionario;
    }

    /**
     * @param Login_Funcionario the Login_Funcionario to set
     */
    public void setLogin_Funcionario(String Login_Funcionario) {
        this.Login_Funcionario = Login_Funcionario;
    }
    
}
