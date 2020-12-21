package questions;

public class DemoVarAssignment {

  public static void main(String[] args) {

    int currentSpeed = 0;
    int newSpeed = 100;

    System.out.println(currentSpeed);

    currentSpeed = newSpeed < 220 ? newSpeed : 220;

    System.out.println(currentSpeed);

    newSpeed = 230;

    if(newSpeed < 220) {
      currentSpeed = newSpeed;
    } else {
      currentSpeed = 220;
    }

    System.out.println(currentSpeed);

  }

}
