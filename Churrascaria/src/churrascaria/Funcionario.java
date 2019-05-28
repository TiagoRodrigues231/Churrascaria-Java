package churrascaria;

public class Funcionario extends Pessoa implements TemHistorico {
    private float salario;
    private String dataContratacao;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public String getHistorico(Banco db){
        db.mesas.forEach(m -> {
            m.getClientes().forEach(c -> {
                if(this.getCodigo() == c.
            } );
        });
    }
}
