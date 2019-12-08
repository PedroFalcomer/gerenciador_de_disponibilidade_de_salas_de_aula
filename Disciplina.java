package entities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Disciplina 
{
    private String nome;
    private long codigo;
   private ArrayList <Turma> turmas = new ArrayList<Turma>();
    private String grau;
    
    public ArrayList<Turma> getTurmas() 
    {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) 
    {
        this.turmas = turmas;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public long getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(long codigo) 
    {
        this.codigo = codigo;
    }

    
    public void setGrau(String gr) {
    	this.grau = gr;	
    } 
    public String getGrau() {
    	return this.grau;
    }
    public void escolherGrau(String gr) {
    	System.out.println("Defina o Grau acad�mico da Disciplina");
    	  	if(gr.equalsIgnoreCase("gradua��o")|| gr.equalsIgnoreCase("graduacao")) {
    		setGrau("Gradua��o.");
    		
    	}
    	  	if (gr.equalsIgnoreCase("extens�o") || gr.equalsIgnoreCase("extensao")) {
    			setGrau("Extens�o.");
    	  	
    	  	}
    	  	
    	  	if (gr.equalsIgnoreCase("Lato Sensu")) {
    	  		setGrau("Lato Sensu.");
    }
    	  	if(gr.equalsIgnoreCase("stricto sensu")) {
        		setGrau("Stricto Sensu.");
        		
        	}
    
    	  	else {
    	  		System.out.println("Erro! Digite um Grau v�lido!");
    	  	}
    	  	System.out.println("O Grau da disciplina � " + this.grau );
    	      
    }
    
    public void criaDiretDisciplina()
    {
        File Insti = new File("diretorio//disc", this.nome);
        boolean jk = Insti.mkdir();
    }
    
    public String salvarLis()//cria um arquivo .txt com o nome de todos os objetos para facilitar a busca em pastas
    {
            
        try 
        {
            FileWriter lt = new FileWriter("diretorio//disc//lista.txt",true);
            PrintWriter plt = new PrintWriter(lt);
            plt.println(this.nome);

            plt.flush();
            plt.close();//fecha a escrita
            lt.close();//fecha o arquivo
        }
            
        catch (IOException ex) 
        {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Lista salva";
    }
    
    public String Salvar()
    {
        try 
        {
            FileWriter fw = new FileWriter("diretorio//disc"+this.nome+"//"+this.nome+".txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.nome);
            pw.println(this.codigo);
            pw.println(this.grau);
            pw.flush();
            pw.close();
            fw.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Altera��o feita";
    }
}
