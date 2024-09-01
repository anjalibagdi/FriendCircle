class Swap1
{
    public static void main(String args[])
    {
        int a=12,b=32;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a after swap :"+a);
        System.out.println("b after swap :"+b);

    }
}