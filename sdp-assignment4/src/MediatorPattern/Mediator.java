package MediatorPattern;

public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
