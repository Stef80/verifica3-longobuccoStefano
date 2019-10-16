package es16;

public class IllegalAppointmentException extends RuntimeException {

    public IllegalAppointmentException() {
        super("Appuntamento non valdo, non puo finire prima di essere iniziato");
    }

    public IllegalAppointmentException(String msg){
        super(msg);
    }
}// end Class
