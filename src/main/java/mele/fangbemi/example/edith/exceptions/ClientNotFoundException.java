package mele.fangbemi.example.edith.exceptions;




public class ClientNotFoundException extends RuntimeException {
    public ClientNotFoundException(String message){
        super(message);
    }
}
