
package cadastroaluno;

import cadastroaluno.Aluno;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {

	private final static List<Aluno> alunos =  new ArrayList<Aluno>(); 
	
	public void salvar(Aluno aluno) {
		alunos.add(aluno);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}