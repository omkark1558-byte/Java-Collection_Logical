package stream_api;

//import java.util.List;
//import java.util.stream.Collectors;

public class Grpby_Mapping_1 {

	public static void main(String[] args) {
	 
//
//		List.of("Maharathra","Madhya Pradesh","UP","MP")
//		.stream()
//		.collect(Collectors.groupingBy(s-> s.dept,Collectors.mapping(s->s.name,Collectors.toList())));
//		
//		
		
	}

}

class Students_1
{
	int id;
	String name;
	String dept;
	int marks;
	
	Students_1(int id,String name,String dept,int marks)
	{
		this.dept = dept;
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
}
