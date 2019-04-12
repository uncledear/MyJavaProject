public class CellPhone extends TelePhone {
    public void call(){
        System.out.println("i can CellPhone");
}
public void message() {
    System.out.println("i can take message");
}
public static void main(String[] args){
    CellPhone cp=new CellPhone();
    cp.call();

    cp.message();
}
}