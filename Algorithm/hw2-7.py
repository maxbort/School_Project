
def binary_search(arr,value):
    low=0
    high=len(arr)-1

    while(low<=high):
        mid=(low+high)//2


        if arr[mid]>value:
            high=mid-1
        elif arr[mid]<value:
	        low=mid+1
        else:
	        return mid
    

          	      
if __name__=='__main__':
    from random import sample
    A=sample(range(100),10)
    print("Random Generation:",A)
    A.sort()
    print("array-sort",A)

a=0
while(a!=-1):
    a=int(input("Choose a number to find the index: "))

    if a!=-1:
        print(binary_search(A,a))

   