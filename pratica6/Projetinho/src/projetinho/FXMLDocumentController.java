/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetinho;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aluno 02
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lbNome;
    private Button btSalvar;
    private TextField tfNome, tfIdade, tfEndereco, tfRG, tfCPF;
    private static final String fileName = "infos.txt";
    BufferedWriter bw = null;
    FileWriter fw = null;
    
    @FXML
    private void clickSalvar(ActionEvent event) {
        //String content = tfNome.getText()+";"+tfIdade.getText()+";"+tfEndereco.getText()+";"+tfRG.getText()+";"+tfCPF.getText();
        String content = "batata";
        lbNome.setText(content);
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
