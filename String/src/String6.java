public class String6
{
    public static void main(String[] args)
    {
      StringBuilder sb=new StringBuilder("TONY");
        System.out.println(sb);                //TONY

        System.out.println(sb.charAt(0));      //T

        sb.setCharAt(0,'P');
        System.out.println(sb);               //PONY

        sb.delete(2,3);                       //POY
        System.out.println(sb);
    }
}