package annotation;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
public @interface Field{
    public String nomcolonne() default"";
}