package taokdao.api.base.annotation.impl;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 由内部实现
 */
@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR, METHOD, FIELD, TYPE})
public @interface InternalImpl {
}
