package churrascaria;

public class Churrascaria {
    public static void main(String[] args) {
        Banco db = new Banco();
        MainGUI gui = new MainGUI(db);
        gui.setVisible(true);
        
        db.produtos.add(new Produto("1","Arroz com Feijão e Farofa", 7.5f));
//        db.mesas.add(new Mesa("1", db.clientes.get(0), db.funcionarios.get(0)));
    }
}
