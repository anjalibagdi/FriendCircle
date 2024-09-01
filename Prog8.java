class Ci{
       public static void main(String args[])
     {
        int p=300,t=3;
        float r=3.2f;
        double ci,amt;
        amt=p*Math.pow(1+r/100,t);
        ci=amt-p;
        System.out.println("Compound Interest : "+ci);
    }

}