package structuralDesignPattern.composite;

public class Main {
	public static void main(String[] args) {
		Directory D1 = new Directory("D1");
		File F1 = new File("F1");
		Directory D2 = new Directory("D2");
		File F2 = new File("F2");
		Directory D3 = new Directory("D3");
		File F3 = new File("F3");
		Directory D4 = new Directory("D4");
		File F4 = new File("F4");
		
		D1.addItem(D2);
		D1.addItem(F1);
		D2.addItem(F2);
		D2.addItem(D3);
		D2.addItem(D4);
		D3.addItem(F3);
		D2.addItem(F4);
		
		D1.ls();
//		D4.ls();
	}
}
