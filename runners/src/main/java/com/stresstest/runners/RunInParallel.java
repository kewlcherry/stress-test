package com.stresstest.runners;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({TYPE, METHOD})
@Retention(RUNTIME)
public @interface RunInParallel {
    int randomStartDelayMax() default 0;
    int numThreads() default 10;
    int maxThreads() default 500;
}
