package churrascaria;

public class ProdutoNaMesa extends Produto {
    private int quantidade;

    public ProdutoNaMesa () {
        super();
        this.quantidade = 0;
    }
    
    public ProdutoNaMesa (Produto produto, int quantidade) {
        super(produto.getNome(), produto.getValor());
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
