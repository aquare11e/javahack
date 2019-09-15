package xyz.walkingcoders.javahack.exception;

public class NotFoundException extends BusinessLogicException {
    public NotFoundException(Class<?> entityClass, Long id) {
        super(String.format("Entity %s with id (%d) not found", entityClass.getSimpleName(), id));
    }
}
