import java.util.Scanner; 
import java.util.Arrays;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("2 - FRQ 2");
    System.out.println("3 - FRQ 3");
    System.out.println("4 - FRQ 4");
    System.out.println("5 - FRQ 5");
    System.out.println("6 - FRQ 6");
    System.out.println("7 - FRQ 7");
    System.out.println("8 - FRQ 8");
    System.out.println("9 - FRQ 9");
    System.out.println("10 - FRQ 10");
    
    for(int i = 1; i <= 9; i++){
      System.out.println("Round " + i);
      System.out.println("Pick an FRQ (enter int)"); 
      int choice = scan.nextInt(); 
      frq_picker(choice);
    }

  }
  public static void frq_picker(int choice){
    Scanner scan = new Scanner(System.in);
    
    if(choice == 2){
      System.out.println("Enter a sequence of 1's and 0's"); 
      String sequence = scan.nextLine(); 
      cb2 gradShow = new cb2(sequence);
      String sequenceDisplay = gradShow.display();
      System.out.println("Your sequence is " + sequenceDisplay);
      System.out.println("Enter another sequence");
      String newSeq = scan.nextLine(); 
      System.out.println("Your new sequence is " + gradShow.changeSequence(newSeq));
      
    }
    else if(choice==3){
      System.out.println("What is your name?");
      String name = scan.nextLine();
      cb3 info = new cb3(name);
      System.out.println("Will you be attending (write true or false)?");
      Boolean attendance = scan.nextBoolean();
      System.out.println("What will you eat? (1-beef; 2-chicken; 3-pasta; 4-fish");
      int food = scan.nextInt();
      System.out.println("Event details: ");
      System.out.println(info.info(attendance, food)); 
      
    }
    else if(choice==4){
      System.out.println("Type a word");
      String word = scan.nextLine(); 
      cb4 test = new cb4(word);
      test.Streak(word); 
    
    }
    else if(choice==5){
      String hostName = "Adrita";
      String address = "1234 Privet Drive"; 
      System.out.println("What is your name?");
      String inviteName = scan.nextLine();
      cb5 invite = new cb5(hostName, address, inviteName);

      System.out.println("INVITE: ");
      System.out.println(invite.invite());
    }
    else if(choice==6){
      cb6 list = new cb6();
      System.out.println("og list: ");
      System.out.println(list.selectWords());
    }
    else if(choice==7){
      System.out.println("first name?");
      String firstName = scan.nextLine(); 
      System.out.println("last name?");
      String lastName = scan.nextLine(); 
      cb7 person1 = new cb7(firstName, lastName);
      person1.generatedNames();
    }
    else if(choice==8){
      Plot p1 = new Plot("corn",20);
      Plot p2 = new Plot("corn", 30);
      Plot p3 = new Plot("peas", 10);
      Plot p4 = new Plot("peas", 30);
      Plot p5 = new Plot("corn",40);
      Plot p6 = new Plot("corn",62);
      Plot p7 = new Plot("wheat",10);
      Plot p8 = new Plot("corn",50);
      Plot p9 = new Plot("rice",30);
      Plot p10 = new Plot("corn", 55);
      Plot p11 = new Plot("corn",30);
      Plot p12 = new Plot("peas", 30);
      Plot[][] plots = {{p1,p2,p3},{p4,p5,p6},{p7,p8,p9},{p10,p11,p12}};
      cb8 f1 = new cb8(plots);
      System.out.println(Arrays.deepToString(plots));
      f1.getHighestYield("corn"); //returns farmPlots[1][2]
      f1.getHighestYield("peas"); //returns farmPlots[1][0] or farmPlots[3][2]
      f1.getHighestYield("bananas"); //returns null
    }
    else if(choice==9){
      cb9 lisa = new cb9("carnivore", "lion", "Lisa");
      System.out.println(lisa);
      herbivore gary = new herbivore("giraffe", "Gary");
      System.out.println(gary);
      Unit9Elephant percy = new Unit9Elephant("Percy", 2.0);
      System.out.println(percy);
    }
    else if(choice==10){
      cb10 set1 = new cb10();
      System.out.println("number 1: ");
      int number1 = scan.nextInt();
      System.out.println("number 2: ");
      int number2 = scan.nextInt();
      System.out.println("gcf: " + set1.gcf(number1, number2));
    }
    else{
      System.out.println("invalid response, next time pick an int");
    }
  }

  
}
