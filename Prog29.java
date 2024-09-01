class Leap
{
    public static void main(String args[])
    {
        int year=1992;
        String A=(year%4==0 || year%100!=0 || year%400==0)?"leap year : "+year:"not a leap year: "+year;:
        System.out.println(A);
        
    }
}