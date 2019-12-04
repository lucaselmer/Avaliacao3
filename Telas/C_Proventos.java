import java.awt.*;
import javax.swing.*;

public class C_Proventos extends JFrame {

    JTextArea pessoas = new JTextArea(10,30);

    public C_Proventos() {

        super("Consultar Proventos ");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(pessoas);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,250);
        this.setVisible(true);
    }

    public static void main(String[] args){
        C_Proventos janela = new C_Proventos();
    }
}