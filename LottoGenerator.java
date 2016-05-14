import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class LottoGenerator{
	public static void main(String[] args){
		List<Integer> machine = new ArrayList<>();
		for (int ball = 0; ball <= 45; ball++) {
			//그냥 0부터 받는거로 바꿔봤따..
			machine.add(ball);
			//git diff로 확인할수있을까???? 애드전에만 확인가능 하다.
		}
		Collections.shuffle(machine);
		List<Integer> balls = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			balls.add(machine.get(i));
		}
		System.out.println(balls);
		Collections.sort(balls);
		System.out.println(balls);
	}//커밋용 ㅋㅋㅋ
}
