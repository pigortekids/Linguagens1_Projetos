package maisbatata;

import br.com.igao.maisbatata.ConnectionFactory;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btSalvar;
    @FXML
    private Label lbMostrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickSalvar(ActionEvent event) {
        
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO batatatable (nome,idade,ra) VALUES (?,?,?);";
        PreparedStatement ps;
        
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "é isso ai");
            ps.setInt(2, 20);
            ps.setString(3, "14.09876-0");
            if (ps.execute()){
                lbMostrar.setText("NÃO BATATA");
            }
            else{
                lbMostrar.setText("BATATA");
            }
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            lbMostrar.setText("nada");
        }
        
    }
    
}
