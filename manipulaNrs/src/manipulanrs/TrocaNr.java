package manipulanrs;


class TrocaNr {

    static void trocavaloresentrevariáveis(int x, int y) {
        
        int z;
        System.out.println("antes da troca x="+x+", y="+y);
        z= x;
        x= y;
        y= z;
        System.out.println("depois da troca x="+x+", y="+y+"\n");
    }
    
}
