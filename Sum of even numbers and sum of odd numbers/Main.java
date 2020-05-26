n = int(input())
s_even,s_odd=0,0
for _ in range(n):
  i = int(input())
  if abs(i)%2==0:
    s_even+=i
  else:
    s_odd+=i
print("The sum of the even numbers in the array is {}".format(s_even))
print("The sum of the odd numbers in the array is {}".format(s_odd))