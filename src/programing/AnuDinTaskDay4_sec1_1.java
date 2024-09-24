package programing;

// Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

public class AnuDinTaskDay4_sec1_1 {
   public static void main(String[] args) {

    HillStations hillStations;

    hillStations = new Manali();

    hillStations.location();
    hillStations.famousFor();
    
    hillStations= new Gulmarg();

    hillStations.location();
    hillStations.famousFor();

    hillStations= new Mussoorie();

    hillStations.location();
    hillStations.famousFor();


    // drectly 

        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
   }
}

// superclss
class HillStations {
    public void location() {
        System.out.println("Hill Stations are located in the mountains");
    }
    public void  famousFor() {
        System.out.println("Hill Stations are famous for their natural beauty");
    }

}

// subclass1
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in the Himalayas");
    }
    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its snowfall");
    }
}

// subclass2
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in the Garhwal Himalayas");
    }
    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its scenic views");
    }

}
// subclass3
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in the Pir Panjal range");
    }
    @Override
    public  void famousFor() {
        System.out.println("Gulmarg is famous for its skiing");
    }
}

            
