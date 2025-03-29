package PROBLEM_SOLVING.GUESSOP;

class Parent {
    public Parent() {
        show();
    }

    public void show() {
        System.out.println("Printing inside parent: ");
    }
}

class Child extends Parent {

    String name;
    public Child() {
        name = "Ranga!!";
//        show();
    }

    public void show() {
        System.out.println("Printing inside child: "+ name);
    }
}

public class CallSuper {

    public static void main(String[] args) {
        Child child = new Child();
//        child.show();
    }

}
