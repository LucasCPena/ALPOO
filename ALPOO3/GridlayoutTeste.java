package ALPOO3;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class GridlayoutTeste  extends JFrame{
    
    
     GridlayoutTeste(){
         setSize(150,250);
         setLayout(new GridLayout(4,3));
         add( new JButton("7"));
         add( new JButton("8"));
         add( new JButton("9"));
         add( new JButton("10"));
         add( new JButton("11"));
         add( new JButton("12"));
         add( new JButton("13"));         
         add( new JButton("+/-"));
         add( new JButton(","));
     }
    public static void main(String[] args) {
        GridlayoutTeste tela = new GridlayoutTeste();
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
        
    }
}