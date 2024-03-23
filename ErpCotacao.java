import java.sql.Date;
import java.sql.Timestamp;

public class ErpCotacao {
    private int id;
    private String finalidade;
    private int erpPessoaFornecedorId;
    private Date vencimentoProposta;
    private double valorTotal;
    private String active;
    private Timestamp dataLancamento;

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public int getErpPessoaFornecedorId() {
        return erpPessoaFornecedorId;
    }

    public void setErpPessoaFornecedorId(int erpPessoaFornecedorId) {
        this.erpPessoaFornecedorId = erpPessoaFornecedorId;
    }

    public Date getVencimentoProposta() {
        return vencimentoProposta;
    }

    public void setVencimentoProposta(Date vencimentoProposta) {
        this.vencimentoProposta = vencimentoProposta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Timestamp getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Timestamp dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
