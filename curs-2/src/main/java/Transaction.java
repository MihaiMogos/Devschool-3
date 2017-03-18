/**
 * Created by Viorica Patrascu on 3/16/2017.
 */
public abstract class Transaction {

        protected Account account;

        protected Bankdatabase bankdatabase;

        protected Screen screen;

        public Transaction(Account account){
                this.account = account;

                screen = new Screen();
        }

        protected abstract void execute();
}
