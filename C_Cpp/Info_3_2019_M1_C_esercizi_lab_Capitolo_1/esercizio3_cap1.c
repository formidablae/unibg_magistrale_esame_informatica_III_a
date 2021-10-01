// A recursive C program to 
// check whether a given number 
// is palindrome or not 
#include <stdio.h> 
#include <string.h> 
#include <stdbool.h> 


bool isPalindromeNoRec(char str[]) 
{ 
    // Start from leftmost and rightmost corners of str 
    int l = 0; 
    int h = strlen(str) - 1; 
  
    // Keep comparing characters while they are same 
    while (h > l) 
    { 
        if (str[l++] != str[h--]) 
        { 
          
            return false; 
        } 
    } 
    return true;
} 


// A recursive function that 
// check a str[s..e] is 
// palindrome or not. 
bool isPalRecR(char str[], 
			int s, int e) 
{ 
	// If there are more than 
	// two characters, check if 
	// middle substring is also 
	// palindrome or not. 
	if (s < e + 1) 
	return str[s] == str[e] && isPalRecR(str, s + 1, e - 1); 

	return true; 
} 

bool isPalindromeR(char str[]) 
{ 
int n = strlen(str); 

// An empty string is 
// considered as palindrome 
if (n == 0) 
	return true; 

return isPalRecR(str, 0, n - 1); 
} 



// A recursive function that 
// check a str[s..e] is 
// palindrome or not. 
bool isPalRecTR(char str[], 
			int s, int e) 
{ 
	// If there is only one character 
	if (s == e) 
	return true; 

	// If first and last 
	// characters do not match 
	if (str[s] != str[e]) 
	return false; 

	// If there are more than 
	// two characters, check if 
	// middle substring is also 
	// palindrome or not. 
	if (s < e + 1) 
	return isPalRecTR(str, s + 1, e - 1); 

	return true; 
} 

bool isPalindromeTR(char str[]) 
{ 
int n = strlen(str); 

// An empty string is 
// considered as palindrome 
if (n == 0) 
	return true; 

return isPalRecTR(str, 0, n - 1); 
} 


// Driver Code 
int main() 
{ 
	char str[] = "geeg"; 

	if (isPalindromeNoRec(str)) 
	printf("Yes NR"); 
	else
	printf("No NR"); 
	
	if (isPalindromeR(str)) 
	printf("Yes R"); 
	else
	printf("No R"); 
	

	if (isPalindromeTR(str)) 
	printf("Yes TR"); 
	else
	printf("No TR"); 
	
	return 0; 
} 

