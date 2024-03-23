import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class ErpContasReceber {
        private int id;
        private Date dataEmissao;
        private Date dataVencimento;
        private Date dataRecebimento;
        private BigDecimal valor;
        private String statusPagamento;
        private String chaveNfe;
        private int responsavelId;
        private int erpLctoHistoricoId;
        private int erpFormaPagamentoId;
        private int contaCredito;
        private String observacao;
        private String active;
        private Timestamp datetime;
        private char transferidoTesouraria;

        // Getters e setters
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

        public Date getDataRecebimento() {
            return dataRecebimento;
        }

        public void setDataRecebimento(Date dataRecebimento) {
            this.dataRecebimento = dataRecebimento;
        }

        public BigDecimal getValor() {
            return valor;
        }

        public void setValor(BigDecimal valor) {
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

        public int getErpFormaPagamentoId() {
            return erpFormaPagamentoId;
        }

        public void setErpFormaPagamentoId(int erpFormaPagamentoId) {
            this.erpFormaPagamentoId = erpFormaPagamentoId;
        }

        public int getContaCredito() {
            return contaCredito;
        }

        public void setContaCredito(int contaCredito) {
            this.contaCredito = contaCredito;
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

        public char getTransferidoTesouraria() {
            return transferidoTesouraria;
        }

        public void setTransferidoTesouraria(char transferidoTesouraria) {
            this.transferidoTesouraria = transferidoTesouraria;
        }
    }


