public class RE2 {

  // Claire Redfield class that inherits from Character
  public static class Claire extends Character {
      // Tweak the RE2 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE2 Character object by using super().
      // The RE2 constructor now takes only name and age as parameters.
      Claire(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "College student", "Arrives in Raccoon City to find her brother Chris, only to face a virus-infected town. Escaping with Leon to the Police Station, she embarks on a harrowing adventure, relying on her survival skills and bravery. A confident, expressive, and daring woman, Claire teams up with Cherry Birkin, a girl linked to the virus, who aids her in the Alpha team's fight for survival");
      }
    
        // Override the getInfo() method for RE2 so that if we called getInfo() on a RE2 Character like Leon, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 2");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");
    
      }
    
    }


    // Sherry Birkin class that inherits from Character
    public static class Sherry extends Character {
      // Tweak the RE2 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE2 Character object by using super().
      // The RE2 constructor now takes only name and age as parameters.
      Sherry(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "Elementary school student", "Daughter of G-Virus creators Annette and William Birkin, is a shy and insecure yet mature girl, emotionally neglected by her work-obsessed parents. She aids Claire in specific situations, contributing to the Alpha team’s efforts to survive the horrors of Raccoon City");
      }

        // Override the getInfo() method for RE2 so that if we called getInfo() on a RE2 Character like Leon, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 2");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");

      }
    }


    // Ada Wong class that inherits from Character
    public static class Ada extends Character {
      // Tweak the RE2 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE2 Character object by using super().
      // The RE2 constructor now takes only name and age as parameters.
      Ada(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "Spy", "This mysterious woman is a spy sent by the Agency who infiltrated Umbrella as an employee to steal the T-Virus. She pretended to be in love with a mansion researcher named John, as referenced in the RE1 file “Researcher’s Letter.” She's reserved, often condescending, and tends to look down on others she deems inferior. However, her encounter with Leon would shift her behavior and significantly influence her future actions");
      }

        // Override the getInfo() method for RE2 so that if we called getInfo() on a RE2 Character like Leon, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 2");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");

      }
    }


    // Hunkclass that inherits from Character
    public static class Hunk extends Character {
      // Tweak the RE2 constructor so that it isn’t necessary to pass in these fields when instantiating a new RE2 Character object by using super().
      // The RE2 constructor now takes only name and age as parameters.
      Hunk(String name, int age) {
        // The super() call sets occupation to "RPD" and bio to "young man with a strong sense of justice"
        // REMEMBER! Each Character will still require its own name and age.
        super(name, age, "Umbrella Security Service (U.S.S.)", "Hunk is a special agent working for Umbrella. During a mission to steal the G-Virus from Dr. Birkin, things go wrong, and Birkin mutates after injecting the virus. Hunk’s team is wiped out, but he survives, keeps the virus sample, and escapes safely");
      }

        // Override the getInfo() method for RE2 so that if we called getInfo() on a RE2 Character like Leon, we’d get the following info:
          // The Character follows the bio: young man with a strong sense of justice
        @Override
        public void getInfo() {

          System.out.println("\nRESDENT EVIL 2");
          System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
          System.out.println("Bio: " + this.bio + ".\n");

      }
    }

  }
