import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;

        while (curr != null || !st.isEmpty()) {

            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = st.peek();

                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    ans.add(peek.val);
                    lastVisited = st.pop();
                }
            }
        }

        return ans;
    }
}