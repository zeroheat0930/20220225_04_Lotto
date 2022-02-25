package codes;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {

//	 6개의 숫자 입력받기.

		Scanner S = new Scanner(System.in);

		int[] myNumbers = new int[6];

		for (int i = 0; i < 6; i++) {

			while (true) {
				System.out.println((i + 1) + "번째 숫자 : ");
				int inputNum = S.nextInt();

				boolean isRangeOk = (1 <= inputNum) && (inputNum <= 45);

				boolean isDuplOk = true;

				for (int myNum : myNumbers) {
					if (myNum == inputNum) {
						isDuplOk = false;
						break;
					}
				}

				if (isRangeOk && isDuplOk) {

					myNumbers[i] = inputNum;

					break;
				}

			}

		}

		int[] winNumbers = new int[6];

		for (int i = 0; i < winNumbers.length; i++) {

			while (true) {

//				Math.random() =>    1 <= 랜덤값*45+1 < 46
//				cf) Random 클래스를 활용해도 됨.
				int randomNum = (int) (Math.random() * 45 + 1);

				boolean isDuplOk = true;

				for (int num : winNumbers) {
					if (num == randomNum) {
						isDuplOk = false;
						break;
					}
				}
				
				

				if (isDuplOk) {
					winNumbers[i] = randomNum;
					break;
				}

			}

		}

		for (int num : winNumbers) {
			System.out.println(num);
		}

//		임시 당첨 번호 선정 -> 당첨 등수 로직 테스트용
		winNumbers[0] = 10;
		winNumbers[1] = 11;
		winNumbers[2] = 20;
		winNumbers[3] = 21;
		winNumbers[4] = 30;
		winNumbers[5] = 31;
		
		
		
		for (int num : winNumbers) {
			System.out.println(num);
		}
		
		int correctCount = 0;

		for (int myNum : myNumbers) {
			
			for (int winNum : winNumbers) {
				
				if (myNum == winNum) {
					correctCount++;
				}
				
			}
			
		}
		
		
		
	}

}
