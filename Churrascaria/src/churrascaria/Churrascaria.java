package churrascaria;

public class Churrascaria {
    public static void main(String[] args) {
        Banco db = new Banco();
        db.produtos.add(new Produto("1","Arroz com Feijão e Farofa", 7.5f));
        System.out.println(db.produtos.get(0).getCodigo() + db.produtos.get(0).getNome() + db.produtos.get(0).getValor());
    }
}
