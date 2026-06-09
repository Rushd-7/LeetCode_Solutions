/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int minDepth(struct TreeNode* root) {
    if(root==NULL)
        return 0;
    else if(root->left==NULL && root->right==NULL)
        return 1;
    else if(root->left==NULL)
        return 1+minDepth(root->right);
    else if(root->right==NULL)
        return 1+minDepth(root->left);
    else
    {
        int l=minDepth(root->left);
        int r=minDepth(root->right);
        return 1+(l<r?l:r);
    }
}
