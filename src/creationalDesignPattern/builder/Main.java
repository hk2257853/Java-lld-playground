package creationalDesignPattern.builder;

public class Main {
	public static void main(String[] args) {
		Student abc = new Student.StudentBuilder().age(10).name("Hk").build();
		System.out.println(abc.toString());
	}
}
