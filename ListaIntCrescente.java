public class ListaIntCrescente {

    private static class NO{
        int dado;
        NO prox;
    }

    private NO lista = null;

    public void insert(int elem){
        NO novo = new NO();
        novo.dado = elem;
        if (lista == null){
            novo.prox = null;
            lista = novo;
        }else {
            if (novo.dado < lista.dado){
                novo.prox = lista;
                lista = novo;
            }else {
                NO aux = lista;
                boolean achou = false;
                while (aux.prox != null && !achou){
                    if (aux.prox.dado < novo.dado){
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

    public boolean remove(int elem){
        boolean achou = false;
        if (lista != null){
            if (lista.dado == elem){
                achou = true;
                lista = lista.prox;
            }else {
                NO aux = lista;
                while (aux.prox != null && !achou) {
                    if (aux.prox.dado != elem) {
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
        return achou;
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

    public void showBigger(int elem){
        NO aux = lista;
        System.out.println("*****Maiores que " + elem + "*****");
        while (aux != null){
            if (aux.dado > elem){
                System.out.println("\t" + aux.dado);
            }
            aux = aux.prox;
        }
    }

    public void show(){
        NO aux = lista;
        System.out.println("***** Lista *****");
        while (aux != null){
            System.out.println("\t" + aux.dado);
            aux = aux.prox;
        }
    }

}
