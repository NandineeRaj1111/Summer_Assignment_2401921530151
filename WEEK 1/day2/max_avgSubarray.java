package WEEK 1.day2;

class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int maxsum=sum;
        for(int i=k;i<a.length;i++){//sliding window
            sum+=a[i]-a[i-k];
            maxsum=Math.max(maxsum,sum);
         }
        return (double) maxsum/k;

    }
}