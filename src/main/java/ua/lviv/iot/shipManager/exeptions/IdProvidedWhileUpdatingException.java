package ua.lviv.iot.shipManager.exeptions;

public class IdProvidedWhileUpdatingException extends RuntimeException {


    @Override
    public String getMessage() {
        return "Failed to update a ship with passed id. Update method should not use external ids";
    }
}
