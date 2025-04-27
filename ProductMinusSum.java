class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, product=1;
        while(n>0)
        {
            int lastDigit=n%10;
            sum+=lastDigit;
            product*=lastDigit;
            n=n/10;
        }
        int x;
        x=product-sum;
        return x;
    }
}
