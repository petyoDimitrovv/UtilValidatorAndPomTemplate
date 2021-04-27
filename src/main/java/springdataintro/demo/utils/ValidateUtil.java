package springdataintro.demo.utils;

import org.hibernate.exception.ConstraintViolationException;
import javax.validation.ConstraintViolation;
import java.util.Set;

public interface ValidateUtil {
    <E> boolean isValid(E entity);

    <E> Set<ConstraintViolation<E>> violations(E entity);
    //TODO: implement validator in config: 
//     @Bean
//     public Validator validator(){
//         return Validation.buildDefaultValidatorFactory().getValidator();
//     }

//     @Bean
//     public ValidateUtil validateUtil() {
//        return new ValidatorUtilImpl(validator());
//     }

}
