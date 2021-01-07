package exercism;

public class Proverb {

	public static void main(String[] args) {

		String inputs[] = new String[]{"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"};

		System.out.println(new Proverb().makeRhyme(inputs));

	}

	private String makeRhyme(String[] inputs) {
		
		String rhyme = new String();
		
		for(int i=0,j=1;i<inputs.length&&j<inputs.length;++j,i++)
		{
			
		 rhyme = rhyme + "For want of a "+inputs[i]+ " the " +inputs[j]+" was lost.\n";
		
		}
		return rhyme.concat("And all for the want of a nail.");

	}

}
