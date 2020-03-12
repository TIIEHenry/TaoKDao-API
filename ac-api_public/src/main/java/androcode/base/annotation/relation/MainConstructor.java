package androcode.base.annotation.relation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 规定主要构造方法，其他构造方法必须调用主构造方法
 */
@Documented
@Retention(CLASS)
@Target({CONSTRUCTOR})
public @interface MainConstructor {
}