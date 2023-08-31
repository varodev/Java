public class Eje12{
	public static void main(String args[]){
		
		int i = 1;
		int j = 1;
		int k = 1;
			
					a(i,j);
					b(i, k);
					c(i, j, k);
					d(i, j);
					e(i, j, k);
					f(i, j, k);
					g(i, j, k);
					h(i, j, k);
					i(i, j, k);
					j(i, j, k);
				
	}
	public static void a (int i, int j){
		System.out.println(i = ++j);//2
	}
	public static void b(int i, int k){
		System.out.println(i = k++);//1
	}
	public static void c (int i, int j, int k){
		System.out.println(i = k + ++j);//3
	}
	public static void d (int i, int j){
		System.out.println(i = i + j++);//2
	}
	public static void e (int i, int j, int k){
		System.out.println(i = j + ++k);//3
	}
	public static void f (int i, int j, int k){
		System.out.println(i = ++j + k++);//3
	}
	public static void g (int i, int j, int k){
		System.out.println(j = k-- + --i);//1
	}
	public static void h(int i, int j, int k){
		System.out.println(i = k + 1 + ++j);//4
	}
	public static void i(int i, int j, int k){
		System.out.println(i = ++i + --j + k--);//3
	}
	public static void j (int i, int j, int k){
		System.out.println(k = j-- + ++k);//3
	}
	
}