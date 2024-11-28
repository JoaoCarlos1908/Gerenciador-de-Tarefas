package Classes;

import Telas.ViewTarefa;
import Telas.btnInicial;
import Telas.btnVisualizar;
import Telas.editarVisualizar;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GerenciadorDeTarefas {
    //Atributos
    private JPanel jplBotoes;
    private JPanel painelPrincipal;
    
    //Construtor
    
    public GerenciadorDeTarefas(JPanel jplBotoes, JPanel painelPrincipal){
        this.jplBotoes = jplBotoes;
        this.painelPrincipal = painelPrincipal;
    }
    
    //Metodos
    public void adicionarTarefa(editarVisualizar edAd){
        Tarefa tarefa = new Tarefa();
      
        tarefa.setId(Integer.parseInt(edAd.getName()));
        tarefa.setTitulo(edAd.getTitulo());
        tarefa.setDescricao(edAd.getDescricao());
        tarefa.setPrazo(edAd.getData());
        tarefa.setPrioridade(edAd.getColorPrioridade());
        
        if(tarefa.getId() <= 0){
            TarefaDAO daoTarefa = new TarefaDAO();
            daoTarefa.adicionarTarefa(tarefa);
            this.listarTarefas();
        }else{
            this.editar(tarefa);
        }
    }
    
    public void remover() {
        // Obtém a lista de tarefas marcadas para remoção
        ArrayList<Tarefa> tarefasParaRemover = this.checkBox();

        // Confirmação para o usuário
        int confirmacao = JOptionPane.showConfirmDialog(
        null,
        "Você tem certeza que deseja remover as tarefas selecionadas?",
        "Confirmar Remoção",
        JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            // Instancia o DAO apenas uma vez
            TarefaDAO daoTarefa = new TarefaDAO();

            // Flag para rastrear se ocorreu algum erro
            boolean erroOcorrido = false;

            for (Tarefa tarefa : tarefasParaRemover) {
                try {
                    // Remove a tarefa do banco de dados
                    daoTarefa.remover(tarefa);
                } catch (Exception e) {
                    // Exibe uma mensagem de erro específica para a tarefa
                    JOptionPane.showMessageDialog(
                    null,
                    "Erro ao remover a tarefa com ID " + tarefa.getId() + ": " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                    erroOcorrido = true;
                }
            }

            // Feedback final com base no resultado
            if (erroOcorrido) {
                JOptionPane.showMessageDialog(
                null,
                "Algumas tarefas não puderam ser removidas. Verifique os erros exibidos.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                null,
                "Tarefas removidas com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
            }

            // Atualiza a lista de tarefas e o layout do painel
            this.listarTarefas();
            painelPrincipal.revalidate();
            painelPrincipal.repaint();
        }
    }


    public void editar(Tarefa tarefa){
        TarefaDAO daoTarefa = new TarefaDAO();
        daoTarefa.editar(tarefa, true);
        // Exibe mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Tarefa editada com sucesso!");
        this.listarTarefas();
    }
    
    public void editarCor(Tarefa tarefa){
        TarefaDAO daoTarefa = new TarefaDAO();
        daoTarefa.editar(tarefa, true);
    }
    
    public void listarTarefas(){
        TarefaDAO daoTarefa = new TarefaDAO();

        // Obtém a lista de tarefas
        ArrayList<Tarefa> tarefas = daoTarefa.listarTarefas(); // Método que busca as tarefas
        try {
            // Limpa os componentes do painel principal antes de adicionar novos
            painelPrincipal.removeAll();
            jplBotoes.removeAll();

            // Adiciona cada tarefa como um JPanel ao painel principal
            for (int i = 0; i < tarefas.size(); i++) {
                // Cria um painel para representar a tarefa
                ViewTarefa viewTarefa = new ViewTarefa(jplBotoes, painelPrincipal);
                
                // Define informações da tarefa no painel
                viewTarefa.setTxtTitulo(tarefas.get(i).getTitulo());
                viewTarefa.setDescricao(tarefas.get(i).getDescricao());
                viewTarefa.setPrioridade(tarefas.get(i).getPrioridade());
                viewTarefa.setdata(tarefas.get(i).getPrazo());

                // Define um identificador único para o painel
                viewTarefa.setName(Integer.toString(tarefas.get(i).getId()));

                // Adiciona o painel ao painel principal
                painelPrincipal.add(viewTarefa);
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tarefas: " + e.getMessage());
            e.printStackTrace();
        }
        // Atualiza o layout do painel principal após adicionar os componentes
        painelPrincipal.revalidate();
        painelPrincipal.repaint();
        
        btnInicial btn = new btnInicial(painelPrincipal, jplBotoes);
        jplBotoes.add(btn);
        jplBotoes.revalidate();
        jplBotoes.repaint();
    }
    
    public void listarTarefas(ArrayList<Tarefa> tarefas){
        try {
            // Limpa os componentes do painel principal antes de adicionar novos
            painelPrincipal.removeAll();
            painelPrincipal.revalidate();
            painelPrincipal.repaint();

            // Adiciona cada tarefa como um JPanel ao painel principal
            for (int i = 0; i < tarefas.size(); i++) {
                // Cria um painel para representar a tarefa
                ViewTarefa viewTarefa = new ViewTarefa(jplBotoes, painelPrincipal);
                
                // Define informações da tarefa no painel
                viewTarefa.setTxtTitulo(tarefas.get(i).getTitulo());
                viewTarefa.setDescricao(tarefas.get(i).getDescricao());
                viewTarefa.setPrioridade(tarefas.get(i).getPrioridade());
                viewTarefa.setdata(tarefas.get(i).getPrazo());

                // Define um identificador único para o painel
                viewTarefa.setName(Integer.toString(tarefas.get(i).getId()));

                // Adiciona o painel ao painel principal
                painelPrincipal.add(viewTarefa);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tarefas: " + e.getMessage());
            e.printStackTrace();
        }
        // Atualiza o layout do painel principal após adicionar os componentes
        painelPrincipal.revalidate();
        painelPrincipal.repaint();
    }
    
    public ArrayList<Tarefa> checkBox() {
        // Cria uma lista para armazenar as tarefas selecionadas
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        // Itera sobre os componentes do painel principal
        for (int i = 0; i < painelPrincipal.getComponentCount(); i++) {
            Component component = painelPrincipal.getComponent(i);

            if (component instanceof ViewTarefa) {
                ViewTarefa viewTarefa = (ViewTarefa) component;

                // Itera sobre os componentes de ViewTarefa para verificar os JCheckBox
                for (int j = 0; j < viewTarefa.getComponentCount(); j++) {
                    Component childComponent = viewTarefa.getComponent(j);

                    if (childComponent instanceof JCheckBox) {
                        JCheckBox checkBox = (JCheckBox) childComponent;

                        // Verifica se o JCheckBox está selecionado
                        if (checkBox.isSelected()) {
                            // Cria uma nova instância de Tarefa para cada tarefa selecionada
                            Tarefa tarefa = new Tarefa();
                            tarefa.setId(Integer.parseInt(viewTarefa.getName()));

                            // Adiciona a nova tarefa à lista
                            tarefas.add(tarefa);
                        }
                    }
                }
            }
        }
        return tarefas;
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
                                return true;
                            }
                        }
                    }
            }
        }
        
        return false;
    }
    
    public void abrirTelaEdição(){
        ViewTarefa view = new ViewTarefa(jplBotoes, painelPrincipal);
        this.abrirTelaEdição(view);
    }
    
    public void abrirTelaEdição(ViewTarefa view){
        editarVisualizar edit = new editarVisualizar(jplBotoes, painelPrincipal);
        btnVisualizar btn = new btnVisualizar(painelPrincipal,  jplBotoes,  edit);
        
        painelPrincipal.removeAll();
        jplBotoes.removeAll();
        
        edit.setName(view.getName());
        edit.setTitulo(view.getTitulo());
        edit.setDescricao(view.getDescricao());
        edit.setData(view.getData());
        edit.setColorPrioridade(view.getPrioridade());
        
        painelPrincipal.add(edit);
        painelPrincipal.revalidate();
        painelPrincipal.repaint();
        
        jplBotoes.add(btn);
        jplBotoes.revalidate();
        jplBotoes.repaint();
    }
    
    public void altearCor(Color prioridade){
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        tarefas = this.checkBox();
        for(Tarefa tarefa: tarefas){
            tarefa.setPrioridade(prioridade);
            this.editarCor(tarefa);
        }
        // Exibe mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Tarefa editada com sucesso!");
        this.listarTarefas();
    }
    
    public ArrayList<Tarefa> reorganizarTarefas(){
        return null;
    }
    
    public void pesquisar(String text, JPanel tarefaP) {}
    public void listarTarefasPesquisa(String text, JPanel tarefaP){}
}
