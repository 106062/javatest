package demo.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestdemoApplication {
	public static void main(String[] args) {
		myObjT mt = new myObjT();
		mt.SetValue(1 , 2);
		mt.show();
		SpringApplication.run(TestdemoApplication.class, args);
	}
}

class myObjT{
	private int _a = 0;
	private int _b = 0;

	public void SetValue(int a, int b) {
		try {
			_a = a;
			_b = b;
		} catch (Exception e) {
			System.out.println("Exection " + e.getMessage());
		}
	}

	public void show() {
		int c = _a + _b;
		System.out.println("res :" + c);
	}
}