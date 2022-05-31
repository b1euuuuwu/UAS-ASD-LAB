package numbertwo;

public class BinaryTree {
    Node root;

	BinaryTree() {
		root = null;
	}

	public void addNode (Node node) {
		if (root == null) {
			root = node;
		}
		else {
			insertNode (root, node);
		}
	}

	public void insertNode (Node parent, Node node) {
		if(parent.key > node.key) {
			if(parent.left == null) {
				parent.left = node;
			}
			else {
				insertNode(parent.left, node);
			}
		}
		else {
			if(parent.right == null) {
				parent.right = node;
			}
			else {
				insertNode(parent.right, node);
			}
		}
	}

	//method to calculate sum of all node values using recursion
	public int sumOfNodes(Node root) {
		if (root == null)
			return 0;
		return (root.key + sumOfNodes(root.left) + sumOfNodes(root.right));
	}

	//method to calculate tree height
	public int heightOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(heightOfTree(root.left),heightOfTree(root.right));
	}

	//method to show level order
	public void showLevelOrder() {
		int h = heightOfTree(root);
		for (int i = 1; i <= h; i++) {
			printCurrentLevel(root, i);
		}

	}

	private void printCurrentLevel(Node root, int level) {
		if (root == null)
			return;
		if (level ==1)
			System.out.print(root.key + " ");
		else if(level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}
}
