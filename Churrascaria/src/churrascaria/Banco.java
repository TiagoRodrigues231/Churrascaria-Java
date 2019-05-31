package churrascaria;

import java.util.ArrayList;

public class Banco {
    private static ArrayList <Mesa> mesas = new ArrayList<Mesa>();
    private static ArrayList <Produto> produtos = new ArrayList<Produto>();
    private static ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    private static ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public static void addMesa(Mesa mesa) {
        mesas.add(mesa);
    }
    
    public static void atualizaMesa(int index, Mesa mesa){
        mesas.set(index, mesa);
    }
 
    public static void removeMesa(Mesa mesa){
        mesas.remove(mesa);
    }
    
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public static void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public static void atualizaCliente(int index, Cliente cliente){
        clientes.set(index, cliente);
    }
 
    public static void removeCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    
    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public static void atualizaFuncionario(int index, Funcionario funcionario){
        funcionarios.set(index, funcionario);
    }
 
    public static void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    
    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public static void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public static void atualizaProduto(int index, Produto produto){
        produtos.set(index, produto);
    }
 
    public static void removeProduto(Produto produto){
        produtos.remove(produto);
    }
}
