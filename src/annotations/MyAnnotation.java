package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 
 * @author Alina
 *
 */
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
	public String test() default "Test";

}
