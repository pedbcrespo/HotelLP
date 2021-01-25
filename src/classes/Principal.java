package classes;
import telas.*;
/*Aqui é a classe que chama todo mundo, que faz tudo acontecer...
Repara como é pequenininha kkk
Assim, ela chama a classe JFrame interfaceFront, que é a primeira tela do trablaho
e nela, sao atualizados os valores da tabela de quartos. Dessa forma, quando o programa
abre, aparece as informações ja atualizadas.*/
public class Principal {
    public static void main(String[] args){
        InterfaceFront principal = new InterfaceFront();
        //Esse metodo aqui simplismente faz a tela aparecer
        principal.setVisible(true);
        //Esse metodo, como o nome diz, pega a data do PC e mostra na tela principal
        principal.mostra_data();
        //Esse metodo atualiza as informações principais, tais como os valores da tabela e os valores dos lucros
        principal.Atualiza();
        
    }
}
