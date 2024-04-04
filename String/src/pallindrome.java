public class pallindrome
{
    public static void main(String[] args)
    {
       String str="abba";
       int i=0,j=str.length()-1;
       boolean flag=true;
       while(i<j)
       {
           if(str.charAt(i)!=str.charAt(j))
           {
               flag=false;
               break;
           }
           i++;
           j--;
       }
       if(flag==true)
       {
           System.out.println("pallindrome");
       }
       else
       {
           System.out.println("not pallindrome");
       }
    }
}