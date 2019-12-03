package entities;

import java.util.ArrayList;
import service.Aluno;
import service.Professor;

public class Turma 
{
    private int numAlunos;
    private int numDiasSema;
    private Disciplina disciplina;
    private ArrayList <Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;
    private ArrayList <Ocupa> ocupacoes = new ArrayList<Ocupa>();

    public int getNumDiasSema() 
    {
        return numDiasSema;
    }

    public void setNumDiasSema(int numDiasSema) 
    {
        this.numDiasSema = numDiasSema;
    }

    public ArrayList<Ocupa> getOcupacoes() 
    {
        return ocupacoes;
    }

    public void setOcupacoes(ArrayList<Ocupa> ocupacoes) 
    {
        this.ocupacoes = ocupacoes;
    }
    
    public Disciplina getDisciplina() 
    {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) 
    {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() 
    {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) 
    {
        this.alunos = alunos;
    }

    public Professor getProfessor() 
    {
        return professor;
    }

    public void setProfessor(Professor professor) 
    {
        this.professor = professor;
    }
    
    public int getNumAlunos() 
    {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) 
    {
        this.numAlunos = numAlunos;
    }

}
