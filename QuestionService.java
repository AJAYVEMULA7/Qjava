import java.util.Scanner;

public class QuestionService {

  Question[] questions=new Question[5];
  String userSelection[]=new String[5];
  public QuestionService(){
    questions[0]=new Question(1,"RCB best opener?","v.k","faf","chris","parthiv","v.k");
    questions[1]=new Question(2,"CSK best opener?","mcc","faf","gai","parthiv","faf");
    questions[2]=new Question(3,"MI best opener?","hitman","s.t","sim","parthiv","hitman");
    questions[3]=new Question(4,"KINGS best opener?","kl","agar","chris","saha","kl");
    questions[4]=new Question(5,"DELHI best player to leave in aution?","abd","david","gam","sam","abd");





  }
  public void play(){
        int j=0;
       for(Question q:questions){
        System.out.println("question no. "+q.getId()+":"+q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc=new Scanner(System.in);
        userSelection[j]=sc.nextLine();
        j++;
       }
       /*for(String s:userSelection){
        System.out.println(s);
       }*/
  }
  public void scores(){
    int Score=0;
    for(int i=0;i<5;i++){
      if(questions[i].getAns().equals( userSelection[i])){
        Score++;
        
      }
    }
    System.out.println("Your Score is:"+Score);

  }
}
