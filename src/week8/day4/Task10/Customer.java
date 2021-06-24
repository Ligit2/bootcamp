package week8.day4.Task10;

public class Customer {
    private Long ID;
    private String name;
    private Integer tier;

    public Customer(Long ID, String name, Integer tier) {
        this.ID = ID;
        this.name = name;
        this.tier = tier;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
