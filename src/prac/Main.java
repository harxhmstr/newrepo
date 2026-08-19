package prac;

public class Main{
	public static void main(String[] args) {
		TaskValidator task = (t)->{
			if(t.getTitle()==null || t.getPriority()==null)
				return false;
			return true;
		};
		Task t1 = new Task();
		System.out.println(task.isValid(t1));
	}
}
