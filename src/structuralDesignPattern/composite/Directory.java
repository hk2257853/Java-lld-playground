package structuralDesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemIF {
	List<FileSystemIF> itemList  = new ArrayList<>(); // I can initialize in a constructor too
	String directoryName;

	Directory(String directoryName) {
		this.directoryName = directoryName;
	}
	
	public void addItem(FileSystemIF item) {
		itemList.add(item);
	}

	@Override
	public void ls() {
		System.out.println("Directory here:" + directoryName);
		for (FileSystemIF items: itemList) {
			items.ls();
		}
	}

}
