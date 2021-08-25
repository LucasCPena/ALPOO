package ALPOO3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ExemploFlowLayout extends JFrame{

  ExemploFlowLayout(){
      setSize(400,350);
      setLayout(new FlowLayout());
      add(new JButton("um"));
      add(new JButton("doi"));
      add(new JButton("Tres"));
      add(new JButton("Quatro"));
      add(new JButton("Cinco"));
      add(new JButton("Seis"));
  }   

  public static void main(String[] args) {
      
      ExemploFlowLayout tela01 = new ExemploFlowLayout();
      tela01.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      tela01.setVisible(true);
    }
    
}