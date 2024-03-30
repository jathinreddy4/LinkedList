// https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1
// find pairs with given sum
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node left = head;
        Node right = head;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        while(right.next != null)
        {
            right = right.next;
        }
        
        while(left != right && left.prev != right)
        {
            ArrayList<Integer> ar = new ArrayList<>();
            int sum = left.data + right.data;
            if(sum == target)
            {
                ar.add(left.data);
                ar.add(right.data);
                
                res.add(ar);
                left = left.next;
                right = right.prev;
            }
            else if(sum < target)
            {
                left = left.next;
            }
            else
            {
                right = right.prev;
            }
        }
        return res;
    }
}