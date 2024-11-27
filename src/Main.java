import Classes.TarefaDAO;
import Classes.Tarefa;

public class Main {
    public static void main(String[] args) {
        TarefaDAO t = new TarefaDAO();
        Tarefa tarefa = new Tarefa();
        int x = 0;
        while(x < 5){
            t.adicionarTarefa(tarefa);
            x++;
        }
    }
}

