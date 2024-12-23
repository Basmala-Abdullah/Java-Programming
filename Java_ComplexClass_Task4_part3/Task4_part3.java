import taskPkg.Complex;

public class Task4_part3{
    public static void main(String[] args) {

        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(1.0, 2.0);

		System.out.println("After Addition");
        complex1.add(complex2);
		System.out.println(complex1.toString());
        

		System.out.println("After Subtraction");
        complex1.subtract(complex2);
		System.out.println(complex1.toString());
        
    }
}