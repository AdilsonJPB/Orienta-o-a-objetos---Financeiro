import java.sql.Timestamp;

public class ErpFormaPagamento {
    private int id;
    private String name;
    private String description;
    private String active;
    private Timestamp dataLancamento;

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
