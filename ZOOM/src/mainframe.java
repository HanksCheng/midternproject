import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame {
    private int count=0;
    int x=20,y=20;
    private JLabel jlb=new JLabel();
    private JButton jbu=new JButton("上");
    private JButton jbd=new JButton("下");
    private JButton jbl=new JButton("左");
    private JButton jbr=new JButton("右");
    private JButton jbz=new JButton("放大");
    private JButton jbs=new JButton("縮小");
    private JButton jbe=new JButton("EXIT");
//    private ImageIcon icon=new ImageIcon("download.png");
    private Container cp;
    public mainframe(){init();}
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setBackground(Color.green);
        jlb.setOpaque(true);
        jbu.setBounds(0,540,60,20);
        jbd.setBounds(60,540,60,20);
        jbl.setBounds(120,540,60,20);
        jbr.setBounds(180,540,60,20);
        jbz.setBounds(240,540,60,20);
        jbs.setBounds(300,540,60,20);
        jbe.setBounds(360,540,60,20);
        jlb.setBounds(0,0,20,20);
        jbu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getY()-5>0){
                    jlb.setLocation(jlb.getX(),jlb.getY()-5);
                }
            }
        });
        jbd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getY()+5<800){
                    jlb.setLocation(jlb.getX(),jlb.getY()+5);
                }
            }
        });
        jbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getX()-5>0){
                    jlb.setLocation(jlb.getX()-5,jlb.getY());
                }
            }
        });
        jbr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jlb.getX()+5<600){
                    jlb.setLocation(jlb.getX()+5,jlb.getY());
                }
            }
        });
        jbz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+10;
                y=y+10;
                jlb.setBounds(jlb.getX(),jlb.getY(),x,y);
            }
        });
        jbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-10;
                y=y-10;
                jlb.setBounds(jlb.getX(),jlb.getY(),x,y);
            }
        });
        cp.add(jbu);
        cp.add(jbd);
        cp.add(jbl);
        cp.add(jbr);
        cp.add(jbz);
        cp.add(jbs);
        cp.add(jbe);
        cp.add(jlb);
    }
}
