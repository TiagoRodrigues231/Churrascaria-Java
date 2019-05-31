package churrascaria;

import java.util.ArrayList;

public class Cliente extends Pessoa implements TemHistorico {
    private String dataCadastro;
    
    public Cliente(){}
    
    public Cliente(String nome, String cpf, String dataCadastro, String rua, String bairro, String cidade, String cep) {
        this.setCodigo(Banco.getClientes().size());
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataCadastro(dataCadastro);
        this.getEndereco().setRua(rua);
        this.getEndereco().setBairro(bairro);
        this.getEndereco().setCidade(cidade);
        this.getEndereco().setCep(cep);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public ArrayList<Mesa> getHistorico(){
        ArrayList<Mesa> mesasEncontradas = new ArrayList();
        Banco.getMesas().forEach(m -> {
            if (m.getCliente().getCodigo() == this.getCodigo())
                mesasEncontradas.add(m);
        });
        return mesasEncontradas;
    }
}
