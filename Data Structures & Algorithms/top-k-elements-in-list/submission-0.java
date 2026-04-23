class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>freqMap= new HashMap<>();
        for(int num:nums){
            if(freqMap.containsKey(num)){
                freqMap.put(num,freqMap.get(num)+1);
            }
            else{
                freqMap.put(num,1);
            }
        }
        HashMap<Integer,List<Integer>>reverseMap= new HashMap<>();
        int maxFreq=0;
        for(Map.Entry<Integer,Integer>entry:freqMap.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(!reverseMap.containsKey(freq)){
                reverseMap.put(freq,new ArrayList<>());
            }
            reverseMap.get(freq).add(num);
            if(freq>maxFreq){
                maxFreq=freq;
            }
        }
        int [] result=new int[k];
        int index=0;
        for(int i=maxFreq;i>0 && index<k;i--){
            if(reverseMap.containsKey(i)){
                List<Integer>list=reverseMap.get(i);
                for(int num:list){
                    result[index++]=num;
                    if(index==k) break;
                }
            }
        }
        return result;
    }
}
