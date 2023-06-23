import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class digitalaccountant {
    static Scanner input = new Scanner(System.in);
    static ArrayList dataList = new ArrayList<String>();
    static String summary;
    static String outputFilePath = "D:/CustomerData.txt";
    static Path fileOut = Paths.get(outputFilePath);

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Welcome to Digital Accountant!");
                System.out.println("What calculation would you like to perform?");
                System.out.println(
                        "1. Interest Calculator\n2. Audit Tool\n3. Loan Calculator\n4. EMI Calculator\n5. Expense Calculator\n6. Profit Calculator\n7. Tax Calculator\n8. Appreciation Calculator");
                int choice = input.nextInt();
                optionsMenu(choice);
                System.out.print("Do you want to perform another calculation?\n1. Yes\t2. No ");
                int loop = input.nextInt();
                if (loop != 1) {
                    System.out.println("Thank you for using Digital Accountant!");
                    break;
                }
            }
        } catch (Exception e) {
            rerun();
        }
    }

    static void fileWriter() {
        fileReader();
        try {
            Files.write(fileOut, dataList);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Your token number is: " + dataList.size() + ". Save it for future reference.");
    }

    static void fileReader() {
        try {
            Scanner read = new Scanner(new File(outputFilePath));
            while (read.hasNext()) {
                dataList.add(read.nextLine());
            }
            read.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void auditTool(double balance, double debt, double interest, double projected) {
        double cashflow = balance + projected;
        interest = interest / 100;
        debt = debt * (1 + interest);
        double revenue = cashflow - debt;
        if (revenue >= 0) {
            System.out.println("You are safe from bankruptcy");
        } else {
            System.out.println("You are going bankrupt. You are in $ " + (-revenue) + " debt.");
        }
        summary = ("Cashflow: " + cashflow + "\tDebt: " + debt + "\tRevenue: " + revenue);
        System.out.println(summary);

    }

    static void taxCalculator(int income, int taxrate) {
        int incometax = income * (taxrate / 100);
        System.out.print("Select your taxation frequency");
        System.out.println("1.Monthly tax\n2.Yearly tax\n");
        int choice = input.nextInt();
        switch (choice) {
            case (1):
                System.out.println("Your monthly income tax is" + incometax);
                summary = ("Income: " + income + "\tMonthly Tax: " + incometax + "\tTax rate: " + taxrate);
                System.out.println(summary);
                break;
            case (2):
                int yearlytax = incometax * 12;
                System.out.println("Your yearly income tax is " + yearlytax);
                summary = ("Income: " + income + "\tYearly Tax: " + yearlytax + "\tTax rate: " + taxrate);
                System.out.println(summary);
                break;
            default:
                System.out.println("You have selected invalid taxation!");
                break;
        }

    }

    static void expenseCalculator(int income, int totalexpenses) {
        System.out.println("Your expenses are:" + totalexpenses);
        if (totalexpenses > income)
            System.out.println("Your expenses are more than your income. Start saving!");
        else if (totalexpenses < income)
            System.out.println("Your income is enough to cover your expenses.");
        summary = ("Income: " + income + "\t Total expenses: " + totalexpenses);
        System.out.println(summary);

    }

    static void appreciationCalculator(double amount, double aprate, int years) {
        double appreciation = amount * Math.pow((1 + aprate / 100), years);
        System.out.print("The appreciated value is: " + appreciation);
        summary = ("Value: " + amount + "\tRate of appreciation: " + aprate + "\tPeriod of appreciation: " + years);
        System.out.println(summary);

    }

    static void productEMICalculator(double cost, double rate, int months) {
        rate = (rate) / 100;
        double emi = (cost * rate * Math.pow(1 + rate, months)) / (Math.pow(1 + rate, months) - 1);
        System.out.print("The Monthly EMI is: " + emi);
        summary = ("Cost: " + cost + "\tMonthly EMI: " + emi + "\tTime period in months: " + months);
        System.out.println(summary);

    }

    static void interestCalculator(int choice, double Principal, double InterestRate, double LoanTerm) {
        switch (choice) {
            case (1) -> {
                InterestRate = InterestRate / 100;
                double TotalInstalments = LoanTerm * 12;
                double TotalInterest = Principal * InterestRate * LoanTerm;
                double IntPerMonth = TotalInterest / TotalInstalments;
                System.out.println("Total Interest on Loan is: " + TotalInterest);
                System.out.println("Installments on Loan: " + TotalInstalments);
                System.out.println("Interest due for the Month is: " + IntPerMonth);
                summary = ("Principal: " + Principal + "\tInterest Rate: " + InterestRate + "\tMonthly Interest: "
                        + IntPerMonth + "\tTotal Installments: " + TotalInstalments + "\tTotal Interest: "
                        + TotalInterest);
                System.out.println(summary);

            }
            case (2) -> {
                double CompoundInterest = Principal * (Math.pow((1 + InterestRate / 100), LoanTerm)) - Principal;
                System.out.println("The total Compound Interest is: " + CompoundInterest);
                summary = ("Principal: " + Principal + "\tInterest Rate: " + InterestRate + "\tTotal Installments: "
                        + LoanTerm + "\tTotal Interest: " + CompoundInterest);
                System.out.println(summary);

            }
        }
    }

    static void loanCalculator(int choice, double Principal, double InterestRate, double LoanTerm) {
        switch (choice) {
            case (1) -> {
                int Installments = (int) (LoanTerm * 12);
                double TotalInterest = Principal * (InterestRate / 100) * LoanTerm;
                double IntPerMonth = TotalInterest / Installments;
                double PayPerMonth = IntPerMonth + (Principal / Installments);
                double TotalPayment = PayPerMonth * Installments;
                System.out.println("Total Payment is: " + TotalPayment);
                System.out.println("Total Interest on Loan is: " + TotalInterest);
                System.out.println("Installments on Loan: " + Installments);
                System.out.println("Interest due for the Month is: " + IntPerMonth);
                System.out.println("Monthly Installment is: " + PayPerMonth);
                summary = ("Principal: " + Principal + "\tInterest Rate: " + InterestRate + "\tMonthly Interest: "
                        + IntPerMonth + "\tTotal Installments: " + Installments + "\tTotal Interest: " + TotalInterest
                        + "\tTotal Amount: " + TotalPayment);

            }
            case (2) -> {
                System.out.println("Enter your Time period in years: ");
                double TimePeriod = input.nextDouble();
                double CompoundInterest = Principal * (Math.pow((1 + InterestRate / 100), TimePeriod)) - Principal;
                double CILoan = CompoundInterest + Principal;
                System.out.println("The Compound Interest Loan amount is: " + CILoan);
                summary = ("Principal: " + Principal + "\tInterest Rate: " + InterestRate + "\tTotal Installments: "
                        + TimePeriod + "\tTotal Interest: " + CompoundInterest + "\tTotal Amount: " + CILoan);

            }
        }
    }

    static void profitCalculator(double costprice, double saleprice) {
        if (costprice - saleprice > 0) {
            double loss = -(costprice - saleprice);
            System.out.println("There is no profit. The loss is: " + loss);
            System.out.println("Loss Percentage: " + (loss / costprice) * 100);
            summary = ("Loss: " + loss + "\tCost: " + costprice + "\tSale Price: " + saleprice + "\tLoss Percentage: "
                    + (loss / costprice) * 100);

        } else if (costprice - saleprice < 0) {
            double profit = saleprice - costprice;
            System.out.println("The profit is: " + profit);
            System.out.println("Profit Percentage: " + (profit / costprice) * 100);
            summary = ("Profit: " + profit + "\tCost: " + costprice + "\tSale Price: " + saleprice
                    + "\tProfit Percentage: " + (profit / costprice) * 100);

        }
    }

    static void rerun() {
        System.out.println("Please select a valid option!");
        System.out.println(
                "1. Interest Calculator\n2. Audit Tool\n3. Loan Calculator\n4. EMI Calculator\n5. Expense Calculator\n6. Profit Calculator\n7. Tax Calculator\n8. Appreciation Calculator\n");
        int option = input.nextInt();
        optionsMenu(option);
    }

    static void optionsMenu(int option) {
        switch (option) {
            case (1):
                try {
                    System.out.println("Choose a type of interest Calculator!");
                    System.out.println("1- Simple Interest calculator\n2- Compound Interest calculator");
                    int choice = input.nextInt();
                    System.out.println("Enter your Principal amount: ");
                    double Principal = input.nextDouble();
                    System.out.println("Enter your Interest rate: ");
                    double InterestRate = input.nextDouble();
                    System.out.println("Enter your loan term in years: ");
                    double LoanTerm = input.nextDouble();
                    interestCalculator(choice, Principal, InterestRate, LoanTerm);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (2):
                try {
                    System.out.println("Enter current balance:");
                    double balance = input.nextInt();
                    System.out.println("Enter current debt:");
                    double debt = input.nextInt();
                    System.out.println("Enter interest rate of debt:");
                    double interest = input.nextInt();
                    System.out.println("Enter projected inflow:");
                    double projected = input.nextInt();
                    auditTool(balance, debt, interest, projected);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (3):
                try {
                    System.out.println("Choose a type of Loan Calculator!");
                    System.out.println("1- Simple Interest Loan calculator\n2- Compound Interest Loan calculator");
                    int choice = input.nextInt();
                    System.out.print("Enter principal amount: ");
                    double Principal = input.nextDouble();
                    System.out.println("Enter your Interest rate: ");
                    double InterestRate = input.nextDouble();
                    System.out.println("Enter your total loan term in years: ");
                    double LoanTerm = input.nextDouble();
                    loanCalculator(choice, Principal, InterestRate, LoanTerm);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (4):
                try {
                    System.out.println("Enter cost of product: ");
                    double cost = input.nextDouble();
                    System.out.println("Enter rate of markup: ");
                    double rate = input.nextDouble();
                    System.out.println("Enter time in months: ");
                    int months = input.nextInt();
                    productEMICalculator(cost, rate, months);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (5):
                try {
                    System.out.println("Enter your monthly income");
                    int income = input.nextInt();
                    System.out.println("Enter your living expense");
                    int living = input.nextInt();
                    System.out.println("Enter your health expense");
                    int health = input.nextInt();
                    System.out.println("Enter your transport expense");
                    int transport = input.nextInt();
                    System.out.println("Enter your loans");
                    int loans = input.nextInt();
                    int totalexpenses = living + health + transport + loans;
                    expenseCalculator(income, totalexpenses);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (6):
                try {
                    System.out.print("Enter the cost price: ");
                    double cp = input.nextDouble();
                    System.out.print("Enter the selling price: ");
                    double sp = input.nextDouble();
                    profitCalculator(cp, sp);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (7):
                try {
                    System.out.println("Enter your monthly income");
                    int income = input.nextInt();
                    System.out.print("Enter your tax");
                    int taxrate = input.nextInt();
                    taxCalculator(income, taxrate);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            case (8):
                try {
                    System.out.print("Enter current value: ");
                    double amount = input.nextDouble();
                    System.out.print("Enter rate of appreciation: ");
                    double aprate = input.nextDouble();
                    System.out.print("Enter time period of appreciation in years: ");
                    int years = input.nextInt();
                    appreciationCalculator(amount, aprate, years);
                } catch (Exception e) {
                    System.out.println("Invalid data entered");
                    rerun();
                }
                break;
            default: {
                rerun();
            }
        }
    }
}