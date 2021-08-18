/*3. Crie uma nova classe chamada TelaBase:

a. A classe TelaBase deve ser herdeira (extends) da classe Frame;

b. Crie um construtor básico para a classe TelaBase:

i. Crie um objeto d01 do tipo Dimension com 300 por 300;

ii. O título da janela deve ser "Tela Base - Utilizando AWT";

iii. Utilize o objeto d01 para definir o tamanho da janela;

iv. Acrescente o código abaixo para fazer o fechamento da tela

// Fechamento da Janela

addWindowListener(new WindowAdapter(){

public void windowClosing(WindowEvent e) {

dispose();

}

});
*/


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
