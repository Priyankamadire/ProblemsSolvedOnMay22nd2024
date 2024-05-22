/*
LCM And GCD
BasicAccuracy: 37.02%Submissions: 103K+Points: 1
Get Internship at GfG by submitting your Entries in: Data Science Blogathon

banner
Given two numbers A and B. The task is to find out their LCM and GCD.

 

Example 1:

Input:
A = 5 , B = 10
Output:
10 5
Explanation:
LCM of 5 and 10 is 10, while
thier GCD is 5.
Example 2:

Input:
A = 14 , B = 8
Output:
56 2
Explanation:
LCM of 14 and 8 is 56, while
thier GCD is 2.
Your Task:
You don't need to read input or print anything. Your task is to complete the function lcmAndGcd() which takes an Integer N as input and returns a List of two Integers, the required LCM and GCD.

Expected Time Complexity: O(log(min(A, B))
Expected Auxiliary Space: O(1)

Constraints:
1 <= A,B <= 109
*/

class LcmGcd {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long tA=A;
        long tB=B;
        while(B!=0){
            long r =  B;
            B=A%B;
            A=r;
        }
        long gcd = A;
        long lcm = (tA*tB)/gcd;
        Long ans[] = new Long[2];
        ans[0]=lcm;
        ans[1]=gcd;
        return ans;
    }
}; 
     
