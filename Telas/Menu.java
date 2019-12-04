import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {
//cadastrar
    JButton CadastrarPessoa = new JButton("Cadastrar Pessoa");
    JButton CadastrarDivida = new JButton("Cadastrar Divida");
    JButton CadastrarProventos = new JButton("Cadastrar Provento");
    
//consultar
    JButton C_Pessoas = new JButton("Consultar Pessoa");
    JButton C_Divida = new JButton("Consultar Divida");
    JButton C_Proventos = new JButton("Consultar Provento");

    public Menu() {
        super("Financeiro");

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        
        pane.add(CadastrarPessoa); //botões formulário
        pane.add(CadastrarDivida); //botões formulário
        pane.add(CadastrarProventos);//botões formulário

        pane.add(C_Pessoas);//botões formulário
        pane.add(C_Divida);//botões formulário
        pane.add(C_Proventos);//botões formulário


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250,300);
        this.setVisible(true);
//chamar as outras telas
        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == CadastrarPessoa){
                    new CadastrarPessoa();
                } else if(e.getSource() == CadastrarDivida){
                    new CadastrarDivida();
                } else if(e.getSource() == CadastrarProventos){
                    new CadastrarProventoss();
                } else if(e.getSource() == C_Pessoas){
                    new C_Pessoass();
                } else if(e.getSource() == C_Divida){
                    new C_Divida();
                } else if(e.getSource() == C_Proventos){
                    new C_Proventoss();
                }
            }
        };
        //cadastrar
        CadastrarPessoa.addActionListener(handlerAction);
        CadastrarDivida.addActionListener(handlerAction);
        CadastrarProventos.addActionListener(handlerAction);
        
        //consultar
        C_Pessoas.addActionListener(handlerAction);
        C_Divida.addActionListener(handlerAction);
        C_Proventos.addActionListener(handlerAction);


    }
    public static void main(String[] args){
        Menu janela = new Menu();
    }
}    
