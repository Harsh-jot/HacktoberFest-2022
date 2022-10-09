// Product of 2 Matrix
#include <cstdio>
#include <iostream>

using namespace std;

int main() 
{
    float a[10][10], b[10][10], c[10][10];
    int m,n,p,q;
    cout<<"Order of the First Matrix";
    cout<<"\nRows= "; cin>>m;
    cout<<"\nColumns= "; cin>>n;
    cout<<"\nOrder of the Second Matrix";
    cout<<"\nRows= "; cin>>p;
    cout<<"\nColumns= "; cin>>q;
    if(n!=p)
    {
        cout<<"\nProduct not possible";
        cout<<"\nTry Again...!";
        exit(0);
    }
    cout<<"Read the First Matrix ";
    int i,j,k;
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>a[i][j];
        }
    }
    cout<<"Read the Second Matrix ";
    for(i=0; i<p; i++)
    {
        for(j=0; j<q; j++)
        {
            cin>>b[i][j];
        }
    }
    for(i=0;i<m;i++)
    {
        for(k=0;k<q;k++)
        {
            c[i][k]=0;
            for(j=0;j<n;j++)
            {
                c[i][k]+= a[i][j]*b[j][k];
            }
        }
    }
    cout<<"Product is ";
    for(i=0; i<m; i++)
    {
        for(j=0; j<q; j++)
        {
            cout<<c[i][j]<<"\n";
        }
        cout<<endl;
    }
    return 0;
}
