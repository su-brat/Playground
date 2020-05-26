r = int(input())
c = int(input())
a = []
for i in range(r):
  a.append(input().split())
s=0
for i in range(1,r-1):
  for j in range(c-2,0,-1):
    s+=int(a[i][j])
for i in range(c):
  s+=int(a[0][i])+int(a[r-1][i])
print('Sum of Zig-Zag pattern is {}'.format(s))