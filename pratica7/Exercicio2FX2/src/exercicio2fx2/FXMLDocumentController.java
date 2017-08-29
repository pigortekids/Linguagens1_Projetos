/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2fx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 *
 * @author Aluno 02
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button botaoSair;
    private Button botaoAdicionar;
    private Button botaoEditar;
    private TableView lista;
    
    @FXML
    private javafx.scene.control.Button sair;
    private static final String fileName = "infos.txt";
    
    @FXML
    private void clickSair(ActionEvent event) {
        Stage stage = (Stage) sair.getScene().getWindow();
        stage.close();
        // com problema
    }
    
    @FXML
    private void clickAdicionar(ActionEvent event){
        lista.setVisible(false);
        //String content = tfNome.getText()+";"+tfIdade.getText()+";"+tfEndereco.getText()+";"+tfRG.getText()+";"+tfCPF.getText();
        //lbNome.setText(content);
    }
    
    @FXML
    private void clickEditar(ActionEvent event){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
