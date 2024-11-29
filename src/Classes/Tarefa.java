package Classes;

import java.awt.Color;

public class Tarefa {
    //Variaveis
    private int id;
    private String titulo;
    private String descricao;
    private Color prioridade;
    private String prazo;
    private Boolean concluido;
    
    //Construtor

    public Tarefa() {
        this.id = -1;
        this.titulo = "Titulo";
        this.descricao = "Descrição";
        this.prioridade = Color.GREEN;
        this.prazo = "00/00/00";
        this.concluido = false;
    }
    
    
    //Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Color getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Color prioridade) {
        this.prioridade = prioridade;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
    
}
