
public class InseeController {

	public static void main(String[] args) {
		long code13=1900303185016L;
			//Calcul code 15
		Insee insee=new Insee(); //réf sur objet de type Insee
		long code15 = insee.run(code13); //récup résult
			// rendu
		System.out.println("Le code NIR :" + code15);
			}

}
