package churrascaria;

public class Cliente extends Pessoa implements TemHistorico {
    private String dataCadastro;    

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public String getHistorico(){
        
    }
}
