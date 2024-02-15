using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProblemSolving.Longest_Harmonious_Subsequence___c__
{
    internal class LongestHarmoniousSubsequence
    {
        public int FindLHS(int[] nums)
        {
            Dictionary<int,int> map = new Dictionary<int,int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (!map.ContainsKey(nums[i]))
                {
                    map[nums[i]] = 1;
                }
                else
                    map[nums[i]] += 1;
            }
            int maxLHS = 0;
            foreach (var kvp in  map)
            {
                int nextKey = kvp.Key+1;
                int nextValue;
                if (map.TryGetValue(nextKey, out nextValue))
                {
                    maxLHS = Math.Max(maxLHS, kvp.Value + nextValue);
                } 
            }
            return maxLHS;

        }
       
    }
}
