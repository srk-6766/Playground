#include<iostream>
using namespace std;
int main(){
 int n,i,count=0,peak=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      count=count+1;
    else
      peak = peak+1;
  }
  cout<<peak<<endl;
  cout<<count;
  return 0;
}