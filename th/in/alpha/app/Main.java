package th.in.alpha.app;

public class Main{

    public static void myMethod(){
        System.out.println("my Method");
    }

    public void myPublicMethod(){
        System.out.println("my Public Method");
    }
    public static void main(String[] args) {
        myMethod();
        Main myPub = new Main();
        myPub.myPublicMethod();
        //myPub.myMethod();
    }
}