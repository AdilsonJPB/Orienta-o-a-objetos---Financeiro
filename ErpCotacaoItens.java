import java.sql.Timestamp;

public class ErpCotacaoItens {
    private int id;
    private double valor;
    private Integer erpProdutosId;
    private double qtd;
    private Integer erpCotacaoId;
    private Timestamp dataLancamento;

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getErpProdutosId() {
        return erpProdutosId;
    }

    public void setErpProdutosId(Integer erpProdutosId) {
        this.erpProdutosId = erpProdutosId;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public Integer getErpCotacaoId() {
        return erpCotacaoId;
    }

    public void setErpCotacaoId(Integer erpCotacaoId) {
        this.erpCotacaoId = erpCotacaoId;
    }

    public Timestamp getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Timestamp dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
