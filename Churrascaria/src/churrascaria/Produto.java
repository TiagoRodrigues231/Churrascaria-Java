package churrascaria;

public class Produto {
    private String codigo, nome;
    private float valor;
    
    public Produto(String codigo, String nome, float valor) {
        this.codigo = "P" + codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
