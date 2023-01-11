package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] wordsArray=test.split(" ");
		for (int i = 1; i < wordsArray.length; i+=2) {
			char[] evenWorsArray=wordsArray[i].toCharArray();
			char[] reversedEvenWordsArray=new char[evenWorsArray.length];
			int z=0;
			for (int j = evenWorsArray.length-1; j >=0; j--) {
				reversedEvenWordsArray[z]=evenWorsArray[j];
				z++;
			}
	
			wordsArray[i]=String.valueOf(reversedEvenWordsArray);
		}
		System.out.println("Reverse Even Words: ");
		for (int i = 0; i < wordsArray.length; i++) {
			if(i!=wordsArray.length-1)
				System.out.print(wordsArray[i]+" ");
			else
				System.out.print(wordsArray[i]);
		}
		
	}
	}

