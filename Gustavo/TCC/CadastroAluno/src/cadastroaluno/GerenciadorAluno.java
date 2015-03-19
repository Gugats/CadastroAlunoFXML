
package cadastroaluno;

import cadastroaluno.Aluno;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class GerenciadorAluno {

	//private final static List<Aluno> alunos =  new ArrayList<Aluno>(); 
	private final static ObservableList<Aluno> alunos = FXCollections.observableArrayList();
	public void salvar(Aluno aluno) {
		alunos.add(aluno);
	}

	public ObservableList<Aluno> getAlunos() {
		return alunos;
	}

}