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
		System.out.println(machine.get(0));
		System.out.println(machine.get(1));
		System.out.println(machine.get(2));
		System.out.println(machine.get(3));
		System.out.println(machine.get(4));
		System.out.println(machine.get(5));
		Collections.shuffle(machine);
		System.out.println(machine.get(0));
		System.out.println(machine.get(1));
		System.out.println(machine.get(2));
		System.out.println(machine.get(3));
		System.out.println(machine.get(4));
		System.out.println(machine.get(5));


		List<Integer> balls = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			balls.add(machine.get(i));
		}
		System.out.println(balls);
		Collections.sort(balls);
		System.out.println(balls);
	}
}