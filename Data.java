//pewarisan interface

public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa adalah Karina");
		
	}

	@Override
	public int stb() {
		return 137;
	}
	
	@Override
	public String mk() {
		return "OOP";
	}
	
}
