package mocks;


public class DsaTM {

    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    Node root;

    public void insert(int value){
        root = insertRec(root, value);
    }

    public Node insertRec(Node root, int value){
        if(root == null){
            root=new Node(value);
            return root;
        }else if(value < root.data){
            root.left = insertRec(root.left, value);
        }else{
            root.right = insertRec(root.right, value);
        }
        return root;

    }
    public void display(){
       displayRec(root);
    }


    private void displayRec(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        displayRec(root.left);
        displayRec(root.right);

    }
    public void heightTree(){
        System.out.println("height" + heightTreeRec(root));
    }
    
    public int heightTreeRec(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = heightTreeRec(root.left) + 1;
        int rightCount = heightTreeRec(root.right) +1;

        return Math.max(leftCount, rightCount);

    }

    public static void main(String[] args) {
        DsaTM obj =new DsaTM();
        obj.insert(10);
        obj.insert(12);
        obj.insert(15);
        obj.insert(17);
        obj.insert(16);

        // obj.display();

        obj.heightTree();
    
    }
    
}
