package churrascaria;

import java.util.ArrayList;

public class Banco {
    public ArrayList <Cliente> clientes;
    public ArrayList <Funcionario> funcionarios;
    public ArrayList <Mesa> mesas;
    public ArrayList <Produto> produtos;
    
    public Banco () {
        this.clientes = new ArrayList();
        this.funcionarios = new ArrayList();
        this.mesas = new ArrayList();
        this.produtos = new ArrayList();

    }
}
