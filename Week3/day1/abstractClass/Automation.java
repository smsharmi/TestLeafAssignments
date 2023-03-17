package abstractClass;

public class Automation extends MultipleLanguage implements TestTool, Language {

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.selenium();
		obj.java();
		obj.python();
		obj.ruby();

	}

	public void selenium() {
		System.out.println("Selenium supports");

	}

	public void java() {
		System.out.println("JAVA");
	}

	public void python() {
		System.out.println("Python");

	}

	public void ruby() {
		System.out.println("Ruby");

	}

}
