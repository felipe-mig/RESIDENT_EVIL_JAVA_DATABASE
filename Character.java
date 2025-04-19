class Character {

    protected String name;
    protected int age;
    protected String occupation;
    protected String bio;

    // Character a constructor that sets each field to the values passed in.
    Character(String name, int age, String occupation, String bio){
      this.name = name;
      this.age = age;
      this.occupation = occupation;
      this.bio = bio;
    }

    // Public method for Character called getInfo(). We’ll use this method to display all of its information (using its field values).
    public void getInfo(){
      System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Occupation: " + this.occupation);
      System.out.println("Bio: " + this.bio + ".\n");
    }

  

        public static void main(String[] args){
          // Instantiate a new Character of your choice
          Character leon = new Character("Leon S.Kennedy", 21, "Raccoon City Police Department (R.P.D.)", "a rookie cop with idealistic views, arrives in Raccoon City only to find it overrun with chaos. He teams up with Claire to escape, unaware that the real dangers await at the Police Station");
          // call getInfo() on the Character variable.
          leon.getInfo();

          RE1.STARS1 richardAiken = new RE1.STARS1("Richard Aiken", 23);
          // call getInfo() on the Character variable.
          richardAiken.getInfo();

          RE1.STARS2 enricoMarini = new RE1.STARS2("Enrico Marini", 41);
          // call getInfo() on the Character variable.
          enricoMarini.getInfo();

          RE1.STARS3 forestSpeyer = new RE1.STARS3("Forest Speyer", 29);
          // call getInfo() on the Character variable.
          forestSpeyer.getInfo();

          RE1.STARS4 kennethJSullivan = new RE1.STARS4("Kenneth J. Sullivan", 45);
          // call getInfo() on the Character variable.
          kennethJSullivan.getInfo();

          RE1.STARS5 rebeccaChambers = new RE1.STARS5("Rebecca Chambers", 18);
          // call getInfo() on the Character variable.
          rebeccaChambers.getInfo();

          RE1.STARS6 jillValentine = new RE1.STARS6("Jill Valentine", 23);
          // call getInfo() on the Character variable.
          jillValentine.getInfo();

          RE1.STARS7 chrisRedfield = new RE1.STARS7("Chris Redfield", 25);
          // call getInfo() on the Character variable.
          chrisRedfield.getInfo();

          RE1.STARS8 barryBurton = new RE1.STARS8("Barry Burton", 38);
          // call getInfo() on the Character variable.
          barryBurton.getInfo();

          RE1.STARS9 albertWesker = new RE1.STARS9("Albert Wesker", 38);
          // call getInfo() on the Character variable.
          albertWesker.getInfo();

          RE1.STAR10 josephFrost = new RE1.STAR10("Joseph Frost", 27);
          // call getInfo() on the Character variable.
          josephFrost.getInfo();


          RE1.STAR11 bradVickers = new RE1.STAR11("Brad Vickers", 35);
          // call getInfo() on the Character variable.
          bradVickers.getInfo();

          RE2.Claire claireRedfield = new RE2.Claire("Claire Redfield", 19);
          // call getInfo() on the Character variable.
          claireRedfield.getInfo();

          RE2.Sherry sherryBirkin = new RE2.Sherry("Sherry Birkin", 12);
          // call getInfo() on the Character variable.
          sherryBirkin.getInfo();

          RE2.Ada adaWong  = new RE2.Ada("Ada Wong", 30);
          // call getInfo() on the Character variable.
          adaWong .getInfo();

          RE2.Hunk hunk  = new RE2.Hunk("Hunk", 31);
          // call getInfo() on the Character variable.
          hunk .getInfo();

          RE3.Carlos carlosOlivera = new RE3.Carlos("Carlos Oliveira", 21);
          // call getInfo() on the Character variable.
          carlosOlivera.getInfo();

          RE3.Mikhail mikhailVictor  = new RE3.Mikhail("Mikhail Victor ", 45);
          // call getInfo() on the Character variable.
          mikhailVictor .getInfo();

          RE3.Nicholai nicholaiGinovaeff  = new RE3.Nicholai("Nicholai Ginovaeff", 35);
          // call getInfo() on the Character variable.
          nicholaiGinovaeff .getInfo();
          
    }
  
} 