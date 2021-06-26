
import static java.lang.Math.*;
import static java.lang.System.*;


public class MathEx1 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("반올림 : round("+val+")="+round(val)); //반올림
		
		val *=100;
		out.println(val);
		out.println("반올림 : round("+val+")="+round(val)); //반올림
		
		out.println("반올림 : round("+val+")/100="+round(val)/100); //반올림
		out.println("반올림 : round("+val+")/100.0="+round(val)/100.0); //반올림
		out.println();
		out.printf("올림 : ceil(%3.1f)=%3.1f%n", 1.1,ceil(1.1)); //올림
		out.printf("내림 : floor(%3.1f)=%3.1f%n",1.5,floor(1.5)); //내림
		out.printf("반올림 : round(%3.1f)=%d%n",1.1,round(1.1)); // 반올림
		out.printf("반올림 : round(%3.1f)=%d%n",1.5,round(1.5)); //반올림
		out.printf("반올림 : rint(%3.1f)=%f%n",1.5,rint(1.5)); //반올림
		out.printf("반올림 : round(%3.1f)=%d%n",-1.5,round(-1.5)); //반올림
		out.printf("반올림 : rint(%3.1f)=%f%n",-1.5,rint(-1.5)); //반올림
		out.printf("올림 : ceil(%3.1f)=%f%n", -1.5,ceil(-1.5)); //올림
		out.printf("내림 : floor(%3.1f)=%f%n",-1.5,floor(-1.5)); //내림
		
	}

}
