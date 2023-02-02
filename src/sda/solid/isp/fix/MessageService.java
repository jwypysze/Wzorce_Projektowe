package sda.solid.isp.fix;

public interface MessageService extends ReadableMessageService{
    //1 interfejs rozszerza drugi interfejs
    // wiec ma dostep do jego metody
    //interfejs nie moze implementowac interfejsu ale
    //interfejs m0ze rozszerzac interfejs
    void writeMessage(String message);
}
