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
            return new Node(info);//Se o nó raiz é nulo -> cria-se um nó com um valor info que será a raiz
        }
        if (info < node.info){
            node.esquerda = inserirElemento(node.esquerda, info);//Se o valor info a inserir é menor que o info raiz -> insere à esquerda da raiz atual
        } else if (info > node.info) {
            node.direita = inserirElemento(node.direita, info);//Se o valor info a inserir é maior que o info raiz -> insere à direita da raiz atual
        }
        return node;
    }



}
