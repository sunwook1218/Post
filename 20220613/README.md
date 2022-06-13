```java
public class TypeCastUtils {

  public static <T> T cast(Object origin, Class<T> castType) throws TypeCastException {
    if(origin == null) {
      throw ExceptionUtils.callElementLoggingException(() -> new TypeCastException("origin Object is null"));
    }
    
    if(castType.isInstance(origin)) {
      return (T) origin;
    } else {
      throw ExceptionUtils.callElementLoggingException(() -> new TypeCastException("origin Object is not " + castType.getName() + " instance"));
    }
  }

  public static class TypeCastException extends Exception {
  }

}

public class ExceptionUtils {

  public static <E extends Exception> E callElementLoggingException(Supplier<E> exception) {
    E customException = exception.get();
    StackTraceElement callElement = customException.getStackTrace()[2];
    
    Logger.getLogger(callElemeng.getClass()).error("ERROR occurred at [" + callElement.getClassName() + "." + callElement.getMethodName() + "]");
  }

}

public class PeriodSample {
  public static void main(String[] args) {
    String dateTime = LocalDateTime.now()
            .minusDays(Period.ofWeek(1).getDays())
            .format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            
    System.out.println(dateTime);
  
  }
}
```
