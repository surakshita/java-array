public class IPhoneTester
{
public static void main(String[] args)
{
System.out.println("main invoked");
boolean connect=IPhone.call();
System.out.println("call return value:"+connect);

String text=IPhone.message();

System.out.println("message returned :"+text);

}
}