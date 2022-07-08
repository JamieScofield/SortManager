import java.util.ArrayList;

public class TreeSort implements Sorter{



    class Node{
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    //Creates a new Node and calls it root
    Node root;
    ArrayList<Integer> list;



    //When calling a new tree it sets the root to null to make it a blank tree
    TreeSort(){
        root = null;
    }

    // this iterates over the array and calls the method insert to start making a tree
    public void makeTree(int[] array){
        for(int i=0; i<array.length; i++){
            insert(array[i]);
        }
    }

    // insert calls the method addkey to decide if the key will be stored on the left or the right hand side of the node
    public void insert(int key){
        root = addkey(root, key);
    }
    /*
    takes the current node and checks if it is null if so starts a new tree
    then checks if its less than the current nodes key if it is it stores it in the left if it isnt it stores it in the
    right.
    this then return the root node to then start again under the next iteration.
     */
    public Node addkey(Node root, int key){
        if (root == null){
            root = new Node(key);
        }
        if (key<root.key){
            root.left = addkey(root.left,key);
        }
        else if (key>root.key){
            root.right = addkey(root.right,key);
        }
        return root;
    }
    public void sortingTree(Node root){
        if(root != null){
            sortingTree(root.left);
            System.out.println(root.key);
            list.add(root.key);
            sortingTree(root.right);
        }
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {
        list = new ArrayList<>();
        System.out.println(list);
        makeTree(arrayToSort);
        sortingTree(root);
        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
