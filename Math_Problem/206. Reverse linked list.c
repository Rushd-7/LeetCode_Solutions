/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) 
{
    struct ListNode *x,*curr, *prev;
    if(head==NULL)
        return head;
    else
    {
        prev=NULL;
        curr=head;
        while(curr!=NULL)
        {
            x=curr->next;
            curr->next=prev;
            prev=curr;
            curr=x;
        }
        head=prev;
        return head;
    }
}
