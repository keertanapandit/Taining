
#include <stdio.h>

int main()

{

int n, a=1,b=1, i=0;

scanf("%d", &n); 
for(i=0;i<n;i++)
{
  b*=6;
}
if(n%2==0)
{ 
n=n/2;
}

elseif {
  n=n/2 +1;
}

for(i=0;i<n;i++)
{ 
  a*=6;
}

printf("%d/%d",a,b);

return 0;
}
