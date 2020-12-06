package entity;

public class Taxist {
    private String name;
    private String nameAuto;
    private int experience;
    private boolean statusOrder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(boolean statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String statusOrder() {
        String statusOrder;
        if (this.statusOrder == true) {
            statusOrder = "work";
        } else {
            statusOrder = "not work";
        }
        return statusOrder;
    }

    @Override
    public String toString() {
        return "Taxist{" +
                "name='" + name + '\'' +
                ", nameAuto='" + nameAuto + '\'' +
                ", experience=" + experience +
                ", statusOrder=" + statusOrder() +
                '}';
    }
}
