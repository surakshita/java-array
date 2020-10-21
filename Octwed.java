public class Octwed
{
public static void main(String[] args)
{
System.out.println("invoking another method called arrayOfPercentage");
arrayOfPercentage();
}
public static void arrayOfPercentage()
{
System.out.println("Details includes percentage of trainee");

double classTen=7.2d;
double classTwelve=72.33d;
double classUg=6.2d;

double[] detailOfPercentage={7.2d,72.33d,6.2d};

double elementAtIndex0= detailOfPercentage[0];
System.out.println("Tenth percentage:"+ elementAtIndex0);

double elementAtIndex1= detailOfPercentage[1];
System.out.println("Twelveth percentage:"+ elementAtIndex1);
 
double elementAtIndex2= detailOfPercentage[2];
System.out.println("Undergraduation percentage:"+ elementAtIndex2);

}
}


