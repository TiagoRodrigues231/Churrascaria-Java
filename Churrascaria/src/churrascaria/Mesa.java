package churrascaria;

import java.util.ArrayList;

public class Mesa {
    private boolean ativa;
    private int codigo;
    private String dataFechamento;
    private float valor;
    private ArrayList<ProdutoNaMesa> produtos;
    private Cliente cliente;
    private Funcionario funcionario;
    
    
    public Mesa(){
        this.ativa = true;
        this.codigo = Banco.getMesas().size();
        this.cliente = new Cliente();
        this.funcionario = new Funcionario();
        this.produtos = new ArrayList();
    }
    
    public Mesa(Cliente cliente, Funcionario funcionario){
        this.ativa = true;
        this.codigo = Banco.getMesas().size();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produtos = new ArrayList();
    }
    
    public Mesa (Cliente cliente, Funcionario funcionario, ArrayList<ProdutoNaMesa> produtos) {
        this.ativa = true;
        this.codigo = Banco.getMesas().size();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.setProdutos(produtos);
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void toggleAtiva() {
        this.ativa = !ativa;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public float getValor() {
        return valor;
    }

    private void setValor(float valor) {
        if (isAtiva()) this.valor = valor;
    }
    
    public String getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(String dataFechamento) {
        if (isAtiva()) this.dataFechamento = dataFechamento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (isAtiva()) this.cliente = cliente;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        if (isAtiva()) this.funcionario = funcionario;
    }

    public ArrayList<ProdutoNaMesa> getProdutos() {
        return produtos;
    }
    
    public void setProdutos(ArrayList<ProdutoNaMesa> produtos) {
        if (isAtiva()) {
        this.produtos = produtos;
        ProdutoNaMesa[] arrayProdutos = produtos.toArray(new ProdutoNaMesa[produtos.size()]);
        float valor = 0;
        for(ProdutoNaMesa p : arrayProdutos) {
            System.out.println(p.getValor());
            System.out.println(p.getQuantidade());
            valor += p.getValor()*p.getQuantidade();
        }
        this.setValor(valor);
        }
    }
    
    public void fecharMesa() {
        this.setDataFechamento(dataFechamento);
        this.ativa = false;
    }
}
