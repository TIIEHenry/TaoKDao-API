package taokdao.api.base.annotation.maintain;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 长期不变
 */
@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR, METHOD, FIELD, TYPE})
public @interface LongTerm {
}
