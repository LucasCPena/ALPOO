package ALPOO3;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;

public class Calculadora_V2 extends Telabase {
    

    Calculadora_V2(){
        JPanel painelbotoes = new JPanel();
        painelbotoes.setLayout(new GridLayout(6,4));

        painelbotoes.add(new JButton("%"));
        painelbotoes.add(new JButton("CE"));
        painelbotoes.add(new JButton("C"));
        painelbotoes.add(new JButton("Back"));
        painelbotoes.add(new JButton("1/2"));
        painelbotoes.add(new JButton("x^2"));
        painelbotoes.add(new JButton("Raiz"));
        painelbotoes.add(new JButton("7"));
        painelbotoes.add(new JButton("8"));
        painelbotoes.add(new JButton("9"));
        
        painelbotoes.add(new JButton ("X"));

		painelbotoes.add(new JButton ("4"));
		painelbotoes.add(new JButton ("5"));
		painelbotoes.add(new JButton ("6"));
		painelbotoes.add(new JButton ("-"));

		painelbotoes.add(new JButton ("1"));
		painelbotoes.add(new JButton ("2"));
		painelbotoes.add(new JButton ("3"));
		painelbotoes.add(new JButton ("+"));
		
		painelbotoes.add(new JButton ("+/-"));
		painelbotoes.add(new JButton ("0"));
		painelbotoes.add(new JButton (","));
		painelbotoes.add(new JButton ("="));
		
		JTextField txtVisor = new JTextField("0");
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setFont(new Font("Arial", 0, 50) );
		add(BorderLayout.NORTH, txtVisor);
		add(BorderLayout.CENTER, painelbotoes);
		
    }
    public static void main(String[] args) {

        Calculadora_V2 calculadora = new Calculadora_V2();
		calculadora.setTitle("Calculadora");
		calculadora.setVisible(true);
		calculadora.setSize(270, 400);
        
    }


}
