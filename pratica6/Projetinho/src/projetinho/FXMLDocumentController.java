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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author Aluno 02
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private TextField tfNome;
    private TextField tfIdade;
    private TextField tfEndereco;
    private TextField tfRG;
    private TextField tfCPF;
    
    @FXML
    private void clickSalvar(ActionEvent event) {
        /*try{
            PrintWriter writer = new PrintWriter(tfNome.getText() + ".txt", "UTF-8");
            writer.println(tfNome.getText() + ";");
            writer.println(tfIdade.getText() + ";");
            writer.println(tfEndereco.getText() + ";");
            writer.println(tfRG.getText() + ";");
            writer.println(tfCPF.getText());
            writer.close();
        } catch (IOException e) {
           // do something
        }*/
        
        /*try {
            Files.write(Paths.get("myfile.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e) {
            //exception handling left as an exercise for the reader
        }*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
