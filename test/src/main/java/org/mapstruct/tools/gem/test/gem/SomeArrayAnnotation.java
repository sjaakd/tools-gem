/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.tools.gem.test.gem;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.mapstruct.tools.gem.test.SomeAnnotation;

/**
 * @author Sjaak Derksen
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE )
public @interface SomeArrayAnnotation {

    enum TEST2 { A, B };

    Class<?>[] myClassWithDefault() default {};

    boolean[] myBooleanWithDefault();

    TEST2[] myEnumWithDefault() default TEST2.A;

    SomeAnnotation myAnnotation();

}
