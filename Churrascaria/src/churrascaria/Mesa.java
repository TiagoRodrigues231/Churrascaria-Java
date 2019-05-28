package churrascaria;

import java.util.ArrayList;

public class Mesa {
    private int codigo;
    private float valor;
    private ArrayList<Integer> clientes;
    private ArrayList<Produto> produtos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int[] getClientes() {
        ArrayList<Integer> listaclientes = new ArrayList();
        clientes.forEach(c -> {listaclientes.add(c);});
        return listaclientes;
    }

    public void setClientes(ArrayList<Integer> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
