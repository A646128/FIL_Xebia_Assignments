package day8exercise;

class Boxes{
	public static int volume(){
		int [][] arr1={{2,3,2},{6,6,7},{1,2,1}};
		int sum=0;
		for (int i = 0; i < 3; i++) { 
			int mul=1;
            for (int j = 0; j < 3; j++) { 
                   mul= mul*arr1[i][j]; 
            }
            	sum=sum+mul;
		}
		System.out.println("Total Volume of all three Boxes: "+sum);
		return sum;
		
	}
}
public class VolOfAllBoxesQues5 {
	public static void main(String[] args) {
		Boxes.volume();

	}

}
