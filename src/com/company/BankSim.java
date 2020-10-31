package com.company;

public class BankSim {

    public static void main(String[] args) {
        Bank myBank = new Bank(2020, 0.00f, "Yi");

        myBank.addMoney(200);
        System.out.println(myBank.balance);
        myBank.clearAccount();
        System.out.println(myBank.balance);
        myBank.removeMoney(40);
        System.out.println(myBank.balance);



    }

    public static class Bank{
        public float balance = 0.00f;
        public int yearFounded;
        public String founderName;

        Bank(int _yearFounded, float _startingBalance, String _founderName){
            balance = _startingBalance;
            yearFounded = _yearFounded;
            founderName = _founderName;

        }

        public void addMoney(float _amountToAdd){
            balance = balance + _amountToAdd;
        }

        public void removeMoney(float _amountToRemove){
            balance = balance - _amountToRemove;
        }

        public void clearAccount(){
            balance = 0.00f;
        }
    }

}
