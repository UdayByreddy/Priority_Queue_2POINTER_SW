class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counter  = new int[26];
        int max=0;
        int maxCount=0;
        for(char task: tasks){
            counter[task-'A']++;
            if(max==counter[task-'A']){
                maxCount++;
            }
            else if(max<counter[task-'A']){
                max=counter[task-'A'];
                maxCount=1;
            }
        }
        int ans = (max-1)*(n+1)+maxCount;
        int s = tasks.length;
        return ans>s?ans:s;
        
    }
}