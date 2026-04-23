package ch28_Exception_Handling;

public class tut01_AgeInvalidException extends RuntimeException {
    public tut01_AgeInvalidException(){
        super("Invalid Age !!");
    }
    public tut01_AgeInvalidException(String message){
        super(message);
    }
}
