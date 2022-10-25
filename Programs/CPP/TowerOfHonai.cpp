#include<bits/stdc++.h>
#include<iostream>
using namespace std;

void towerOfHonoi(int disks, char source, char destination, char aux){
    if(disks == 0){
        return;
    }

    towerOfHonoi(disks -1, source, aux, destination);
    //cout<<"Moving "<<disks<<" disk from "<<source <<" to "<<destination<<endl;
    cout << "Move disk " << disks << " from rod " << source <<
                                " to rod " << destination << endl;
    towerOfHonoi(disks -1, aux, destination, source);
}
int main(){

    // Moving from source 'a' to 'c' using 'b' as an alternate
    int n;
    cin>>n;    

    towerOfHonoi(n, 'a', 'c', 'b');
    return 0;
}