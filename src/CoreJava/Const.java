public class Const {
    String name;
    int rollNo;
    // creating constructor
//    Const()
//    {
//        name = "Arshad Rahmani";
//        rollNo = 63;
//    }
    void show(){
        System.out.println(name);
        System.out.println(rollNo);
    }

    public static void main(String[] args) {
        Const ref = new Const();
        ref.show();
    }

}
