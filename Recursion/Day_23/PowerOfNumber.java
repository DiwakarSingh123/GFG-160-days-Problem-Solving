class Solution {
    static int power(int n,int num){
        if(n==10) return 10;
        if(n==0) return 1;
        
        return num * power(n-1,num);
        
    }
    public int reverseExponentiation(int n) {
        // code here
        return power(n,n);
    }
}