#include<bits/stdc++.h>
using namespace std;

int operation(char oper, int a, int b){
    int res;
    switch (oper){
        case '+':   return a+b;
        case '-':   return a-b;
        case '*':   return a*b;
        case '/':   return a/b;
    }
    return 0;
}

int extractInt(int &i, int l, string s){
    int a = 0;
    while(i<l and s[i]>='0' and s[i]<='9'){
        a = a*10 + (s[i]-'0');
        i++;
    }
    return a;
}
int main()
{
    string s;
    cin>>s;

    int l = s.length();
    int i = 0, curr = 0, res = 0;

    int a = 0, b = 0, negFlag = 0;
    char oper;
    while(i<l){
        if(i==0)    
            oper = '+';
        else        
            oper = s[i++];
        
        if(s[i]=='-'){
            negFlag = 1;
            i++;
        }
curr = extractInt(i,l,s);

        if(negFlag)    
            curr *= -1;
        res = operation(oper,res,curr);
        
        negFlag = 0;
    }

    cout<<res<<endl;
    return 0;
}
