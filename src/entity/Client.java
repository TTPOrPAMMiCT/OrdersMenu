package entity;

public class Client {
    private String name;
    private String address;
    private String lastName;
    private boolean statusOrder = false;

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String statusOrder() {
        String statusOrder;
        if (this.statusOrder == true) {
            statusOrder = "treatment order";
        } else {
            statusOrder = "order not treatment";
        }
        return statusOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", lastName='" + lastName + '\'' +
                ", statusOrder=" + statusOrder() +
                '}';
    }
}
