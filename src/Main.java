import Classes.TarefaDAO;
import Classes.Tarefa;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    TarefaDAO daoTarefa = new TarefaDAO();

    for (int x = 0; x < 10; x++) {
        Tarefa tarefa = new Tarefa(); // Cria um novo objeto para cada iteração
        
        daoTarefa.adicionarTarefa(tarefa); // Remove a tarefa do banco de dados
        
    }
}

}

