package cs103.project;

import java.util.PriorityQueue;

/**
 * Dati su koren binarnog stabla pretrage i integer k. Vratiti k-tu najmanju
 * vrednost (1-indexed) među svim vrednostima čvorova u stablu.
 */
public class KthSmallestElementBST {

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int kthSmallest(TreeNode root, int k) {

        inorderTraversal(root);

        for (int i = 0; i < k - 1; i++) {

            pq.remove();
        }
        return pq.remove();
    }

    public void inorderTraversal(TreeNode root) {

        if (root != null) {

            pq.add(root.val);
            inorderTraversal(root.left);
            inorderTraversal(root.right);
        }

    }

}
