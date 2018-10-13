public class Positive{
  public static int num(int[] arr) //Sum of positive
    {
        if(arr.length != 0)
        {
            int sum_num = 0;
            for(int single_num : arr) 
            {
                if(single_num > 0) sum_num += single_num;
            }
            return sum_num;
        } else
        {
            return 0;
        }
    }
}
