package Trees;

import java.io.PrintStream;

class Node{
        int Id;
        String Name;
        int Grade;

        Node left=null;
        Node right=null;

    public Node(int id, String name, int grade) {
        Id = id;
        Name = name;
        Grade = grade;
    }
}

public class BinaryTree {

    private static Node AddElement(Node root,int id,String name,int grade){
        if(root==null){
            Node temp = new Node(id,name,grade);
            return temp;
        }
            if (id < root.Id) root.left = AddElement(root.left, id, name, grade);
            else if (id > root.Id) root.right = AddElement(root.right, id, name, grade);
            else return root;

        return root;
    }

    private static Node SearchElement(Node root, int Id){
        if(root.Id==Id) return root;
        else if (root.Id>Id) return SearchElement(root.left,Id);
        else return  SearchElement(root.right,Id);
    }

    private static void InOrderSorting(Node root){
        if(root==null) return;
            InOrderSorting(root.left);
            System.out.println(root.Id);
            InOrderSorting(root.right);

    }

    public static void main(String[] args) {
        Node root = null;
        root = AddElement(root,20,"ismail",90);
        root = AddElement(root,25,"ahmet",95);
        root = AddElement(root,24,"ahmet",95);
        root = AddElement(root,5,"mehmet",70);
        root = AddElement(root,22,"mehmet",70);
        root = AddElement(root,1,"ali",80);
        InOrderSorting(root);
    }
}

