class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ls = new ArrayList<>();
        comb(0, candidates, target,ls, new ArrayList<>());
        return ls;
    }

    private void comb(int ind,int[] arr, int targ, List<List<Integer>> ls, List<Integer> ds){
        if(ind == arr.length){
            if(targ == 0){
                ls.add(new ArrayList<>(ds));
            }
            return;
        }
        
        //pick 
        if(arr[ind] <= targ){
            ds.add(arr[ind]);
            comb(ind,arr,targ - arr[ind], ls, ds);
            ds.remove(ds.size() - 1);
        }

        //not pick
        comb(ind+1, arr, targ, ls ,ds);
    }
}