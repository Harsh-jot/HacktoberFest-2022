#include<bits/stdc++.h>
#include<iostream>
using namespace std;

void printVector(vector<vector<int>> vt){
    for(int i = 0; i < vt.size(); i++){
        cout<<"[ ";
        for(int j = 0; j < vt[i].size(); j++)
            cout<<vt[i][j]<<" ";
        cout<<"]";
        if(i!= vt.size() - 1) cout<<endl;
    }
}
void generatePermutations(int ind, vector<int> &arr, vector<vector<int>> &permutations){
    if(ind == arr.size()){
        permutations.push_back(arr);
        return;
    }

    for(int a = ind ; a < arr.size(); a++){
        swap(arr[a], arr[ind]);
        generatePermutations(ind + 1, arr, permutations);
        swap(arr[a], arr[ind]);
    }
}
int main(){
    vector<int> arr = {1,2,3};
    vector<vector<int>> permutations;
    generatePermutations(0,arr,permutations);
    printVector(permutations);
    return 0;
}