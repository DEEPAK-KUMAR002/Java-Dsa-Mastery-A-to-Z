package ch21_Binary_tree;

public class tut02_Height_of_tree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount+rightCount+1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum =sum(root.left);
        int rightsum =sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int diameter(Node root){//0(n^n)
        if(root == null){
            return 0;
        }
        int Leftdiameter = diameter(root.left);
        int LeftHeight = height(root.left);
        int Rightdiameter = diameter(root.right);
        int RightHeight = height(root.right);
        int selfdiameter = LeftHeight+RightHeight+1;
        return  Math.max(selfdiameter,Math.max(Leftdiameter,RightHeight));
    }
    //(approach 2) Diamter of a tree
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info Diameter(Node root){//0(n)
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String args[]){
        /*
                 1
               /  \
             2     3
            / \   / \
           4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println("Approach 1 is "+diameter(root));
        System.out.println("Approach 2 is "+Diameter(root).diam);
        System.out.println("Approach 2 height is "+Diameter(root).ht);
    }
}
