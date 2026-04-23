package ch00_Java_Refresh;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.printf("Hello %s!%n", "world");
//        %s → replaced with "world"
//        ! → printed as it is
//        %n → new line
        System.out.printf("Hello%nWorld");
//        %n is better than \n because
//        it is platform-independent and automatically uses
//        the correct newline format for the operating system.`

        System.out.printf("Java is %d percent fun!",100);


//        A variable is a memory location used to store data,
//        and each variable is identified by a unique name called an identifier
    }
}
