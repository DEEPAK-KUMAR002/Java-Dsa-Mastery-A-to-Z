package ch21_Binary_tree;

import java.util.ArrayList;

public class tut06_Lowest_common_Ancestor {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);
        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node Lca(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //Last Common Ancestor
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        //Last equal Node -> (i-1)th
        Node Lca = path1.get(i-1);
        return Lca;
    }
    public static Node Lca2(Node root,int n1,int n2){

        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = Lca2(root.left,n1,n2);
        Node rightLca = Lca2(root.right,n1,n2);
       //LeftLca = val rightlca = null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }
    public static void main(String[] args) {
        /*
               1
            /    \
           2      3
         /  \    /   \
        4    5  6     7
       */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new  Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new  Node(6);
        root.right.right = new  Node(7);
        int n1 = 4,n2 = 5;
        System.out.println(Lca(root,n1,n2).data);
        System.out.println(Lca2(root,n1,n2).data);
    }
}
