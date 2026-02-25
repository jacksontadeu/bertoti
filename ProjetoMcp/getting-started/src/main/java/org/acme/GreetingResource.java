package org.acme;

import java.util.ArrayList;
import java.util.List;

import org.acme.dao.AlunoDao;
import org.acme.model.Aluno;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/aluno")
public class GreetingResource {
    @GET
    @Path("{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public Aluno buscarAluno(String email){
        AlunoDao alunoDao = new AlunoDao();
        Aluno aluno= new Aluno();
        aluno = alunoDao.buscarPorEmail(email);
        return aluno;
    }
    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Aluno> buscarTodos(){
        AlunoDao alunoDao = new AlunoDao();
        List<Aluno> alunos = new ArrayList<>();
        alunos= alunoDao.buscarTodos();
        return alunos;
    }
}
