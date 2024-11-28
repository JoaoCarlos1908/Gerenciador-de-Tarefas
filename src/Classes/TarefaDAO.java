package Classes;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TarefaDAO {
    //Atributos
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    //Metodos
    public void adicionarTarefa(Tarefa tarefa){//create
        try {
            con = ConnectionTarefas.getConnection();
            stmt = con.prepareStatement("INSERT INTO tarefas(titulo, descricao, prioridade, prazo)VALUES(?,?,?,?)");
        
            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, String.format("#%02x%02x%02x", tarefa.getPrioridade().getRed(), tarefa.getPrioridade().getGreen(), tarefa.getPrioridade().getBlue()));
            stmt.setString(4, tarefa.getPrazo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionTarefas.closerConnection(con, stmt);
        }
    }
    
     public void remover(Tarefa tarefa) {
         try {
            // Obter a conexão (substitua pelo seu método de conexão)
            con = ConnectionTarefas.getConnection();
            // Preparar a instrução SQL para deletar a tarefa pelo ID
            String sql = "DELETE FROM tarefas WHERE id = ?";
            stmt = con.prepareStatement(sql);

            // Definir o ID da tarefa como parâmetro
            stmt.setInt(1, tarefa.getId());

            // Executar a instrução
            int rowsAffected = stmt.executeUpdate();

            // Feedback para o usuário
            if (rowsAffected > 0) {
                 
            } else {
                JOptionPane.showMessageDialog(null, "Nenhuma tarefa encontrada com o ID especificado.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao remover a tarefa: " + ex.getMessage());
        } finally {
            // Fechar a conexão e a declaração
            ConnectionTarefas.closerConnection(con, stmt);
        }
        this.listarTarefas();
    }


    
    public void editar(Tarefa tarefa, Boolean estado) {
        try {
            // Obter a conexão (substitua pelo seu método de conexão)
            con = ConnectionTarefas.getConnection();
            // Query SQL para atualizar a tarefa existente
            String sql = "UPDATE tarefas SET titulo = ?, descricao = ?, prioridade = ?, prazo = ?, concluido = ? WHERE id = ?";
            
            if (estado) {
                stmt = con.prepareStatement(sql);

                // Preenchendo os parâmetros da query
                stmt.setString(1, tarefa.getTitulo());
                stmt.setString(2, tarefa.getDescricao());
                stmt.setString(3, String.format("#%02x%02x%02x", 
                    tarefa.getPrioridade().getRed(),
                    tarefa.getPrioridade().getGreen(),
                    tarefa.getPrioridade().getBlue()));
                stmt.setString(4, tarefa.getPrazo());
                stmt.setBoolean(5, tarefa.getConcluido());
                stmt.setInt(6, tarefa.getId()); // ID da tarefa para atualização

                // Executa a query
                stmt.executeUpdate();
            
            } else {
                // Chama o método responsável por adicionar uma nova tarefa
                this.adicionarTarefa(tarefa);
            }
        } catch (SQLException ex) {
            // Exibe mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao salvar ou editar a tarefa: " + ex.getMessage());
        } finally {
            // Fecha conexão
            ConnectionTarefas.closerConnection(con, stmt);
        }
    }   

    public ArrayList<Tarefa> listarTarefas() {
        String sql = "SELECT * FROM tarefas";
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        
        try {
            con = ConnectionTarefas.getConnection();
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Tarefa tarefa = new Tarefa();
                tarefa.setId(rs.getInt("id"));
                tarefa.setTitulo(rs.getString("titulo"));
                tarefa.setDescricao(rs.getString("descricao"));
            
                // Converte a string de prioridade para uma cor
                String prioridadeHex = rs.getString("prioridade");
                Color prioridadeCor = Color.decode(prioridadeHex);
                tarefa.setPrioridade(prioridadeCor);
            
                tarefa.setPrazo(rs.getString("prazo"));
                tarefa.setConcluido(rs.getBoolean("concluido"));
            
                tarefas.add(tarefa); // Adiciona a tarefa à lista
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar tarefas: " + ex.getMessage());
        } finally {
            ConnectionTarefas.closerConnection(con, stmt, rs);
        }
    
        return tarefas;
    }
    
    public ArrayList<Tarefa> buscarTarefasPorTexto(String textoPesquisa){
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        String sql = "SELECT * FROM tarefas WHERE titulo LIKE ? OR descricao LIKE ?";
        con = ConnectionTarefas.getConnection();
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Adiciona os parâmetros com curinga para busca aproximada
            String textoBusca = "%" + textoPesquisa + "%";
            stmt.setString(1, textoBusca);
            stmt.setString(2, textoBusca);

            // Executa a consulta
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    // Criar objeto Tarefa e popular com dados do banco
                    Tarefa tarefa = new Tarefa();
                    tarefa.setId(rs.getInt("id"));
                    tarefa.setTitulo(rs.getString("titulo"));
                    tarefa.setDescricao(rs.getString("descricao"));
                    tarefa.setPrioridade(Color.decode(rs.getString("prioridade")));
                    tarefa.setPrazo(rs.getString("prazo"));
                    tarefa.setConcluido(rs.getBoolean("concluido"));

                    // Adiciona a tarefa à lista
                    tarefas.add(tarefa);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tarefas;
    }
}
