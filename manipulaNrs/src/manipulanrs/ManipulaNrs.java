package manipulanrs;

import java.util.Scanner;


public class ManipulaNrs {

    public static Scanner ler = new Scanner(System.in);
    public static int x, y;
    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("menu de operação com nrs");
            System.out.println("1- maior de 2 nrs");
            System.out.println("2 - ordem descrescente");
            System.out.println("3- soma impares multiplica pares");
            System.out.println("0- sair");
            System.out.println("selecione a opção pretendida");
            op= ler.nextInt();
            switch(op){
                case 0: break;
                case 1:
                    levalores("insira um valor","insira outro valor");
                    MaiorNr.maior2(x,y);
                    break;
                case 2: 
                    do{
                        le1valor("insira um valor");
                    }while(x<=0);
                    NumeroDecr.ordenadecr(x);                    
                    break;
                case 3:
                    somaimpsmultipares();
                    SomaparMultimp.somamulti();
                    break;
                default: System.out.println("insira uma opção válida");
                    
            }
        }while(op!= 0);
    }
    private static void levalores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }

    private static void le1valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }

    private static void somaimpsmultipares() {
       
    }
    
}
