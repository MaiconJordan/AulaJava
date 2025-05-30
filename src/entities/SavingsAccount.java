package entities;

public class SavingsAccount extends Account {


    private Double interestRate;

     public SavingsAccount(Integer number, String holder, java.lang.Double balance) {
        super(number, holder, balance);
        //TODO Auto-generated constructor stub
    }

     public Double getInterestRate() {
         return interestRate;
     }

     public void setInterestRate(Double interestRate) {
         this.interestRate = interestRate;
     }

     public void updateBalance(){
        balance += balance * interestRate;
     }
   
}
