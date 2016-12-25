package defaultvariablesmethods;

public class DefaultSubClass extends DefaultSuperClass {
	
	 void m1(){
		/* DefaultSuperClass d = new DefaultSuperClass();
		 d.a=20;
		*///accessing default variables with object name  in subclass is optional.
		 //because of inheritance , default variables already available.
		 super.a=30;//default variable is   accessible with out creating object because of inheritance
			s="s1";
		System.out.println("subclassm1");
	}
public void m2(){
	
	System.out.println("m2");
}

public void m3(){
	
	DefaultSuperClass a= new DefaultSuperClass();
	
	
}

}
