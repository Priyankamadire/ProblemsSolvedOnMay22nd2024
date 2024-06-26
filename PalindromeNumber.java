/*
9. Palindrome Number
Solved
Easy
Topics
Companies
Hint
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?

*/
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        String a = reversestr(y);
        return y.equals(a);
     }
    public String reversestr(String s){
        int i = 0,j=s.length()-1;
        char arr[] = s.toCharArray();
        while(i<j){
            char t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return new String(arr);
    }
}
