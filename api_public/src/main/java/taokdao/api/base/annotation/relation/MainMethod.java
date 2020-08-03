package taokdao.api.base.annotation.relation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 规定主要方法，其他方法必须调用主构造方法
 */
@Documented
@Retention(CLASS)
@Target({METHOD})
public @interface MainMethod {
}