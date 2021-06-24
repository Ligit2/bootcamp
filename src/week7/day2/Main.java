package week7.day2;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.add(4);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(100);
        myBinarySearchTree.add(111);
        myBinarySearchTree.add(90);
        myBinarySearchTree.add(85);
        myBinarySearchTree.add(120);
        myBinarySearchTree.add(130);
        myBinarySearchTree.add(91);
        myBinarySearchTree.add(92);
        myBinarySearchTree.add(93);
        myBinarySearchTree.add(94);
       /* myBinarySearchTree.postOrder();
        System.out.println();
       myBinarySearchTree.inOrder();*/
       // System.out.println(myBinarySearchTree.findMin());
        //myBinarySearchTree.levelOrder();
       // System.out.println(myBinarySearchTree.getReplace());
        System.out.println(myBinarySearchTree.height());
    }
}
