package structuralDesignPattern.composite;

public class File implements FileSystemIF {
	String fileName;

	File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void ls() {
		System.out.println("File Here" + fileName);
	}

}
