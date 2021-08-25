package ALPOO3;
  
import java.awt.*;
import javax.swing.*;

//Criando a classe ExemploJFrame que é Herdeira de JFrame
public class ExemploJFrame extends JFrame {
	public ExemploJFrame() {
		//Cirando um Objeto da classe ToolKit
		Toolkit tk = Toolkit.getDefaultToolkit();
		//descobrir qual é o tamanho da nossa tela
		Dimension d = tk.getScreenSize();
		setSize(d);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		//Criando a primeira tela
		ExemploJFrame tela = new ExemploJFrame();
		//tela com fundo azul
		tela.getContentPane().setBackground(Color.blue);
		//quando clicar o botão de fechar automaticamente esconde e elemina o frame
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//Criando a primeira Tela
		ExemploJFrame tela2 = new ExemploJFrame();
		//tela com fundo preto
		tela2.getContentPane().setBackground(Color.black);
	    //quando clicar o botão de fechar automaticamente esconde e elemina o frame
		tela2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
}