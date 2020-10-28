public class Age
{
public static String ageDefinition(byte age)
{
System.out.println("invoking age:");
System.out.println("age:"+ age);
if(age>=0 && age<=4)

{
System.out.println("age is kid");
return "kid";
}
if(age>=5 && age<=12)
{
System.out.println("child");
return "child";
}
if(age>=13 && age<=19)
{
System.out.println("teen:");
return "teen";
}
if(age>=20 && age<=59)
{
System.out.println("adult");
return "adult";
}
if(age>=60)
{
System.out.println("old");
return "old";
}
return "age-none";
}
}