Build an ATM Console Application

- Flow:
   - The user is required to login by entering an Account number and the PIN of that account
   - If the Account is found then the user can perform 4 actions: View my balance; Deposit; Withdrawal; Exit
   - If the Account is not found then the user is notified and asked to Try Again
   - Actions:
             - View my balance -> the balance of the account is displayed
             - Deposit -> the user is asked to enter an amount, and that amount is added to the balance of
                the account he is authenticated for
             - Withdrawal -> the user is asked to select an amount from a list, and if the the Cash Dispenser
                has enough bills, and the balance supports it, the money are withdrawn
             - Exit -> the used is logged-out and the next user is required to login
-Use Cases:
   - An ATM uses a Screen to display messages and a Keypad for the interaction
   - An ATM uses a BankDatabase which contains Accounts
   - An Account has an account number and is protected by a PIN.
   - An Account has a balance which on which you can apply a credit or debit operations
   - An ATM supports three types of Transactions: Balance Inquiry, Cash Deposit and Cash Withrawal
   - An ATM uses a Cash Dispenser to withdraw  money.
   - The Cash Dispenser has a limited amount of 20$ bills, and can only dispense these kind of bills.
   - The number of bills in a Cash Dispenser is not increased when a Deposit Transaction is Made.
   - An ATM allows a user to perform a Transaction only if the user is authenticated with his account number and pin
   - The Balance Inquiry transaction should display on the screen the Balance of the account on which the user is authenticated
   - The Withdrawal transaction should give the user the possibility to withdraw 20$, 40$, 60$, 100$, 200$ from the account on which the user is authenticated or to cancel the transaction.
   - The Deposit transaction should give the user the possibility to credit the account on which the user is authenticated with an amount, thus increasing it's balance
   - The Keypad gives you the user input
   - The Screen can display a message, including formatted amounts