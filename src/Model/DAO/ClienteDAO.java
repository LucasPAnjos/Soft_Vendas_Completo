/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.BD.Conecta_Banco;
import Model.BO.ClienteBO;
import Model.VO.Cadastro_ClienteVO;
import Model.VO.Cadastro_Cliente_ComercVO;
import Model.VO.Cadastro_Cliente_ContatoVO;
import Model.VO.Cadastro_Cliente_ProfVO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ClienteDAO {
    
    Cadastro_ClienteVO ModCliente = new Cadastro_ClienteVO();
    Cadastro_Cliente_ContatoVO ModContato = new Cadastro_Cliente_ContatoVO();
    Cadastro_Cliente_ComercVO ModComercial = new Cadastro_Cliente_ComercVO ();
    Cadastro_Cliente_ProfVO ModProficional = new Cadastro_Cliente_ProfVO ();
    
    Conecta_Banco ConexaoBuscas = new Conecta_Banco();
    
    Conecta_Banco Conexao = new Conecta_Banco ();
      
    
    int CodEstadoCivil;String Estado_civil;
    int CodSexo; String Sexo;
    int CodEmissor; String Emissor;
    int CodEstado, Cod_EstadoComercial; String Estado, Estado_Comercial;
    int CodCliente;
    int CodClienteProf;
    int CodClienteComercial;
    
    public void Inserir_Cliente (Cadastro_ClienteVO ModCliente){
    
        BuscaCodigo(ModCliente.getEstado_civil());
    BuscaCodigoSexo(ModCliente.getSexo());
    BuscarCodigoEmissor(ModCliente.getOrgao_emissor());
        
        Conexao.conexao();
        
                
        try {
            PreparedStatement pst = Conexao.conn.prepareStatement("insert into cadastro_cliente(nome_cliente,cpf,rg,data_emissao_rg,data_nascimento,nome_pai,nome_mae,Estado_civil_idEstado_civil,sexo_idsexo,Orgao_emissor_idOrgao_emissor)"
                    +"values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ModCliente.getNome_cliente());
            pst.setString(2, ModCliente.getCpf());
            pst.setString(3, ModCliente.getRg());
            pst.setString(4, ModCliente.getData_emisao_rg());
            pst.setString(5, ModCliente.getData_nascimento());
            pst.setString(6, ModCliente.getNome_pai());
            pst.setString(7, ModCliente.getNome_mae());
            pst.setInt(8, CodEstadoCivil);
            pst.setInt(9, CodSexo);
            pst.setInt(10, CodEmissor);
            
            pst.execute();
//            JOptionPane.showMessageDialog(null,"Cliente Cadastrado Com Sucesso!");            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar o Cliente" +ex);
        }
            
        Conexao.desconecta();
        
    }
    
    public void BuscaCodigo (String EstadoCivil ){
        
        Conexao.conexao();
        
        Conexao.executaSQL("select * from estado_civil where tipo_civil='"+EstadoCivil+"' ");
        try {
            Conexao.rs.first();
            CodEstadoCivil=Conexao.rs.getInt("idEstado_civil");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca estado civil" +ex);
        }
        
        Conexao.desconecta();
        
    }
    

public void BuscaCodigoSexo (String sexo ){
        
        Conexao.conexao();
        Conexao.executaSQL("select * from sexo where tipo_sexo='"+sexo+"' ");
        try {
            Conexao.rs.first();
            CodSexo=Conexao.rs.getInt("idsexo");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca sexo" +ex);
        }
        
        Conexao.desconecta();
    }


public void BuscarCodigoEmissor (String Emissor){
    
    Conexao.conexao();
    
    
    Conexao.executaSQL("select * from orgao_emissor where nome_orgao= '"+Emissor+"'");
    
        try {
            Conexao.rs.first();
            CodEmissor=Conexao.rs.getInt("idOrgao_emissor");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca emissor" +ex);
        }
    
        Conexao.desconecta();
}



public void InserirClienteContato (Cadastro_Cliente_ContatoVO ModContato){
    
    BuscarCodEstado(ModContato.getEstado());
    BuscarIDCliente(ModContato.getCadastroCliente());
    
    Conexao.conexao();
    
        try {
            PreparedStatement pstContato = Conexao.conn.prepareStatement("insert into cliente_contato (cep_cliente,endereco_cliente,numero_casa,bairro_cliente,complemento_cliente,cidade_cliente,telefone_cliente,celular_cliente,email_cliente,Estado_idEstado,Cadastro_cliente_idCadastro_cliente)"
            +"values(?,?,?,?,?,?,?,?,?,?,?)");
            
            pstContato.setString(1, ModContato.getCep());
            pstContato.setString(2, ModContato.getEndereco_contato());
            pstContato.setString(3, ModContato.getNumero_casa());
            pstContato.setString(4, ModContato.getBairro_cliente());
            pstContato.setString(5, ModContato.getCompemento());
            pstContato.setString(6, ModContato.getCidade_cliente());
            pstContato.setString(7, ModContato.getTelefone_cliente());
            pstContato.setString(8, ModContato.getCelular_cliente());
            pstContato.setString(9, ModContato.getEmail_cliente());
            pstContato.setInt(10, CodEstado);
            pstContato.setInt(11, CodCliente);
            
            pstContato.execute();
//            JOptionPane.showMessageDialog(null,"Contato Cadastrado Com Sucesso!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        Conexao.desconecta();
        
} 

public void BuscarIDCliente (String IDCliente){
        Conexao.conexao();
        Conexao.executaSQL("select * from cadastro_cliente where nome_cliente='"+IDCliente+"'");
        try {
            Conexao.rs.first();
            CodCliente=Conexao.rs.getInt("idCadastro_cliente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca cliente" +ex);
        }
            
        Conexao.desconecta();
        
        }

public void BuscarNomeCliente(int IDNomeCliente){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from ");
    
}

public void BuscarCodEstado (String Estado){
        Conexao.conexao();
        Conexao.executaSQL("select * from estado where nome_estado='"+Estado+"'");
        try {
            Conexao.rs.first();
            CodEstado=Conexao.rs.getInt("idEstado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca estado" +ex);
        }
            
        Conexao.desconecta();
        
        }

public void BuscarCod_EstadoComercial(String Estado_Comercial){
    
    ConexaoBuscas.conexao();
    
    ConexaoBuscas.executaSQL("select * from estado where nome_estado='"+Estado_Comercial+"'");

        try {
            ConexaoBuscas.rs.first();
            
            Cod_EstadoComercial = ConexaoBuscas.rs.getInt("idEstado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro estado!"+ ex);
        
            ConexaoBuscas.desconecta();
        }
    
}

public void InserirClienteComercial(Cadastro_Cliente_ComercVO ModComercial){
    
    BuscarIDClienteComercial(ModComercial.getCadastroCliente());
    BuscarCod_EstadoComercial(ModComercial.getEstado_comercial());
    
    Conexao.conexao();
        try {
            PreparedStatement pstComercial=Conexao.conn.prepareStatement("insert into cliente_comercial (nome_empresa_comercial,cep_comercial,endereco_comercial,numero_comercial,complemento_comercial,bairro_comercial,telefone_comercial,ramal_comercial, Cidade_comercial,Cadastro_cliente_idCadastro_cliente,Estado_idEstado)"
            +"values (?,?,?,?,?,?,?,?,?,?,?)");
            
            pstComercial.setString(1, ModComercial.getNome_empresa());
            pstComercial.setString(2, ModComercial.getCep_comercial());
            pstComercial.setString(3, ModComercial.getEndereco_comercial());
            pstComercial.setString(4, ModComercial.getNumero_comercial());
            pstComercial.setString(5, ModComercial.getComplemento_comercial());
            pstComercial.setString(6, ModComercial.getBairro_comercial());
            pstComercial.setString(7, ModComercial.getTelefone_comercial());
            pstComercial.setString(8, ModComercial.getRamal_comercial());
            pstComercial.setString(9, ModComercial.getCidade_comercial());
            pstComercial.setInt(10, CodClienteComercial);
            pstComercial.setInt(11, Cod_EstadoComercial);
            
            pstComercial.execute();
            
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado Com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Cliente Comercial não Cadastrado "+ ex);
        }
    
        Conexao.desconecta();
        
}


public void InserirClienteProficional (Cadastro_Cliente_ProfVO ModProfissional) {
    
    BuscarIDClienteProf(ModProfissional.getCadastro_cliente());
    
    Conexao.conexao();
    
        try {
            PreparedStatement pstProfissional = Conexao.conn.prepareStatement("insert into cliente_dados_prof (natureza_ocupacao,Profissao,renda_principal,tempo_servico,Cadastro_cliente_idCadastro_cliente)"
            +"values (?,?,?,?,?)");
            
            pstProfissional.setString(1, ModProfissional.getOcupacao());
            pstProfissional.setString(2, ModProfissional.getProfissao());
            pstProfissional.setFloat(3, ModProfissional.getRenda_principal());
            pstProfissional.setInt(4, ModProfissional.getTempo_servico());
            pstProfissional.setInt(5, CodClienteProf);
            
            pstProfissional.execute();
//            JOptionPane.showMessageDialog(null, "Dados prof. cadastrados");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Dados prof. cadastrados "+ex);
        }
    Conexao.desconecta();
}


public void BuscarIDClienteProf (String IDClienteProf) {
    
    Conexao.conexao();
    Conexao.executaSQL("select * from cadastro_cliente where nome_cliente='"+IDClienteProf+"'");
        try {
            Conexao.rs.first();
        CodClienteProf=Conexao.rs.getInt("idCadastro_cliente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca cliente prof." +ex);
        }
            
        Conexao.desconecta();
}



    
 
public void BuscarIDClienteComercial (String IDClienteComercial) {
    
    Conexao.conexao();
    Conexao.executaSQL("select * from cadastro_cliente where nome_cliente='"+IDClienteComercial+"'");
        try {
            Conexao.rs.first();
        CodClienteComercial=Conexao.rs.getInt("idCadastro_cliente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro busca cliente prof." +ex);
        }
            
        Conexao.desconecta();
}

//Conexao.executaSQL("select * from cliente where nomecliente like '%" + modelo.getPesq() + "%'" );

//Pesquisar e='"

public Cadastro_ClienteVO PesquisarClienteID  (Cadastro_ClienteVO ModCliente) {
    //"select * from cadastro_cliente where nome_cliente='"+IDClienteProf+"'");
    Conexao.conexao();
    
    Conexao.executaSQL("select * from cadastro_cliente where idCadastro_cliente='"+ModCliente.getPesquisa_Cliente()+"'");
        
        try {
            Conexao.rs.first();
            
            ModCliente.setId_cliente(Conexao.rs.getInt("idCadastro_cliente"));
            ModCliente.setNome_cliente(Conexao.rs.getString("nome_cliente"));
            ModCliente.setCpf(Conexao.rs.getString("cpf"));
            ModCliente.setRg(Conexao.rs.getString("rg"));
            ModCliente.setData_emisao_rg(Conexao.rs.getString("data_emissao_rg"));
            ModCliente.setData_nascimento(Conexao.rs.getString("data_nascimento"));
            ModCliente.setNome_pai(Conexao.rs.getString("nome_pai"));
            ModCliente.setNome_mae(Conexao.rs.getString("nome_mae"));
            Pesquisa_BuscarEstadoCivil(Conexao.rs.getInt("Estado_civil_idEstado_civil"));
            ModCliente.setEstado_civil(Estado_civil);
            Pesquisa_BuscarSexo(Conexao.rs.getInt("sexo_idsexo"));
            ModCliente.setSexo(Sexo);
            Pesquisa_BuscarEmissaoRG(Conexao.rs.getInt("Orgao_emissor_idOrgao_emissor"));
            ModCliente.setOrgao_emissor(Emissor);        
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código Não Localizado!");
            
            ModCliente.setId_cliente(0);
            ModCliente.setNome_cliente("");
            ModCliente.setCpf("");
            ModCliente.setRg("");
            ModCliente.setData_emisao_rg("");
            ModCliente.setData_nascimento("");
            ModCliente.setNome_pai("");
            ModCliente.setNome_mae("");
            
        }
    
    return ModCliente;
}

public Cadastro_Cliente_ContatoVO PesquisarClienteContato (Cadastro_Cliente_ContatoVO ModContato){
    
    Conexao.executaSQL("select * from cliente_contato where Cadastro_cliente_idCadastro_cliente='"+ModContato.getPesquisa_ClienteContato()+"'");
            
        try {
            Conexao.rs.first();
            
            ModContato.setCep(Conexao.rs.getString("cep_cliente"));
            ModContato.setEndereco_contato(Conexao.rs.getString("endereco_cliente"));
            ModContato.setNumero_casa(Conexao.rs.getString("numero_casa"));
            ModContato.setBairro_cliente(Conexao.rs.getString("bairro_cliente"));
            ModContato.setCompemento(Conexao.rs.getString("complemento_cliente"));
            ModContato.setCidade_cliente(Conexao.rs.getString("cidade_cliente"));
            ModContato.setTelefone_cliente(Conexao.rs.getString("telefone_cliente"));
            ModContato.setCelular_cliente(Conexao.rs.getString("celular_cliente"));
            ModContato.setEmail_cliente(Conexao.rs.getString("email_cliente"));
            Pesquisar_EstadoCliente(Conexao.rs.getInt("Estado_idEstado"));
            ModContato.setEstado(Estado);
            
        } catch (SQLException ex) {
            
            ModContato.setCep("");
            ModContato.setEndereco_contato("");
            ModContato.setNumero_casa("");
            ModContato.setBairro_cliente("");
            ModContato.setCompemento("");
            ModContato.setCidade_cliente("");
            ModContato.setTelefone_cliente("");
            ModContato.setCelular_cliente("");
            ModContato.setEmail_cliente("");
            
        }
                    
    return ModContato;
}


public Cadastro_Cliente_ProfVO PesquisarClienteProf (Cadastro_Cliente_ProfVO ModProficional){
    
    Conexao.executaSQL("select * from cliente_dados_prof where Cadastro_cliente_idCadastro_cliente='"+ModProficional.getPesquisar_ClienteProfissional()+"'");
        try {
            Conexao.rs.first();
            
            ModProficional.setOcupacao(Conexao.rs.getString("natureza_ocupacao"));
            ModProficional.setProfissao(Conexao.rs.getString("Profissao"));
            ModProficional.setRenda_principal(Float.parseFloat(Conexao.rs.getString("renda_principal")));
            ModProficional.setTempo_servico(Integer.parseInt(Conexao.rs.getString("tempo_servico")));
            
        } catch (SQLException ex) {
         
            ModProficional.setOcupacao("");
            ModProficional.setProfissao("");
            ModProficional.setRenda_principal(0);
            ModProficional.setTempo_servico(0);
            
        }
    return ModProficional;
}


public Cadastro_Cliente_ComercVO PesquisarClienteComercial (Cadastro_Cliente_ComercVO ModComercial){
    
    Conexao.conexao();
    Conexao.executaSQL("select * from cliente_comercial where Cadastro_cliente_idCadastro_cliente='"+ModComercial.getPesquisa_ClienteComercial()+"'");
        try {
            Conexao.rs.first();
            
            ModComercial.setNome_empresa(Conexao.rs.getString("nome_empresa_comercial"));
            ModComercial.setCep_comercial(Conexao.rs.getString("cep_comercial"));
            ModComercial.setEndereco_comercial(Conexao.rs.getString("endereco_comercial"));
            ModComercial.setNumero_comercial(Conexao.rs.getString("numero_comercial"));
            ModComercial.setComplemento_comercial(Conexao.rs.getString("complemento_comercial"));
            ModComercial.setBairro_comercial(Conexao.rs.getString("bairro_comercial"));
            ModComercial.setTelefone_comercial(Conexao.rs.getString("telefone_comercial"));
            ModComercial.setRamal_comercial(Conexao.rs.getString("ramal_comercial"));
            ModComercial.setCidade_comercial(Conexao.rs.getString("Cidade_comercial"));
            
            PesquisaBuscarEstado_Comercial(Conexao.rs.getInt("Estado_idEstado"));
            ModComercial.setEstado_comercial(Estado_Comercial);
            
        } catch (SQLException ex) {
            
            ModComercial.setNome_empresa("");
            ModComercial.setCep_comercial("");
            ModComercial.setEndereco_comercial("");
            ModComercial.setNumero_comercial("");
            ModComercial.setComplemento_comercial("");
            ModComercial.setBairro_comercial("");
            ModComercial.setTelefone_comercial("");
            ModComercial.setRamal_comercial("");
            ModComercial.setCidade_comercial("");
            
        }
    
    return ModComercial;
}

public Cadastro_ClienteVO Pesquisar_NomeCliente (Cadastro_ClienteVO ModCliente){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from cadastro_cliente where nome_cliente like '%"+ModCliente.getPesquisa_ClienteNome()+"%'");
    
        try {
            Conexao.rs.first();
            
            ModCliente.setId_cliente(Conexao.rs.getInt("idCadastro_cliente"));
            ModCliente.setNome_cliente(Conexao.rs.getString("nome_cliente"));
            ModCliente.setCpf(Conexao.rs.getString("cpf"));
            ModCliente.setRg(Conexao.rs.getString("rg"));
            ModCliente.setData_emisao_rg(Conexao.rs.getString("data_emissao_rg"));
            ModCliente.setData_nascimento(Conexao.rs.getString("data_nascimento"));
            ModCliente.setNome_pai(Conexao.rs.getString("nome_pai"));
            ModCliente.setNome_mae(Conexao.rs.getString("nome_mae"));
            
            Pesquisa_BuscarEstadoCivil(Conexao.rs.getInt("Estado_civil_idEstado_civil"));
            ModCliente.setEstado_civil(Estado_civil);
            
            Pesquisa_BuscarSexo(Conexao.rs.getInt("sexo_idsexo"));
            ModCliente.setSexo(Sexo);
            
            Pesquisa_BuscarEmissaoRG(Conexao.rs.getInt("Orgao_emissor_idOrgao_emissor"));
            ModCliente.setOrgao_emissor(Emissor);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        Conexao.desconecta();
        
    return ModCliente;
}

public Cadastro_Cliente_ComercVO Pesquisar_NomeClienteComercial (Cadastro_Cliente_ComercVO ModComercial){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from cliente_comercial where Cadastro_cliente_idCadastro_cliente ='"+ModComercial.getPesquisa_ClienteComercial()+"'");
    
        try {
            Conexao.rs.first();
           
            ModComercial.setNome_empresa(Conexao.rs.getString("nome_empresa_comercial"));
            ModComercial.setCep_comercial(Conexao.rs.getString("cep_comercial"));
            ModComercial.setEndereco_comercial(Conexao.rs.getString("endereco_comercial"));
            ModComercial.setNumero_comercial(Conexao.rs.getString("numero_comercial"));
            ModComercial.setComplemento_comercial(Conexao.rs.getString("complemento_comercial"));
            ModComercial.setBairro_comercial(Conexao.rs.getString("bairro_comercial"));
            ModComercial.setTelefone_comercial(Conexao.rs.getString("telefone_comercial"));
            ModComercial.setRamal_comercial(Conexao.rs.getString("ramal_comercial"));
            ModComercial.setCidade_comercial(Conexao.rs.getString("Cidade_comercial"));
            
                  
            PesquisaBuscarEstado_Comercial(Conexao.rs.getInt("Estado_idEstado"));
            ModComercial.setEstado_comercial(Estado_Comercial);
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        Conexao.desconecta();
        
    return ModComercial;
}

public Cadastro_Cliente_ContatoVO Pesquisar_NomeClienteContato (Cadastro_Cliente_ContatoVO ModContato){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from cliente_contato where Cadastro_cliente_idCadastro_cliente='"+ModContato.getPesquisa_ClienteContato()+"'");
    
        try {
            
            Conexao.rs.first();
            
            ModContato.setCep(Conexao.rs.getString("cep_cliente"));
            ModContato.setEndereco_contato(Conexao.rs.getString("endereco_cliente"));
            ModContato.setNumero_casa(Conexao.rs.getString("numero_casa"));
            ModContato.setBairro_cliente(Conexao.rs.getString("bairro_cliente"));
            ModContato.setCompemento(Conexao.rs.getString("complemento_cliente"));
            ModContato.setCidade_cliente(Conexao.rs.getString("cidade_cliente"));
            ModContato.setTelefone_cliente(Conexao.rs.getString("telefone_cliente"));
            ModContato.setCelular_cliente(Conexao.rs.getString("celular_cliente"));
            ModContato.setEmail_cliente(Conexao.rs.getString("email_cliente"));
            
            PesquisaBuscarEstado_Comercial(Conexao.rs.getInt("Estado_idEstado"));
            ModContato.setEstado(Estado_Comercial);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        Conexao.desconecta();
        
    return ModContato;
}

public Cadastro_Cliente_ProfVO Pesquisar_NomeClienteProfissional(Cadastro_Cliente_ProfVO ModProficional){
    
    Conexao.conexao();
    
    Conexao.executaSQL("select * from cliente_dados_prof where Cadastro_cliente_idCadastro_cliente ='"+ModProficional.getPesquisar_ClienteProfissional()+"'");
        try {
            Conexao.rs.first();
            
         ModProficional.setOcupacao(Conexao.rs.getString("natureza_ocupacao"));
         ModProficional.setProfissao(Conexao.rs.getString("Profissao"));
         ModProficional.setRenda_principal(Conexao.rs.getFloat("renda_principal"));
         ModProficional.setTempo_servico(Conexao.rs.getInt("tempo_servico"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
        Conexao.desconecta();
        
    return ModProficional;
}

public void Atualizar_ClienteCadastro (Cadastro_ClienteVO ModCliente){
    
    BuscaCodigo(ModCliente.getEstado_civil());
    BuscaCodigoSexo(ModCliente.getSexo());
    BuscarCodigoEmissor(ModCliente.getOrgao_emissor());
    
    Conexao.conexao();
    
        try {
            PreparedStatement pstAtualizar_Cliente = Conexao.conn.prepareStatement("update cadastro_cliente set nome_cliente=?, cpf=?, rg=?, data_emissao_rg=?, data_nascimento=?, nome_pai=?, nome_mae=?, Estado_civil_idEstado_civil=?, sexo_idsexo=?, Orgao_emissor_idOrgao_emissor=? where idCadastro_cliente='"+ModCliente.getPesquisa_Cliente()+"'");
        
            pstAtualizar_Cliente.setString(1, ModCliente.getNome_cliente());
            pstAtualizar_Cliente.setString(2, ModCliente.getCpf());
            pstAtualizar_Cliente.setString(3, ModCliente.getRg());
            pstAtualizar_Cliente.setString(4, ModCliente.getData_emisao_rg());
            pstAtualizar_Cliente.setString(5, ModCliente.getData_nascimento());
            pstAtualizar_Cliente.setString(6, ModCliente.getNome_pai());
            pstAtualizar_Cliente.setString(7, ModCliente.getNome_mae());
            
            pstAtualizar_Cliente.setInt(8, CodEstadoCivil);
            pstAtualizar_Cliente.setInt(9, CodSexo);
            pstAtualizar_Cliente.setInt(10, CodEmissor);
            
            pstAtualizar_Cliente.execute();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

public void Pesquisa_BuscarEstadoCivil (int cod){
   
    ConexaoBuscas.conexao();
    ConexaoBuscas.executaSQL("select * from estado_civil where idEstado_civil="+cod+"");
        try {
            ConexaoBuscas.rs.first();
            Estado_civil = ConexaoBuscas.rs.getString("tipo_civil");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
        
}

public void PesquisaBuscarEstado_Comercial(int cod){
    
    ConexaoBuscas.conexao();
    
    ConexaoBuscas.executaSQL("select * from estado where idEstado ='"+cod+"'");
    
        try {
            ConexaoBuscas.rs.first();
            
            Estado_Comercial = ConexaoBuscas.rs.getString("nome_estado");
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexaoBuscas.desconecta();
}

public void Pesquisa_BuscarSexo (int cod_sexo){
    
    ConexaoBuscas.conexao();
    ConexaoBuscas.executaSQL("select * from sexo where idsexo="+cod_sexo+"");
        try {
            ConexaoBuscas.rs.first();
            Sexo = ConexaoBuscas.rs.getString("tipo_sexo");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        ConexaoBuscas.desconecta();
}


public void Pesquisa_BuscarEmissaoRG (int cod_emissao){
    
    ConexaoBuscas.conexao();
    ConexaoBuscas.executaSQL("select * from orgao_emissor where idOrgao_emissor="+cod_emissao+"");
        try {
            ConexaoBuscas.rs.first();
            Emissor = ConexaoBuscas.rs.getString("nome_orgao");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    ConexaoBuscas.desconecta();
}


public void Pesquisar_EstadoCliente (int cod_EstadoCliente) {
    
    ConexaoBuscas.conexao();
    ConexaoBuscas.executaSQL("select * from estado where idEstado="+cod_EstadoCliente+"");
        try {
            ConexaoBuscas.rs.first();
            Estado = ConexaoBuscas.rs.getString("nome_estado");
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    ConexaoBuscas.desconecta();
}

public void Pesquisar_CPFCliente (Cadastro_ClienteVO ModClienteVO, Cadastro_Cliente_ComercVO ModComercial, Cadastro_Cliente_ContatoVO ModContatoVO, Cadastro_Cliente_ProfVO ModProfissional){
    
    
    Conexao.conexao();
    
    
    
}

}
