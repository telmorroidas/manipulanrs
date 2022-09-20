package manipulanrs;


class Carro {

    static void calculaValorFinal() {
        float n= 0;
        float soma= 0;
        System.out.println("custo de fábrica?");
        n= ManipulaNrs.ler.nextFloat();
        soma= (float) (n+(n*0.28)+(n*0.45));
        System.out.println("preço final= "+soma+"\n");
    }
    
}
