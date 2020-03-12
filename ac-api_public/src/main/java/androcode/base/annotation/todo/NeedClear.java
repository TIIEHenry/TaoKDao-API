package androcode.base.annotation.todo;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * 需要启动Activity时清空
 */
@Documented
@Retention(CLASS)
@Target({TYPE})
public @interface NeedClear {
}
