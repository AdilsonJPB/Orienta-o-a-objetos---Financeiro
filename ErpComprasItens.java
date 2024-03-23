import java.sql.Timestamp;

public class ErpComprasItens {
    private int id;
    private double valor;
    private int erpProdutosId;
    private double qtd;
    private int erpComprasId;
    private Timestamp dataLancamento;

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

    public int getErpProdutosId() {
        return erpProdutosId;
    }

    public void setErpProdutosId(int erpProdutosId) {
        this.erpProdutosId = erpProdutosId;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public int getErpComprasId() {
        return erpComprasId;
    }

    public void setErpComprasId(int erpComprasId) {
        this.erpComprasId = erpComprasId;
    }

    public Timestamp getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Timestamp dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
