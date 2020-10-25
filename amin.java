import java.util.*;

class amin{

	public static void main(String[]args){

	Scanner a=new Scanner(System.in);
	System.out.println("Please Enter Number Of Your Name Is Latter");

	int bb=a.nextInt();
	char myName[]=new char[bb];

	System.out.println("Enter The Letters");


	for(int i=0;i<myName.length;i++)
	{
	myName[i]=a.next().charAt(0);
}

System.out.print("Your Name Is: ");

for(int i=0;i<myName.length;i++)

{
	System.out.print(myName[i]);
}
System.out.println("");
}}