using System;

internal class Program
{
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> map = new Dictionary<int, int>();

        for (int i = 0; i < nums.Length; i++)
        {
            int complement = target - nums[i];
            if (map.ContainsKey(complement))
            {
                return new int[] { map[complement], i };
            }
            if (!map.ContainsKey(nums[i]))
            {
                map.Add(nums[i], i);
            }
        }
        return new int[] { 0, 0 }; 
    }

    private static void Main(string[] args)
    {
        Program p = new Program();

        int[] result = p.TwoSum([ 3,2,3,3,33,3,3,3,3,3,3,3,33,0, 2, 4 ], 6);
        for (int i = 0; i < result.Length; i++)
        {
            Console.WriteLine($"Our index [{i}] is {result[i]}");

        }

    }
}
