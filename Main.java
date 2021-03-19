package pengenalan;
//belajar membuat class dan object
class Mahasiswa{
	String nama;
	String nohp;
	double ipk;
}
public class Main {
	public static void main(String[] args) {
		Mahasiswa Mahasiswa1= new Mahasiswa();
		
		Mahasiswa1.nama="Rifki";
		Mahasiswa1.nohp="0899186676";
		Mahasiswa1.ipk= 3.89;
		System.out.println(Mahasiswa1.nama);
		System.out.println(Mahasiswa1.nohp);
		System.out.println(Mahasiswa1.ipk);
	}
}
