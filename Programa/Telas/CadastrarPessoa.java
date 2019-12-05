package Telas;

import javax.swing.*;
import Usuario.UsuarioDAO;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarPessoa extends JFrame {

    JTextField textPessoa = new JTextField(25);
    JTextField textEmail = new JTextField(25);
    
    public CadastrarPessoa(){
        
        super("Cadastrar Pessoas");
        JLabel labelPessoa = new JLabel("Nome:");
        JLabel labelEmail = new JLabel("E-mail:");



        
        

        JButton gravar = new JButton("Gravar");
        
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
         
        pane.add(labelPessoa);
        pane.add(textPessoa);

        pane.add(labelEmail);
        pane.add(textEmail); 
        
        gravar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoaNova();
            }

        });

        pane.add(gravar);

        setSize(300,180);
        setVisible(true);
    }

    public void cadastrarPessoaNova() { //Método 
       
        Programa.Pessoas pessoa = new Programa.Pessoas(); //Criar um objeto do tipo Pessoas
        pessoa.setNomePessoa(textPessoa.getText());
        pessoa.setEmailPessoa(textEmail.getText());
        UsuarioDAO usuarioDao = new UsuarioDAO(); //Instanciar a classe 
        usuarioDao.adicionaPessoa(pessoa); //Chamar o método que insere em banco

    }

    public static void main(String[] args) {
        CadastrarPessoa consulta = new CadastrarPessoa();
        
        
    }

}