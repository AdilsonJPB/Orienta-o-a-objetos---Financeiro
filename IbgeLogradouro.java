public class IbgeLogradouro {
    private int id;
    private int numCep;
    private int ibgeBairroId;
    private String descLogradouro;
    private String descTipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumCep() {
        return numCep;
    }

    public void setNumCep(int numCep) {
        this.numCep = numCep;
    }

    public int getIbgeBairroId() {
        return ibgeBairroId;
    }

    public void setIbgeBairroId(int ibgeBairroId) {
        this.ibgeBairroId = ibgeBairroId;
    }

    public String getDescLogradouro() {
        return descLogradouro;
    }

    public void setDescLogradouro(String descLogradouro) {
        this.descLogradouro = descLogradouro;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }
}
