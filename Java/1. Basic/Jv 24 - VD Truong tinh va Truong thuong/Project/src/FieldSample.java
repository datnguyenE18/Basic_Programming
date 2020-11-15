public class FieldSample {
	
	// Đây là một trường tĩnh (static field).
	public static int MY_STATIC_FIELD = 100;
	

	// Đây là một trường thông thường.
	public String myValue;
	
	// Constructor để khởi tạo đối tượng FieldSample.
	public FieldSample( String myValue ) {
		this.myValue = myValue;
	}
	
}

/*
public class FinalFieldExample {
 
    // Một trường final (Cũng được gọi là trường hằng số).
    // Trường final không cho phép gán giá trị mới.
    public final int myValue = 100;
 
    // Một trường tĩnh và final.
    // Trường final không cho phép gán giá trị mới.
    public static final long MY_LONG_VALUE = 1234L;
 
}
*/