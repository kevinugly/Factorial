package math;

class One {
  public String invoke() {
    String message = "Hello, thank you for calling ";
    return message + actionOne();
  }

  public String actionOne() {
    return "This is one";
  }
}

class Two extends One {
  public String actionOne() {
    return "This is two";
  }
}

//As you work on this, look at the code before change and after change. Then relate this class to the test class
class Three extends One {
  public String actionOne() {
    return "This is three";
  }
}

//Feedback: Do not change any code below this line. Please change any code above this line.

class Sample {
  public static void main(String[] args) {
    One one = new One();
    Two two = new Two();
    Three three = new Three();

    System.out.println(one.invoke()); //Hello, thank you for calling This is one
    System.out.println(two.invoke()); //Hello, thank you for calling This is two
    System.out.println(three.invoke()); //Hello, thank you for calling This is three
  }
}

//For the same output, let's reduce the duplication.
//How can use use OOP, inheritance, polymorphism to do that?