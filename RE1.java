public class RE1 {
    
    public static class STARS1 extends Character{

        // Richard Aiken
        STARS1(String name, int age) {
            // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
            // REMEMBER! Each Charcter will still require its own name and age.
            super(name, age, "S.T.A.R.S", "Vital team member. He is the primary communications expert connecting field teams to headquarters. As the Bravo team lacks a trained radio operator besides the tech-savvy Jill, he serves both units. Known for his positive attitude and warm welcomes, he is tragically found poisoned near the great serpent's quarters, beyond saving");
              // change the bio to "S.T.A.R.S Bravo Team" if this.bio contains "Bravo"
              if (bio.contains("Bravo")){
                this.occupation = "S.T.A.R.S Bravo Team";
              }
          }

        @Override
        public void getInfo() {
        System.out.println("\nRESIDENT EVIL 1");     
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
        System.out.println("\nBio: " + this.bio + ".\n");

      }
    }
    


    //Enrico Marini
    public static class STARS2 extends Character{
        STARS2(String name, int age) {
            // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
            // REMEMBER! Each Charcter will still require its own name and age.
            super(name, age, "S.T.A.R.S", "Enrico, the Bravo team leader and second-in-command of S.T.A.R.S. under Wesker. Hee is a dedicated operative, proud to lead when given the chance. Tragically, he is found scared and is fatally shot from behind, possibly by Wesker, during a conversation.");
              // change the bio to "S.T.A.R.S Bravo Team" if this.bio contains "Bravo"
              if (bio.contains("Bravo")){
                this.occupation = "S.T.A.R.S Bravo Team";
              }
          }

        @Override
        public void getInfo() {
        System.out.println("\nRESIDENT EVIL 1"); 
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
        System.out.println("\nBio: " + this.bio + ".\n");

      }
    } 


    // Forest Speyer
    public static class STARS3 extends Character{
      STARS3(String name, int age) {
          // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
          // REMEMBER! Each Charcter will still require its own name and age.
          super(name, age, "S.T.A.R.S", "A skilled sniper and vehicle specialist for the Bravo team, is a highly respected professional who quickly bonded with Chris, becoming good friends. Tragically, he is found dead on the crows' balcony");
            // change the bio to "S.T.A.R.S Bravo Team" if this.bio contains "Bravo"
            if (bio.contains("Bravo")){
              this.occupation = "S.T.A.R.S Bravo Team";
            }
        }

      @Override
      public void getInfo() {
      System.out.println("\nRESIDENT EVIL 1"); 
      System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
      System.out.println("\nBio: " + this.bio + ".\n");

    }
  }


  // 	Kenneth J. Sullivan
  public static class STARS4 extends Character{
    STARS4(String name, int age) {
        // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
        // REMEMBER! Each Charcter will still require its own name and age.
        super(name, age, "S.T.A.R.S", "A reserved yet skilled scout and chemistry expert, this S.T.A.R.S. officer questioned the relevance of his chemical knowledge in Raccoon City but joined the team at Wesker’s request. Tragically, he is found being devoured by the first zombie encountered, a grim fate for a member of the Bravo team");
          // change the bio to "S.T.A.R.S Bravo Team" if this.bio contains "Bravo"
          if (bio.contains("Bravo")){
            this.occupation = "S.T.A.R.S Bravo Team";
          }
      }

    @Override
    public void getInfo() {
    System.out.println("\nRESIDENT EVIL 1"); 
    System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
    System.out.println("\nBio: " + this.bio + ".\n");

  }
}


  // Rebecca Chambers
  public static class STARS5 extends Character{
    STARS5(String name, int age) {
        // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
        // REMEMBER! Each Charcter will still require its own name and age.
        super(name, age, "S.T.A.R.S", "The youngest S.T.A.R.S. member at 18, is a field medicine and first aid expert who feels out of place due to her inexperience but is eager to prove herself. As the only Bravo team survivor");
          // change the bio to "S.T.A.R.S Bravo Team" if this.bio contains "Bravo"
          if (bio.contains("Bravo")){
            this.occupation = "S.T.A.R.S Bravo Team";
          }
      }

    @Override
    public void getInfo() {
    System.out.println("\nRESIDENT EVIL 1"); 
    System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
    System.out.println("\nBio: " + this.bio + ".\n");

  }
}


  // Jill Valentine
  public static class STARS6 extends Character{
    STARS6(String name, int age) {
        // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
        // REMEMBER! Each Charcter will still require its own name and age.
        super(name, age, "S.T.A.R.S", "a skilled and intelligent soldier, reassigned to Raccoon City alongside Chris, is adept with mechanical devices like grenades and upholds strong moral principles. Known for saving teammates, she supports the Alpha team but is hindered by lower vitality despite her ability to carry many items");
          // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
          if (bio.contains("Alpha")){
            this.occupation = "S.T.A.R.S Alpha Team";
          }
      }

    @Override
    public void getInfo() {
    System.out.println("\nRESIDENT EVIL 1"); 
    System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
    System.out.println("\nBio: " + this.bio + ".\n");

  }
}


  // 	Chris Redfield
  public static class STARS7 extends Character{
    STARS7(String name, int age) {
        // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
        // REMEMBER! Each Charcter will still require its own name and age.
        super(name, age, "S.T.A.R.S", "A resilient former Air Force member, was recruited by Barry Burton for S.T.A.R.S. after losing his way. Reassigned to the Alpha team in Raccoon City, he must quickly prove himself. Known for his toughness, strong mentality, and high vitality, Chris thrives in combat, effectively wielding weapons against numerous foes");
          // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
          if (bio.contains("Alpha")){
            this.occupation = "S.T.A.R.S Alpha Team";
          }
      }

    @Override
    public void getInfo() {
    System.out.println("\nRESIDENT EVIL 1"); 
    System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
    System.out.println("\nBio: " + this.bio + ".\n");

  }
}


// 	Barry Burton
public static class STARS8 extends Character{
  STARS8(String name, int age) {
      // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
      // REMEMBER! Each Charcter will still require its own name and age.
      super(name, age, "S.T.A.R.S", "A seasoned ex-SWAT member and Chris Redfield’s trusted friend, equips the Alpha team with weapons, drawing on his 16 years of successful S.T.A.R.S. experience. Despite personal struggles with his family, he remains a dependable ally, aiding Jill by rescuing her from danger and providing crucial ammunition support");
        // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
        if (bio.contains("Alpha")){
          this.occupation = "S.T.A.R.S Alpha Team";
        }
    }

  @Override
  public void getInfo() {
  System.out.println("\nRESIDENT EVIL 1"); 
  System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
  System.out.println("\nBio: " + this.bio + ".\n");
  }
}


// 	Albert Wesker
public static class STARS9 extends Character{
  STARS9(String name, int age) {
      // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
      // REMEMBER! Each Charcter will still require its own name and age.
      super(name, age, "S.T.A.R.S", "The cunning and tough leader of the Alpha team, rapidly advanced in S.T.A.R.S. after being recruited for his sharp intellect. Known for his shaved head and sunglasses, he betrays his team in Raccoon City to seize control of the Tyrant-002, but his plan backfires, leaving him worse for wear");
        // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
        if (bio.contains("Alpha")){
          this.occupation = "S.T.A.R.S Alpha Team";
        }
    }

  @Override
  public void getInfo() {
  System.out.println("\nRESIDENT EVIL 1"); 
  System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
  System.out.println("\nBio: " + this.bio + ".\n");
  }
}


// 	Joseph Frost
public static class STAR10 extends Character{
  STAR10(String name, int age) {
      // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
      // REMEMBER! Each Charcter will still require its own name and age.
      super(name, age, "S.T.A.R.S", "a young and enthusiastic team member, was recently promoted by Wesker to serve as the Alpha team’s vehicle specialist in Raccoon City, sparking jealousy among his former teammates. His curiosity doesn’t save him, as he meets a grim fate, mauled by a Cerberus in the mansion");
        // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
        if (bio.contains("Alpha")){
          this.occupation = "S.T.A.R.S Alpha Team";
        }
    }

  @Override
  public void getInfo() {
  System.out.println("\nRESIDENT EVIL 1"); 
  System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
  System.out.println("\nBio: " + this.bio + ".\n");
  }
}


// 	Brad Vickers
public static class STAR11 extends Character{
  STAR11(String name, int age) {
      // The super() call sets occupation to "S.T.A.R.S" and bio to "whatever it is..."
      // REMEMBER! Each Charcter will still require its own name and age.
      super(name, age, "S.T.A.R.S", "The Alpha team’s helicopter pilot and information expert, is nicknamed Chicken due to his fear of death and reluctance to face danger, which demoralizes his teammates. After fleeing in the helicopter during a Cerberus attack, leaving his team stranded, he redeems himself by returning to aid in the critical final battle against the Tyrant");
        // change the bio to "S.T.A.R.S Alpha Team" if this.bio contains "Alpha"
        if (bio.contains("Alpha")){
          this.occupation = "S.T.A.R.S Alpha Team";
        }
    }

  @Override
  public void getInfo() {
  System.out.println("\nRESIDENT EVIL 1"); 
  System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
  System.out.println("\nBio: " + this.bio + ".\n");
  }
}
    

}
