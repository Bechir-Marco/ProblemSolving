using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProblemSolving.Contains_Duplicate
{
    internal class containsDuplicate
    {
        /*************First Approach 
        public bool ContainsNearbyDuplicate(int[] nums, int k)
        {
             
            Boolean valid = false;
            ;
            for (int i = 0; i < nums.Length; i++)
            {
                for (int j= i+1; j<nums.Length;j++)
                {
                    if (nums[i] == nums[j] && Math.Abs(i-j)<=k)
                    {
                        valid = true; break;
                    }
                }
            }
                
            return valid;
        
    }
        ***********/

        /***************** Second Approach *********/


        public bool ContainsNearbyDuplicate(int[] nums, int k)
        {
            Dictionary<int, int> dictionary = new Dictionary<int, int>();
            for (int i = 0; i < nums.Length; i++)
            {
                if (!dictionary.ContainsKey(nums[i]))
                {
                    dictionary.Add(nums[i], i);
                }
                else if (Math.Abs(dictionary[nums[i]] - i) <= k)
                {
                    return true;
                }
                else
                    dictionary[nums[i]] = i;
            }

            return false;
        }
        public static void Main(string[] args)
        {
            containsDuplicate c = new containsDuplicate();
            Boolean r = c.ContainsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2);
            Console.WriteLine($" res is {r}");
        }

    }
}

