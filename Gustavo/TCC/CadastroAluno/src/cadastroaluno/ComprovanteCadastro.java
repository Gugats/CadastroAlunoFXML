
package cadastroaluno;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ComprovanteCadastro {
    
    @FXML private TableView<Aluno> table = new TableView<Aluno>();
    @FXML private TableColumn raC, nomeC, estadoC, sexoC;
    
    GerenciadorAluno ga = new GerenciadorAluno();
    final ObservableList<Aluno> alunos = ga.getAlunos();
    
    @FXML
    protected void imprime(ActionEvent event){ 
        table.setItems(alunos);
    }
    
}
