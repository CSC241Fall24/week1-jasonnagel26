public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur
        level = lv;
        if(lv >=16 && lv <=31){
            id = 2;
        }else if(lv >= 32){
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return level; // Placeholder return value
    }

    // getName method
    public String getName() {
        // TODO: Implement this method
        // Return the name based on the current id
        if(level < 16){
            return "Bulbasaur";
        }else if(level >=16 && level <=31){
            return "Ivysaur";
        }else{
            return "Venusaur";
        }
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return id; 
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return ("Level: " + level + ", ID: " + id); // Placeholder return value
    }

    // equals method
   
    public boolean equals(Bulbasaur obj) {
        if(level == obj.getLevel()){
            return true;
        }
        else{
            return false;
        }
        // TODO: Implement this method
        // Compare this Bulbasaur object with another object
        // Placeholder return value
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur bulb = new Bulbasaur();
        bulb.setLevel(level);
        return bulb; // Placeholder return value
    }
}