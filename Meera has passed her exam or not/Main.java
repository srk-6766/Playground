#include<iostream>
using namespace std;
int main ()
{
    int arr[10],n,i,x;
    cin >> n;
    for(i = 0; i < n; i++)
        cin >> arr[i];
  		cin>>x;
  for(i=0;i<n;i++)
  	if(arr[i]==x){
      cout<<"She passed her exam";
  	break;
    }
  else if(i==n-1)
    cout<<"She failed";
}    
  