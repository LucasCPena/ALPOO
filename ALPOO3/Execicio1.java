package ALPOO3;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class Execicio1 extends Telabase {
   
    Execicio1(){
        setTitle("Exercicio 01");
        setVisible(true);
        setLayout(new FlowLayout());
        add(new JButton("vermelho"));
        add(new JButton("azul"));
        add(new JButton("amarelo"));
        add(new JButton("verde"));
        add(new JButton("sair"));
    }

    public static void main(String[] args) {
        Execicio1 tela = new Execicio1();
    }
  
}
