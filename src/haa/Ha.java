package haa;

public class Ha {
int a;
int b;
Ha(int x,int y){
	a = x;
	b =y;
}
public static void main(String[] args) {
	for (int i = 0;i<1000;i++) {
		System.out.println((int)(Math.random()*100)+" "+(int)(Math.random()*100));
	}
}
}
