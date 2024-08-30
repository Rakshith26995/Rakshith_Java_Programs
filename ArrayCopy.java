package Interview_Important_programs;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		String name[] = new String [4];
		name[0] = "Raam";
				name[1] = "Mala";
				name[2] = "Darshu";
				name[3] = "Chikku";
				
				String [] nameCopy = new String [name.length];
			
				
				
				for(int i=0; i<name.length; i++)
				{
					nameCopy[i] = name[name.length-1-i];    // nameCopy[0] = name[4-1-0] -----1st iteration
				}                                            // nameCopy[0] = name[3] ------So in nameCopy[0] position "Chikku" will sit in reverse...       
				System.out.println(Arrays.toString(nameCopy));
				
				for(int j=0; j<name.length; j++)
				{
					nameCopy[j] = name[j];    
				}                                           
				System.out.println(Arrays.toString(nameCopy));
				
				
	}

}
