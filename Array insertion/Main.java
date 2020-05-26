#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array\n";
  int n;
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int a[20];
  for(int i=0; i<n; i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  int p,val;
  cin>>p;
  if(p>n) {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  cin>>val;
  for(int i=n; i>=p; i--) {
    a[i] = a[i-1];
  }
  a[p-1] = val;
  cout<<"Array after insertion is\n";
  for(int i=0; i<=n; i++)
    cout<<a[i]<<endl;
  return 0;
}