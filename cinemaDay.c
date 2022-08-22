
#include <stdio.h>

int main() {
   int d,m,y,ns;
   printf("Enter day,month,year");
   scanf("%d %d %d",&d,&m,&y);
   printf("Enter ns");
   scanf("%d",&ns);
   
   if((d+m+y)%12==0)
   {
       if(ns>50 && ns<100)
       {
           printf("Cinema Day");
   
       }
   }
   else
  printf("Not cinema day");
 
   return 0;
}
