#include<stdio.h>
int main() {
   int arr[50],n,i;
   printf("Enter no of elements:");
   scanf("%d",&n);
   printf("Enter array");
   for(i=0;i<n;i++)
   {
       scanf("%d",&arr[i]);
   }
   SumOddIntegers(arr,n);
   
}
int SumOddIntegers(int arr[],int n)
{     int sum=1,i;
     for(i=1;i<n;i++)
    {
        if(arr[i]%2!=0)
       {
          sum+=arr[i];
     
       }  
    }
 printf("sum is %d",sum);
}
