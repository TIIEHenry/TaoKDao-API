package taokdao.api.base.annotation.todo;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 需要启动Activity时清空
 */
@Documented
@Retention(CLASS)
@Target({TYPE})
public @interface NeedClear {
}
