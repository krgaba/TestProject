/*******************************************************************************************************
****  Copyright (c) 2017 CA Technologies.  All rights reserved. 
 ****  This software and all information contained therein is confidential and proprietary and shall
 ****  not be duplicated, used, disclosed or disseminated in any way except as authorized by the
 ****  applicable license agreement, without the express written permission of CA. All authorized
 ****  reproductions must be marked with this language. 
 **** 
 ****  EXCEPT AS SET FORTH IN THE APPLICABLE LICENSE AGREEMENT, TO THE EXTENT PERMITTED BY APPLICABLE
 ****  LAW, CA PROVIDES THIS SOFTWARE WITHOUT WARRANTY OF ANY KIND, INCLUDING WITHOUT LIMITATION, ANY
 ****  IMPLIED WARRANTIES OF MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  IN NO EVENT WILL CA
 ****  BE LIABLE TO THE END USER OR ANY THIRD PARTY FOR ANY LOSS OR DAMAGE, DIRECT OR INDIRECT, FROM
 ****  THE USE OF THIS SOFTWARE, INCLUDING WITHOUT LIMITATION, LOST PROFITS, BUSINESS INTERRUPTION,
 ****  GOODWILL, OR LOST DATA, EVEN IF CA IS EXPRESSLY ADVISED OF SUCH LOSS OR DAMAGE.
********************************************************************************************************/
/**
 * 
 */
package com.test.model;

/**
 * @author gabkh01
 *
 */
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
