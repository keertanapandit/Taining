#include<stdio.h>
struct TreeHeight
{
    int feets;
    int inches;
   
};
int TallestTree(struct TreeHeight tree[],int n);
int TallestTree(struct TreeHeight tree[],int n)
{
    int height=0,h;
    for(int i=0;i<n;i++)
    {
        if(tree[i].inches >=0 && tree[i].inches<=1 && tree[i].feets>0)
        {
            h= (12*tree[i].feets)+tree[i].inches;
        }
        if(h>height)
        {
            height=h;
        }
        printf("%d",height);
    }
}
int main()
{
    int i=0;
    int n;
    scanf("%d",&n);
    struct TreeHeight tree[n];
    for(i=0;i<n;i++)
    {
       
        scanf("%d",&tree[i].feets);
        scanf("%d",&tree[i].inches);
         //TallestTree(tree,n);
    }
    TallestTree(tree,n);
   
   
}
