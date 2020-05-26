#include<iostream>
using namespace std;
int check(int n,int *a) {
  bool e=false,o=false;
  for(int i=0; i<n && ((!e) || (!o)); i++) {
    if(a[i]%2==0)
      e=true;
    else
      o=true;
  }
  if(e && o)
  	return 3;
  else if(e && (!o))
    return 1;
  else
    return 2;
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int a[n];
  for(int i=0; i<n; i++)
    cin>>a[i];
  if(check(n,a)==1)
    cout<<"The array is Even";
  else if(check(n,a)==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}