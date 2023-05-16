public class ListaAluno {
    private static class NO{
        Aluno dado;
        NO prox;
    }

    private NO lista = null;

    public void insert(Aluno elem){
        NO novo = new NO();
        novo.dado = elem;
        if (lista == null){
            novo.prox = null;
            lista = novo;
        }else {
            if (novo.dado.rm < lista.dado.rm){
                novo.prox = lista;
                lista = novo;
            }else {
                NO aux = lista;
                boolean achou = false;
                while (aux.prox != null && !achou){
                    if (aux.prox.dado.rm < novo.dado.rm){
                        aux = aux.prox;
                    }else {
                        achou = true;
                    }
                }
                novo.prox = aux.prox;
                aux.prox = novo;
            }
        }
    }

    public void remove(int elem){
        boolean achou = false;
        if (lista != null){
            if (lista.dado.rm == elem){
                achou = true;
                lista = lista.prox;
            }else {
                NO aux = lista;
                while (aux.prox != null && !achou) {
                    if (aux.prox.dado.rm != elem) {
                        aux = aux.prox;
                    } else {
                        achou = true;
                        aux.prox = aux.prox.prox;
                    }
                }
            }
        }else {
            System.out.println("Lista está vazia!");
        }
    }

    public double select(int rm){
        double media = -1;
        NO aux = lista;
        while (aux != null && media == -1){
            if (aux.dado.rm == rm){
                media = aux.dado.media;
            }else{
                aux = aux.prox;
            }
        }
        return media;
    }

    public int length(){
        int cont = 0;
        NO aux = lista;
        while (aux != null){
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    public void show(){
        NO aux = lista;
        System.out.println("***** Lista *****");
        while (aux != null){
            System.out.println(aux.dado.toString());
            aux = aux.prox;
        }
    }


}
