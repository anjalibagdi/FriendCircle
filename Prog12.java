class Low
{
    public static void main(String args[])
    {
       char a='A';
       String s=(a>=65 && a<=90)?"to lowercase "+(char)(a+32):"lowercase";
       System.out.println(s);
    }
}