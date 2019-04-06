import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private JButton jbt=new JButton("ADD");
    private JButton jbtn=new JButton("CLOSE");
    private JButton jbtu=new JButton("UP");
    private JButton jbtd=new JButton("DOWN");
    private JButton jbtl=new JButton("LEFT");
    private JButton jbtr=new JButton("RIGHT");
    private JButton jbtc=new JButton("CLONE");
    private JButton jbth=new JButton("HIDE");
    private Container cp;
    private int count=0;
    private JLabel jlb= new JLabel("icon");
    private RoleAshe ashe=new RoleAshe();
    private ImageIcon icon=new ImageIcon("download.jpg");
    ArrayList<RoleAshe> asList=new ArrayList<>();
    private boolean selectflag=false;
    public MainFrame(){
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(null);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jlb.setIcon(icon);
        jbt.setBounds(0,0,80,25);
        jbtn.setBounds(90,0,80,25);
        jbtu.setBounds(180,0,80,25);
        jbtd.setBounds(270,0,80,25);
        jbtl.setBounds(360,0,80,25);
        jbtr.setBounds(450,0,80,25);
        jbtc.setBounds(540,0,80,25);
        jbth.setBounds(630,0,80,25);
        jlb.setBounds(0,50,icon.getIconWidth(),icon.getIconHeight());
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
            }
        });
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int I=0;boolean selectFlag = false;
                RoleAshe tmpAshe = new RoleAshe();
                switch (e.getKeyCode()) {
                    case 37:
                        I= 0;
                        selectFlag = false;
                        System.out.println("qqq");
                        while (I < asList.size() && selectFlag == false) {
                            tmpAshe = asList.get(I);
                          //  System.out.println(tmpAshe.getSelectStatus()+"****");
                            if (tmpAshe.getSelectStatus() == true) {
                                System.out.println("TTT");
                                selectFlag = true;
                            }
                            I++;
                        }
                        if (selectFlag == true) {
                            System.out.println("aaa");
                            tmpAshe.move(2);
                            //tmpAshe.setselectSatus(false);
                        }
                        break;

                    case 38:
                        I=0;selectFlag = false;
                        while (I < asList.size() && selectFlag == false) {
                            tmpAshe = asList.get(I);
                            if (tmpAshe.getSelectStatus() == true) {
                                selectFlag = true;
                            }
                            I++;
                        }
                        if (selectFlag == true) {
                            tmpAshe.move(0);
                           //tmpAshe.setselectSatus(false);
                        }
                        break;

                    case 39:
                        I=0;selectFlag = false;
                        while (I < asList.size() && selectFlag == false) {
                            tmpAshe = asList.get(I);
                            if (tmpAshe.getSelectStatus() == true) {
                                selectFlag = true;
                            }
                            I++;
                        }
                        if (selectFlag == true) {
                            tmpAshe.move(3);
                           //tmpAshe.setselectSatus(false);
                        }
                        break;

                    case 40:
                        I=0;selectFlag = false;
                        while (I < asList.size() && selectFlag == false) {
                            tmpAshe = asList.get(I);
                            if (tmpAshe.getSelectStatus() == true) {
                                selectFlag = true;
                            }
                            I++;
                        }
                        if (selectFlag == true) {
                            tmpAshe.move(1);
                           //tmpAshe.setselectSatus(false);
                        }
                        break;
                }
                    //case 37:
                      //  break;
                    //case 38:
                     //   break;
                    //case 39:
                     //   break;
                    //case 40:
                      //  break;
                }


            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        jbtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtu.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getY()-5>0){
                    jlb.setLocation(jlb.getX(),jlb.getY()-5);
                }
            }
        });
        jbtd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getY()+5<500){
                    jlb.setLocation(jlb.getX(),jlb.getY()+5);
                }
            }
        });
        jbtl.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getX()-5>0){
                    jlb.setLocation(jlb.getX()-5,jlb.getY());
                }
            }
        });
        jbtr.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlb.getY()+5<600){
                    jlb.setLocation(jlb.getX()+5,jlb.getY());
                }
            }
        });
        jbtc.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asList.add(new RoleAshe());
                cp.add(asList.get(asList.size()-1));
                cp.repaint();
                MainFrame.this.requestFocus();
            }
        });
        jbth.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                asList.get(asList.size()-1).setVisible(false);
                asList.remove(asList.size()-1);
                cp.repaint();
                System.out.println(asList.size());
            }
        });
        cp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3) {
                    boolean selectFlag = false;
                    RoleAshe tmpAshe = new RoleAshe();
                    int i = 0;
                    while (i < asList.size() && selectFlag == false) {
                        tmpAshe = asList.get(i);
                        if (tmpAshe.getSelectStatus() == true) {
                            selectFlag = true;
                        }
                        i++;
                    }
                    if (selectFlag == true) {
                        tmpAshe.setLocation(e.getX(), e.getY());
                        tmpAshe.setselectSatus(false);
                    }
                }
            }
        });
        cp.add(jbt);
        cp.add(jbtr);
        cp.add(jbtl);
        cp.add(jbtu);
        cp.add(jbtd);
        cp.add(jlb);
        cp.add(jbtc);
        cp.add(jbth);
    }
}
