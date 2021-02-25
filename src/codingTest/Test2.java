package codingTest;

public class Test2 {
	private int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	public void solution(int[] input) {
		int left = input[0]-1;
		int right = input[1]-1;
		
		while (left < right) {
			int tmp = cards[left];// tmp=a; a=b; b=tmp; 와 같이 사용하기위한 코드!
			cards[left] = cards[right];
			cards[right] = tmp;
			left++;//왼쪽 한칸옮김
			right--;//오른쪽 한칸옮김
		}
		
		for (int card : cards) {
			System.out.print(card);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.solution(new int[] {5, 10});
		t2.solution(new int[] {9, 13});
		t2.solution(new int[] {1, 2});
		t2.solution(new int[] {3, 4});
		t2.solution(new int[] {5, 6});
		t2.solution(new int[] {1, 2});
		t2.solution(new int[] {3, 4});
		t2.solution(new int[] {5, 6});
		t2.solution(new int[] {1, 20});
		t2.solution(new int[] {1, 20});
	}
}
