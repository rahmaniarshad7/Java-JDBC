package Infosys.SpringBoard;

public class Constructor {
    private String bankName;
    private String location;
    private String phoneNumber;
     Constructor( String bankName , String location , String phoneNumber){
         this.bankName = bankName;
         this.location = location;
         this.phoneNumber = phoneNumber;
     }
     void getData(){
         System.out.println(STR."BankName : \{bankName}");
         System.out.println(STR."Address : \{location}");
         System.out.println(STR."Contact Number : \{phoneNumber}");
     }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("BOI" , "Dehradun" , "9318364519");
        constructor.getData();
    }

}
