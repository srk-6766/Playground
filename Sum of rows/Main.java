#include<iostream>
using namespace std;


int main()
{
  //Type your code here.
  int c,r,i,j,sum=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
   {
     sum=sum+a[i][j];
   }
    std::cout<<""<<sum<<"\n";
    sum=0;
  }
  return 0;
}

  