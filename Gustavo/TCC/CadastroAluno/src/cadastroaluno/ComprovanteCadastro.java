
package cadastroaluno;

import cadastroaluno.Aluno;
import cadastroaluno.GerenciadorAluno;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComprovanteCadastro {
    
    @FXML private Label sexo, nome, ra, estado;
    
    GerenciadorAluno ga = new GerenciadorAluno();
    List<Aluno> alunos = ga.getAlunos();
    
    Aluno a = alunos.get(0);
    
    @FXML
    protected void imprime(ActionEvent event){
        nome.setText("Nome: "+a.getNome());
        ra.setText("RA: "+a.getRa());
        sexo.setText("Sexo: "+a.getSexo());
        estado.setText("Estado: "+a.getEstado());
    }
    
}
