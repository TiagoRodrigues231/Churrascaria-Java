package churrascaria;

public class ProdutoNaMesa extends Produto {
    private int quantidade;

    public ProdutoNaMesa () {
        super();
        this.quantidade = 0;
    }
    
    public ProdutoNaMesa (int produto, int quantidade) {
        Produto produtoOriginal = Banco.getProdutos().get(produto);
        this.setCodigo(produtoOriginal.getCodigo());
        this.setNome(produtoOriginal.getNome());
        this.setValor(produtoOriginal.getValor());
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
