class Area
{
    public static void main(String args[])
    {
        int a=5,b=7,c=6,s;
        double A;
        s=(a+b+c)/2;
        A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle :"+A);

    }
}