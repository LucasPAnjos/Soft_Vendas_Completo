/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.VO.Cadastro_ClienteVO;
import Model.VO.Cadastro_FuncionarioVO;
import Model.VO.Dados_iniciaisVO;
import Model.VO.VGerenteVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class FuncionarioDAO {
    
    Conecta_Banco Conexao = new Conecta_Banco();
    Conecta_Banco ConexaoBuscas = new Conecta_Banco();
    
    int Cod_Formacao, Cod_Cargo, Cod_Setor, Cod_FuncionarioDados, Cod_Estado;
    String Nome_Estado, Nome_Formacao, Nome_Setor, Nome_Cargo;
    
    public void Cadastrar_FuncionarioDados (Cadastro_FuncionarioVO Model_Funcionario){
       
        Buscar_CodFormacao(Model_Funcionario.getFormacao_NomeFuncionario());
        //Buscar_CodProfissao(Model_Funcionario.getProfissao_NomeFuncionario());
        Buscar_CodSetor(Model_Funcionario.getSetor_NomeFuncionario());
        Buscar_CodCargo(Model_Funcionario.getCargo_NomeFuncionario());
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into funcionario_dados (Nome_Funcionario,Data_Nascimento_Funcionario,Idade_Funcionario,CPF_Funcionario,RG_Funcionario,Formacao_idFormacao,Setor_idSetor,Cargo_idCargo)"+"values(?,?,?,?,?,?,?,?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Funcionario());
            pstCadastrar.setString(2, Model_Funcionario.getData_Funcionario());
            pstCadastrar.setString(3, Model_Funcionario.getIdade_Funcionario());
            pstCadastrar.setString(4, Model_Funcionario.getCPF_funcionario());
            pstCadastrar.setString(5, Model_Funcionario.getRG_funcionario());
            
            pstCadastrar.setInt(6, Cod_Formacao);
//            pstCadastrar.setInt(7, Cod_Profissao);
            pstCadastrar.setInt(7, Cod_Setor);
            pstCadastrar.setInt(8, Cod_Cargo);
            
            pstCadastrar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
     
    public void Cadastrar_FuncionarioContato(Cadastro_FuncionarioVO Model_Funcionario){
        
        Buscar_CodEstado(Model_Funcionario.getEstado_NomeFuncionario_Contato());
        BuscarIDFuncionario_Dados(Model_Funcionario.getIDFuncionario_Dados());
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadatrar = Conexao.conn.prepareStatement("insert into funcionario_cotato (Endereco_Funcionario,Numero_Funcionario,Bairro_Funcionario,Complemento_Funcionario,Telefone_Funcionario,Celular_Funcionario,Cep_Funcionario,Cidade_Funcionario, Email_Funcionario,Estado_idEstado,Funcionario_Dados_idFuncionario)"+"values(?,?,?,?,?,?,?,?,?,?,?)");
            
            pstCadatrar.setString(1, Model_Funcionario.getEndereco_Funcionario_Contato());
            pstCadatrar.setString(2, Model_Funcionario.getNumero_Funcionario_Contato());
            pstCadatrar.setString(3, Model_Funcionario.getBairro_Funcionario_Contato());
            pstCadatrar.setString(4, Model_Funcionario.getComplemento_Funcionario_Contato());
            pstCadatrar.setString(5, Model_Funcionario.getTelefone_Funcionario_Contato());
            pstCadatrar.setString(6, Model_Funcionario.getCelular_Funcionario_Contato());
            pstCadatrar.setString(7, Model_Funcionario.getCep_Funcionario_Contato());
            pstCadatrar.setString(8, Model_Funcionario.getCidade_Funcionario_Contato());
            pstCadatrar.setString(9, Model_Funcionario.getEmail_Funcionario());
            
            pstCadatrar.setInt(10, Cod_Estado);
            pstCadatrar.setInt(11, Cod_FuncionarioDados);
            
            pstCadatrar.execute();
        
            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso");
        
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    
    public void Adicionar_Aprovador (VGerenteVO ModGerente){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("INSERT INTO gerente (Funcionario_Dados_idFuncionario1)"+"values(?)");
        
        pst.setInt(1, ModGerente.getCod_funcionario());
        
        pst.execute();
        
        JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Cadastro_FuncionarioVO PesquisarCod_Funcionario(Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from funcionario_dados inner join funcionario_cotato on funcionario_dados.`idFuncionario` = funcionario_cotato.`Funcionario_Dados_idFuncionario` where funcionario_dados.`idFuncionario`='"+Model_Funcionario.getID_Funcionario()+"';");
             
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setID_Funcionario(Conexao.rs.getInt("idFuncionario"));
            Model_Funcionario.setNome_Funcionario(Conexao.rs.getString("Nome_Funcionario"));
            Model_Funcionario.setData_Funcionario(Conexao.rs.getString("Data_Nascimento_Funcionario"));
            Model_Funcionario.setIdade_Funcionario(Conexao.rs.getString("Idade_Funcionario"));
            Model_Funcionario.setCPF_funcionario(Conexao.rs.getString("Idade_Funcionario"));
            Model_Funcionario.setRG_funcionario(Conexao.rs.getString("RG_Funcionario"));
            
            Model_Funcionario.setEndereco_Funcionario_Contato(Conexao.rs.getString("Endereco_Funcionario"));
            Model_Funcionario.setNumero_Funcionario_Contato(Conexao.rs.getString("Numero_Funcionario"));
            Model_Funcionario.setBairro_Funcionario_Contato(Conexao.rs.getString("Bairro_Funcionario"));
            Model_Funcionario.setComplemento_Funcionario_Contato(Conexao.rs.getString("Complemento_Funcionario"));
            Model_Funcionario.setTelefone_Funcionario_Contato(Conexao.rs.getString("Telefone_Funcionario"));
            Model_Funcionario.setCelular_Funcionario_Contato(Conexao.rs.getString("Celular_Funcionario"));
            Model_Funcionario.setCep_Funcionario_Contato(Conexao.rs.getString("Cep_Funcionario"));
            Model_Funcionario.setCidade_Funcionario_Contato(Conexao.rs.getString("Cidade_Funcionario"));
            Model_Funcionario.setEmail_Funcionario(Conexao.rs.getString("Email_Funcionario"));
            
            BuscarNomeEstado(Conexao.rs.getInt("Estado_idEstado"));
            Model_Funcionario.setEstado_NomeFuncionario_Contato(Nome_Estado);
            
            Buscar_NomeFormacao(Conexao.rs.getInt("Formacao_idFormacao"));
            Model_Funcionario.setFormacao_NomeFuncionario(Nome_Formacao);
            
            //Buscar_NomeProfissao(Conexao.rs.getInt("Profissao_idProfissao"));
            //Model_Funcionario.setProfissao_NomeFuncionario(Nome_Profissao);
            
            Buscar_NomeSetor(Conexao.rs.getInt("Setor_idSetor"));
            Model_Funcionario.setSetor_NomeFuncionario(Nome_Setor);
            
            Buscar_NomeCargo(Conexao.rs.getInt("Cargo_idCargo"));
            Model_Funcionario.setCargo_NomeFuncionario(Nome_Cargo);
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Cadastro Não Localizado!");
            
            Model_Funcionario.setID_Funcionario(0);
            Model_Funcionario.setNome_Funcionario("");
            Model_Funcionario.setData_Funcionario("");
            Model_Funcionario.setIdade_Funcionario("");
            Model_Funcionario.setCPF_funcionario("");
            Model_Funcionario.setRG_funcionario("");
            
            Model_Funcionario.setEndereco_Funcionario_Contato("");
            Model_Funcionario.setNumero_Funcionario_Contato("");
            Model_Funcionario.setBairro_Funcionario_Contato("");
            Model_Funcionario.setComplemento_Funcionario_Contato("");
            Model_Funcionario.setTelefone_Funcionario_Contato("");
            Model_Funcionario.setCelular_Funcionario_Contato("");
            Model_Funcionario.setCep_Funcionario_Contato("");
            Model_Funcionario.setCidade_Funcionario_Contato("");
            Model_Funcionario.setEmail_Funcionario("");
            
            
        }
        
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO PesquisarNome_Funcionario(Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from funcionario_dados inner join funcionario_cotato on funcionario_dados.`idFuncionario` = funcionario_cotato.`Funcionario_Dados_idFuncionario` where funcionario_dados.`Nome_Funcionario` like'%"+Model_Funcionario.getPesquisaNomeFuncionario()+"%';");
             
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setID_Funcionario(Conexao.rs.getInt("idFuncionario"));
            Model_Funcionario.setNome_Funcionario(Conexao.rs.getString("Nome_Funcionario"));
            Model_Funcionario.setData_Funcionario(Conexao.rs.getString("Data_Nascimento_Funcionario"));
            Model_Funcionario.setIdade_Funcionario(Conexao.rs.getString("Idade_Funcionario"));
            Model_Funcionario.setCPF_funcionario(Conexao.rs.getString("Idade_Funcionario"));
            Model_Funcionario.setRG_funcionario(Conexao.rs.getString("RG_Funcionario"));
            
            Model_Funcionario.setEndereco_Funcionario_Contato(Conexao.rs.getString("Endereco_Funcionario"));
            Model_Funcionario.setNumero_Funcionario_Contato(Conexao.rs.getString("Numero_Funcionario"));
            Model_Funcionario.setBairro_Funcionario_Contato(Conexao.rs.getString("Bairro_Funcionario"));
            Model_Funcionario.setComplemento_Funcionario_Contato(Conexao.rs.getString("Complemento_Funcionario"));
            Model_Funcionario.setTelefone_Funcionario_Contato(Conexao.rs.getString("Telefone_Funcionario"));
            Model_Funcionario.setCelular_Funcionario_Contato(Conexao.rs.getString("Celular_Funcionario"));
            Model_Funcionario.setCep_Funcionario_Contato(Conexao.rs.getString("Cep_Funcionario"));
            Model_Funcionario.setCidade_Funcionario_Contato(Conexao.rs.getString("Cidade_Funcionario"));
            Model_Funcionario.setEmail_Funcionario(Conexao.rs.getString("Email_Funcionario"));
            
            BuscarNomeEstado(Conexao.rs.getInt("Estado_idEstado"));
            Model_Funcionario.setEstado_NomeFuncionario_Contato(Nome_Estado);
            
            Buscar_NomeFormacao(Conexao.rs.getInt("Formacao_idFormacao"));
            Model_Funcionario.setFormacao_NomeFuncionario(Nome_Formacao);
            
            //Buscar_NomeProfissao(Conexao.rs.getInt("Profissao_idProfissao"));
            //Model_Funcionario.setProfissao_NomeFuncionario(Nome_Profissao);
            
            Buscar_NomeSetor(Conexao.rs.getInt("Setor_idSetor"));
            Model_Funcionario.setSetor_NomeFuncionario(Nome_Setor);
            
            Buscar_NomeCargo(Conexao.rs.getInt("Cargo_idCargo"));
            Model_Funcionario.setCargo_NomeFuncionario(Nome_Cargo);
            
        } catch (SQLException ex) {
            
            Model_Funcionario.setID_Funcionario(0);
            Model_Funcionario.setNome_Funcionario("");
            Model_Funcionario.setData_Funcionario("");
            Model_Funcionario.setIdade_Funcionario("");
            Model_Funcionario.setCPF_funcionario("");
            Model_Funcionario.setRG_funcionario("");
            
            Model_Funcionario.setEndereco_Funcionario_Contato("");
            Model_Funcionario.setNumero_Funcionario_Contato("");
            Model_Funcionario.setBairro_Funcionario_Contato("");
            Model_Funcionario.setComplemento_Funcionario_Contato("");
            Model_Funcionario.setTelefone_Funcionario_Contato("");
            Model_Funcionario.setCelular_Funcionario_Contato("");
            Model_Funcionario.setCep_Funcionario_Contato("");
            Model_Funcionario.setCidade_Funcionario_Contato("");
            Model_Funcionario.setEmail_Funcionario("");
            
            
        }
        
        
        return Model_Funcionario;
    }
    
    
    public void AtualizarFuncionario (Cadastro_FuncionarioVO Model_Funcionario){
        
  //      Buscar_CodProfissao(Model_Funcionario.getProfissao_NomeFuncionario());
        Buscar_CodFormacao(Model_Funcionario.getFormacao_NomeFuncionario());
        Buscar_CodSetor(Model_Funcionario.getSetor_NomeFuncionario());
        Buscar_CodCargo(Model_Funcionario.getCargo_NomeFuncionario());
        
        Buscar_CodEstado(Model_Funcionario.getEstado_NomeFuncionario_Contato());
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update funcionario_dados inner join funcionario_cotato on funcionario_dados.`idFuncionario` = funcionario_cotato.`Funcionario_Dados_idFuncionario` set Nome_Funcionario=?, Data_Nascimento_Funcionario=?, Idade_Funcionario=?,CPF_Funcionario=?,RG_Funcionario=?,Formacao_idFormacao=?,Setor_idSetor=?,Cargo_idCargo=?, "
                    + "Endereco_Funcionario=?,Numero_Funcionario=?,Bairro_Funcionario=?,Complemento_Funcionario=?,Telefone_Funcionario=?,Celular_Funcionario=?,Cep_Funcionario=?,Cidade_Funcionario=?,Email_Funcionario=?,Estado_idEstado=? where idFuncionario='"+Model_Funcionario.getID_Funcionario()+"'");
            
            pstAtualizar.setString(1, Model_Funcionario.getNome_Funcionario());
            pstAtualizar.setString(2, Model_Funcionario.getData_Funcionario());
            pstAtualizar.setString(3, Model_Funcionario.getIdade_Funcionario());
            pstAtualizar.setString(4, Model_Funcionario.getCPF_funcionario());
            pstAtualizar.setString(5, Model_Funcionario.getRG_funcionario());
            
//            pstAtualizar.setInt(6, Cod_Profissao);
            pstAtualizar.setInt(6, Cod_Formacao);
            pstAtualizar.setInt(7, Cod_Setor);
            pstAtualizar.setInt(8, Cod_Cargo);
                        
            pstAtualizar.setString(9, Model_Funcionario.getEndereco_Funcionario_Contato());
            pstAtualizar.setString(10, Model_Funcionario.getNumero_Funcionario_Contato());
            pstAtualizar.setString(11, Model_Funcionario.getBairro_Funcionario_Contato());
            pstAtualizar.setString(12, Model_Funcionario.getComplemento_Funcionario_Contato());
            pstAtualizar.setString(13, Model_Funcionario.getTelefone_Funcionario_Contato());
            pstAtualizar.setString(14, Model_Funcionario.getCelular_Funcionario_Contato());
            pstAtualizar.setString(15, Model_Funcionario.getCep_Funcionario_Contato());
            pstAtualizar.setString(16, Model_Funcionario.getCidade_Funcionario_Contato());
            pstAtualizar.setString(17, Model_Funcionario.getEmail_Funcionario());
            
            pstAtualizar.setInt(18, Cod_Estado);
            
            pstAtualizar.execute();
            
            JOptionPane.showMessageDialog(null, "Alterado Com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Conexao.desconecta();
    }
    
    public void Cadastrar_Estado (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into estado (nome_estado) "+"values(?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Estado());
            
            pstCadastrar.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        Conexao.desconecta();    
        
    }
    
    
    public void Cadastrar_Profissao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into profissao (Nome_Profissao)"+"values(?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Profissao());
            
            pstCadastrar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    
    public void Cadastrar_Setor (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into setor (Nome_Setor)"+"values(?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Setor());
            
            pstCadastrar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    

    public void Cadastrar_Formacao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into formacao (Nome_Formacao)"+"values(?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Formacao());
            
            pstCadastrar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastrado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }

    
    public Cadastro_FuncionarioVO Consultar_Estado (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from estado where idEstado ='"+Model_Funcionario.getIdEstado()+"'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdEstado(Conexao.rs.getInt("idEstado"));
            Model_Funcionario.setNome_Estado(Conexao.rs.getString("Nome_Estado"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_CodFormacao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from formacao where idFormacao ='"+Model_Funcionario.getIdFormacao()+"'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdFormacao(Conexao.rs.getInt("idFormacao"));
            Model_Funcionario.setNome_Formacao(Conexao.rs.getString("Nome_Formacao"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_NomeFormacao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from formacao where Nome_Formacao like'%"+Model_Funcionario.getNome_Formacao()+"%'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdFormacao(Conexao.rs.getInt("idFormacao"));
            Model_Funcionario.setNome_Formacao(Conexao.rs.getString("Nome_Formacao"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    public Cadastro_FuncionarioVO Consultar_Setor (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from setor where idSetor ='"+Model_Funcionario.getIdSetor()+"'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdSetor(Conexao.rs.getInt("idSetor"));
            Model_Funcionario.setNome_Setor(Conexao.rs.getString("Nome_Setor"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_NomeSetor (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from setor where Nome_Setor like'%"+Model_Funcionario.getNome_Setor()+"%'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdSetor(Conexao.rs.getInt("idSetor"));
            Model_Funcionario.setNome_Setor(Conexao.rs.getString("Nome_Setor"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    public Cadastro_FuncionarioVO Consultar_Profissao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from profissao where idProfissao ='"+Model_Funcionario.getIdProfissao()+"'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdProfissao(Conexao.rs.getInt("idProfissao"));
            Model_Funcionario.setNome_Profissao(Conexao.rs.getString("Nome_Profissao"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_NomeProfissao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from profissao where Nome_Profissao like'%"+Model_Funcionario.getNome_Profissao()+"%'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdProfissao(Conexao.rs.getInt("idProfissao"));
            Model_Funcionario.setNome_Profissao(Conexao.rs.getString("Nome_Profissao"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_NomeEstado (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from estado where nome_estado like'%"+Model_Funcionario.getNome_Estado()+"%'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdEstado(Conexao.rs.getInt("idEstado"));
            Model_Funcionario.setNome_Estado(Conexao.rs.getString("Nome_Estado"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public void Atualizar_Estado (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update estado set nome_estado=? where idEstado ='"+Model_Funcionario.getIdEstado()+"'");
            
            pstAtualizar.setString(1, Model_Funcionario.getNome_Estado());
            
            pstAtualizar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Atualizar_Setor (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update setor set Nome_Setor=? where idSetor ='"+Model_Funcionario.getIdSetor()+"'");
            
            pstAtualizar.setString(1, Model_Funcionario.getNome_Setor());
            
            pstAtualizar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Atualizar_Profissao (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update profissao set Nome_Profissao=? where idProfissao ='"+Model_Funcionario.getIdProfissao()+"'");
            
            pstAtualizar.setString(1, Model_Funcionario.getNome_Profissao());
            
            pstAtualizar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    
    public void Atualizar_Cargo (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstAtualizar = Conexao.conn.prepareStatement("update cargo set Nome_Cargo=? where idCargo ='"+Model_Funcionario.getIdCargo()+"'");
            
            pstAtualizar.setString(1, Model_Funcionario.getNome_Cargo());
            
            pstAtualizar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Alterado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    
    
    public void Cadastrar_Cargo (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        try {
            PreparedStatement pstCadastrar = Conexao.conn.prepareStatement("insert into cargo (Nome_Cargo)"+"values (?)");
            
            pstCadastrar.setString(1, Model_Funcionario.getNome_Cargo());
            
            pstCadastrar.execute();
            
            JOptionPane.showMessageDialog(null, "Cadastro Com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
            Conexao.desconecta();
            
        }
        
    }
    
    
    public Cadastro_FuncionarioVO Consultar_CodCargo (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from cargo where idCargo ='"+Model_Funcionario.getIdCargo()+"'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdCargo(Conexao.rs.getInt("idCargo"));
            Model_Funcionario.setNome_Cargo(Conexao.rs.getString("Nome_Cargo"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public Cadastro_FuncionarioVO Consultar_NomeCargo (Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from cargo where Nome_Cargo like'%"+Model_Funcionario.getNome_Cargo()+"%'");
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setIdCargo(Conexao.rs.getInt("idCargo"));
            Model_Funcionario.setNome_Cargo(Conexao.rs.getString("Nome_Cargo"));
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
        return Model_Funcionario;
    }
    
    
    public void Buscar_NomeCargo (int Cod_Cargo){
        
        ConexaoBuscas.conexao();
        
        ConexaoBuscas.executaSQL("select * from cargo where idCargo ='"+Cod_Cargo+"'");
        
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Cargo = ConexaoBuscas.rs.getString("Nome_Cargo");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void Buscar_NomeSetor(int Cod_Setor){
        
        ConexaoBuscas.conexao();
        
        ConexaoBuscas.executaSQL("select * from setor where idSetor ='"+Cod_Setor+"'");
        
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Setor = ConexaoBuscas.rs.getString("Nome_Setor");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
        
    }
    
    public void Buscar_CodEstado(String Estado){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from estado where nome_estado ='"+Estado+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_Estado = Conexao.rs.getInt("idEstado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    public void BuscarNomeEstado (int CodEstado){
        
        ConexaoBuscas.conexao();
        
        ConexaoBuscas.executaSQL("select * from estado where idEstado ='"+CodEstado+"'");
        
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Estado = ConexaoBuscas.rs.getString("nome_estado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
    }
    
    public void BuscarIDFuncionario_Dados(String CPF){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from funcionario_dados where CPF_Funcionario ='"+CPF+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_FuncionarioDados = Conexao.rs.getInt("idFuncionario"); 
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    
    public void Buscar_CodFormacao (String Formacao){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from formacao where Nome_Formacao='"+Formacao+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_Formacao = Conexao.rs.getInt("idFormacao");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
    }
    
    public void Buscar_NomeFormacao (int CodFormacao){
        
        ConexaoBuscas.conexao();
        
        ConexaoBuscas.executaSQL("select * from formacao where idFormacao ='"+CodFormacao+"'");
        
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Formacao = ConexaoBuscas.rs.getString("Nome_Formacao");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
        
    }
    
    /*
    public void Buscar_CodProfissao(String Profissao){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from profissao where Nome_Profissao ='"+Profissao+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_Profissao = Conexao.rs.getInt("idProfissao");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    */

/*    
    public void Buscar_NomeProfissao (int Cod_Profissao){
        
        ConexaoBuscas.conexao();
        
        ConexaoBuscas.executaSQL("select * from profissao where idProfissao ='"+Cod_Profissao+"'");
        
        try {
            ConexaoBuscas.rs.first();
            
            Nome_Profissao = ConexaoBuscas.rs.getString("Nome_Profissao");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
        
    }
    
*/  

    public Cadastro_FuncionarioVO PesquisarCod_FuncionarioLogin(Cadastro_FuncionarioVO Model_Funcionario){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from funcionario_dados where `idFuncionario`='"+Model_Funcionario.getID_Funcionario()+"';");
             
        
        try {
            Conexao.rs.first();
            
            Model_Funcionario.setID_Funcionario(Conexao.rs.getInt("idFuncionario"));
            Model_Funcionario.setNome_Funcionario(Conexao.rs.getString("Nome_Funcionario"));
                        
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Model_Funcionario;
        
    }
     
    
    
    public void Buscar_CodCargo(String Cargo){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from cargo where Nome_Cargo='"+Cargo+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_Cargo = Conexao.rs.getInt("idCargo");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }
    
    public void Buscar_CodSetor (String Setor){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from setor where Nome_Setor ='"+Setor+"'");
        
        try {
            Conexao.rs.first();
            
            Cod_Setor = Conexao.rs.getInt("idSetor");
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Conexao.desconecta();
        
    }

      
        
          
            
     
    
}

