internal class MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        int[] arr = new int[nums.Length];
        int counter = 0;
        int arrIndex = 0;

        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] == 0) {
                counter++;

             }
            if (nums[i] != 0)
            {
                arr[arrIndex] = nums[i];
                Console.WriteLine($"oki {arr[arrIndex]}");
                arrIndex++;
            }
         
        }

        for (int j = arrIndex; j < arr.Length  ; j++)
        {
            arr[j] = 0;
        }
        Array.Copy(arr, 0, nums, 0, arr.Length);
    }

   
}
