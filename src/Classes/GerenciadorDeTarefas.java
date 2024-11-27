package Classes;

import Telas.ViewTarefa;
import Telas.editarVisualizar;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GerenciadorDeTarefas {
    //Atributos
    private ArrayList<Tarefa> tarefas;
    private TarefaDAO tarefaDAO;
    private JPanel jplBotoes;
    private JPanel painelPrincipal;
    ViewTarefa viewTarefa;
    
    //Construtor
    
    public GerenciadorDeTarefas(JPanel jplBotoes, JPanel painelPrincipal){
        this.jplBotoes = jplBotoes;
        this.painelPrincipal = painelPrincipal;
        viewTarefa = new ViewTarefa(jplBotoes, painelPrincipal);
    }
    
    //Metodos
    public void adicionarTarefa(editarVisualizar edAd){
        Tarefa tarefa = new Tarefa();
      
        tarefa.setId(Integer.parseInt(edAd.getName()));
        tarefa.setTitulo(edAd.getTitulo());
        tarefa.setDescricao(edAd.getDescricao());
        tarefa.setPrazo(edAd.getData());
        tarefa.setPrioridade(edAd.getColorPrioridade());
      
        if(tarefa.getId() >= -1){
            tarefaDAO.adicionarTarefa(tarefa);
        }else{
            this.editar(tarefa);
        }
      
    }
    
    public void remover(){
        ArrayList<ViewTarefa> tarefasParaRemover = this.checkBox();
        //Remove os componentes marcados na lista de remoção
        for (ViewTarefa tarefaV : tarefasParaRemover) {
            Tarefa tarefa = new Tarefa();
            tarefa.setId(Integer.parseInt(tarefaV.getName()));
        
            tarefaDAO.remover(tarefa);
        }

        // Revalida e repinta o painel para refletir as mudanças
        painelPrincipal.revalidate();
        painelPrincipal.repaint();
        
    }
    
    public void editar(Tarefa tarefa){
        tarefaDAO.adicionarTarefa(tarefa);
    }
    
    public void listarTarefas() {
        try {
            // Limpa os componentes do painel principal antes de adicionar novos
            painelPrincipal.removeAll();
            painelPrincipal.revalidate();
            painelPrincipal.repaint();

            // Obtém a lista de tarefas
            ArrayList<Tarefa> tarefas = tarefaDAO.listarTarefas(); // Método que busca as tarefas
        
            // Adiciona cada tarefa como um JPanel ao painel principal
            for (Tarefa tarefa : tarefas) {
                // Cria um painel para representar a tarefa
                
            
                // Define informações da tarefa no painel
                viewTarefa.setTxtTitulo(tarefa.getTitulo());
                viewTarefa.setDescricao(tarefa.getDescricao());
                viewTarefa.setPrioridade(tarefa.getPrioridade());
                viewTarefa.setdata(tarefa.getPrazo());

                // Define um identificador único para o painel
                viewTarefa.setName(Integer.toString(tarefa.getId()));

                // Adiciona o painel ao painel principal
                painelPrincipal.add(viewTarefa);
            }

            // Atualiza o layout do painel principal após adicionar os componentes
            painelPrincipal.revalidate();
            painelPrincipal.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tarefas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    public void listarTarefas(ArrayList<Tarefa> tarefas){}
    
    public ArrayList<ViewTarefa> checkBox(){
       // Cria uma lista para armazenar os componentes que precisam ser removidos
        ArrayList<ViewTarefa> tarefasParaRemover = new ArrayList<>();

        for (int i = 0; i < painelPrincipal.getComponentCount(); i++) {
            Component component = painelPrincipal.getComponent(i);
            if (component instanceof ViewTarefa) {
                ViewTarefa viewTarefa = (ViewTarefa) component;
                boolean checkBoxSelecionado = false;

                // Itera sobre os componentes de viewTarefa para verificar se algum JCheckBox está selecionado
                    for (int j = 0; j < viewTarefa.getComponentCount(); j++) {
                        Component childComponent = viewTarefa.getComponent(j);
                        if (childComponent instanceof JCheckBox) {
                            JCheckBox checkBox = (JCheckBox) childComponent;
                            if (checkBox.isSelected()) {
                                checkBoxSelecionado = true; // Marcar que pelo menos um JCheckBox está selecionado
                                break; // Não precisa verificar mais checkboxes
                            }
                        }
                    }

                // Se um checkbox foi selecionado, adiciona a viewTarefa à lista de remoção
                if (checkBoxSelecionado) {
                    tarefasParaRemover.add(viewTarefa);
                } 
            }
        }
        return tarefasParaRemover;
    }
    
    public Boolean checkBoxAtivado(){
        for (int i = 0; i < painelPrincipal.getComponentCount(); i++) {
            Component component = painelPrincipal.getComponent(i);
            if (component instanceof ViewTarefa) {
                ViewTarefa viewTarefa = (ViewTarefa) component;
                boolean checkBoxSelecionado = false;

                // Itera sobre os componentes de viewTarefa para verificar se algum JCheckBox está selecionado
                    for (int j = 0; j < viewTarefa.getComponentCount(); j++) {
                        Component childComponent = viewTarefa.getComponent(j);
                        if (childComponent instanceof JCheckBox) {
                            JCheckBox checkBox = (JCheckBox) childComponent;
                            if (checkBox.isSelected()) {
                                checkBoxSelecionado = true; // Marcar que pelo menos um JCheckBox está selecionado
                                break; // Não precisa verificar mais checkboxes
                            }
                        }
                    }
            }
        }
        return false;
    }
    
    public void abrirTelaEdição(){}
    public void abrirTelaEdição(JPanel ViewTarefa){}
    public void altearCor(Color prioridade){}
    
    public ArrayList<Tarefa> reorganizarTarefas(){
        return null;
    }
    
    public void pesquisar(String text, JPanel tarefaP) {}
    public void listarTarefasPesquisa(String text, JPanel tarefaP){}
}