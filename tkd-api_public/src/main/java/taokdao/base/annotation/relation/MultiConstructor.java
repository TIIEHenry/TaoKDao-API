package taokdao.base.annotation.relation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.RetentionPolicy.CLASS;


@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR})
public @interface MultiConstructor {
}