 class Treenode {
    int value;
    Treenode left,right;
    Treenode(int value){
        this.value =value;
        left=right=null;
    
    }
} 


public class treetraverseipp{
    public void preorder (Treenode node){
        if(node ==null)
        return;
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder (Treenode node){
        if(node ==null)
        return;
      
        inorder(node.left);
        System.out.print(node.value+" ");
        inorder(node.right);
    }

    public void postorder (Treenode node){
        if(node ==null)
        return;
       
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");
    }

    public static void main(String[] args) {
        Treenode root =new Treenode(1);
        root.left=new Treenode(2);
        root.right=new Treenode(3);
        root.left.left=new Treenode(4);
        root.left.right=new Treenode(5);
        root.right.left=new Treenode(6);
        root.right.right=new Treenode(7);
        root.left.right.left=new Treenode(8);
        root.right.right.left=new Treenode(9);
        root.right.right.right=new Treenode(10);
        
        treetraverseipp tree= new treetraverseipp();
        System.err.println("preorder traversal:");
        tree.preorder(root);
        System.err.println("\ninorder traversal:");
        tree.inorder(root);
        System.err.println("\npostorder traversal:");
        tree.postorder(root);
}
}