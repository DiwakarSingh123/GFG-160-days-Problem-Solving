class Solution {
    static int fibbo(int n){
        if(n<=1) return 1;
        return fibbo(n-1) + fibbo(n-2);
    }
    public int fib(int n) {
        return fibbo(n);
    }
}