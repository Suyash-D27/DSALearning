package Trees.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SDquestion279 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public class Codec {

        // Encodes a tree to a single string.
//        public String serialize(TreeNode root) {
//           StringBuilder sb = new StringBuilder();
//            helper(root , sb);
//            return sb.toString();
//        }
//
//        public void helper(TreeNode node , StringBuilder sb){
//            if (node == null) {
//                sb.append("null,");
//                return;
//            }
//            sb.append(node.val).append(",");
//            helper(node.left, sb);
//            helper(node.right, sb);
//        }

        public List<String> serialize(TreeNode root){
            List<String> res = new ArrayList<>();
            helper(root , res);
            return res;
        }
        public void helper(TreeNode node , List<String> res){
            if(node==null){
                res.add("null");
                return ;
            }
            res.add(String.valueOf(node.val));
            helper(node.left , res);
            helper(node.right , res);
        }
        // Decodes your encoded data to tree.
        public TreeNode deserialize(List<String> data) {
            Collections.reverse(data);
            TreeNode  node = helper2(data);
            return node;
        }

        public TreeNode helper2 ( List<String> s){
            String st = s.remove(s.size()-1);

            if(st.charAt(0)=='n'){
                return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(st));

            node.left = helper2(s);
            node.right = helper2(s);

            return node;
        }


    }
}
