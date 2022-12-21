package ATM_Machine;

public class Account {
        private String Number ;
        private String Name ;
        private double Balance;
        private String Email;
        private String Phone_number;

        public Account(String Number, String Name, double Balance , String Email, String Phone_number){
            this.Number = Number;
            this.Name = Name;
            this.Balance = Balance;
            this.Email = Email;
            this.Phone_number = Phone_number;
        }

        public void DepositMoney(Double  DepositMoney){
            this.Balance +=  DepositMoney ;
            System.out.println("Deposite is Successfull , New Balance is " + this.Balance);
        }
        public void Withdraw(double WithdrawMoney){
            if(this.Balance - WithdrawMoney < 0){
                System.out.println("Withdraw Unseccessfull Your Corrent Balance is : " + this.Balance);
            }
            else{
                this.Balance -= WithdrawMoney ;
                System.out.println("Withdraw Money is Successfull Total Amount is : " + this.Balance);
            }
        } 
        
        public String getnumber(){
            return Number;
        }
        public void setNumber(String number){
            Number = number;
        }
        public double getBalance(){
            return Balance;
        }
        public void setbalance(double balance){
            Balance = balance;
        }
        public String getName(){
            return Name ;
        }
        public void setName(String name){
            Name = name;
        }
        public String setEmail(){
            return Email;
        }
        public void getEmail(String email){
            Email = email;
        }
        public String Phone_number(){
            return Phone_number;
        }
        public void setPhone_number(String phone_number){
            Phone_number = phone_number;
        }




    
}
