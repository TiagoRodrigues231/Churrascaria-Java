package churrascaria;

import java.util.ArrayList;

public class Mesa {
    private boolean ativa;
    private String codigo, dataFechamento;
    private float valor;
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private Funcionario funcionario;
    
    
    public Mesa(){
        this.ativa = true;
        this.produtos = new ArrayList();
        this.cliente = new Cliente();
        this.funcionario = new Funcionario();
    }
    
    public Mesa(String codigo, Cliente cliente, Funcionario funcionario){
        this.ativa = true;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produtos = new ArrayList();
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void toggleAtiva() {
        this.ativa = !ativa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (isAtiva()) this.codigo = codigo;
    }
    
    public float getValor() {
        float soma = 0;
        this.getProdutos().forEach(p -> {
            
        });
        return valor;
    }

    public void setValor(float valor) {
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

    public void setClientes(int cliente, Banco db) {
        if (isAtiva()) this.cliente = db.clientes.get(cliente);
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionarios(int funcionario, Banco db) {
        if (isAtiva()) this.funcionario = db.funcionarios.get(funcionario);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public void fecharMesa() {
        this.setDataFechamento(dataFechamento);
        this.ativa = false;
    }
}
