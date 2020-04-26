package semana2.strings;
public class Main {
	static FindGeneSimpleAndTest test = new FindGeneSimpleAndTest();
	public static void main(String[] args) {

		System.out.println(test.findGeneSimple("AATGCGTAATATGGT"));
		System.out.println(test.findGeneSimple("AATGCTAGGGTAAATATGGT"));
		System.out.println(test.findGeneSimple("TTATAA"));
		System.out.println(test.findGeneSimple("CGATGGTTTG"));
	}

}
