package prac;

import java.util.*;
import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args) {
		TaskValidator validator = (t)->{
			if(t.getTitle()==null || t.getPriority()==null)
				return false;
			return true;
		};
		Task t1 = new Task();
		Task t2 = new Task("Work","High");
		Task t3 = new Task(null , "low");
		List<Task> tasksList = List.of(t1,t2,t3,new Task("impo work",null),new Task("okish work","medium"));
//		tasksList.add(t1);
//		tasksList.add(t2);
//		tasksList.add(t3);
//		tasksList.add(new Task("impo work",null));
//		tasksList.add(new Task("okish work","medium"));
		List<Task> result = tasksList.stream().filter(validator::isValid).toList();
		System.out.println(result.size());
		result.forEach(t->System.out.println(t.getTitle()));
		
		List<String> result2 = tasksList.stream().filter(validator::isValid).map(t ->t.getTitle()).sorted().toList();
		result2.forEach(t->System.out.println(t));
		
		Map<String,List<Task>> mapped = tasksList.stream().collect(Collectors.groupingBy(t->t.getPriority()==null?"unspecified":t.getPriority()));
		mapped.forEach((priorityTag,listOfTask)->{
			System.out.print("\n"+priorityTag+" ");
			System.out.println(listOfTask.stream().map(Task::getTitle).collect(Collectors.joining(", "))); 
		});
	}
}
