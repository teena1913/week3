package week3.day1;

public class DuplicateValue {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String []name=text.split(" ");
		int count=0;
	for(int i=0;i<name.length-1;i++) {
		
	for(int j=i+1;j<name.length-1;j++) {
		
		if(name[i].equalsIgnoreCase(name[j])){
			count++;
		if(count>1) {
			name[j]="";
		}
	}
	}
	System.out.print(name[i]);
	}
}
}
