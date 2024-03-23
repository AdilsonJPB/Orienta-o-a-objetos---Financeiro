import java.sql.Date;
import java.sql.Timestamp;

public class ErpContasPagar {
    private int id;
    private Date dataEmissao;
    private Date dataVencimento;
    private Date dataPgto;
    private double valor;
    private String statusPagamento;
    private String chaveNfe;
    private int responsavelId;
    private int erpLctoHistoricoId;
    private int erpDestinacaoRecursoId;
    private int erpFormaPagamentoId;
    private int contaDebito;
    private int erpPessoaFornecedorId;
    private String observacao;
    private String active;
    private Timestamp datetime;
    private String transferidoTesouraria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Date dataPgto) {
        this.dataPgto = dataPgto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public int getResponsavelId() {
        return responsavelId;
    }

    public void setResponsavelId(int responsavelId) {
        this.responsavelId = responsavelId;
    }

    public int getErpLctoHistoricoId() {
        return erpLctoHistoricoId;
    }

    public void setErpLctoHistoricoId(int erpLctoHistoricoId) {
        this.erpLctoHistoricoId = erpLctoHistoricoId;
    }

    public int getErpDestinacaoRecursoId() {
        return erpDestinacaoRecursoId;
    }

    public void setErpDestinacaoRecursoId(int erpDestinacaoRecursoId) {
        this.erpDestinacaoRecursoId = erpDestinacaoRecursoId;
    }

    public int getErpFormaPagamentoId() {
        return erpFormaPagamentoId;
    }

    public void setErpFormaPagamentoId(int erpFormaPagamentoId) {
        this.erpFormaPagamentoId = erpFormaPagamentoId;
    }

    public int getContaDebito() {
        return contaDebito;
    }

    public void setContaDebito(int contaDebito) {
        this.contaDebito = contaDebito;
    }

    public int getErpPessoaFornecedorId() {
        return erpPessoaFornecedorId;
    }

    public void setErpPessoaFornecedorId(int erpPessoaFornecedorId) {
        this.erpPessoaFornecedorId = erpPessoaFornecedorId;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getTransferidoTesouraria() {
        return transferidoTesouraria;
    }

    public void setTransferidoTesouraria(String transferidoTesouraria) {
        this.transferidoTesouraria = transferidoTesouraria;
    }
}
