package basicjv;
/*
 * Create math class with: +, -, *, /, %, ++, --
 * @Trang
 */
public class sohoc {
	//Phep cong 2 so nguyen
	public static  int congHaiSo(int a, int b){
		int result;
		result = a+b;
		return result;
	}
	//Phep tru 2 so nguyen
	public static int truHaiSo(int a, int b){
		int result;
		result = a-b;
		return result;
	}
	//Phep nhan 2 so nguyen
	public static int nhanHaiSo(int a, int b){
		int result;
		result = a*b;
		return result;
	}
	//Phep chia lay so thuc
	public static float chiaHaiSo(int a, int b){
		
		if (b==0){
			return 0;
		}			
		return (float) a/b;
	}
	//Phep chia lay du
	public static int laydu(int a, int b){
		if (b==0){
			return 0;
		}			
		return (int) a%b;
	}
	//Phep ++
	public static int congcong(int a){
		return (int) ++a;			
	}
	//Phep --
	public static int trutru(int a){
		return (int) --a;
	}
	//Phep logic And so sanh a>b & a+b>30 => return "hello a"
	public static void and(int a, int b){
		int c;
		c = a+b;
		if ((a>b)&&(c>30)){
			System.out.println("Hello a");
		}
		else
		System.out.println("Hello b");		
	}
	//Phep logic Or so sanh a>b or a>9 => in ra "Hello a"
	public static void or(int a, int b){
		if ((a>b)||(a>9)){
			System.out.println("Hello a");
		}
		else
		System.out.println("Hello b");
	}
	//Phep logic NOT 25 => in ra "a is not 25"
	public static void not(int a){
		if (a!=25){
			System.out.println("a#25");
		}
		else
		System.out.println("a equal 25");
	}
	//Vong lap
	public static void vonglap(int a){
		// do - while
		do{
			System.out.println(a);
			a++;
		}
		while (a<19);
		// for
		for (int i=0; i<20; i++){
			System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		System.out.println(congHaiSo(2,3));
		System.out.println(truHaiSo(3,4));
		System.out.println(nhanHaiSo(5,7));
		System.out.println(chiaHaiSo(9,0));
		System.out.println(chiaHaiSo(9,7));
		System.out.println(laydu(95,0));
		System.out.println(laydu(95,9));
		System.out.println(congcong(8));
		System.out.println(trutru(19));
		and(7,89);
		or (15,10);
		not (35);
		vonglap(8);
	}
}
