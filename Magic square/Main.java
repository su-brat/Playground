#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n][n],s1=0,s2=0;
  for(int i=0;i<n;i++) {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(int i=0;i<n;i++) {
    s1+=a[i][i];
    s2+=a[i][n-i-1];
  }
  if(s1==s2)
    cout<<"Yes";
  else
    cout<<"No";
}