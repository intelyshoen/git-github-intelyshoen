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
		for (int ball = 1; ball <= 45; ball++) {
			machine.add(ball);
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
