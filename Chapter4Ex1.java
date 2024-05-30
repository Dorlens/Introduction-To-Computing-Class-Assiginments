public class Chapter4Ex1
{
        public static boolean twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            int[] array = {5, 3, 10, 4, 11};
            
            int target1 = 7;
            System.out.println(twoSum(array, target1));  
            
            int target2 = 19;
            System.out.println(twoSum(array, target2)); 
        }
    }

