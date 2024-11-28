import Classes.TarefaDAO;
import Classes.Tarefa;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TarefaDAO daoTarefa = new TarefaDAO();
         ArrayList<Tarefa> tarefas = daoTarefa.listarTarefas(); // Método que busca as tarefas
            // Adiciona cada tarefa como um JPanel ao painel principal
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(tarefas.get(i).getId());
            }
    }
}

