/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* searchBST(struct TreeNode* root, int val) {
    typedef struct TreeNode Node;
    Node* curr;
    curr=root;
    bool fl=false;
    while(curr!=NULL)
    {
        if(curr->val>val)
            curr=curr->left;
        else if(curr->val<val)
            curr=curr->right;
        else
        {
            fl=true;
            break;
        }
    }
    if(fl==true)
        return curr;
    else 
        return NULL;
}
