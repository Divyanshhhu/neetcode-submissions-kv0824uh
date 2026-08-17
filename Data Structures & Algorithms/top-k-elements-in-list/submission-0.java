class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];   
        for(int num:nums){
                map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

            

        for(int i:map.keySet()){
            pq.offer(i);
        }

        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }

        return arr;
    }
}
