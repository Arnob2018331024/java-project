package snake;

import java.awt.Color;
import javax.swing.JFrame;

public class Snake extends JFrame{
     Snake(){
     this.setVisible(true);
     this.setTitle("Hissss!");
     this.setResizable(false);
     this.setBounds(100, 40, 882, 720);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setBackground(Color.GRAY );
     }
    public static void main(String[] args) {
       Snake snake=new Snake();
       game g=new game();
       snake.add(g);
    }
    
}
