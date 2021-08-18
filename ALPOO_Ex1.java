import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ALPOO_Ex1 {
      public static void main(String[] args) {        

         Frame t01 = new Frame(); // Cria objeto janela
          t01.setTitle("Tela01-Utilizando AWT");// titulo da janela
          t01.setSize(500, 300); //tamanho da janela horizontal x vertical
          t01.setVisible(true);// deixa a janel visivel
          //fechamento da janela
          t01.addWindowListener(new WindowAdapter(){
              public void windowClosing(WindowEvent e){
                  System.exit(0);
              }

            });

      }
}