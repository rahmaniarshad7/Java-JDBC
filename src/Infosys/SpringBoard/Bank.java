package Infosys.SpringBoard;

class Bank {
    String bankName;
    String area;

    public static void main(){
        Bank bank2=new Bank("xyz");
        System.out.println(bank2.bankName);
        System.out.println(bank2.area);

    }
    Bank(String area){
        this.area=area;
    }
}
 