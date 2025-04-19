public class RE3 {

    // Carlos Oliveira class that inherits from Character
    public static class Carlos extends Character {
        // Tweak the RE3 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE3 Character object by using super().
        // The RE3 constructor now takes only name and age as parameters.
        Carlos(String name, int age) {
          // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
          // REMEMBER! Each Character will still require its own name and age.
          super(name, age, "Umbrella Biohazard Countermeasure Service (U.B.C.S)", "Handles heavy weapons, security, and weapon maintenance. Though he may seem immature, he's kind-hearted and morally grounded. He supports Jill throughout her journey and even saves her from dying due to the T-Virus");
        }
      
          // Override the getInfo() method for RE3 so that if we called getInfo() on a RE3 Character like carlos, we’d get the following info:
            // The Character follows the bio: young man with a strong sense of justice
          @Override
          public void getInfo() {

            System.out.println("\nRESDENT EVIL 3");
            System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
            System.out.println("Bio: " + this.bio + ".\n");
      
        }
      
      }


    // Mikhail Victor class that inherits from Character
    public static class Mikhail extends Character {
      // Tweak the RE3 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE3 Character object by using super().
      // The RE3 constructor now takes only name and age as parameters.
      Mikhail(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "Umbrella Biohazard Countermeasure Service (U.B.C.S)", "A seasoned Russian commander of the U.B.C.S. mercenary team, wounded during the mission. He bravely sacrifices himself trying to stop Nemesis to help Jill");
      }
    
        // Override the getInfo() method for RE3 so that if we called getInfo() on a RE3 Character like Mikhail, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 3");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");
    
      }
    }


    // Nicholai Ginovaeff class that inherits from Character
    public static class Nicholai extends Character {
      // Tweak the RE3 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE3 Character object by using super().
      // The RE3 constructor now takes only name and age as parameters.
      Nicholai(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "Umbrella Biohazard Countermeasure Service (U.B.C.S)", "A cold and reserved former Red Army member, now serving as a mercenary sergeant for U.B.C.S. His secretive and ruthless goals lead him to eliminate those who oppose him, ultimately facing the consequences for his actions");
      }
    
        // Override the getInfo() method for RE3 so that if we called getInfo() on a RE3 Character like Nicholai, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 3");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");
    
      }
    }
  
    }
  