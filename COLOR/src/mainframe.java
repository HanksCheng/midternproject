import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame {
    private JLabel jlr=new JLabel("RED");
    private JLabel jlg=new JLabel("GREEN");
    private JLabel jlb=new JLabel("BLUE");
    private TextField rt=new TextField();
    private TextField gt=new TextField();
    private TextField bt=new TextField();
    private JButton jbA =new JButton("APPLY");
    private JButton jbE =new JButton("EXIT");
    private Container cp;
    public mainframe(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlr.setBounds(0,0,80,20);
        jlg.setBounds(80,0,80,20);
        jlb.setBounds(160,0,80,20);
        rt.setBounds(0,20,80,20);
        gt.setBounds(80,20,80,20);
        bt.setBounds(160,20,80,20);
        jbA.setBounds(40,40,80,20);
        jbE.setBounds(120,40,80,20);
        jbA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r,g,b;
                r=Math.round(Float.parseFloat(rt.getText()));
                g=Math.round(Float.parseFloat(gt.getText()));
                b=Math.round(Float.parseFloat(bt.getText()));
                cp.setBackground(new Color(r,g,b));
            }
        });
        jbE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cp.add(jlr);
        cp.add(jlg);
        cp.add(jlb);
        cp.add(rt);
        cp.add(gt);
        cp.add(bt);
        cp.add(jbA);
        cp.add(jbE);
    }
}
