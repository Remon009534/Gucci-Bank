package com.company;

public class Bank {
    private static String id;
    private String name;
    private String type;
    private float balance;

    public Bank(String name, String type, float balance)
    {
        this.id += 1;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public float getBalance()
    {
        return balance;
    }
    public void setBalance(float balance)
    {
        this.balance = balance;
    }
    public void idCreator()
    {
        System.out.println("ABC_ " + this.id);
    }
    public float withdrawAmount(float amount)
    {
        if(balance > amount)
        {
            setBalance(balance - amount);
        }
        else
        {
            System.out.println("You can't withdraw!!");
        }
        return 0;
    }
    public float depositAmount(float amount)
    {
        amount = balance;
        if(amount > 100 || amount <= 100000)
        {
            System.out.println("You can deposite");
        }
        else
        {
            System.out.println("You can't depostie now!!!");
        }

        return amount;
    }
    public void showinfo()
    {
        System.out.println("Name:- " + name);
        System.out.println("Type:- " + type);
        System.out.println("Balance:- " + balance);
    }

}
