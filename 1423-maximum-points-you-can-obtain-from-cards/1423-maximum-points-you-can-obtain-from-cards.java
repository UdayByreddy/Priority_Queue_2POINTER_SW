class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max =0;
        for(int i=0;i<k;i++){
            max+=cardPoints[i];
        }
        int n = cardPoints.length;
        int sum=max;
        for(int i=0;i<k;i++){
            max-=cardPoints[k-1-i];
            max+=cardPoints[n-1-i];
            sum = Math.max(sum,max);
        }
        return sum;

    }
}