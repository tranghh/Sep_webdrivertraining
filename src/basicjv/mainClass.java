package basicjv;

public class mainClass {
	static sohoc goisohoc;
	public static void main (String[] args){
		goisohoc = new sohoc();
		System.out.println(sohoc.congHaiSo(5,6));
		System.out.println(sohoc.truHaiSo(5,6));
		System.out.println(sohoc.nhanHaiSo(5,6));
		System.out.println(sohoc.chiaHaiSo(5,6));
		System.out.println(sohoc.laydu(5,6));
		System.out.println(sohoc.congcong(9));
		System.out.println(sohoc.trutru(8));
		sohoc.and(8, 9);
		sohoc.or(8, 7);
		sohoc.not(34);
		sohoc.vonglap(4);		
	}
}