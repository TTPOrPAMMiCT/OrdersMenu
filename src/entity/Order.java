package entity;

public class Order {
    private boolean statusOrder;
    private int clientId;
    private int taxistId;
    private Client client;
    private Taxist taxist;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getTaxistId() {
        return taxistId;
    }

    public void setTaxistId(int taxistId) {
        this.taxistId = taxistId;
    }

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Taxist getTaxist() {
        return taxist;
    }

    public void setTaxist(Taxist taxist) {
        this.taxist = taxist;
    }

    @Override
    public String toString() {
        return "Order{" +
                "statusOrder=" + statusOrder +
                ", clientId=" + clientId +
                ", taxistId=" + taxistId +
                ", client=" + client +
                ", taxist=" + taxist +
                '}';
    }
}
