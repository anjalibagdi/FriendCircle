class Pass
{
    public static void main(String args[])
    {
        int e=78,h=87,m=99,s=97,ss=95,total;
        float per;
        total=e+h+m+s+ss;
        per=total/5;
        String b=(per>=75 &&per<=100)?"A grade: "+per:"Fail: "+per;
        System.out.println(b);
    } 
}