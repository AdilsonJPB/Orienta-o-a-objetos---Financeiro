import java.sql.Timestamp;

public class ErpPessoaFornecedor extends Pessoa {
    private String cnpj;
    private String responsavel;
    private String contato;
    private String fantasia;
    private String razaoSocial;
    private Timestamp dataLancamento;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Timestamp getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Timestamp dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public ErpPessoaFornecedor(int id, String telefones, String active, int id1, String cnpj, String responsavel, String contato, String telefones1, String fantasia, String razaoSocial, String active1, Timestamp dataLancamento) {
        super(id, telefones, active);
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.contato = contato;
        this.fantasia = fantasia;
        this.razaoSocial = razaoSocial;
        this.dataLancamento = dataLancamento;
    }
}
