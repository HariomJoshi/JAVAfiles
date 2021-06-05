package com.company;

// the following is the great example of when to use extend class function and when to use implement interface function
interface camera{
    int images = 4;
    void takeSnap();
    void recordVideo();
    private int number(){
        return images;
    }
    default void message2(){
        System.out.println(number() + " Images were captured! ");
        System.out.println("Taking Images! ");
    }
}
interface wifi{
    void getNetworks();
    private void remainingMessage(){  //this is the method which cannot be accessed by the subclasses
        // the aim of making this is to help the code in the default method
        // this is used when the code in the default method becomes typical so it is needing another method to simplify it
        System.out.println("This is the remaining message");
    }
    default void message(){  // by adding a default method we are adding a sort fo option for all the subclasses that
        // either to override it or not
        remainingMessage();  // this contains the remaining code
        System.out.println("Getting networks");
    }
}
class cellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(long phoneNumber){
        System.out.println("Connecting ...." + phoneNumber);
    }
}
class smartPhone extends cellPhone implements camera , wifi{
    public void takeSnap(){
        System.out.println("Taking snap!");
    }
    public void recordVideo(){
        System.out.println("Recording Video! ");
    }
    public void getNetworks(){
        System.out.println("Your networks are full and better than usual ");
    }
}
public class cwh_default_methods {
    public static void main(String[] args) {
        cellPhone old = new cellPhone();
        old.callNumber(975868582);
        old.pickCall(975868582);
        smartPhone newPhone = new smartPhone();
        newPhone.recordVideo();
        newPhone.getNetworks();
        newPhone.takeSnap();
        newPhone.message();
        // newPhone.remainingMessage(); // throws error since the access is limited to interface wifi
        newPhone.message2();
    }
}
