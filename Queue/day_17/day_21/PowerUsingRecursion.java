class Solution
{
    static int power(int n, int p){
        if(p==0) return 1;
        return n * power(n,p-1);
    }
    static int RecursivePower(int n,int p)
    {
        int num=power(n,p);
        return num;
    }
 
}