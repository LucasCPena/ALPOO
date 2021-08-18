import java.awt.Color;

public class TestaTela{

    public static void main(String[] args) {
        TelaBase t01 = new TelaBase();
        t01.setVisible(true);
        t01.setBackground(Color.green);

        TelaBase t02 = new TelaBase();
        t02.setVisible(true);
        t02.setBackground(Color.yellow);
        t02.setLocation(300,0);
        t02.setTitle("Tela Base - Tela 02");
    }
}