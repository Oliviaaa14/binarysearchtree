import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Binary Search Tree");
        Random random = new Random();
        final int max = 110;
        final int min = 0;
        final int count = 10;
        BinarySearchTree bst = new BinarySearchTree();
        for (int i=0; i<count; i++) {
            int number = random.nextInt(max - min) + min;
            bst.add(number);
        }
        bst.display();
    }}

