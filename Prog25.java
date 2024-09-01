class Big4
{
    public static void main(String args[])
    {
        int a=23,b=21,c=33,d=12;
        String e=(a>b && a>c && a>d)?"a is greater":(b>c && b>d)?"b is greater":(c>d)?"c is greater":"d is greater";
        System.out.println(e);
    }
}