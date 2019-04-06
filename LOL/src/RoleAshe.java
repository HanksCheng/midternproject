import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RoleAshe extends JLabel {
    private Random rand=new Random(System.currentTimeMillis());
    ImageIcon icon=new ImageIcon("download.jpg");
    private int x,y;
    private Timer t1;
    private boolean isSelected=false;
    boolean flag=true;
      RoleAshe() {
        this.setIcon(icon);
        x = rand.nextInt(1280);
        y = rand.nextInt(720);
        this.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
       // t1 = new Timer(100, new ActionListener() {
        //    @Override
        //    public void actionPerformed(ActionEvent e) {
        //        if (x>1280){
        //            flag=false;
        //        }else if (x<0){
         //           flag=true;
        //        }
        //        if (flag==false){
        //            x=x-5;
         //       }
        //        else {
         //           x=x+5;
        //        }
        //        RoleAshe.this.setLocation(x, y);
        //    }
      //  });
       // t1.start();
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isSelected = true;
           //     System.out.println(isSelected + "kkkkk");
            }
        });
    }
    public boolean getSelectStatus(){
        return isSelected;
    }
    public void setselectSatus(boolean v1){
        this.isSelected=v1;
    }
    public void move(int dir){
      //  System.out.println("234");
          if (isSelected==true){
              switch (dir){
                  case 0:
                      if (y - 5 >0) {
                          y -= 5;
                          setLocation(x, y);
                      }

                      break;
                  case 1:
                      if (y + 5 >0) {
                          y += 5;
                          setLocation(x, y);
                      }

                      break;
                  case 2:
                   //   System.out.println("123");
                      if (x - 5 >0) {
                          x -= 5;
                          setLocation(x, y);
                      }

                      break;
                  case 3:
                      if (x + 5 >0) {
                          x += 5;
                          setLocation(x, y);
                      }

                      break;
              }
          }
    }
    public void setLocation(int x1,int y1){
        x=x1;
        y=y1;
        super.setLocation(x1,y1);
    }
}
