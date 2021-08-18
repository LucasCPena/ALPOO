import java.awt.Frame;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TelaBase extends Frame {
    
    //construtor
    TelaBase(){
        Dimension d01 = new Dimension(300, 300);
        this.setTitle("Tela Base - Utilizando AWT"); //define o titulo
        this.setSize(d01);//define o tamanho da tela horizontal e vertical
       //fechamento da janela
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }

          });

    }
}
