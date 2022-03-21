import java.util.Iterator;

public class BinaryTree<T> implements BinaryTreeInterface<T>{

    BinaryNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(T rootData){
        root = new BinaryNode<>(rootData);
    }

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        privateSetTree(rootData, leftTree, rightTree);
    }

    private void privateSetTree(T rootData,BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        root = new BinaryNode<T>(rootData);

        if((leftTree != null) && !leftTree.isEmpty())
            root.setLeftChild(leftTree.root);

        if((rightTree != null) && !rightTree.isEmpty()){
            if(rightTree != leftTree)
                root.setRightChild(rightTree.root);
            else
                root.setRightChild(rightTree.root.copy());
        }

        if ((leftTree != null) && (leftTree != this))
            leftTree.clear();

        if ((rightTree != null) && (rightTree != this))
            rightTree.clear();
    }


    
    @Override
    public T getRootData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getNumberOfNodes() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setTree(T rootData) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public Iterator<T> getPreorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Iterator<T> getPostorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Iterator<T> getInorderIterator() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Iterator<T> getLevelOrderIterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
