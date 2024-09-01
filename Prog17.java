class Alpha
{
    public static void main(String args[])
    {
        char ch='b';
        String s=(ch>=65 && ch<=90 || ch>=97 && ch<=122)? "Alphabet":"Not alphabet";
        System.out.println(s);
    }
}