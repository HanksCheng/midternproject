import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame {
    private JButton jbta= new JButton("ADD");
    private JButton jbts= new JButton("SUB");
    private JLabel jlb=new JLabel("ICON");
    private int count=0;
    private Container cp;
    public mainframe(){init();}
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setText(Integer.toString(count));
        jbta.setBounds(530,480,80,25);
        jbts.setBounds(630,480,80,25);
        jlb.setBounds(615,430,80,25);
        jbta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                jlb.setText(Integer.toString(count));
            }
        });
        jbts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                jlb.setText(Integer.toString(count));
            }
        });
        cp.add(jlb);
        cp.add(jbta);
        cp.add(jbts);
    }
}
