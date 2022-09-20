package manipulanrs;


class MediaAluno {
    public static int [] notas;
    static void registaNotas() {
        int n = 0;
        System.out.println("quantas notas pretende inserir?");
        n= ManipulaNrs.ler.nextInt();
        notas= new int[n];
        for(int x=0; x<n; x++){
            System.out.println("insira nota");
            notas[x]= ManipulaNrs.ler.nextInt();
        }
        mediAluno();
    }
    
    private static void mediAluno(){
        int tam= notas.length;
        int soma= 0;
        for(int x=0; x<tam; x++)
            soma+= notas[x];
        System.out.println("média do aluno: "+(1.0*soma/tam+"\n"));
    }
    
}
