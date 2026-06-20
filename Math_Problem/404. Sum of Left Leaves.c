/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int sumOfLeftLeaves(struct TreeNode* root) {
    if(root==NULL)
        return 0;
    else
    {
        struct TreeNode* par;
        par=root;
        if(par->left!=NULL)
        {
            if(par->left->left==NULL && par->left->right==NULL)
                return par->left->val + sumOfLeftLeaves(par->right);
            else
            {
                return sumOfLeftLeaves(par->right) + sumOfLeftLeaves(par->left);
            }
        }
        return sumOfLeftLeaves(par->left)+sumOfLeftLeaves(par->right);
    }
}
