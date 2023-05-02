import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        ListaIntCrescente lista = new ListaIntCrescente();

        System.out.print("Informe valor: ");
        int val = e.nextInt();
        while(val >= 0){
            lista.insere(val);
            lista.apresenta();
            System.out.print("Informe valor: ");
            val = e.nextInt();
        }


    }

}
