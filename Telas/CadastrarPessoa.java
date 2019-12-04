import javax.swing.*;
import java.awt.*;

public class CadastrarPessoa extends JFrame {
    
    public CadastrarPessoa(){
        
        super("Cadastrar Proventos");
        JLabel labelPessoa = new JLabel("Nome:");
        JLabel labelEmail = new JLabel("E-mail:");



        JTextField textPessoa = new JTextField(25);
        JTextField textEmail = new JTextField(25);

        JButton gravar = new JButton("Gravar");
        
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
         
        pane.add(labelPessoa);
        pane.add(textPessoa);

        pane.add(labelEmail);
        pane.add(textEmail); 
        

        pane.add(gravar);

        setSize(300,180);
        setVisible(true);
    }

    public static void main(String[] args) {
        CadastrarPessoa consulta = new CadastrarPessoa();
        
        
    }

}