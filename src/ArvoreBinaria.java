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


    public void percorrePreOrdem(){
        System.out.println("Pré-Ordem: ");
        preOrdem(raiz);
    }
    private void preOrdem(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.info + " ");
        preOrdem(node.esquerda);
        preOrdem(node.direita);
    }

    public void percorreInOrdem(){
        System.out.println("\nIn-Ordem: ");
        InOrdem(raiz);
    }
    private void InOrdem(Node node){
        if (node == null){
            return;
        }
        InOrdem(node.esquerda);
        System.out.println(node.info + " ");
        InOrdem(node.direita);
    }

    public void percorrePosOrdem(){
        System.out.println("\nPós-Ordem: ");
        PosOrdem(raiz);
    }
    private void PosOrdem(Node node){
        if (node == null){
            return;
        }
        InOrdem(node.esquerda);
        InOrdem(node.direita);
        System.out.println(node.info + " ");
    }

    public void removerMaiorElemento(){
        if (raiz != null){
            raiz = removeMaior(raiz);
        }
    }

    private Node removeMaior(Node node){
        if (node.direita == null){
            return node.esquerda;
        }
        node.direita = removeMaior(node.direita);
        return node;
    }

    public void removerMenorElemento(){
        if (raiz != null){
            raiz = removeMenor(raiz);
        }
    }

    private Node removeMenor(Node node){
        if (node.esquerda == null){
            return node.direita;
        }
        node.esquerda = removeMenor(node.esquerda);
        return node;
    }


    public void removerElementoN(int info){
        raiz = removerElemento(raiz, info);
    }

    private Node removerElemento(Node node, int info){
        if (node == null){
            return null;
        }

        if (info < node.info){
            node.esquerda = removerElemento(node.esquerda, info);
        } else if (info > node.info) {
            node.direita = removerElemento(node.direita, info);
        } else {
            if (node.esquerda == null){
                return node.direita;
            } else if (node.direita == null) {
                return node.esquerda;
            }

            node.info = encontrarMenorElemento(node.direita);
            node.direita = removerElemento(node.direita, node.info);
        }

        return node;
    }

    private int encontrarMenorElemento(Node node){
        int menorValor = node.info;
        while (node.esquerda != null){
            menorValor = node.esquerda.info;
            node = node.esquerda;
        }
        return menorValor;
    }

}
