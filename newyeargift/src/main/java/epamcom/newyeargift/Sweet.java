package epamcom.newyeargift;

public class Sweet extends Sweets {
	
		@Override
		void setWeight(double weight) {
		
		this.weight = weight;
		}
		double calcWeight (int numOfSweets) {
		return numOfSweets *weight;
		}

}




