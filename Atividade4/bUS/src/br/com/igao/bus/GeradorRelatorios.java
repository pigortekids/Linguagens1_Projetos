//Igor Correa 15.00588-7
//Rodrigo Franciozi 14.04014-0

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TiagoLow
 */
public class GeradorRelatorios implements Runnable{
    
    private String caminhoCompleto; // com o nome do arquivo
    private String conteudo;

    public GeradorRelatorios ( String cam, String cont ){
        this.caminhoCompleto = cam;
        this.conteudo = cont;        
    }
    
    public void setCaminho( String cam ){
        this.caminhoCompleto = cam;
    }
    
    public void setConteudo( String cont ){
        this.conteudo = cont; 
    }
    
    /*Não modifique esse método*/
    public void gerarTxt( ) {
                  
        File file = new File(this.caminhoCompleto);
        try {
            if (file.exists())
                file.delete();
            file.createNewFile();
            if ( file.canWrite() ) {
                
                FileOutputStream out = new FileOutputStream(file);
                System.out.println("Iniciando relatório.");
                Thread.sleep(10000); // atraso proposital, simulando uma geração complexa de relatório
                out.write(this.conteudo.getBytes()); 
                JOptionPane.showMessageDialog(null, "Relatório pronto.", "Gerador de Relatórios", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(null, "O arquivo está sendo usado por outra aplicação.", "Gerador de Relatórios", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(GeradorRelatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        gerarTxt();
    }
    
}
