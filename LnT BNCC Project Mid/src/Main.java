import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Main {
Scanner scan = new Scanner(System.in);
Random rand = new Random();
Vector<String>karyawanId = new Vector<>();
Vector<String>karyawanNama = new Vector<>();
Vector<String>karyawanGender = new Vector<>();
Vector<String>karyawanJabatan = new Vector<>();
Vector<Integer>karyawanGaji = new Vector<>();


	
	public void insert() {
	
	String nama, kelamin, jabatan;
	String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String id = "";
	int gaji, pendapatan;
	int kode = 2;	
	char[] text = new char[kode];
	do {
		System.out.print("Input nama karyawan [=>3]:");
		nama = scan.nextLine();
	} while (nama.length()<4);
	
	do {
		System.out.print("Input Jenis Kelamin [Laki-Laki | Perempuan] (Case Sensitive):");
		kelamin = scan.nextLine();
	} while (!(kelamin.equals("Laki-Laki") || kelamin.equals("Perempuan")));
	
	do {
		System.out.print("Input Jabatan [Manager | Supervisor | Admin](Case Sensitive): ");
		jabatan = scan.nextLine();
	} while (!(jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin") ));
	
	double bonus = 0;
	
	for (int i = 0; i < kode; i++) {
		text[i] = huruf.charAt(rand.nextInt(huruf.length()));
	}
	for (int i = 0; i < text.length; i++) {
		id += text[i];
	}
	
	
	if (jabatan !=("Manager")) {
		gaji = 8000000;
	}else if (jabatan != ("Supervisor")) {
		gaji = 6000000;
	}else {
		gaji = 4000000;
	}
	
	
	if (jabatan !=("Manager")) {
		bonus = 10;
	}else if (jabatan != ("Supervisor")) {
		bonus = 7.5;
	}else {
		bonus = 5.0;
	}
	
	pendapatan = (int) ((gaji*bonus) + gaji);
	
	int randomNum = (int)(Math.random() *10000);  
	
	
	System.out.println("Berhasil Menambahkan karyawan dengan id "+ id +  "-"+ randomNum);
	System.out.println("Enter to return");
	scan.nextLine();
	
	karyawanId.add(id);
	karyawanNama.add(nama);
	karyawanGender.add(kelamin);
	karyawanGaji.add(gaji);
	karyawanJabatan.add(jabatan);
	
	for (int i = 0; i < karyawanNama.size(); i++) {
		for (int j = 0; j < karyawanNama.size() - i - 1; j++) {
			if (karyawanNama.get(j).charAt(0) < karyawanNama.get(j + 1).charAt(0)) {
				String swap = karyawanNama.get(j);
				karyawanNama.set(j, karyawanNama.get(j + 1));
				karyawanNama.set(j + 1, swap);
			
			swap = karyawanId.get(j);
			karyawanId.set(j, karyawanId.get(j + 1));
			karyawanId.set(j + 1, swap);
			
			int swap2 = karyawanGaji.get(j);
			karyawanGaji.set(j, karyawanGaji.get(j + 1));
			karyawanGaji.set(j + 1, swap2);
			
			swap = karyawanGender.get(j);
			karyawanGender.set(j, karyawanGender.get(j + 1));
			karyawanGender.set(j + 1, swap);
			
			swap = karyawanJabatan.get(j);
			karyawanJabatan.set(j, karyawanJabatan.get(j + 1));
			karyawanJabatan.set(j + 1, swap);
				
			}
			
		}
	
	
	}
	
	System.out.println("Sucesfull added");
	System.out.println("Enter to continue");
	scan.nextLine();
	menu();
	}

	public void view() {
		for (int i = 0; i < karyawanNama.size(); i++) {
			System.out.println("\nNo: " + ( i + 1));	
			System.out.println("\nKode Karyawan:\n" + karyawanId.get(i));
			System.out.println("\nNama Karyawan:\n" +karyawanNama.get(i));
			System.out.println("\nJenis Kelamin:\n" + karyawanGender.get(i));
			System.out.println("\nJabatan:\n" + karyawanJabatan.get(i));
			System.out.println("\nGaji Karyawan:\n" + karyawanGaji.get(i)+ "\n");
		}
	
		menu();

	}
	
	public void update() {
		for (int i = 0; i < karyawanNama.size(); i++) {
			System.out.println("\nNo: " + ( i + 1));	
			System.out.println("\nKode Karyawan:\n" + karyawanId.get(i));
			System.out.println("\nNama Karyawan:\n" +karyawanNama.get(i));
			System.out.println("\nJenis Kelamin:\n" + karyawanGender.get(i));
			System.out.println("\nJabatan:\n" + karyawanJabatan.get(i));
			System.out.println("\nGaji Karyawan:\n" + karyawanGaji.get(i)+ "\n");
		}
		
		
	}
	
	

	public void delete() {
		String del;
		for (int i = 0; i < karyawanNama.size(); i++) {
			System.out.println("\nNo: " + ( i + 1));	
			System.out.println("\nKode Karyawan:\n" + karyawanId.get(i));
			System.out.println("\nNama Karyawan:\n" +karyawanNama.get(i));
			System.out.println("\nJenis Kelamin:\n" + karyawanGender.get(i));
			System.out.println("\nJabatan:\n" + karyawanJabatan.get(i));
			System.out.println("\nGaji Karyawan:\n" + karyawanGaji.get(i)+ "\n");
		}
		do {
			System.out.println("Input nomer Karyawan yang ingin dihapus: ");
			del =  scan.nextLine();
		} while (del.equals(karyawanId) );
		
		
		karyawanId.remove(del);
		karyawanNama.remove(del);
		karyawanGender.remove(del);
		karyawanGaji.remove(del);
		karyawanJabatan.remove(del);
		
		System.out.println("Berhasil menghapus karyawan dengan !");
		System.out.println("Enter to continue");
		scan.nextLine();
		menu();
		
	}

	public void menu() {
		System.out.println("1. Insert Data Karyawan ");
		System.out.println("2. View Data Karyawan ");
		System.out.println("3. Update Data Karyawan ");
		System.out.println("4. Delete Data Karyawan ");
		
		System.out.print("Input your option: ");
		int option = scan.nextInt();scan.nextLine();
		
	
		switch (option) {
		case 1:
			insert();
			break;
		case 2:
			view();
			break;

		case 3:
			update();
			break;

		case 4:
			delete();
			break;

		default:
			break;
		}
		
		
		
	}
	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();

	}

}
