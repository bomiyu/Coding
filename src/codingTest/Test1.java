package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	public boolean solution(String input) {
		Map<Character, Character> pair = new HashMap<>();
		pair.put(')', '(');
		pair.put('}', '{');
		pair.put(']', '[');
		
		List<Character> open = new ArrayList<>();
		
		for (int i = 0; i < input.length(); i++) {//아래 솔루션 안의 데이터의 길이
			Character c = input.charAt(i);//스트링의 몇번째 캐릭터
			if (pair.containsKey(c)) { //키 중에 있는지 확인
				if (open.isEmpty()) {//열린괄호만 저장한 리스트가 비어있으면
					return false;
				}
				char last = open.remove(open.size()-1);//리스트에서 마지막거를 잘라서 last에 넣음
				if (pair.get(c) != last) {//last와 키에 해당하는 벨류비교 
					return false;
				}
			} else {
				open.add(c);//닫힌 괄호 아닐때만 저장!
			}
		}
		if (open.isEmpty()) {//열린괄호가 찾아지면 하나씩 삭제이므로 다 삭제? 리스트가 비어있으면 트루,아니면 false
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.solution("()"));
		System.out.println(t1.solution("({})"));
		System.out.println(t1.solution("([]())"));
		System.out.println(t1.solution("{[()]()}"));
		System.out.println(t1.solution(")("));
		System.out.println(t1.solution("(()"));
		System.out.println(t1.solution("([)]"));
		System.out.println(t1.solution("[[[{[[[[[]]]]}]]]]"));
		System.out.println(t1.solution("[[[[[[[[[]]]]]]]]"));
	}
}
