package churrascaria;

public class Venda {
    private int codigo;
    private String data;
    private Mesa mesa;
    
    public String getInfo() {
        return "Código: " + codigo + "\n" +
               "Data: " + data + "\n" +
               "Mesa: " + mesa + "\n";
    }
}
