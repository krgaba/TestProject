
package com.test.model;

public class BankAccount {
    
    
    private String accountName;
    
    private String accountType;
    
    private String ssn;
    
    private double initialDeposit;
    
    
    public BankAccount(String ssn, double initialDeposit){
        this.ssn = ssn;
        this.initialDeposit = initialDeposit;
    }
    

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @return the initialDeposit
     */
    public double getInitialDeposit() {
        return initialDeposit;
    }
    
    public void printAccountInfo(){
        
        System.out.println(this.accountName + ", " + this.accountType + ", $" + this.initialDeposit);
    }
    
    
    
    
    /*Create a BankAccount class and it should contain following properties:
    account name, account type, ssn, and initial deposit.
    ssn and initial deposit should be read only, meaning they should only be 
    set via constructor, so only get methods for them.
    
    Class should also have a public method printAccountInfo which should print "Account Name, Account Type, Initial deposit".
    For example "Khuram Gaba, Savings, $200"
    
    Good luck!
*/
}
