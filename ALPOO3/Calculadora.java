package ALPOO3;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;


public class Calculadora extends Telabase {
    
  JLabel lblresultado;
  JTextField txtnumero1;
  JTextField txtnumero2;
  JPanel painel;
  JButton btsomar;
  JButton btsubtrair;
  JButton btMutiplicar;
  JButton btdividir;
  JButton btresultado;

  Calculadora(){
      lblresultado = new JLabel("Calculadora");
      lblresultado.setBackground(Color.black);
      txtnumero1 = new JTextField();
      txtnumero2 = new JTextField();
   
      painel = new JPanel();
      painel.setLayout(new GridLayout(1,4));
      btsomar = new JButton("+");
      btsubtrair = new JButton("-");
      btMutiplicar = new JButton("*");
      btdividir = new JButton("/");
      btresultado = new JButton("=");

      painel.add(btsomar);
      painel.add(btsubtrair);
      painel.add(btMutiplicar);
      painel.add(btMutiplicar);
      painel.add(btdividir);
      painel.add(btresultado);


      add(lblresultado);
      add(txtnumero1);
      add(txtnumero2);
      add(painel);


    setLayout(new GridLayout(4,1,5,5));
     setSize(400,200);
     setResizable(false);
     setTitle("Calculadora");


  }


  public static void main(String[] args) {
    Calculadora t01 = new Calculadora();
    t01.setVisible(true);
      
  }
}
