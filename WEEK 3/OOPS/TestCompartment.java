import java.util.Random;

abstract class Compartment {

    public abstract String notice();
}

class FirstClass extends Compartment {

    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {

    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] coach =
                new Compartment[10];

        Random random =
                new Random();

        for(int i=0;i<10;i++){

            int num =
                random.nextInt(4)+1;

            switch(num){

                case 1:
                    coach[i]=
                        new FirstClass();
                    break;

                case 2:
                    coach[i]=
                        new Ladies();
                    break;

                case 3:
                    coach[i]=
                        new General();
                    break;

                case 4:
                    coach[i]=
                        new Luggage();
                    break;
            }
        }

        System.out.println(
                "Compartment Notices:\n"
        );

        for(Compartment c:coach){

            System.out.println(
                    c.notice()
            );
        }
    }
}