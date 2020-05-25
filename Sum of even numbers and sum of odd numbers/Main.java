#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int sum=0,bum=0;
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      sum=sum+a[i];
    else
      bum=bum+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<sum;
  std::cout<<"\nThe sum of the odd numbers in the array is "<<bum;
}