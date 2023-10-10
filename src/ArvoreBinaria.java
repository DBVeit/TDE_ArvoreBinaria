public class ArvoreBinaria {

    private Node raiz;

    public void inserirElemento(Node raiz, int info){

        if (raiz != null){
            if (info < raiz.info){
                if (raiz.esquerda != null){
                    inserirElemento(raiz.esquerda, info);
                }else {
                    System.out.println("Insere "+ info +" a esquerda de "+ raiz.info);
                    raiz.esquerda = new Node();
                }
            } else if (info > raiz.info) {
                if (raiz.direita != null){
                    inserirElemento(raiz.direita, info);
                }else {
                    System.out.println("Insere "+ info +" a direita de "+ raiz.info);
                    raiz.direita = new Node();
                }
                
            }
        }

    }



}
