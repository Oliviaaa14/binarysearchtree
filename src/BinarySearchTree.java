public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {

        root = null;
    }

    public void add(int value) {

        BinaryTreeNode nodeToAdd = new BinaryTreeNode(value);


        if (root == null) {
            root = nodeToAdd;
            return;
        }

        BinaryTreeNode currentNode = root;
        boolean finished = false;
        while (!finished) {
            if (nodeToAdd.getValue() < currentNode.getValue()) {

                if (currentNode.getLeft() != null) {
                    currentNode = currentNode.getLeft();
                } else {

                    currentNode.setLeft(nodeToAdd);
                    finished = true;
                }
            } else {
                // follow the right branch, if there is one
                if (currentNode.getRight() != null) {
                    currentNode = currentNode.getRight();
                } else {

                    currentNode.setRight(nodeToAdd);
                    finished = true;
                }
            }
        }
    }

    public void display() {

        traverseInOrder(root);
        System.out.println();
    }

    public void traverseInOrder(BinaryTreeNode node) {

        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft());
        }


        System.out.print(node.getValue() + ", ");


        if (node.getRight() != null) {
            traverseInOrder(node.getRight());
        }
    }
}
