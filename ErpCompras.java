import java.time.LocalDateTime;

public class ErpCompras {
    private int id;
    private char numero_requisicao;
    private int membro_comprador_system_users_id;
    private int erp_forma_pagamento_id;
    private int erp_destinacao_recurso_id;
    private int erp_cotacao_id;
    private double valor_total;
    private LocalDateTime data_compra;
    private int erp_status_compra_id;
    private char active;
    private LocalDateTime data_lancamento;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public char getNumero_requisicao(){
        return numero_requisicao;
    }

    public void setNumero_requisicao(char numero_requisicao){
        this.numero_requisicao = numero_requisicao;
    }

    public int getMembro_comprador_system_users_id(){
        return membro_comprador_system_users_id;
    }

    public void setMembro_comprador_system_users_id(int membro_comprador_system_users_id){
        this.membro_comprador_system_users_id = membro_comprador_system_users_id;
    }

    public int getErp_forma_pagamento_id(){
        return erp_forma_pagamento_id;
    }

    public void setErp_forma_pagamento_id(int erp_forma_pagamento_id){
        this.erp_forma_pagamento_id = erp_forma_pagamento_id;
    }

    public int getErp_destinacao_recurso_id(){
        return erp_destinacao_recurso_id;
    }

    public void setErp_destinacao_recurso_id(int erp_destinacao_recurso_id){
        this.erp_destinacao_recurso_id = erp_destinacao_recurso_id;
    }

    public int getErp_cotacao_id(){
        return erp_cotacao_id;
    }

    public void setErp_cotacao_id(int erp_cotacao_id){
        this.erp_cotacao_id = erp_cotacao_id;
    }

    public double getValor_total(){
        return valor_total;
    }

    public void setValor_total(double valor_total){
        this.valor_total = valor_total;
    }

    public LocalDateTime getData_compra(){
        return data_compra;
    }

    public void setData_compra(LocalDateTime data_compra){
        this.data_compra = data_compra;
    }

    public int getErp_status_compra_id(){
        return erp_status_compra_id;
    }

    public void setErp_status_compra_id(int erp_status_compra_id){
        this.erp_status_compra_id = erp_status_compra_id;
    }

    public char getActive(){
        return active;
    }

    public void setActive(char active){
        this.active = active;
    }

    public LocalDateTime getData_lancamento(){
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento){
        this.data_lancamento = data_lancamento;
    }
}
