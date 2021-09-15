package ALPOO4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class testeEvents  extends JFrame{
    
    //atributos
    private JLabel lblMensagem;
    private JTextField txtnome;



    //construtor
    public testeEvents(){
        super("Testando eventos nos componentes");
        setLayout(new GridLayout(4,1,5,5));
        setSize(500,200);
        setResizable(false);
        setTitle("Calculadora");


    }





    //main

  public static void main(String[] args) {
      
  }



    
}
