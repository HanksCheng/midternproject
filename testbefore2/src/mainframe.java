import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame {
    private JButton jbta= new JButton("判定");
    private JButton jbts= new JButton("關閉");
    private JLabel jbtsc=new JLabel("成績");
    private JLabel gr=new JLabel();
    private TextField tf=new TextField();
    private Container cp;
    public mainframe(){init();}
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbta.setBounds(530,480,80,25);
        jbts.setBounds(630,480,80,25);
        jbtsc.setBounds(580,430,80,25);
        tf.setBounds(615,430,80,25);
        gr.setBounds(710,430,80,25);
        jbta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v=Math.round(Float.parseFloat(tf.getText()));
                if (v>=90&&v<=100){
                    gr.setText("A");
                }
                else if (v>=80&&v<=89){
                    gr.setText("B");
                }
                else if (v>=70&&v<=79){
                    gr.setText("C");
                }
                else if (v>=60&&v<=69){
                    gr.setText("D");
                }else {
                    gr.setText("E");
                }
            }
        });
        jbts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(tf);
        cp.add(jbta);
        cp.add(jbts);
        cp.add(jbtsc);
        cp.add(gr);
    }
}
