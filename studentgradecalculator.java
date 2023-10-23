import java.util.Scanner;

public class studentgradecalculator {
  public static void main(String args[]){
    int totalmarks=0;
    String grade;
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the number of subjects you have:");
    int numofsubjects=scanner.nextInt();

    for(int i=1;i<=numofsubjects;i++){
      System.out.print("Enter the marks in subject "+i+" :");
      int marks=scanner.nextInt();
      totalmarks=totalmarks+marks;

    }
    float averagepercentage=(float)totalmarks/numofsubjects;
     if(averagepercentage>=90){
      grade="A+";
     }
      else if(averagepercentage>=80){
      grade="A";
     }
      else if(averagepercentage>=70){
      grade="B";
     }
      else if(averagepercentage>=60){
      grade="C";
     }
      else if(averagepercentage>=50){
      grade="D";
     }
      else{
      grade="F";
     }
     System.out.println("Total marks : "+totalmarks);
     System.out.println("Average percentage: "+averagepercentage);
     System.out.println("Grade : "+grade);

  }
  
}
