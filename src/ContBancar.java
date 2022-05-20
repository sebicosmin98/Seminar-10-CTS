public class ContBancar {

    private String client;
    private String numar;

    public ContBancar(String client, String numar) {
        this.client = client;
        this.numar = numar;
    }

    public String getClient() {
        return client;
    }

    public String getNumar() {
        return numar;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("client='").append(client).append('\'');
        sb.append(", numar='").append(numar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


