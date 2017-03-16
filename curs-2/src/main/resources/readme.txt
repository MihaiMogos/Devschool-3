Build an ro.isr.devschool3.atm.utils.ATM Console Application

-Flow:
    -The user is required to login by entering an Account number and the PIN of that account
    -If the Account is found then the user can perform 4 actions: View my balance, ro.isr.devschool3.atm.transaction.Deposit, ro.isr.devschool3.atm.transaction.Withdrawal, Exit
    -If the Account is not found then the user is notified and asked to Try Again
    -Actions:
        -View my balance -> the balance of the account is displayed
        -ro.isr.devschool3.atm.transaction.Deposit -> the user is asked to enter an amount and that amount is added to the balance
            of the account he is authentificated
        -ro.isr.devschool3.atm.transaction.Withdrawal -> the user is asked to select an amount from a list and if the Cash Dispenser has enough
            bills and the balance supports it the money are withdrawn
        -Exit -> the user is logged-out and the next user is required to login
-Use cases:
    -An ro.isr.devschool3.atm.utils.ATM uses a Screen to display messages and a Keypad for the interaction
    -An ro.isr.devschool3.atm.utils.ATM uses a ro.isr.devschool3.atm.bank.BankDatabase which contains Accounts
    -An Account has an account number and is protected by a PIN
    -An Account has a Balance which on you can apply a credit or debit operation
    -An ro.isr.devschool3.atm.utils.ATM supports three types of Transactions: Balance Inquiry, Cash ro.isr.devschool3.atm.transaction.Deposit and Cash ro.isr.devschool3.atm.transaction.Withdrawal
    -An ro.isr.devschool3.atm.utils.ATM uses a Cash Dispenser to withdraw money
    -The Cash Dispenser has a limited amount of 20$ bills and can only dispense these kind of bills
    -The number of bills in a Cash Dispenser is not increased when a ro.isr.devschool3.atm.transaction.Deposit Transaction is made
    -An ro.isr.devschool3.atm.utils.ATM allows a user to perform a Transaction only if the user is authentificated with his account number and PIN
    -The Balance Inquiry transaction should display on the screen the Balance of the account
        on which the user is authentificated
    -The ro.isr.devschool3.atm.transaction.Withdrawal transaction should give the user the possibility to withdraw 20$, 40$, 60$, 100$, 200$
        from the account on which the user is authentificated
    -The ro.isr.devschool3.atm.transaction.Deposit transaction should give the user the possibilty to credit the account on which the user
        is authentificated
    -The KeyPad gives you the user input
    -The Screen can display a message, including formatted amounts