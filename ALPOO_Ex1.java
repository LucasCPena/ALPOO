/*1. Criar um janela (Frame), conforme instruções:

a. Criar um novo projeto JAVA com o seguinte nome: “ALPOO_02”;

b. Criar uma classe chamada “Tela01”, que possua um método main;

c. Instanciar um objeto chamado “t01” do tipo Frame (no método main);

d. Defina o título de “t01” para “Tela 01 - Utilizando AWT”;

e. Defina o tamanho da janela com 500px de comprimento e 300px de largura

f. Deixe a janela visível
*/



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