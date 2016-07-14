package prob4;

public class MyStackEmptyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyStackEmptyException() {
		super( "MyStackException" );
	}
	
	public MyStackEmptyException( String message ) {
		super( message );
	}
}