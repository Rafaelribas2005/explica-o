import java.util.Scanner; // importando o método scanner pro java reconhecer o teclado

public class App {
    public static void main(String[] args) throws Exception {
        int n1; 
        int n2; //declarando a INT chamada n1(número 1) e a n2(número 2), mas não dando valor a elas
        String escolha1; // variavel para armazenar a escolha do usuario

        /*aqui é importante dizer que temos duas escolhas, par ou impar, se o player 1 escolher
        par, o player 2 ficará com impar, e vice-versa*/

        Scanner teclado = new Scanner(System.in); //declarando a variavel do teclado

        System.out.println("Escolha par ou ímpar?"); 
        /*usando o comando sout, usaremos o System.out.println,
        sendo System de sistema, out de saida, e println para aparecer a informação no terminal
        fazendo assim Sout uma sigla para System.OUT.print (preste atenção nas letras maiusculas que formam
        a palavra SOUT(SOUT = abreviação do comando, por isso o nome)) 
        */
        escolha1 = teclado.next(); /*armazenando a escolha do usuario com a variavel recebendo o comando
        teclado.next (o teclado vem do nome que demos ao scanner quando declaramos a variavel scanner)*/
        System.out.println("Jogador 1 escolha um número"); // mesma coisa do primeiro sout
        n1 = teclado.nextInt(); // aqui é importante ressaltar que o comando nextInt indica o tipo da proxima leitura
        // para um double seria nextDouble, e para uma String sera apenas next como vimos no primeiro comando next acima
        System.out.println("Jogador 2 escolha um número");
        n2 = teclado.nextInt();

        if((n1+n2) % 2 == 0) {
            System.out.println("Par venceu!");
        } else {
            System.out.println("Ímpar venceu!");
        }

        /*Explicando IF 
         * 
         * if (n1 == 2) {
            System.out.println("O n1 é igual a 2);
        } else {
            System.out.println("O n1 Não é igual a 2);
        }

        aqui a tradução de if é "se" e a tradução de else é "se não"
        nesse caso leriamos da seguinte maneira, SE(if) n1 for igual a 2, o terminal nos dirá que n1 é igual a 2
        SE NÃO(else) n1 não é igual a 2

        */

        /*aqui usamos o comando if para determinar o ganhador, primeiro nós verificamos se o numero inserido
         * é impar, usando o operador % 2(2 = divisor) que indica o resto da divisão, se (if) o resto da divisão de um número for
         * igual a 0, é porque ele é par, caso contrario, o mesmo é ímpar.
         * 
         * então se o resto da divisão for igual a zero, o número será par. 
         * agora imprimiremos "Par venceu!", então o player que escolheu par venceu
         * se não (else) o Ímpar vence.
         */
        teclado.close(); //fechamento do teclado para encerrar a interação do usuário com o teclado
    }
}
