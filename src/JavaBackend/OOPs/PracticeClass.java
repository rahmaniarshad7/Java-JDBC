package JavaBackend.OOPs;

class Private{
    private String myName = "Arshad Rahmani";

    public void display(){
        System.out.println(myName);
    }
}

public class PracticeClass {
    public static void main(String[] args) {
        Private pvt = new Private();
        pvt.display();
    }
}
