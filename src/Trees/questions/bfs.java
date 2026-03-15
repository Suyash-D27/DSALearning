package Trees.questions;

import java.util.*;

public class bfs {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

      /// 1st question or BFS algo

      public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> res = new ArrayList();

          if(root==null){
              return new ArrayList<> () ;
          }

          Queue<TreeNode> queue = new LinkedList<>();

          queue.offer(root);

          while(!queue.isEmpty()){
              int levelsize = queue.size();
              List<Integer> current = new ArrayList(levelsize);

              for(int i = 0 ; i<levelsize ; i++){
                  TreeNode currentnode = queue.poll();
                  current.add(currentnode.val);

                  if(currentnode.left!=null){
                      queue.offer(currentnode.left);
                  }
                  if(currentnode.right!=null){
                      queue.offer(currentnode.right);
                  }
              }

              res.add(current);
          }

          return res;
      }


    ///  2nd question
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList();

        if(root==null){
            return new ArrayList<> () ;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            Double sum =0.0;
            int count =0;

            for(int i = 0 ; i<levelsize ; i++){
                TreeNode currentnode = queue.poll();
                sum+=currentnode.val;
                count++;

                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }

            res.add(sum/count);
        }

        return res;
    }
    ///  3rd question

    public TreeNode levelsuccesser (TreeNode root , int key ){
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            TreeNode currentnode = queue.poll();
            if(currentnode.left!=null){
                queue.add(currentnode.left);
            }
            if(currentnode.right!=null){
                queue.add(currentnode.right);
            }

            if(currentnode.val==key){
                break;
            }
        }
        return queue.poll();
    }


    ///  print zigzac ordert

    public List<List<Integer>> zigzacorder (TreeNode root) {
        List<List<Integer>> res = new ArrayList();

        if(root==null){
            return new ArrayList<> () ;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Boolean reverse = false;


        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> current = new ArrayList(levelsize);

            if(!reverse){
                for(int i = 0 ; i<levelsize ; i++){
                    TreeNode currentnode = queue.pollLast();
                    current.add(currentnode.val);

                    if(currentnode.left!=null){
                        queue.offerFirst(currentnode.left);
                    }
                    if(currentnode.right!=null){
                        queue.offerFirst(currentnode.right);
                    }
                }
            }else {
                for(int i = 0 ; i<levelsize ; i++){
                    TreeNode currentnode = queue.pollFirst();
                    current.add(currentnode.val);
                    if(currentnode.right!=null){
                        queue.offerLast(currentnode.right);
                    }
                    if(currentnode.left!=null){
                        queue.offerLast(currentnode.left);
                    }

                }
            }

             reverse = ! reverse;

            res.add(current);
        }

        return res;
    }

    // 4th quesrion

    public TreeNode connect(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode leftmost = root;

        while (leftmost.left!=null){
            TreeNode current = leftmost;
            while (current!=null){
                current.left.next= current.right;
                if(current.next!=null){
                    current.right.next= current.next.left;
                }
                current=current.next;
            }
            leftmost=leftmost.left;
        }
        return root;
    }

    // 5th question tree right side view

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList();

        if(root==null){
            return new ArrayList<> () ;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();

            for(int i = 0 ; i<levelsize ; i++){
                TreeNode currentnode = queue.poll();

                if(levelsize-1==0){
                    res.add(currentnode.val);
                }

                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }

        }

        return res;
    }

    // 6th question

    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findnode(root , x);
        TreeNode yy = findnode(root,y);

        return (level(root,xx,0) == level(root,yy,0) && !isSibling(root,xx,yy));
    }

    private boolean isSibling(,TreeNode node ,TreeNode x , TreeNode y){
        if(node==null){
            return false;
        }

        return (
                (node.right==x && node.left==y) || (node.right==y && node.left==x) || isSibling(node.right, x,y)||isSibling(node.left,x,y)
                );

    }

    private TreeNode findnode(TreeNode node , int key ) {
        if (node == null) {
            return null;
        }
        if (node.val == key) {
            return node.left;
        }
        TreeNode n = findnode(node.left,key);
        if (n!=null) {
            return n;
        }
        return findnode(node.right,key);
    }

    private int level(TreeNode node , TreeNode x , int i){
        if(node==null){
            return 0;
        }

        if(node== x){
            return i;
        }

        int l = level(node.left, x , i++);
        if(l!=0){
            return l;
        }
        return level(node.right, x ,i++);

    }


    ///  7th question

    public boolean isSymmetric(TreeNode root) {
        Deque <TreeNode> qu = new LinkedList<>();
        qu.add(root.right);
        qu.add(root.left);

        while (!qu.isEmpty()) {
            TreeNode l = qu.pollFirst();
            TreeNode r =qu.pollLast();

            if(l!=r){
                return false;
            }
            qu.addFirst(l.left);
            qu.addFirst(l.right);
            qu.add(r.left);
            qu.add(r.right);
        }

        return true;
    }
}





