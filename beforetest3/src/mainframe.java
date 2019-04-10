import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class mainframe extends JFrame {
    int v,b,n,m,j,k;
    private JButton jbta= new JButton("重新產生");
    private JButton jbts= new JButton("結束");
    private JLabel jlb1=new JLabel();
    private JLabel jlb2=new JLabel();
    private JLabel jlb3=new JLabel();
    private JLabel jlb4=new JLabel();
    private JLabel jlb5=new JLabel();
    private JLabel jlb6=new JLabel();
    private int count=0;
    private Container cp;
    private Random rand=new Random();
    public mainframe(){init();}
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jlb1.setText(Integer.toString());
//        jlb2.setText(Integer.toString());
//        jlb3.setText(Integer.toString());
//        jlb4.setText(Integer.toString());
//        jlb5.setText(Integer.toString());
//        jlb6.setText(Integer.toString());
        jlb1.setBounds(0,0,80,25);
        jlb2.setBounds(80,0,80,25);
        jlb3.setBounds(160,0,80,25);
        jlb4.setBounds(240,0,80,25);
        jlb5.setBounds(320,0,80,25);
        jlb6.setBounds(400,0,80,25);
        jbta.setBounds(480,0,80,25);
        jbts.setBounds(560,0,80,25);
        jbta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v=rand.nextInt(42);
                b=rand.nextInt(42);
                n=rand.nextInt(42);
                m=rand.nextInt(42);
                j=rand.nextInt(42);
                k=rand.nextInt(42);
                jlb1.setText(Integer.toString(v));
                jlb2.setText(Integer.toString(b));
                jlb3.setText(Integer.toString(n));
                jlb4.setText(Integer.toString(m));
                jlb5.setText(Integer.toString(j));
                jlb6.setText(Integer.toString(k));
            }
        });
        jbts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jlb1);
        cp.add(jlb2);
        cp.add(jlb3);
        cp.add(jlb4);
        cp.add(jlb5);
        cp.add(jlb6);
        cp.add(jbta);
        cp.add(jbts);
    }
}
