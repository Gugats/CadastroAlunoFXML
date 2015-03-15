package cadastroaluno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastroAluno extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root, 400, 370);
        
        stage.setScene(scene);
        stage.setTitle("Cadastro de Alunos");
        scene.getStylesheets().add(CadastroAluno.class.getResource("CadastroAluno.css").toExternalForm());
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
