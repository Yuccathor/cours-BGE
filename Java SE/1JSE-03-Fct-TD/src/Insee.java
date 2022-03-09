
public class Insee {
	public long run(long code13) {
		
		long code2 = 97 - code13 % 97;
		return code13*100 + code2;

	}
}