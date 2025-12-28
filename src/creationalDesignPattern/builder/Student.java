package creationalDesignPattern.builder;

public class Student {
	private int age;
	private String stream;
	private String name;

	private Student(StudentBuilder studentBuilder) {
		this.age = studentBuilder.age;
		this.stream = studentBuilder.stream;
		this.name = studentBuilder.name;
	}

	@Override
	public String toString() {
		return "Student{name='" + name + "', age=" + age + ", stream='" + stream + "'}";
	}

	public static class StudentBuilder {
		private int age;
		private String stream;
		private String name;

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder stream(String stream) {
			this.stream = stream;
			return this;
		}

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public Student build() {
			return new Student(this);
		}

	}

}
