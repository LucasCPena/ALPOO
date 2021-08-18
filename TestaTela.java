/*c. Crie uma classe chamada TestaTela que possua um método main:

i. No método main crie um objeto chamado t01 do tipo TelaBase;

ii. Faça com que t01 seja visível;

iii. A cor de fundo da janela deve ser verde;

iv. Esta tela não deve ser redimensionada;

v. Execute o programa, e o resultado deve se similar ao da figura abaixo:




vi. Crie um novo objeto do tipo TelaBase, chamado t02;

vii. O título deve ser "Tela Base - Tela 02";

viii. A cor de fundo deve ser amarela;

ix. O local da nova janela deve ter as seguintes coordenadas: x = 300 e y = 0;

x. Deixar a janela visível;

xi. Execute o programa, e o resultado deve se similar ao da figura a seguir:
*/

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