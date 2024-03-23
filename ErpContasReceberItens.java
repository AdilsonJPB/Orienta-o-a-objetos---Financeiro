import java.sql.Timestamp;

public class ErpContasReceberItens {
    private int id;
    private String descricao;
    private double valor;
    private int erpContasReceberId;
    private Timestamp lancamento;

    // Getters e setters
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

    public int getErpContasReceberId() {
        return erpContasReceberId;
    }

    public void setErpContasReceberId(int erpContasReceberId) {
        this.erpContasReceberId = erpContasReceberId;
    }

    public Timestamp getLancamento() {
        return lancamento;
    }

    public void setLancamento(Timestamp lancamento) {
        this.lancamento = lancamento;
    }
}

