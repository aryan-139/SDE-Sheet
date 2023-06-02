class Solution {
    
    private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(ind == arr.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
                //this is if the base case is true and the condition satisfies  
            }
            return; 
            //if untrue then this will simply backtrack 
        }
        //since we are taking repeat indexes, we will not increment the index right now
        if(arr[ind] <= target) {
            ds.add(arr[ind]);
            //we wilk keep adding the variables and subtracting its value from the target till we reach the base case
            findCombinations(ind, arr, target - arr[ind], ans, ds); 
            ds.remove(ds.size() - 1); 
        }
        //if the condition fails then we use the NOT PICK condition 
        findCombinations(ind + 1, arr, target, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        //creating a fresh data structure to store the values
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        //we will have an updated ans ArrayList  
        return ans; 
        //we can print the arraylist now
    }
}
