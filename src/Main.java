public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(8);
        arvoreBinaria.inserir(12);
        //arvoreBinaria.removerMaiorElemento();
        arvoreBinaria.inserir(15);
        //arvoreBinaria.removerMenorElemento();
        arvoreBinaria.inserir(3);
        //arvoreBinaria.removerElementoN(15);
        arvoreBinaria.percorrePreOrdem();
        arvoreBinaria.percorreInOrdem();
        arvoreBinaria.percorrePosOrdem();
    }
}