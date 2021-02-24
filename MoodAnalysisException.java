package javasample4;

public class MoodAnalysisException extends Exception {
	private static final long serialVersionUID = 1L;
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY
	}
	ExceptionType type;
	public MoodAnalysisException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}

}
