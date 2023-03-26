# 105. Construct Binary Tree from Preorder and Inorder Traversal

Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder
traversal of a binary tree and `inorder` is the inorder traversal of the same tree,
construct and return the binary tree.

### Example 1
![Example1.png](Example1.png)
```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

### Example 2
```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```

## Constraints 
* `1 <= preorder.length <= 3000`
* `inorder.length == preorder.length`
* `-3000 <= preorder[i], inorder[i] <= 3000`
* `preorder` and `inorder` consist of unique values.
* Each value of inorder also appears in preorder.
* preorder is guaranteed to be the preorder traversal of the tree.
* inorder is guaranteed to be the inorder traversal of the tree.

# Solution 
https://www.youtube.com/watch?v=ihj4IQGZ2zc&ab_channel=NeetCode
## Tracing 
```

```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```
startPreorder = 0
endPreorder = 4
startInorder = 0
endInorder = 4

currentRoot = (3)
rootIndexInInorder = 1
leftTreeSize = 1 - 0 = 1
righTreeSize = 4 - 1 = 3 
left buildTree
		startPreorder = 0 + 1 +  = 1
		endPreorder = 0 + 1 = 1 
		startInorder = 0
		endInorder = 1 - 1 = 0
		currentRoot = preorder[startPreorder] = preorder[1] = 9 
		return TreeNode(9)

right BuildTree 
		startPreorder = startPreorder + leftsize + 1 =  0 + 1 + 1=  2
		endPreorder = endPreorder = 4
		startInorder = rootIndexInInorder + 1 = 1 + 1 = 2 
		endInorder =  4
		
		currentRoot = (20) 
		rootIndexInInorder = 3 
		leftTreeSize = 3 - 2 = 1 
		righTreeSize = 4 - 3 = 1
		
		left BuildTree 
					startPreorder = startPreorder  + 1 = 2 + 1 = 3
					endPreorder = startPreorder + leftSize = 2 + 1 = 3
					startInorder = startInorder = 2
					endInorder =   rootIndexInInorder - 1 = 3 - 1 = 2 
					
					currentRoot = TreeNode(15)
					return currentRoot 
	    right BuildTree 
					startPreorder = startPreorder + leftsize + 1 =  2 + 1 + 1=  4
					endPreorder = endPreorder = 4
					startInorder = rootIndexInInorder + 1 = 3 + 1 = 4
					endInorder =  4
					
					currentRoot = TreeNode(7)
					return currentRoot;
```
