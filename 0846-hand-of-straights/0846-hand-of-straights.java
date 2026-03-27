class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int a :hand){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        while(map.size()!=0){
           int key = map.firstKey();
           for(int i=0;i<groupSize;i++){
            int nextEle = key+i;
            if(!map.containsKey(nextEle)) return false;
                map.put(nextEle,map.get(nextEle)-1);
                if(map.get(nextEle)==0) map.remove(nextEle);
           }

        }
        return true;
    }
}