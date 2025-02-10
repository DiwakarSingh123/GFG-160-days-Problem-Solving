class Solution {
    // complete the below function
    static int countNum(int n){
        if(n<10) return 1;
        return 1 + countNum(n/10);
    }
    public static int countDigits(int n) {
        // add your code here
        return countNum(n);
    }
}