#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j,sum[10][10];
  	cin>>r>>c;
  	int a[10][10],b[10][10];
  	for(i=0;i<r;++i)
      for(j=0;j<c;++j)
        cin>>a[i][j];
  for(i = 0; i < r; ++i)
       for(j = 0; j < c; ++j)
       {
           cin >> b[i][j];
       }  
 for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
            sum[i][j] = a[i][j] + b[i][j];

    for(i = 0; i < r; ++i)
        for(j = 0; j < c; ++j)
        {
            cout << sum[i][j] << " ";
         if(j == c - 1)
                cout << endl;
        }

    return 0;
}