package Trees.questions;

import java.util.Arrays;
import java.util.List;

public class DFS {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        bfs.TreeNode next;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    /// Question 1 diameter
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        helperHeight(root);
        return diameter;
    }

    public int helperHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int lefthafe = helperHeight(node.left);
        int righthafe = helperHeight(node.right);

        int dia = lefthafe+righthafe+1;
        diameter=Math.max(dia,diameter);

        return Math.max(lefthafe, righthafe)+1;
    }


    ///  question 2

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode left =invertTree(root.left);
        TreeNode right =invertTree(root.right);

        root.right = left;
        root.left =right;

        return root;
    }

    ///  question 4 peroder question and this is other apporch to solve it

    public void flatten(TreeNode root){
        TreeNode current = root;

        while(current!=null){
            if(current.right!=null){
                TreeNode temp = current.left;
                while (temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;

                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }

    /// question 5 validate B - tree

    public boolean isValidBST(TreeNode root) {
        return helper(root, null , null);
    }

    public boolean helper(TreeNode node , Integer low , Integer high){
        if(node == null){
            return true;
        }

        if(low!=null && low>=node.val){
            return false;
        }
        if(high!=null && high<=node.val){
            return false;
        }

        boolean lefttree = helper(node.left,low,node.val);
        boolean righttree = helper(node.right, node.val, high);

        return lefttree && righttree;
    }

    ///  question 6 Lowest common ancestor

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root  == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left , p ,q);
        TreeNode right = lowestCommonAncestor(root.right ,p ,q);

        if(left !=null && right!=null){
            return root;
        }

        if(left == null ){
            return right;
        }else {
            return left;
        }

    }

    /// question 7 kth smallest elemnet (inorder appporch )

    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        TreeNode ans = kth(root, k);
        return ans != null ? ans.val : -1;
    }

    public TreeNode kth(TreeNode node, int k) {
        if (node == null) return null;

        TreeNode left = kth(node.left, k);
        if (left != null) return left;

        count++;
        if (count == k) return node;

        return kth(node.right, k);
    }

    ///  question 8

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int r = preorder[0];
        int index =0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i]==r){
                index =i;
                break;
            }
        }

        TreeNode node = new TreeNode(r);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1 , index-1),Arrays.copyOfRange(inorder, 0 , index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1 , preorder.length),Arrays.copyOfRange(inorder, index+1 , inorder.length));
        return node;
    }

    /// 9th question
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public int helper(TreeNode node , int sum ){
        if(node==null){
            return 0;
        }

        sum= sum*10+(node.val);
        if(node.right==null && node.left==null){
            return sum;
        }

        return helper(node.right, sum )+helper(node.left , sum );

    }

    ///  10 the question post order tervesal
    int maxsum =Integer.MAX_VALUE;
    public int maxPathSum(TreeNode root) {
        int ans =helper(root);
        return  ans;
    }

    int helper(TreeNode node){
        if(node == null ){
            return 0;
        }

        int left = helper(node.left );
        int right = helper(node.right);

        left = Math.max(0,left);
        right=Math.max(0,right);

        int sum = node.val+left+right;

        maxsum=Math.max(sum,maxsum);

        return maxsum;
    }

    // is given path is valid or not


    public boolean validPath(TreeNode node , int[] arr){
        return helper(node , arr , 0);
    }

    public boolean helper(TreeNode node , int[] arr , int index){
        if(node==null){
            return false;
        }

        if(index>arr.length-1 || arr[index!= node.val]){
            return false;
        }
        if(node.left==null&& node.right==null){
            return true;
        }

        helper(node.left, arr,index+1);
        helper(node.left,arr,index+1);

        return helper(node.left, arr,index+1)||helper(node.left,arr,index+1);
    }

}
