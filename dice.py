from itertools import product
from fractions import Fraction
n=int(input())
s=[1,2,3,4,5,6]
count=0
comb = product(s, repeat=n)
for i in list(comb):
    a=''
    for j in i:
        a+=str(j)
        #print(a)
    if(a==a[::-1]):
        count+=1
q=pow(6,n)
print(q)
p=count
print(p)
print(Fraction(p,q))
