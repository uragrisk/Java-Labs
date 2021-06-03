package ua.lviv.iot.shipManager.exeptions;

public class IdProvidedWhileCreationException extends  RuntimeException{
    @Override
    public String getMessage(){
        return "Failed to create a ship with passed id. Creation method should not use external ids";
    }
}
