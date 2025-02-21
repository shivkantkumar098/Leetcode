class FindElements {
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root = root;
    }    
    public boolean find(int target) {
        var cur = root;
        for(int i = Integer.highestOneBit(++target); i > 1 && cur != null;){
            if (((i >>= 1)&target)==0) cur = cur.left;
            else cur = cur.right;
        }
        return cur != null;
    }
}