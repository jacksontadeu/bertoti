package org.acme.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.acme.model.Aluno;
import org.acme.util.Conexao;

public class AlunoDao {

    public void cadastrarAluno(Aluno aluno) {
        try {
            String sql="insert into aluno (nome,email,notaprova,notatrabalho,mediafinal)" + 
           " values (?,?,?,?,?)";
           PreparedStatement ps= Conexao.obterConexao().prepareStatement(sql);
           ps.setString(1, aluno.getNome());
           ps.setString(2, aluno.getEmail());
           ps.setDouble(3, aluno.getNotaProva());
           ps.setDouble(4,aluno.getNotaTrabalho());
           ps.setDouble(5,aluno.getMediaFinal());

           ps.execute();


        } catch (Exception e) {
            System.out.println("Erro ao conectar "+ e.getMessage());
        }

    }

    public Aluno buscarPorEmail(String email){
        Aluno aluno = new Aluno();
        try{
            
            String sql = "select * from aluno where email=?";

            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setString(1, email);

            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setNotaProva(rs.getDouble("notaprova"));
                aluno.setNotaTrabalho(rs.getDouble("notatrabalho"));
                aluno.setMediaFinal(rs.getDouble("mediafinal"));
                System.out.println(aluno);
            }
        }catch(Exception e){
            System.out.println("Erro ao buscar aluno" + e.getMessage());

        }
        return aluno;
    }
    public List<Aluno> buscarTodos(){
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno = null;
        try {
            String sql = "select * from aluno";

            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setEmail(rs.getString("email"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNotaProva(rs.getDouble("notaprova"));
                aluno.setNotaTrabalho(rs.getDouble("notatrabalho"));
                aluno.setMediaFinal(rs.getDouble("mediafinal"));
                alunos.add(aluno);

            }
            
        } catch (Exception e) {
            System.out.println("Erro ao carregar alunos" + e.getMessage());
        }

        return alunos;
    }

}
