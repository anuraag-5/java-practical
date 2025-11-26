package ass_2.setb;

// Multilevel.java

class Continent {
    String continentName;

    Continent(String continentName) {
        this.continentName = continentName;
    }
}

class Country extends Continent {
    String countryName;

    Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }
}

class State extends Country {
    String stateName;

    State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }
}

class Place extends State {
    String placeName;

    Place(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    void display() {
        System.out.println("Place     : " + placeName);
        System.out.println("State     : " + stateName);
        System.out.println("Country   : " + countryName);
        System.out.println("Continent : " + continentName);
    }
}

public class a {
    public static void main(String[] args) {
        Place p = new Place("Asia", "India", "Maharashtra", "Pune");
        p.display();
    }
}
