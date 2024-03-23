import java.sql.Timestamp;

public class Pessoa {
    private int id;
    private String telefones;
    private String active;

    public Pessoa(int id, String telefones, String active) {
        this.id = id;
        this.telefones = telefones;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}

