#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[10][10];
  for(i=0;i<r;++i)
    for(j=0;j<c;++j)
      cin>>a[i][j];
  for(i=0;i<c;++i){
    for(j=0;j<r;++j){
      cout<<a[j][i]<<" ";
      if(j == r - 1)
                cout << endl;
    }
  }
  
}