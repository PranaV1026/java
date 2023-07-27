class BankAccount:
    def __init__(self, account_number,balance):
        self._account_number = account_number
        self._balance = balance
        
    def deposit(self,amount):
        if amount > 0:
            self._balance += amount
            
    def withdraw(self,amount):
        if 0 < amount <= self._balance:
            self._balance -= amount
    
    def  get_balance(self):
        return self._balance
    
    def get_account_number(self):
        return self._account_number
    
account1 = BankAccount("123456789",20000)

print("Account Balance:", account1.get_balance())
print("Account Number:", account1.get_account_number())

account1.deposit(257)
print("Updated Balance:", account1.get_balance())
    