import java.lang.Thread.UncaughtExceptionHandler;

public class CustomThreadException implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Une exception non gérée est déclanché");
		System.out.println("Cette expection est de type :" + e.getClass());
	}

}
