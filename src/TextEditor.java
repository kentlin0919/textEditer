import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {

    JTextPane textPane;
    JScrollPane scrollPane;
    JSpinner fontSizeSpinner;

    TextEditor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor");
        this.setSize(600,500);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        textPane =new JTextPane();
        textPane.setPreferredSize(new Dimension(550,500));
        textPane.setFont(new Font("Arial",Font.PLAIN,50));

        scrollPane = new JScrollPane(textPane);
        scrollPane.setPreferredSize(new Dimension(550,500));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);



        this.add(scrollPane);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

    }

}
