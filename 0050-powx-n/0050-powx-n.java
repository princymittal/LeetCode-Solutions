class Solution {
    public double myPow(double x, int n) {
        double r=1;
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        while(n!=0){
            if(n%2!=0){
                r=r*x;
            }
            x=x*x;
            n=n/2;
        }
        return r;
    }
}