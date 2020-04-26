package semana2.strings;
/*
 * @author Tao Hansen
 * @version 1.0 (26/04/2020)
 */
public class FindGeneSimpleAndTest {
	
	
	//TEST with AATGCGTAATATGGT
	//start index: 1 / Stopindex 6 -> 
	public String findGeneSimple(String dna) {
		String result = "";
		int startIndex = dna.indexOf("ATG");
		if (startIndex == -1) { //no ATG
			return "";
		}
		int stopIndex = dna.indexOf("TAA", startIndex+3);
		if (stopIndex == -1) {
			return ""; //no TAA
		}
		result = dna.substring(startIndex, stopIndex+3);
	    return result;
		
	}
}
