package functionalProgramming.anonymous.inner;


public class HelloworldAnonymousClasses {


    interface Helloworld {
        public void greet();

        public void greetSomeone(String someone);
    }


    public void sayHello() {


        class EnglishGreeting implements Helloworld {
            String name = "world";

            @Override
            public void greet() {
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello," + name);
            }
        }


        Helloworld englishGreeting = new EnglishGreeting();

        Helloworld frenchGreeting = new Helloworld() {

            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {

                name = someone;
                System.out.println("Sault," + name);

            }
        };

        Helloworld spanishGreeting = new Helloworld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola," + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greet();
        spanishGreeting.greet();


    }


    public static void main(String[] args) {
        HelloworldAnonymousClasses helloworldAnonymousClasses = new HelloworldAnonymousClasses();
        helloworldAnonymousClasses.sayHello();
    }

}
