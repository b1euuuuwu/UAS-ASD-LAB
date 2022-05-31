package numbertwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		int[] treeData;
        int size = 0;
		treeData = new int[size];
		BinaryTree tree = new BinaryTree();
		try (Scanner sc = new Scanner(System.in)) {
            //hardcode binary tree
            size = sc.nextInt();
            for (int treeDatum : treeData) {
                
            	tree.addNode(new Node(treeDatum));
            }

            //level order
            System.out.print("\nThe level order of traversal in this binary tree is: ");
            tree.showLevelOrder();
        }
	}
}
