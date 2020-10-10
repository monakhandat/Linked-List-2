class BSTIterator {
    
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        dfs(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        if(!hasNext()) return -1;
        TreeNode node = stack.pop();
        if(node.right != null)
        {
            dfs(node.right);
        }
        return node.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }
    private void dfs(TreeNode root)
    {
        while(root!=null)
        {
            stack.push(root);
            root = root.left;
        }
    }
}

//TC- O(N)
//SC- O(N)

