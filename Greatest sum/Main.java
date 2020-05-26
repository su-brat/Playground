r = int(input())
c = int(input())
mat = []
for i in range(r):
  mat.append(input().split())
sr = [0 for _ in range(r)]
sc = [0 for _ in range(c)]
for i in range(r):
  for j in range(c):
    sr[i]+=int(mat[i][j])
    sc[j]+=int(mat[i][j])
maxr,maxc = 0,0
for i in range(r):
  if sr[maxr]<sr[i]:
    maxr = i
for i in range(c):
  if sc[maxc]<sc[i]:
    maxc = i
print("Sum of rows is {}".format(' '.join(map(str,sr))))
print("Row {} has maximum sum".format(maxr+1))
print("Sum of columns is {}".format(' '.join(map(str,sc))))
print("Column {} has maximum sum".format(maxc+1))