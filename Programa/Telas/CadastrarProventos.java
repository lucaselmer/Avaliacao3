package Telas;

import javax.swing.*;
import java.awt.*;

public class CadastrarProventos extends JFrame {
    
    public CadastrarProventos(){
        
        super("Cadastrar Proventos");
        JLabel labelPessoa = new JLabel("Pessoa:");
        JLabel labelAno = new JLabel("Ano:");
        JLabel labelMes = new JLabel("Mês:");
        JLabel labelValor = new JLabel("Valor:");
        JLabel labelImposto = new JLabel("Imposto:");


        JTextField textPessoa = new JTextField(25);
        JTextField textAno = new JTextField(25);
        JTextField textValor = new JTextField(25);
        JTextField textImposto = new JTextField(25);

        JButton button1 = new JButton("Gravar");
        JComboBox mes = new JComboBox();

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        mes.addItem("Janeiro");
        mes.addItem("Fevereiro");
        mes.addItem("Março");
        mes.addItem("Abril");
        mes.addItem("Maio");
        mes.addItem("Junho");
        mes.addItem("Julho");
        mes.addItem("Agosto");
        mes.addItem("Setembro");
        mes.addItem("Outubro");
        mes.addItem("Novembro");
        mes.addItem("Dezembro");
         
        pane.add(labelPessoa);
        pane.add(textPessoa);

        pane.add(labelAno);
        pane.add(textAno); 
        
        pane.add(labelValor);
        pane.add(textValor);

        pane.add(labelImposto);
        pane.add(textImposto);

        pane.add(labelMes);
        pane.add(mes);

        pane.add(button1);

        setSize(250,270);
        setVisible(true);
    }

    public static void main(String[] args) {
        CadastrarProventos consulta = new CadastrarProventos();
        
        
    }

}