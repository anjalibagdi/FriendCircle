class Cisi
{
    public static void main(String args[])
    {
        int p=500,t=4;
        double ci,si,amt,r=4.2;
        amt=p*Math.pow(1-r/100,t);
        ci=amt-p;
        si=(p*r*t)/100;
        String b= (p>=500)?"compound interest is : "+ci:"simple interest is : "+si;
        System.out.println(b);
    }
}