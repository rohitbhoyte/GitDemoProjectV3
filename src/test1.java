

import noorganisedatabhaipackageterakyapurpose.bhaiprivateaccesskafundacheckkarnahai;

public class test1 extends bhaiprivateaccesskafundacheckkarnahai {

	public static void main(String[] args) 
	{
		test1 differentpackagesinsamefolder=new test1();
		//differentpackagesinsamefolder.p0();        private method cannot be access from another package
		differentpackagesinsamefolder.p1();
		//differentpackagesinsamefolder.p2();        default method is unable to access in another package
		differentpackagesinsamefolder.p3();

	}

}
