package com.boban.trees;

import com.boban.ds.imps.BasicBinaryTree;

public class TreeProblem1 {

	public static void main(String[] args) {
		//Check if the two binary trees are identical or not.

		BasicBinaryTree<Integer> treeOne = new BasicBinaryTree();
		treeOne.add(15);
		treeOne.add(13);
		treeOne.add(16);
		treeOne.add(43);
		treeOne.add(22);
		treeOne.add(55);
		treeOne.add(18);

		BasicBinaryTree<Integer> treeTwo = new BasicBinaryTree();
		treeTwo.add(15);
		treeTwo.add(13);
		treeTwo.add(16);
		treeTwo.add(43);
		treeTwo.add(22);
		treeTwo.add(55);
		treeTwo.add(18);

	}
	
	public static boolean isIdentical() {
		
		
		return false;
		
	}

}
