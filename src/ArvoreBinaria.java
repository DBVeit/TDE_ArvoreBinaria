public class ArvoreBinaria {

    private Node raiz;

    public ArvoreBinaria(){
        raiz = null;
    }

    public void inserir(int info) {
        raiz = inserirElemento(raiz, info);
    }

    private Node inserirElemento(Node node, int info){

        if (node == null){
            return new Node(info);
        }

        if (info < node.info){
            inserirElemento(node.esquerda, info);
        } else if (info > node.info) {
            inserirElemento(node.direita, info);
        }

        return node;

    }



}
