#include<stdio.h>
#include<stdlib.h>
#include<string>
#include<iostream>
#include<bits/stdc++.h>


using namespace std;

string reverseString (string word){
	int start = 0;
	int end{word.length() - 1};
	while(start<end){
		word[start] ^= word[end];
		word[end] ^= word[start];
		word[start] ^= word[end];
		++start;
		--end;		
	}
	return word;
}

int main()
{
    string word;

    cout << "Type a word: \n";

    cin >> word;

    cout << "\n Reversed word: "<<reverseString(word)<< "\n";

    system("pause");

    return 0;
}
