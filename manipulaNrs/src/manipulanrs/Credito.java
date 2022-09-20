package manipulanrs;

import static java.lang.System.exit;


class Credito {

    static int calculaCred() {
        int s= 0;
        float c= 0;
        System.out.println("saldo médio:");
        s= ManipulaNrs.ler.nextInt();
        if(s < 0){
            System.out.println("saldo médio= "+s);
            System.out.println("não tem direito a crédito. deve ao banco\n");
            return 0;
        }    
        switch(s/201){
            case 0:
                System.out.println("saldo médio= "+s);
                System.out.println("não tem direito a crédito\n");
                break;
            case 1:
                c= (float) (s*0.20);
                System.out.println("saldo médio= "+s);
                System.out.println("crédito= "+c+"\n");
                break;
            case 2:
                c= (float) (s*0.30);
                System.out.println("saldo médio= "+s);
                System.out.println("crédito= "+c+"\n");
                break;
            default:
                c= (float) (s*0.40);
                System.out.println("saldo médio= "+s);
                System.out.println("crédito= "+c+"\n");    
        }
        return 0;
        
    }
    
}
