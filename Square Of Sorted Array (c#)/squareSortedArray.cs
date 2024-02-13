using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProblemSolving.Square_Of_Sorted_Array
{
    internal class squareSortedArray
    {
        /***** First Approach *****************
        public int[] SortedSquares(int[] nums)
        {
            for (int i = 0; i < nums.Length; i++)
            {
                nums[i] = nums[i] * nums[i];
            }
            Array.Sort(nums);
            return nums;
        }
        *************/

        /******************* Second Approach ***********/


        public int[] SortedSquares(int[] nums)
        {
            var arr = new int[nums.Length];
            int endIndex = nums.Length - 1;
            int beginIndex = 0;
            int index = endIndex;
            while (beginIndex <= endIndex)
            {
                arr[index--] = Math.Abs(nums[endIndex]) > Math.Abs(nums[beginIndex]) ? nums[endIndex] * nums[endIndex--] : nums[beginIndex] * nums[beginIndex++];
            }
            return arr;

        }
       



        public static void Main(string[] args)
        {
            squareSortedArray s = new squareSortedArray();
            int[] arr = [-4, -2, 5, 2];
            s.SortedSquares(arr);
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine($"index {i} value is {arr[i]}");
            }

        }
    }


}
