package ProtectedPackage;
import accessSpecifier.PrivateUse;

public class Sample extends PrivateUse{

	public static void main(String[] args) {
		
PrivateUse P = new PrivateUse();
P.test1();



Sample S =new Sample();
S.test1();
S.test4();
	}

}
