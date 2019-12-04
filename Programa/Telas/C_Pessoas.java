package Telas;

import java.awt.*;
import javax.swing.*;

public class C_Pessoas extends JFrame {

    JTextArea C_Pessoas = new JTextArea(10,30);

    public C_Pessoas() {

        super("Consultar Pessoa ");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(C_Pessoas);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,250);
        this.setVisible(true);
    }

    public static void main(String[] args){
        C_Pessoas janela = new C_Pessoas();
    }
}