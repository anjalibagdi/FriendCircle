class Uptolo
{
    public static void main(String args[])
    {
        char a='G';
        String b=(a>=65 && a<=90 || a>=97 && a<=122)?"lowercase is :"+(char)(a+32):"uppercase is :"+(char)(a-32);
        System.out.println(b);
    }
}