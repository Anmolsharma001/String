public class pallindromeSubstring
{
  public static boolean isPallindrome(String s)
  {
      int i=0;
      int j=s.length()-1;
      while(i<j)
      {
          if(s.charAt(i)!=s.charAt(j))
              return false;
          i++;
          j--;
      }
      return true;
  }
  public static void main(String[]args)
  {
      int count=0;
      String str="abbd";
      for(int i=0;i<str.length();i++)
      {
          for(int j=i+1;j<str.length();j++)
          {
              if(isPallindrome(str.substring(i,j))==true)
              {
                  System.out.println(str.substring(i,j)+" ");
                  count++;
              }
          }
      }
      System.out.println("the number of pallindrome substrings are"+count);
  }
}
