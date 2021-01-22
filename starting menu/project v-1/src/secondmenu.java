/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class secondmenu extends JFrame {
    Container c;
    public secondmenu(){
    setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100,50,615,650);
    this.setTitle("Select_Game");
    c=this.getContentPane();
    c.setLayout(null);
    }
    
}
