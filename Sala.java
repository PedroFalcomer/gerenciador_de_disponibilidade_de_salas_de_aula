package entities;

import java.io.File;
import java.util.ArrayList;

public class Sala 
{
    private int idSala;// numero da sala
    private int capacidade;
    private boolean ar;
    private boolean projetor;
    private boolean tv;
    private Predio predio;
    private ArrayList <Ocupa> ocupacoes = new ArrayList<Ocupa>();
    private ArrayList <Turma> turmas = new ArrayList<Turma>();
    
    public Predio getPredio() 
    {
        return predio;
    }

    public void setPredio(Predio predio) 
    {
        this.predio = predio;
    }
   
    public ArrayList<Ocupa> getOcupa() 
    {
        return ocupacoes;
    }

    public void setOcupa(ArrayList<Ocupa> ocupa) 
    {
        this.ocupacoes = ocupa;
    }

    public ArrayList<Turma> getTurma() 
    {
        return turmas;
    }

    public void setTurma(ArrayList<Turma> turma) 
    {
        this.turmas = turma;
    }

    public int getIdSala() 
    {
        return idSala;
    }

    public void setIdSala(int idSala) 
    {
        this.idSala = idSala;
    }

    public int getCapacidade() 
    {
        return capacidade;
    }

    public void setCapacidade(int capacidade) 
    {
        this.capacidade = capacidade;
    }

    public boolean isAr() 
    {
        return ar;
    }

    public void setAr(boolean ar) 
    {
        this.ar = ar;
    }

    public boolean isProjetor() 
    {
        return projetor;
    }

    public void setProjetor(boolean projetor) 
    {
        this.projetor = projetor;
    }

    public boolean isTv() 
    {
        return tv;
    }

    public void setTv(boolean tv) 
    {
        this.tv = tv;
    }
    public void criaDiretSala()
    {
        File Inst = new File("diretorio//inst//"+this.predio.getInstituicao().getNome()+"//"+this.predio.getNome(), "sala");//cria um diretorio geral para sala
        boolean jk = Inst.mkdir();
        File sala = new File("diretorio//inst//"+this.predio.getInstituicao().getNome()+"//"+this.predio.getNome()+"//sala",Integer.toString(this.idSala));//cria uma pasta para cada sala
        boolean kk = sala.mkdir();
    }
}
