package week7.day2;

public class Node {
    Integer value;
    Node left;
    Node right;

    public Node(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
