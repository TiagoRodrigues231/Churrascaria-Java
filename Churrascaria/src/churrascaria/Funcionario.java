package churrascaria;

import java.util.ArrayList;

public class Funcionario extends Pessoa implements TemHistorico {
    private float salario;
    private String dataContratacao;

    public Funcionario(){}
    
    public Funcionario(String codigo, String nome, String cpf, float salario, String dataContratacao, String rua, String bairro, String cidade, String cep) {
        this.setCodigo("F" + codigo);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
        this.setDataContratacao(dataContratacao);
        this.getEndereco().setRua(rua);
        this.getEndereco().setBairro(bairro);
        this.getEndereco().setCidade(cidade);
        this.getEndereco().setCep(cep);
    }
    
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
    
    public ArrayList<Mesa> getHistorico(Banco db){
        ArrayList<Mesa> mesasEncontradas = new ArrayList();
        db.mesas.forEach(m -> {
            if (m.getFuncionario().getCodigo().equals(this.getCodigo()))
                mesasEncontradas.add(m);
        });
        return mesasEncontradas;
    }
    
//    public String imprimeHistorico(Banco db) {
//        ArrayList<Mesa> historico = getHistorico(db);
//        String historicoDetalhado = "", listaProdutos = "";
//        
//        historico.forEach(item -> {
//            item.getProdutos().forEach(p -> {
//                listaProdutos.concat("CODIGO")
//            });
//        });
//        
//        historico.forEach(item -> {
//            historicoDetalhado.concat("NUMERO DA MESA: " + item.getCodigo() + "\n"
//                    + "NUMERO DO CLIENTE: " + item.getCliente() + "\n"
//                    + "PRODUTOS: " + "\n" + listaProdutos
//                    + "VALOR: " + item.getValor() + "\n");
//            });
//        });
//        return historicoDetalhado;
//    }
}
