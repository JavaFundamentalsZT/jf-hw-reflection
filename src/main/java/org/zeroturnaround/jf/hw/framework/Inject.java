package org.zeroturnaround.jf.hw.framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a class member as injectable,
 * meaning that the framework should inject
 * a proxy instance into the annotated field
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {

	Class<?> value();

}
