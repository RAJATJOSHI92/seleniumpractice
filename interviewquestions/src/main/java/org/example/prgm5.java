package org.example;

import java.util.ArrayList;

class Account {
    String name;
    String accountno;
    double balance;
    double amount;

    Account(String name, String accountno, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountno = accountno;

    }

    public String getName() {
        return name;
    }

    public String getAccountno() {
        return accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.amount = amount;
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public String getaccountinfo() {
        return "name=" + name + " " + "accountno=" + accountno + " " + "balance=" + balance;
    }
}


class Bank {
    ArrayList<Account> accounts;
    double amount;

    Bank() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeccount(Account account) {
        accounts.remove(account);
    }

    public void depositmoney(Account account, double amount) {
        //this.amount=amount;
        account.deposit(amount);
    }

    public void withdrawmoney(Account account, double amount) {
        account.deposit(amount);
    }

    public ArrayList<Account> getaccounts() {
        return accounts;
    }


}

public class prgm5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account rajat = new Account("rajat", "123456", 45000);
        Account shubham = new Account("shubham", "7890", 55000);
        Account vivek = new Account("vivek", "00245", 65000);
        bank.addAccount(rajat);
        bank.addAccount(shubham);
        bank.addAccount(vivek);
        ArrayList<Account> acc = bank.getaccounts();
        for (Account ac : acc) {
            System.out.println(ac.getaccountinfo());
        }

        bank.depositmoney(rajat, 5000);
        System.out.println("after deposit " + rajat.amount + " new balance is :");
        System.out.println(rajat.getaccountinfo());

        bank.withdrawmoney(rajat, 3000);
        System.out.println("after withdraw" + rajat.amount + " new balance is: ");
        System.out.println(rajat.getaccountinfo());

    }
}
