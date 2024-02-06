package xmldatareading;

public class StringBuilderTest {
	
	static String jsonString = "Test Automation";

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append(jsonString);
		System.out.println(builder);
	}

}
