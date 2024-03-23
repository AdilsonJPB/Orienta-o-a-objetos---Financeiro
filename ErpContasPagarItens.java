import java.sql.Timestamp;

public class ErpContasPagarItens {
    private int id;
    private String descricao;
    private double valor;
    private int erpContasPagarId;
    private Timestamp lancamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getErpContasPagarId() {
        return erpContasPagarId;
    }

    public void setErpContasPagarId(int erpContasPagarId) {
        this.erpContasPagarId = erpContasPagarId;
    }

    public Timestamp getLancamento() {
        return lancamento;
    }

    public void setLancamento(Timestamp lancamento) {
        this.lancamento = lancamento;
    }
}
