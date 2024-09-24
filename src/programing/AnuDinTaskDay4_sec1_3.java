package programing;


// Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint:Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check condition]

public class AnuDinTaskDay4_sec1_3 {
    public static void main(String[] args) {
        vaccinationSuccessful user1 = new vaccinationSuccessful(25, "Indian");

        user1.firstDose();
        user1.secondDose();
        user1.boosterDose();
        
    }
}

abstract class vaccine {

    boolean secondDoseTaken = false;
    boolean firstDoseTaken = false;

    int  age;
    String nationality;
    public vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose(){
        if(nationality.equals("Indian") && age>=18){
            System.out.println("You are eligible for first dose");
            System.out.println("You have to pay 250rs");
            firstDoseTaken=true;
        }
        else{
            System.out.println("You are not eligible for first dose");
        }
    }

    void  secondDose(){
        if (firstDoseTaken) {
            System.out.println("Second dose taken successfully.");
            secondDoseTaken = true;
        } else {
            System.out.println("You need to take the first dose before the second dose.");
        }

    }

    public abstract void boosterDose();
  
}


class vaccinationSuccessful extends vaccine{

    public vaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void boosterDose() {
        if (secondDoseTaken) {
            System.out.println("Booster dose taken successfully.");
        }else {
            System.out.println("You need to take the second dose before the booster dose.");
        }
    }
    
}