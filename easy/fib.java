class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        if(N == 1)
            return 1;
        else
            return fib(N-2)+fib(N-1);
    }
}
