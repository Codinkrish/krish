import java.util.*;
class FIRST
{
public static void main(String[] args)
{
int pinnumber=1234;
int balance=1000;
int deposite=0;
int withdrawn=0;

System.out.println("Enter your password ");
Scanner scanner=new Scanner(System.in);
int password=scanner.nextInt();
if(pinnumber==password){
System.out.println("your name is");
String name=scanner.next();
System.out.println("welcome"+" "+ name);

while(true){
System.out.println("1 to your account balance");
System.out.println(" 2 to deposite");
System.out.println(" 3 to withdraw");
System.out.println(" 4 to Exit");

int opt=scanner.nextInt();

switch(opt)
{
case 1:
System.out.println("your account balance is"+" "+balance);
break;

case 2:
System.out.println("how much money did you want your account");
deposite=scanner.nextInt();
System.out.println("you are succssfully deposite");
balance=deposite+balance;

break;

case 3:
System.out.println("how much money did you want to take ");
withdrawn=scanner.nextInt();
if(withdrawn>balance){
System.out.println("your account balance insufficient");

}
else{
System.out.println("your account money withdrawn");
balance=balance-withdrawn;
}

break;



case 4:

System.out.println("Available balance "+" "+balance);
System.out.println("You deposite amount"+" "+deposite);
System.out.println("You withdrawn amount"+" "+withdrawn);
System.out.println("Thanks You For Visiting!");
break;

}
}
}else{
System.out.println("your password is wroung");
System.out.println(" Enter your correct password");
}
}
}
