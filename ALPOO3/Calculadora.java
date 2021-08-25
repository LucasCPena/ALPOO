package ALPOO3;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Calculadora extends Telabase {
    
  JLabel lblresultado;
  JTextField txtnumero1;
  JTextField txtnumero2;
  JPanel painel;
  JPanel btsomar;
  JPanel btsubtrair;
  JPanel btMutiplicar;
  JPanel btdividir;

  Calculadora(){
      lblresultado = new JLabel();
      txtnumero1 = new JTextField();
      txtnumero2 = new JTextField();
   
      painel = new JPanel();
      painel.setLayout(new GridLayout(1,4));
      btsomar = new JButton("+");
      btsubtrair = new JButton("-");
      btMutiplicar = new JButton("*");
      btdividir = new JButton("/");
  }

  public static void main(String[] args) {
      
  }
}
