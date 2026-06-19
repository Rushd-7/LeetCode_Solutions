/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeNodes(struct ListNode* head) {
    struct ListNode* temp;
    temp=head;
    struct ListNode* res;
    res=NULL;
    struct ListNode* final;
    int sum,cnt=0;
    while(temp!=NULL)
    {
        if(temp->val==0)
        {
            cnt++;
            struct ListNode *ele;
            ele=(struct ListNode*)malloc(sizeof(struct ListNode));
            ele->val=sum;
            ele->next=NULL;
            if(cnt==1)
            {
                sum=0;
                temp=temp->next;
                continue;
            }
            if(cnt==2)
            {
                res=ele;
                res->next=NULL;
                final=res;
            }
            else
            {
                res->next=ele;
                res=res->next;
                res->next=NULL;
            }
            sum=0;            
        }
        else
            sum+=temp->val;
        temp=temp->next;
    }
    return final;
}
