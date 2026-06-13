class Outer {

    void display() {
        System.out.println(
                "Outer class display"
        );
    }

    class Inner {

        void display() {

            System.out.println(
                    "Inner class display"
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Outer out =
                new Outer();

        out.display();

        Outer.Inner in =
                out.new Inner();

        in.display();
    }
}