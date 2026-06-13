import java.util.*;

class Solution {

    List<Integer> ans =
            new ArrayList<>();

    public List<Integer>
    inorderTraversal(
            TreeNode root
    ) {

        dfs(root);

        return ans;
    }

    void dfs(TreeNode root){

        if(root==null)
            return;

        dfs(root.left);

        ans.add(root.val);

        dfs(root.right);
    }
}