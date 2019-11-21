package com.boban.ds.imps;

public class BasicBinaryTree<X extends Comparable<X>> {

	private Node root;
	private int size;

	public BasicBinaryTree() {
		this.root = null;
	}

	public int size() {
		return size;
	}

	//############Insertion############
	public void add(X item) {
		Node node = new Node(item);

		if(root == null) {
			this.root = node;
			System.out.println("Setting root node: "+ node.getItem());
			size++;
		} else {
			insert(this.root, node);
		}
	}

	public void insert(Node parent, Node child) {
		//If the child is less than parent then it will be left node
		if(child.getItem().compareTo(parent.getItem()) < 0) {
			//Now we will check if this position is empty or not
			if(parent.getLeft() == null) {
				parent.setLeft(child);
				child.setParent(parent);
				size++;
			} else {
				insert(parent.getLeft(), child);
			}

			//Now we will check if the child is greater than parent, then it will go to right
			if(child.getItem().compareTo(parent.getItem()) > 0) {
				//check if the right position is empty for us to insert new value
				if(parent.getRight() == null) {
					parent.setRight(child);
					child.setParent(parent);
					size++;
				}
				//otherwise we go further down the tree
				else {
					insert(parent.getRight(), child);
				}
			}
		}

	}

	
	//############Retrieval############
	public boolean contains(X item) {
		Node currentNode = getNode(item);
		if(null != currentNode)
			return true;
		else
			return false;

	}

	//This method will find the node non-recursively
	private Node getNode(X item) {
		Node currentNode = this.root;

		//each time we iterate over the loop we go a step down in the tree
		while(currentNode != null) {
			int value = item.compareTo(currentNode.getItem());

			if(value == 0) {
				return currentNode;
			} else if(value < 0) {
				currentNode = currentNode.getLeft();
			} else {
				currentNode = currentNode.getRight();
			}
		}
		return currentNode;
	}

	//This method will find the node recursively
	private Node getNodeRecurrsively(Node node, X item) {

		//check if this node's value matches with our search item
		if(item.compareTo(node.getItem()) == 0) {
			return node;
		}
		//If not equal than we will check if the search item's value is less than this node's value
		else if(item.compareTo(node.getItem()) < 0) {
			if(node.getLeft() != null) return getNodeRecurrsively(node.getLeft(), item);
			//else System.out.println("This item is not present in the tree: "+ item);
		} 
		//This means that the item is greater than the node's value
		else {
			if(node.getRight() != null) return getNodeRecurrsively(node.getRight(), item);
			//else System.out.println("This item is not present in the tree: "+ item);
		}

		return null;
	}

	//############Deletion############
	
	public boolean delete(X item) {
		
		return true;
	}
	
	private class Node{

		private Node left;
		private Node right;
		private Node parent;
		private X item;

		public Node(X item) {
			this.item = item;
			left = right = parent = null;
		}

		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
		public X getItem() {
			return item;
		}
		public void setItem(X item) {
			this.item = item;
		}


	}
}
