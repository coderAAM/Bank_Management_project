import java.util.Scanner;

class Customer {
  String name;
  int acc;
  int bal;
  public Customer(String name, int acc, int bal){
    this.name = name;
    this.acc = acc;
    this.bal = bal;
  }
}

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of customers");
    int n = sc.nextInt();
    Customer[] c = new Customer[n];
    for(int i=0; i<n; i++){
      System.out.println("Enter the name of customer");
      String name = sc.next();
      System.out.println("Enter the account number");
      int acc = sc.nextInt();
      System.out.println("Enter the balance");
      int bal = sc.nextInt();
      c[i] = new Customer(name,acc,bal);
    }
  }
}