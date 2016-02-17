import static java.util.Arrays.*;

import java.util.*;

public class CuboidJoin {
	int N;
	int[][] cubes;
	int[] X, Y, Z;

	public long totalVolume(int[] cuboids) {
		N = cuboids.length / 6;
		cubes = new int[N][];
		X = new int[2 * N];
		Y = new int[2 * N];
		Z = new int[2 * N];
		for (int i = 0; i < N; i++) {
			cubes[i] = new int[6];
			System.arraycopy(cuboids, i * 6, cubes[i], 0, 6);
			X[2 * i] = cubes[i][0];
			Y[2 * i] = cubes[i][1];
			Z[2 * i] = cubes[i][2];
			X[2 * i + 1] = cubes[i][3];
			Y[2 * i + 1] = cubes[i][4];
			Z[2 * i + 1] = cubes[i][5];
		}
		long total = 0;
		// for (int i = 0; i < N; i++) {
		// total += volume(cubes[i]);
		// }
		Arrays.sort(X);
		Arrays.sort(Y);
		Arrays.sort(Z);
		// remove dup
		for (int x = 0; x < 2 * N - 1; x++) {
			for (int y = 0; y < 2 * N - 1; y++) {
				for (int z = 0; z < 2 * N - 1; z++) {
					long ol = check(new int[] { X[x], Y[y], Z[z], X[x + 1],
							Y[y + 1], Z[z + 1] });
					total += ol;
				}
			}
		}
		return total;
	}

	long check(int[] range) {
		long vol = volume(range);
		for (int i = 0; i < N; i++) {
			if (overlap(range, cubes[i]) != 0) {
				return vol;
				// debug(range, cubes[i], layer, vol);
			}
		}
		return 0;
	}

	long volume(int[] cube) {
		long ret = 1;
		for (int i = 0; i < 3; i++) {
			ret *= (cube[i] - cube[i + 3]);
		}
		return Math.abs(ret);
	}

	long overlap(int[] cube1, int[] cube2) {
		// check if xy is overlaped
		long vol = 1;
		for (int i = 0; i < 3; i++) {
			int left = Math.max(cube1[i], cube2[i]);
			int right = Math.min(cube1[i + 3], cube2[i + 3]);
			if (left < right) {
				vol *= (right - left);
			} else {
				return 0;
			}
		}
		return vol;
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

}
