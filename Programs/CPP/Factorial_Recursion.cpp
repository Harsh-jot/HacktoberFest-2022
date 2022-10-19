#include <iostream>
using namespace std;

int fact(int n)
{
  if(n==0 || n==1)
  {
    return 1;
  }

  return n*fact(n-1);
}

int main()
{
  int n;
  cout<<"Enter the number :"<<endl;
  cin>>n;

  int ans=fact(n);
  cout<<"The factorial of the givern number is: "<<ans<<endl;


  //Using loops

  int fact1=1;
  if(n==0)
  {
    cout<<"Factorial of the givern number is: "<<fact<<endl;
  }
  else
  {
    for(int i=n;i>0;i--)
    {
      fact1*=i;
    }
    cout<<"The factorial of yhe given number using loops is: "<<fact1<<endl;
  }


  return 0;
}
