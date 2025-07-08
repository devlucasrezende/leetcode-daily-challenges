package week4;



public class SymmetricTree {

     public class TreeNode {
          int val;
          TreeNode right;
          TreeNode left;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftCurrent, TreeNode rightCurrent) {
         if (leftCurrent == null && rightCurrent == null) {
             return true;
         }

         if (leftCurrent == null || rightCurrent == null || leftCurrent.val != rightCurrent.val) {
             return false;
         }

         return isMirror(leftCurrent.left, rightCurrent.right) && isMirror(leftCurrent.right, rightCurrent.left);
    }



}
