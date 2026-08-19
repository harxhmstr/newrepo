package prac;

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
		System.out.println(task.isValid(t1));
		System.out.println(task.isValid(t3));
		System.out.println(task.isValid(t2));	
	}
}
