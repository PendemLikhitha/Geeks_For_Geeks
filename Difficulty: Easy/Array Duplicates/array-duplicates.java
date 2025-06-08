class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int j:arr){
            h.put(j,h.getOrDefault(j,0)+1);
            if(h.get(j)>1){
                l.add(j);
            }
        }
        return l;
    }
}