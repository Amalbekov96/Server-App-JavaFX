package kg.one.serverapp.Exception;

public class DepartmentNotFound extends RuntimeException{
    public DepartmentNotFound(String message) {
        super(message);
    }
}
