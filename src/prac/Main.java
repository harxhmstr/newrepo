package prac;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		TaskValidator task = (t)->{
			if(t.getTitle()==null || t.getPriority()==null)
				return false;
			return true;
		};
		Task t1 = new Task();
		Task t2 = new Task("Work","High");
		Task t3 = new Task(null , "low");
		List<Task> tasksList = new ArrayList<>();
		tasksList.add(t1);
		tasksList.add(t2);
		tasksList.add(t3);
		tasksList.add(new Task("impo work",null));
		tasksList.add(new Task("okish work","medium"));
		List<Task> result = tasksList.stream().filter(task::isValid).toList();
		System.out.println(result.size());
		result.forEach(t->System.out.println(t.getTitle()));
	}
}
