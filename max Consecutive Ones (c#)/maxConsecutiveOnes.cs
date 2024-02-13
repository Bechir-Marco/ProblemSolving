using ProblemSolving.Square_Of_Sorted_Array;
using System;
using System.Collections.Generic;
using System.Diagnostics.Metrics;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ProblemSolving.max_Consecutive_Ones
{
    internal class maxConsecutiveOnes
    {

        public int FindMaxConsecutiveOnes(int[] nums)
        {
            
            int j = 0;
            int counter = 0;
            int max = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (nums[j]==1)
                {
                    counter++;
                    j++;
                    max = max > counter ? max : counter;
                }
                else
                { i=j;
                    j++;
                    counter = 0;
                    max = Math.Max(max, counter);


                }
            }
            return max;
        }
        
    }
}
