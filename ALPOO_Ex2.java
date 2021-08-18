import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ALPOO_Ex2 {
      public static void main(String[] args) {        

         Frame t01 = new Frame(); // Cria objeto janela
          t01.setTitle("Tela01-Utilizando AWT - versão 2.0");// titulo da janela
          t01.setSize(700, 400); //tamanho da janela horizontal x vertical
          t01.setLocation(100,100); //define a localização da tela inicial
          t01.setBackground(Color.BLUE); //define a cor de fundo
          t01.setResizable(false);// permite o redimensionamento da tela
          t01.setVisible(true);// deixa a janel visivel
          //fechamento da janela
          t01.addWindowListener(new WindowAdapter(){
              public void windowClosing(WindowEvent e){
                  System.exit(0);
              }

            });

      }
}