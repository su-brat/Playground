n,m = list(map(int,input().split()))
a = list(map(int,input().split()))
sum,bus = 0,0
while len(a)!=0:
  i = 0
  sum = 0
  while i<n:
    if sum+a[i]<=m:
      sum+=a[i]
      a.pop(i)
      n-=1
    i+=1
  bus+=1
print(bus)