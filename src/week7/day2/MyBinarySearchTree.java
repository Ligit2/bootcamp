package week7.day2;

import java.util.ArrayDeque;
import java.util.Stack;


public class MyBinarySearchTree {
    private Node root;

    public void add(Integer value) {
        root = addRecursion(root, value);
    }

    public boolean search(Integer value) {
        return findNode(root, value) != null;
    }

    private Node addRecursion(Node current, Integer value) {
        if (current == null) {
            return new Node(value);
        }
        if (value > current.value) {
            current.right = addRecursion(current.right, value);
        }
        if (value < current.value) {
            current.left = addRecursion(current.left, value);
        }
        return current;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value);
            inOrder(current.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node current) {
        if (current != null) {
            preOrder(current.left);
            preOrder(current.right);
            System.out.print(current.value);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node current) {
        if (current != null) {
            System.out.print(current.value);
            postOrder(current.left);
            postOrder(current.right);
        }
    }

    public Node findMin() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public Node findMax() {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node current) {
        ArrayDeque<Node> list = new ArrayDeque<>();
        list.push(current);
        while (!list.isEmpty()) {
            Node node = list.poll();
            System.out.println(node.value);
            if (node.left != null)
                list.push(node.left);
            if (node.right != null) {
                list.push(node.right);
            }
        }
    }

    public void inOrderIterative() {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();//current step before is null
            System.out.println(current.value);
            current = current.right;
        }
    }

    public void preIterative() {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(current);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.value);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node current) {
        if (current == null) {
            return -1;
        } else
            return max(height(current.left) + 1, height(current.right) + 1);
    }

    private int max(int i, int i1) {
        if (i1 >= i) return i1;
        else return i;
    }

    public int f() {
        return findHeight(root);
    }

    int findHeight(Node aNode) {
        if (aNode == null) {
            return -1;
        }
        int left = findHeight(aNode.left);
        int right = findHeight(aNode.right);

        if (left > right) {
            return left + 1;
        } else {
            return right + 1;
        }
    }

    public Node minElement(Node current) {
        if (current.left == null) return current;
        else
            return minElement(current.left);
    }

    private Node findNode(Node current, Integer value) {
        if (current == null)
            return null;
        if (current.value.equals(value))
            return current;
        if (current.value > value) {
            return findNode(current.left, value);
        }
        return findNode(current.right, value);
    }

    public Node delete(Node root, Integer value) {
        if (root == null) {
            return null;
        }
        if (root.value > value) {
            root.left = delete(root.left, value);
        } else if (root.value < value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                Node temp = root;
                Node min = minElement(temp.right);
                root.value = min.value;
                root.right = delete(root, min.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }
}
