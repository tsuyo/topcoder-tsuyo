import java.util.ArrayList;

public class BusinessTasks {

	public String getTask(String[] list, int n) {
		ArrayList<String> tasks = new ArrayList<String>();
		for (String t : list) {
			tasks.add(t);
		}
		int ind = 0;
		for (int i = 0; i < list.length - 1; i++) {
			ind = (ind + n - 1) % tasks.size();
			tasks.remove(ind);
		}
		return tasks.get(0);
	}

}
