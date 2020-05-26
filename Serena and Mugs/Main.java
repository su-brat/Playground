#include<iostream>
using namespace std;
int main()
{
  int n,capacity;
  cin>>n>>capacity;
  int c,sum=0;
  for(int i=0;i<n;i++) {
    cin>>c;
    sum+=c;
  }
  if(sum<=capacity)
    cout<<"YES";
  else
    cout<<"NO";
}