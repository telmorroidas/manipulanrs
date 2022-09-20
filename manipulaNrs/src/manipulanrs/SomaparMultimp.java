package manipulanrs;


class SomaparMultimp {

    static void somamulti() {
        int soma = 0;
        long multi = 1;
        int x = 1;
        
        for(x=1; x<=30; x++){
            if(x%2!=0){
                soma += x;
            }else{  
                multi *= x;
            }
        }
        
        System.out.println("soma total = "+soma);
        System.out.println("multiplicação total = "+multi+"\n");
                    
        
    }
    
}
