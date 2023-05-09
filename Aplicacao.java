import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.print("Informe valor para inserir: ");
        int val = e.nextInt();
        while(val >= 0){
            lista.insert(val);
            lista.show();
            System.out.println("Tamanho: " + lista.length());
            System.out.print("Informe valor para inserir: ");
            val = e.nextInt();
        }

        System.out.print("Informe valor para remover: ");
        val = e.nextInt();
        while(val >= 0){
            if (!lista.remove(val)){
                System.out.println("Valor não esta na lista!");
            }
            lista.show();
            System.out.println("Tamanho: " + lista.length());
            System.out.print("Informe valor para remover: ");
            val = e.nextInt();
        }

        lista.showBigger(5);



    }

}
