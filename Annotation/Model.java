package annotation;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface Model{
    public String nomTable() default"";
}