package org.acme.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.acme.dao.AlunoDao;
import org.acme.model.Aluno;

public class Teste {
    public static void main(String[] args) throws SQLException {
        
        Conexao.obterConexao();

        AlunoDao alunoDao = new AlunoDao();
       List<Aluno> alunos = new ArrayList<>();
       alunos= alunoDao.buscarTodos();
       System.out.println(alunos);
       
    }

}
