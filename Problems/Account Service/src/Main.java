interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

// Declare and implement your AccountServiceImpl here
class AccountServiceImpl implements AccountService {
    Account[]accounts;
    AccountServiceImpl(Account[]accounts) {
        this.accounts = accounts.clone();

    }


    @Override
    public Account findAccountByOwnerId(long id) {
        int indexOfAccount = 0;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getOwner().getId() == id) {

                indexOfAccount = i;
                break;
            }
        }
        return accounts[indexOfAccount];
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long numberOfAccounts = 0;
        for (Account account: accounts) {
            if (account.getBalance() > value) {
                numberOfAccounts++;
            }
        }
        return numberOfAccounts;
    }

}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}