import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        ListaAluno lista = new ListaAluno();

        double media;
        int rm, resp = 1;

        do {
            System.out.print("\tRM: ");
            rm = e.nextInt();
            System.out.print("\tMédia: ");
            media = e.nextDouble();
            Aluno aluno = new Aluno(rm, media);
            lista.insert(aluno);
            lista.show();
            System.out.print("Digite 1 para continuar inserindo: ");
            resp = e.nextInt();
        }while (resp==1);

        System.out.print("Digite um RM para consultar ou 0 para encerrar: ");
        rm = e.nextInt();
        while (rm > 0){
            media = lista.select(rm);
            if (media != -1){
                System.out.println("Media do aluno= " + media);
            }else{
                System.out.println("Aluno não existe");
            }
            System.out.print("Digite um RM para consultar ou 0 para encerrar: ");
            rm = e.nextInt();
        }

    }

}
