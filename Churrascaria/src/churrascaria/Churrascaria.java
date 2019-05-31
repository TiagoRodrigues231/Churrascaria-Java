package churrascaria;

public class Churrascaria {
    public static void main(String[] args) {
        new Banco();
        Banco.addCliente(new Cliente("Tiago", "12345678910", "10/07/2018", "Alvarino Ferreira", "Aeroporto", "Presidente Olegário", "38750-000"));
        Banco.addFuncionario(new Funcionario("José", "12312312312", 1000, "23/03/2017", "Severino Mendes", "Planalto", "Presidente Olegário", "38750-000"));
        Banco.addProduto(new Produto("Biriba", 10f));
        MainGUI gui = new MainGUI();
        gui.setVisible(true);
    }
}
