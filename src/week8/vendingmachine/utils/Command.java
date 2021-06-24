package week8.vendingmachine.utils;

public class Command {

    private String product;

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    private int index;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Command{" +
                "product='" + product + '\'' +
                ", index=" + index +
                ", count=" + count +
                '}';
    }
}
