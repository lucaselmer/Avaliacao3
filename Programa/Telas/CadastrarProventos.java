package Telas;

import javax.swing.*;
import javax.swing.text.TextAction;

import Programa.Proventos;

import java.awt.*;

public class CadastrarProventos extends JFrame {

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

    public CadastrarProventos(){
        
        super("Cadastrar Proventos");
       

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
    public void cadastrarProventosNovo(){      //método
        
        Programa.Proventos proventos = new Proventos();
        proventos.setIdConta(Integer.parseInt(textPessoa.getText()));
        proventos.setIdConta(Integer.parseInt(labelPessoa.getLabel()));
        proventos.setAno(Integer.parseInt(textAno.getText()));
        proventos.setAno(Integer.parseInt(labelAno.getLabel()));
        proventos.setValor(Integer.parseInt(textValor.getText()));
        proventos.setValor(Integer.parseInt(labelValor.getLabel()));


    }


    public static void main(String[] args) {
        CadastrarProventos consulta = new CadastrarProventos();
        
        
    }

}