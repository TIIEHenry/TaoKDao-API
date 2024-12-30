package taokdao.api.base.annotation.relation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR})
public @interface MultiConstructor {
}