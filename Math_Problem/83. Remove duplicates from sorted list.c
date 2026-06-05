/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL)
        return head;
    else
    {
        struct ListNode* temp;
        temp=head;
        while(temp->next!=NULL)
        {
            if(temp->val==temp->next->val)
            {
                struct ListNode* t;
                t=temp->next;
                temp->next=temp->next->next;
                free(t);
            }
            else
                temp=temp->next;
        }
        return head;
    }
}
