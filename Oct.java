public class Oct
{
public static void main(String[] args)
{
System.out.println("invoking method arrayOfEmail ");
arrayOfEmail();
}
public static void arrayOfEmail()
{
String emailId="Surakshita.xworkz@gmail.com";
String altEmail="biradar.surakshita@gmail.com";

String[] emails={emailId,altEmail};
int sizeOfArray=emails.length;

System.out.println("total elements in arrayOfEmail:"+ sizeOfArray);

String elementAtIndex0=emails[0];
System.out.println("element at index 0 is:"+ elementAtIndex0);

String elementAtIndex1=emails[1];
System.out.println("element at index 1 is:"+ elementAtIndex1);

}
}





