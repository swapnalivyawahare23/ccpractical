class biggestnumber
  {
    public static void main(String args[])
    {
      int[] arr={12,34,23,45,66};
      int maxnum=arr[0];
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>maxnum)
          {
            maxnum=arr[i];
          }
        }
      System.out.println("Biggest Number="+maxnum);
    }
  }
