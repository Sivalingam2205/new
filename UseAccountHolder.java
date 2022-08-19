package day2_objects;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder accountHolder1 = new AccountHolder();
		accountHolder1.name = "mano";
		accountHolder1.age = 26;
		accountHolder1.isFemale = false;
		accountHolder1.accountNumber = 28330485612584l;
		accountHolder1.monthlyIncome = 21000;
		accountHolder1.savingsPercentage = 18;
		accountHolder1.savingsAmount = accountHolder1.monthlyIncome*accountHolder1.savingsPercentage/100;
		AccountHolder accountHolder2 = new AccountHolder();
		accountHolder2.name = "Savithri";
		accountHolder2.age = 25;
		accountHolder2.isFemale = true;
		accountHolder2.accountNumber = 28330485612585l;
		accountHolder2.monthlyIncome = 20000;
		accountHolder2.savingsPercentage = 20;
		accountHolder2.savingsAmount =accountHolder2.monthlyIncome*accountHolder2.savingsPercentage/100;
		AccountHolder accountHolder3 = new AccountHolder();
		accountHolder3.name = "Kamban";
		accountHolder3.age = 30;
		accountHolder3.isFemale = false;
		accountHolder3.monthlyIncome = 30000;
		accountHolder3.savingsPercentage = 10;
		accountHolder3.savingsAmount = accountHolder3.monthlyIncome*accountHolder3.savingsPercentage/100;
		System.out.println(accountHolder1.name+" "+accountHolder1.age+" "+accountHolder1.isFemale+" "+accountHolder1.monthlyIncome+" "+accountHolder1.savingsPercentage+" "+accountHolder1.savingsAmount);
		System.out.println(accountHolder2.name+" "+accountHolder2.age+" "+accountHolder2.isFemale+" "+accountHolder2.monthlyIncome+" "+accountHolder2.savingsPercentage+" "+accountHolder2.savingsAmount);
		System.out.println(accountHolder3.name+" "+accountHolder3.age+" "+accountHolder3.isFemale+" "+accountHolder3.monthlyIncome+" "+accountHolder3.savingsPercentage+" "+accountHolder3.savingsAmount);
		
	}
}
