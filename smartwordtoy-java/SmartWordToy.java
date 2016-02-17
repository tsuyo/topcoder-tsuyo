import java.util.LinkedList;
import java.util.Queue;

public class SmartWordToy {
	int MAX = encode("zzzz") + 1;
	int MASK = (1 << 5) - 1;
	boolean[] visited = new boolean[MAX];
	int[] dist = new int[MAX];

	public int minPresses(String start, String finish, String[] forbid) {
		for (String line : forbid) {
			String[] fs = line.split(" ");
			for (char c0 : fs[0].toCharArray()) {
				for (char c1 : fs[1].toCharArray()) {
					for (char c2 : fs[2].toCharArray()) {
						for (char c3 : fs[3].toCharArray()) {
							String tmp = new String(
									new char[] { c0, c1, c2, c3 });
							visited[encode(tmp)] = true;
						}
					}
				}
			}
		}

		// start BFS
		Queue<Integer> que = new LinkedList<Integer>();
		int sti = encode(start);
		int fii = encode(finish);
		que.offer(sti);
		visited[sti] = true;
		while (!que.isEmpty()) {
			int cur = que.poll();
			if (cur == fii)
				return dist[cur];
			add(cur, que);
		}
		return -1; // not found
	}

	void add(int cur, Queue<Integer> que) {
		for (int diff = -1; diff <= 1; diff += 2) {
			for (int i = 0; i < 4; i++) {
				int dig = (cur >> ((3 - i) * 5)) & MASK;
				int next = ((dig + diff + 26) % 26) << ((3 - i) * 5);
				next += cur & ~(MASK << (3 - i) * 5);
				if (!visited[next]) {
					que.offer(next);
					visited[next] = true;
					dist[next] = dist[cur] + 1;
				}
			}
		}
	}

	/*
	 * 1char ('a') maps to 5bits (<=31) so state (4chars) can be encoded to an
	 * int value
	 */
	int encode(String state) {
		int sum = 0;
		char[] chs = state.toCharArray();
		for (int i = 0; i < 4; i++) {
			sum += (chs[i] - 'a') << ((3 - i) * 5);
		}
		return sum;
	}

}
