import random

def search_list(a,x):
	n=len(a)
	result=[]
	for i in range(0,n):
	    if x==a[i]:
	        result.append(i)
	return result

if __name__=='__main__':
     from random import sample
     A=sample(range(100),10)
     print("Random Generation:",A)

a=0
while(a!=-1):
     a=int(input("Choose a number to find the index:  "))
     if a!=-1:
         print(search_list(A,a))