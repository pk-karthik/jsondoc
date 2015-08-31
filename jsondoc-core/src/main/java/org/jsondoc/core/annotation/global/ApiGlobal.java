package org.jsondoc.core.annotation.global;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation has to be used on a class dedicated to global api documentation 
 * 
 * @author Fabio Maffioletti
 *
 */
@Documented
@Target(value=ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiGlobal {
	
	public ApiGlobalVerb[] globalverbs() default {};
	
	public ApiGlobalHeader[] globalheaders() default {};
	
	public ApiGlobalResponseStatusCode[] globalresponsestatuscodes() default {};
	
	public ApiChangelog[] changelogs() default {};

	public ApiMigration[] migrations() default {};
	
}
