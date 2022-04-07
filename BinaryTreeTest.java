import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {


    public void testgetHeight_callBinaryNodeMethod(){
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = tree.getHeight_callBinaryNodeMethod();
        int expected = 4;

        // Assert
        assertEquals(result, expected);
    }

    public void testgetHeight_binaryNodeMethod(){
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = getHeight_binaryNodeMethod(tree.getRootNode());
        int expected = 4;

        // Assert
        assertEquals(result, expected);
    }

    public void testgetNumberOfNodes(){
        // Arrange
        BinaryTree<String> dTree = new BinaryTree<>("D");
        BinaryTree<String> eTree = new BinaryTree<>("E");
        BinaryTree<String> gTree = new BinaryTree<>("G");

        BinaryTree<String> fTree = new BinaryTree<>("F", null, gTree);
        BinaryTree<String> bTree = new BinaryTree<>("B", dTree, eTree);
        BinaryTree<String> cTree = new BinaryTree<>("C", fTree, null);

        BinaryTree<String> tree = new BinaryTree<String>();
        tree.setTree("A", bTree, cTree);

        // Act
        int result = getNumberofNodes(tree.getRootNode());
        int expected = 7;

        // Assert
        assertEquals(result, expected);
    }
}