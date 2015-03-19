package cadastroaluno;

import cadastroaluno.Aluno;
import cadastroaluno.CadastroAluno;
import cadastroaluno.GerenciadorAluno;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class FXMLDocumentController {
    
    Aluno aluno = new Aluno();
    
    @FXML private TextField tfRa, tfNome;
    
    @FXML private RadioButton rbMasc, rbFemin;
    
    @FXML private ComboBox combo;
    
    @FXML private ToggleGroup myToggleGroup;
    
    @FXML
    protected void limparCampos(ActionEvent event) {
        tfRa.setText("");
        tfNome.setText("");
        rbMasc.setSelected(false);
        rbFemin.setSelected(false);
        combo.setValue(null);
    }
    
    @FXML
    protected void salvarDados(ActionEvent event) throws IOException {
        aluno.setRa(tfRa.getText());
        aluno.setNome(tfNome.getText());
        if(myToggleGroup.getSelectedToggle() == rbMasc){
             aluno.setSexo("Masculino");
        }else if(myToggleGroup.getSelectedToggle() == rbFemin){
             aluno.setSexo("Feminino");
        }else{
             aluno.setSexo("Não informado");
        }
        
        aluno.setEstado(combo.getValue().toString());
        GerenciadorAluno ga = new GerenciadorAluno();
        ga.salvar(aluno);
        Parent root = FXMLLoader.load(getClass().getResource("ComprovanteFXML.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Comprovante");
        Scene scene = new Scene(root, 650, 450);
        stage.setScene(scene);
        scene.getStylesheets().add(CadastroAluno.class.getResource("CadastroAluno.css").toExternalForm());
        stage.show();
    }
    
}
