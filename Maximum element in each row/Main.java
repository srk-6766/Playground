#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j;
  std::cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  int highest=a[0][0];
  for(i=0;i<m;i++)
  {
    for(j=1;j<n;j++)
    {
      if(highest<a[i][j])
      {
        highest=a[i][j];
      }
    }
    std::cout<<""<<highest<<"\n";
    highest=a[i+1][0];
  }
}