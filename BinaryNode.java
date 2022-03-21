public class BinaryNode<T>{
    private T data;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    public BinaryNode(){
        this(null);
    }

    public BinaryNode(T dataPortion){
        this(dataPortion, null, null);
    }

    public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, BinaryNode<T> newRightChild){
        data = dataPortion;
        leftChild = newLeftChild;
        rightChild = newRightChild;
    }

    public T getData(){
        return data;
    }

    public void setData(T newData){
        data  = newData;
    }

    public BinaryNode<T> getLeftChild(){
        return leftChild;
    }

    public BinaryNode<T> getRightChild(){
        return rightChild;
    }

    public void setLeftChild(BinaryNode<T> newLeftChild)
    {
       leftChild = newLeftChild;
    }

    public void setRightChild(BinaryNode<T> newRightChild)
    {
       rightChild = newRightChild;
    }

    public boolean hasLeftChild(){
        return leftChild != null;
    }

    public boolean hasRightChild(){
        return rightChild != null;
    }

    public boolean isLeaf(){
        return (leftChild == null) && (rightChild == null); 
    }
}
