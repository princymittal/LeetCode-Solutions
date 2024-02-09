class Solution {
    public int mySqrt(int x) {
        long l=0,h=x,ans=-1;
        while(l<=h){
            long mid=l + (h - l) / 2;;
            long mysq=mid*mid;
            if(mysq==x) return (int) mid;
            else if(mysq>x) 
                h=mid-1;
            else{
                l=mid+1;
                ans=mid;}
        }
        return  (int)ans;
        
    }
}