import java.util.*;
class Example{
	
	
	public final static void clearConsole() { 
		try {
		final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J"); 
			System.out.flush();
			}
			} catch (final Exception e) {
			e.printStackTrace();
		
			}
		}
			
	public static void main(String args[]){
			homePage();			
		}			
	public static void homePage(){
		Scanner input=new Scanner(System.in);
			System.out.println("\n");
           System.out.println("\t\t\t\t __                       __");
            System.out.println("\t\t\t\t|  \\                     |  \\");
            System.out.println("\t\t\t\t \\$$  _______   ______  _| $$_");
            System.out.println("\t\t\t\t|  \\ /       \\ /      \\|   $$ \\");
            System.out.println("\t\t\t\t| $$|  $$$$$$$|  $$$$$$\\\\$$$$$$");
            System.out.println("\t\t\t\t| $$| $$      | $$    $$ | $$ __");
            System.out.println("\t\t\t\t| $$| $$_____ | $$$$$$$$ | $$|  \\");
            System.out.println("\t\t\t\t| $$ \\$$     \\ \\$$     \\  \\$$  $$");
            System.out.println("\t\t\t\t \\$$  \\$$$$$$$  \\$$$$$$$   \\$$$$");
            System.out.println();
            System.out.println(" _______       __   __   _____          _      _____ _    _ _            _______ ____  _____  ");
			System.out.println("|__   __|/\\    \\ \\ / /  / ____|   /\\   | |    / ____| |  | | |        /\\|__   __/ __ \\|  __ \\ ");
			System.out.println("   | |  /  \\    \\ V /  | |       /  \\  | |   | |    | |  | | |       /  \\  | | | |  | | |__) |");
			System.out.println("   | | / /\\ \\    > <   | |      / /\\ \\ | |   | |    | |  | | |      / /\\ \\ | | | |  | |  _  / ");
			System.out.println("   | |/ ____ \\  / . \\  | |____ / ____ \\| |___| |____| |__| | |____ / ____ \\| | | |__| | | \\ \\ ");
			System.out.println("   |_/_/    \\_\\/_/ \\_\\  \\_____/_/    \\_\\______\\_____|\\____/|______/_/    \\_\\_|  \\____/|_|  \\_\\");           
            System.out.println();		
			System.out.println("================================================================================================================================");
			System.out.println("\n\n");
			System.out.println("\t[01] Withholding Tax");
			System.out.println("\n");
			System.out.println("\t[02] Payble Tax");
			System.out.println("\n");
			System.out.println("\t[03] Income Tax");
			System.out.println("\n");
			System.out.println("\t[04] Social Security Contribution Levy (SSCL) Tax");
			System.out.println("\n");
			System.out.println("\t[05] Leasing Payment");
			System.out.println("\n");
			System.out.println("\t[06] Exit");
			System.out.println("\n");
			System.out.print("Enter Option -> ");
			int num=input.nextInt();
			clearConsole();
			switch(num){
				case 1:
					withHoldingtax();
					break;
				case 2:
					payble();	
					break;	
				case 3:
					income();	
					break;	
				case 4:
					sscl();	
					break;
				case 5:
					leasing();	
					break;
				case 6:
					System.out.println("B...Y...E");	
					break;	
					
				default:
					System.out.println("Enter Valid Input...");
					homePage();
					break;		
		
		
		}
	}	
	
	public static void withHoldingtax(){
		Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                           WITHHOLDING TAX                                   |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.println("\t[01] Rent Tax");
					System.out.println("\n");
					System.out.println("\t[02] Bank Interest Tax");
					System.out.println("\n");
					System.out.println("\t[03] Dividend Tax");
					System.out.println("\n");
					System.out.println("\t[04] Exit");
					System.out.println("\n");
					System.out.print("Enter Option to continue -> ");
					int numwithholding=input.nextInt();//with holding eke option eka
					clearConsole();
					switch(numwithholding){
				case 1:
					rentTax();
					break;
				case 2:
					bankInterest();	
					break;	
				case 3:
					dividend();	
					break;	
				case 4:
					homePage();	
					break;	
					
				default:
					clearConsole();
					System.out.println("Enter Valid Input...");
					withHoldingtax();
					break;		
		
		
		}
	}	
				
	
	public static void rentTax(){
		Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                               RENT TAX                                      |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.print("Enter your rent             : ");
					double rent=input.nextDouble();
						if(rent<=0){//if start
							System.out.println("\n");
							System.out.println("\tInvalid input...");
							System.out.println("\n");
							
							
							System.out.print("Do you want to enter the correct value agin (Y/N): ");
							char option=input.next().charAt(0);
							clearConsole();
							 if(option=='y' || option=='Y'){
								 rentTax();
								 }else{
									 withHoldingtax();
									 }
							}else if(rent<=100000){
									System.out.println("\n");
									System.out.println("\tYou dont have to pay rent tax..........");
									System.out.println("\n");
							
							
									System.out.print("Do you want to calculate another rent Tax (Y/N) : ");
									char option=input.next().charAt(0);
									clearConsole();
									if(option=='y' || option=='Y'){
									rentTax();
								 }else{
									 withHoldingtax();
									 }
								
								}else if(rent>100000){
									double tax=(rent-100000)*10/100;
									System.out.println("\n");
									System.out.println("You have to pay Rent Tax       : "+tax);
									System.out.println("\n");
							
							
									System.out.print("Do you want to calculate another rent Tax (Y/N) : ");
									char option=input.next().charAt(0);
									clearConsole();
									if(option=='y' || option=='Y'){
									rentTax();
								 }else{
									 withHoldingtax();
									 }
								}	
	}

	public static void bankInterest(){
		Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                              BANK INTEREST TAX                              |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.print("Enter your bank interest per year             : ");
					double bankinterest=input.nextDouble();
						if(bankinterest<=0){
							System.out.println("\n");
							System.out.println("\tInvalid input..........");
							System.out.println("\n");
							
							
							System.out.print("Do you want to enter the correct value agin (Y/N): ");
							char option=input.next().charAt(0);
							clearConsole();
							 if(option=='y' || option=='Y'){
								bankInterest();
								 }else{
									 withHoldingtax();
									 }
								
								}else{
									double tax=bankinterest*0.05;
									System.out.println("\n");
									System.out.println("You have to pay interest Tax per year          : "+tax);
									System.out.println("\n");
							
							
									System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
									char option=input.next().charAt(0);
									clearConsole();
									if(option=='y' || option=='Y'){
									bankInterest();
									}else{
									 withHoldingtax();
									 }
								}	
	}
		
	public static void dividend(){
		Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                              DIVIDEND TAX                                   |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.print("Enter your total dividend per year             : ");
					double dividend=input.nextDouble();
						if(dividend<=0){
							System.out.println("\n");
							System.out.println("\tInvalid input..........");
							System.out.println("\n");
							
							
							System.out.print("Do you want to enter the correct value agin (Y/N): ");
							char option=input.next().charAt(0);
							clearConsole();
							 if(option=='y' || option=='Y'){
								dividend();
								 }else{
									 withHoldingtax();
									 }
							}else if(dividend<=100000){
									System.out.println("\n");
									System.out.println("\tYou dont have to pay Dividend Tax..........");
									System.out.println("\n");
							
							
									System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
									char option=input.next().charAt(0);
									clearConsole();
									if(option=='y' || option=='Y'){
									dividend();
								 }else{
									 withHoldingtax();
									 }
								
								}else if(dividend>100000){
									double tax=(dividend-100000)*14/100;
									System.out.println("\n");
									System.out.println("You have to pay Dividend Tax per year          : "+tax);
									System.out.println("\n");
							
							
									System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
									char option=input.next().charAt(0);
									clearConsole();
									if(option=='y' || option=='Y'){
									dividend();
								 }else{
									 withHoldingtax();
									 }
								}

	
	}


	public static void payble(){
		Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                             PAYABLE TAX                                     |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.print("Enter your employee payment per month :  ");
					double salary=input.nextDouble();
					double tax=0;

						
							
							if (salary <= 141667) {
								tax = (salary - 100000) * 0.06;
							} else if (salary <= 183333) {
								tax = (salary - 141667) * 0.12 + (41667 * 0.06);
							} else if (salary <= 225000) {
								tax = (salary - 183333) * 0.18 + (41667 * 0.12) + (41667 * 0.06);
							} else if (salary <= 266667) {
								tax = (salary - 225000) * 0.24 + (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
							} else if (salary <= 308333) {
								tax = (salary - 266667) * 0.30 + (41667 * 0.24) + (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
							} else {
								tax = (salary - 308333) * 0.36 + (41667 * 0.30) + (41667 * 0.24) + (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
							}
													
							
						if (salary <= 100000) {
							System.out.println("\nYou don’t have to pay Payable Tax");
						} else {
							System.out.println("\nYou have to pay payable tax per month: Rs. " + tax);
						}

						System.out.print("\nDo you want to calculate another payable tax (Y/N): ");
						char yesno = input.next().charAt(0);
						clearConsole();
						if (yesno == 'Y' || yesno == 'y') {
							payble();
						} else {
							
								homePage();
							 }					
							
							System.out.println();
							salary = Math.round(salary);
							System.out.printf("You have to pay Pable Tax per month : %.2f", salary);					
							System.out.print("Do you want to calculate another Payble Tax (Y/N) : ");
							char option=input.next().charAt(0);
							clearConsole();
							if(option=='y' || option=='Y'){
								payble();
						    }else{
								homePage();
									 }
								 }
								 								
	
		public static void income(){
				Scanner input=new Scanner(System.in);
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("|                             INCOME TAX                                     |");
					System.out.println("+-----------------------------------------------------------------------------+");
					System.out.println("\n");
					System.out.print("Enter your total income per year :  ");
					double income=input.nextDouble();
					double tax=0;
							
							if (income > 3700000) {
								tax += (income - 3700000) * 0.36;
								income = 3700000;
							}
							if (income > 3200000) {
								tax += (income - 3200000) * 0.30;
								income = 3200000;
							}
							if (income > 2700000) {
								tax += (income - 2700000) * 0.24;
								income = 2700000;
							}
							if (income > 2200000) {
								tax += (income - 2200000) * 0.18;
								income = 2200000;
							}
							if (income > 1700000) {
								tax += (income - 1700000) * 0.12;
								income = 1700000;
							}
							if (income > 1200000) {
								tax += (income - 1200000) * 0.06;
							}

							if (income <= 1200000) {
								System.out.println("\n\t\tYou don’t have to pay Income Tax...");
							} else {
								System.out.println("\nYou have to pay income tax per year: Rs. " + tax);
							}

							System.out.print("\nDo you want to calculate another income tax (Y/N): ");
							char yesno = input.next().charAt(0);
							clearConsole();
							if (yesno == 'Y' || yesno == 'y') {
								income();
							} else {
								homePage();	
									}
							}	
																						
	public static void sscl(){
		Scanner input=new Scanner(System.in);
						                
						System.out.println("\n+------------------------------------------------------------------------------+");
                        System.out.println("|                         SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX      	 |");
                        System.out.println("+--------------------------------------------------------------------------------+\n");
                        System.out.print("\nEnter value of good or service: ");
                        double value = input.nextDouble();
                        
                        double a = value*0.025;
                        double b = value+a;
                        
                        double vat = b*0.15;
                        double totaltx = a + vat;
                        
                        System.out.println("\nYou have to pay SSCL tax : "+totaltx);
                        System.out.print("\nDo you want to calculate another sscl tax (Y/N): ");
                        char yesno = input.next().charAt(0);
                        
							clearConsole();
							if(yesno=='y' || yesno=='Y'){
							sscl();
						    }else{
								homePage();									 													
						}
					}
					public static void leasing(){
						Scanner input=new Scanner(System.in); 
						
						System.out.println("\n+------------------------------------------------------------------------------+");
                        System.out.println("|                                 LEASING PAYMENT      	 						|");
                        System.out.println("+--------------------------------------------------------------------------------+\n");
                        System.out.println("\n\t[1] Calculate monthly installment");
                        System.out.println("\n\t[2] Search leasing category");
                        System.out.println("\n\t[3] Find leasing amount");
                        System.out.println("\n\t[4] Exit");
                        System.out.print("\nEnter Option to continue = ");
                        int option = input.nextInt();
                        clearConsole();
                        
                         switch (option) {
						case 1:
							Calculatemonthlyinstallment();
							break;
						case 2:
							searchLeasingCategory();
							break;
						case 3:
							Findleasingamount();
							break;
						case 4:
							exit();
						break;
            
			}
    }

    public static void Calculatemonthlyinstallment() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n+-----------------------------------------------------------------------------+");
        System.out.println("|                            Calculate Leasing Payment                          |");
        System.out.println("+-------------------------------------------------------------------------------+\n");
        System.out.print("\nEnter lease amount : ");
        double leaseamount = input.nextDouble();
        System.out.print("\nEnter annual interest rate : ");
        double interest = input.nextDouble();

        double years;
        System.out.print("\nEnter number of years : ");
			years = input.nextDouble();	
			
			if(years>5){
				System.out.print("\n\t Invalid number of years...Enter the correct valur again...");
				System.out.print("\n Enter number of years = ");
				years = input.nextDouble();	
			}																						
		     double monthInt = (interest / 100) / 12; 
			 double months = years * 12;             
			 double monthInst = leaseamount * monthInt / (1 - Math.pow(1 + monthInt, -months));
             System.out.printf("\nYour monthly installement = %.2f ",monthInst);
                                                    
        System.out.print("\n\nDo you want to calculate another installment (Y/N)? ");
        char option = input.next().charAt(0);
        clearConsole();
        if (option == 'y' || option == 'Y') {
            Calculatemonthlyinstallment();
        } else {
            leasing();
        }
    }

    public static void searchLeasingCategory() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n+-----------------------------------------------------------------------------+");
        System.out.println("|                          Search Leasing Category                             |");
        System.out.println("+-------------------------------------------------------------------------------+\n");
        System.out.print("\nEnter lease amount : ");
        double lease = input.nextDouble();
        System.out.print("\nEnter annual interest rate : ");
        double interest = input.nextDouble();
        
        double monthlyInterest=(interest/100)/12;

        double payment3y = lease*monthlyInterest/(1-Math.pow(1+monthlyInterest,-3*12));
		double payment4y = lease*monthlyInterest/(1-Math.pow(1+monthlyInterest,-4*12));
		double payment5y = lease*monthlyInterest/(1-Math.pow(1+monthlyInterest,-5*12));


        System.out.printf("\nMonthly Payment for 3 Year Leasing Plan : %.2f\n", payment3y);
        System.out.printf("Monthly Payment for 4 Year Leasing Plan : %.2f\n",payment4y);
        System.out.printf("Monthly Payment for 5 Year Leasing Plan : %.2f\n",payment5y);

        System.out.print("\nDo you want to search again (Y/N)? ");
        char option = input.next().charAt(0);
        clearConsole();
        if (option == 'y' || option == 'Y') {
            searchLeasingCategory();
        } else {
            leasing();
        }
    }

   public static void Findleasingamount() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n+-----------------------------------------------------------------------------+");
        System.out.println("|                          Find Leasing Amount                                  |");
        System.out.println("+-------------------------------------------------------------------------------+\n");
        System.out.print("\n\tEnter the monthly lease payment amount you can afford : ");
        double lease = input.nextDouble();
        System.out.print("\n\tEnter the number of years : ");
        double years = input.nextDouble();
        System.out.print("\n\tEnter the annual interes rate : ");
        double interest = input.nextDouble();
        System.out.print("\n");
                                        		   
        double monthlyInterest = (interest/100)/12; 
        double totalmonths = years * 12; 
       
        double leaseAmount = (lease * (1-Math.pow(1+monthlyInterest,-totalmonths)))/monthlyInterest;
        
        double x= Math.round(leaseAmount);
        System.out.printf("\tYou can get lease amount: %.2f\n", x);
		
		 System.out.print("\nDo you want to search again (Y/N)? ");
        char option = input.next().charAt(0);
        clearConsole();
        if (option == 'y' || option == 'Y') {
            searchLeasingCategory();
        } else {
            leasing();
		
		}
    }
		public static void exit() {
			Scanner input = new Scanner(System.in);
				homePage();			
	}
}

									
									
									
									
									
									
									
									
									
									
									
									
									
									
								
								
							
						
							
							
						
					
				
        
        
					
					
					
					
					
					
					
					
					
					
					
					
					
				
			
			
					
				
			
