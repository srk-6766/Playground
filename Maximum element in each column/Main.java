#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c,r,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  int highest=a[0][0];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      if(highest<a[j][i])
        highest=a[j][i];
    }
    
    std::cout<<""<<highest<<"\n";
    highest=a[0][i+1];
  }
  
    
}