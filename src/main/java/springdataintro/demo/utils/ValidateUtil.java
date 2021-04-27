package springdataintro.demo.utils;

import org.hibernate.exception.ConstraintViolationException;
import javax.validation.ConstraintViolation;
import java.util.Set;

public interface ValidateUtil {
    <E> boolean isValid(E entity);

    <E> Set<ConstraintViolation<E>> violations(E entity);
}
