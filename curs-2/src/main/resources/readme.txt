Build an ATM Console Application
Flow:
    - The user is required to login by entering an Acount number and the PIN of that account
    - If the Account is found then the user can perform 4 actions: - View by balance; Deposit; Withdrawal; Exit
    - If the Account is not found the the user is notified and asked to Try Again
    - Actions:
        - View my balance -> the balance of the account is displayed
        - Deposit -> the user is asked to enter an amount, and that amount is added to the balance of the account
        - Withdrawal -> the user is asked to select an amount from a list, and if the Cash Dispenser has enough bills,
            and the balance supports it, the money are withdrawn
        - Exit -> the user is logged-out and the next user is required to login
- Use Cases:
    - An ATM uses a Screen to display messages and a Keypad for the interaction
    - An ATM uses a BankDatabase which contains Accounts
    - acc has acc number and PIN
    - acc has balance with credit or debit operations
    - ATM transactions - Balance Inquiry, Cash Deposit and Cash Withdrawal.
    - An ATM uses a Cash Dispenser to withdraw money
    - The Cash Dispenser has a limited amount of 20$ bills, and can only dispense these kind of bills
    - The number of bills is not increased when a Deposit Tran is made
    - transaction only when authenticated
    - the balance should display on screen the balance of his account
    - withdrawal 20$, 40$, 60$, 100$, 200$ from the account
    - keypad gives you the user input
    - the Screen can display a message, including formatted amounts