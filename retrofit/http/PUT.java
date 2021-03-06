package retrofit.http;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD})
@RestMethod(hasBody=true, value="PUT")
public @interface PUT
{
  String value();
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/retrofit/http/PUT.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */