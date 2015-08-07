import java.util.Scanner;

public class Game {

    public static Scanner scan;
    public static String name;
    public static int age;
    public static String gender;
    public static int strength;
    public static int perception;
    public static int endurance;
    public static int charisma;
    public static int intelligence;
    public static int agility;
    public static int luck;
    public static String attribute;
    public static int attributePoints;
    public static int smallGuns;
    public static int bigGuns;
    public static int energyWeapons;
    public static int unarmed;
    public static int meleeWeapons;
    public static int throwing;
    public static int firstAid;
    public static int doctor;
    public static int sneak;
    public static int lockpick;
    public static int steal;
    public static int traps;
    public static int science;
    public static int repair;
    public static int speech;
    public static int barter;
    public static int gambling;
    public static int outdoors;
    public static String tag1;
    public static String tag2;
    public static String tag3;
    public static int maxHP;
    public static int currentHP;
    public static int armorClass;
    public static int actionPoints;
    public static int currentCarryWeight;
    public static int maxCarryWeight;
    public static int meleeDamage;
    public static int damageResis;
    public static int poisonResis;
    public static int radResis;
    public static int sequence;
    public static int healingRate;
    public static int critChance;
    public static String trait1;
    public static String trait2;
    public static boolean fastMetabolism;
    public static boolean bruiser;
    public static boolean smallFrame;
    public static boolean oneHander;
    public static boolean finesse;
    public static boolean kamikaze;
    public static boolean heavyHanded;
    public static boolean fastShot;
    public static boolean bloodyMess;
    public static boolean jinxed;
    public static boolean goodNatured;
    public static boolean drugAddict;
    public static boolean drugResistant;
    public static boolean nightPerson;
    public static boolean skilled;
    public static boolean gifted;

    public static void main(String[] args){

        startGame();

        createName();

        createAge();

        createGender();

        pressEnter();

        declareBaseAttributes();

        showAttributes();

        pressEnter();

        createAttributes();

        showAttributes();

        pressEnter();

        declareBaseSkills();

        showSkills();

        pressEnter();

        createSkills();

        pressEnter();

        showSkills();

        pressEnter();

        declareBaseStats();

        showStats();

        pressEnter();
       
        declareBaseTraits();
       
        createTraits();
       
        character();

    } //end method main()

    public static void startGame() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("     *** Welcome to Fallout! ***");
        System.out.println();
        System.out.println("Press Enter to begin character creation.");
        scan = new Scanner(System.in);
        scan.nextLine();
    } //end method start()

    public static void createName() {
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Greetings " + name + "!");
        System.out.println();
    } //end method name()

    public static void createAge() {
        System.out.println("How old are you?");
        while (scan.hasNextInt()) {
            age = scan.nextInt();
            if ((age <= 82) && (age >=18))
                break;
            else System.out.println("Please choose a number between 18 & 82");
        } //end while
        System.out.println(age + ". Got it.");
        System.out.println();
    } //end method createAge()

    public static void createGender() {
        System.out.println("Are you Male or Female?");
        while (scan.hasNextLine()) {
            gender = scan.nextLine();
            if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female"))
                break;
            else System.out.println("Please choose Male or Female");
        } //end while
        System.out.println(gender + ". Noted.");
        System.out.println();
    } //end method createGender()

    public static void pressEnter() {
        System.out.println("Press Enter to continue.");
        scan.nextLine();
    } //end method pressEnter()

    public static void declareBaseAttributes() {
        strength = 1;
        perception = 1;
        endurance = 1;
        charisma = 1;
        intelligence = 1;
        agility = 1;
        luck = 1;
    } //end method declareBaseAttributes()

    public static void showAttributes() {
        System.out.println("Your Attributes are:");
        System.out.println("Strength: " + strength);
        System.out.println("Perception: " + perception);
        System.out.println("Endurance: " + endurance);
        System.out.println("Charisma: " + charisma);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Agility: " + agility);
        System.out.println("Luck: " + luck);
        System.out.println();
    } //end method showAttributes()

    public static void createAttributes() {
        attributePoints = 33;
        for(int i = 1; i <= 33; i++) {
            System.out.println("You have " + attributePoints + " Attribute Points to allocate.");
            System.out.println("What would you like to increase?");
            System.out.println("S: Strength, P: Perception, E: Endurance, C: Charisma, I: Intelligence, A: Agility or L: Luck");
            while (scan.hasNextLine()) {
                attribute = scan.nextLine();
                if (      (attribute.equalsIgnoreCase("S") && (strength != 10))
                        || (attribute.equalsIgnoreCase("P") && (perception != 10))
                        || (attribute.equalsIgnoreCase("E") && (endurance != 10))
                        || (attribute.equalsIgnoreCase("C") && (charisma != 10))
                        || (attribute.equalsIgnoreCase("I") && (intelligence != 10))
                        || (attribute.equalsIgnoreCase("A") && (agility != 10))
                        || (attribute.equalsIgnoreCase("L") && (luck != 10)) )
                    break;
                else System.out.println("Please choose S: Strength, P: Perception, E: Endurance, C: Charisma, I: Intelligence, A: Agility or L: Luck");
                System.out.println("Note: Maximum Attribute Point value is 10.");
            } //end while
            if (attribute.equalsIgnoreCase("S")) {
                System.out.println("Strength Increased by 1!");
                strength ++;
                attributePoints --;
                System.out.println("Strength: " + strength);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("P")) {
                System.out.println("Perception Increased by 1!");
                perception ++;
                attributePoints --;
                System.out.println("Perception: " + perception);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("E")) {
                System.out.println("Endurance Increased by 1!");
                endurance ++;
                attributePoints --;
                System.out.println("Endurance: " + endurance);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("C")) {
                System.out.println("Charisma Increased by 1!");
                charisma ++;
                attributePoints --;
                System.out.println("Charisma: " + charisma);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("I")) {
                System.out.println("Intelligence Increased by 1!");
                intelligence ++;
                attributePoints --;
                System.out.println("Intelligence: " + intelligence);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("A")) {
                System.out.println("Agility Increased by 1!");
                agility ++;
                attributePoints --;
                System.out.println("Agility: " + agility);
                System.out.println();
            } else if (attribute.equalsIgnoreCase("L")) {
                System.out.println("Luck Increased by 1!");
                luck ++;
                attributePoints --;
                System.out.println("Luck: " + luck);
                System.out.println();
            } //end if
        } //end for
    } //end method createAttributes()

    public static void declareBaseSkills() {
        smallGuns = ((perception + agility + luck) * 2);
        bigGuns = (((strength / 2) + (perception / 2) + agility + luck) * 2);
        energyWeapons = (((intelligence / 2)+ (perception / 2) + agility + luck) * 2);
        unarmed = (((strength / 2) + (perception / 2) + (agility / 2) + (endurance / 2) + luck) * 2);
        meleeWeapons = (((strength / 2) + (perception / 2) + (agility / 2) + (endurance / 2) + luck) * 2);
        throwing = (((strength / 2) + (perception / 2) + agility + luck) * 2);
        firstAid = (((intelligence * 2) + perception) * 2);
        doctor = ((intelligence * 3) * 2);
        sneak = (((perception / 2) + (luck / 2) + (agility * 2)) * 2);
        lockpick = (((perception / 2) + (luck / 2) + agility + intelligence) * 2);
        steal = (((perception / 2) + (luck / 2) + (agility * 2)) * 2);
        traps = (((perception / 2) + (luck / 2) + agility + intelligence) * 2);
        science = ((intelligence * 3) * 2);
        repair = (((agility / 2) + (perception / 2) + (intelligence * 2)) * 2);
        speech = ((intelligence + (charisma * 2)) * 2);
        barter = ((intelligence + (charisma * 2)) * 2);
        gambling = ((luck * 3) * 2);
        outdoors = (((strength / 2) + (agility / 2) + (intelligence / 2) + (luck / 2) + endurance) * 2);
    } //end method declareBaseSkills()

    public static void showSkills() {
        System.out.println("Your Skills are:");
        System.out.println("Small Guns: " + smallGuns);
        System.out.println("Big Guns: " + bigGuns);
        System.out.println("Energy Weapons: " + energyWeapons);
        System.out.println("Unarmed: " + unarmed);
        System.out.println("Melee Weapons: " + meleeWeapons);
        System.out.println("Throwing: " + throwing);
        System.out.println("First Aid: " + firstAid);
        System.out.println("Doctor: " + doctor);
        System.out.println("Sneak: " + sneak);
        System.out.println("Lockpick: " + lockpick);
        System.out.println("Steal: " + steal);
        System.out.println("Traps: " + traps);
        System.out.println("Science: " + science);
        System.out.println("Repair: " + repair);
        System.out.println("Speech: " + speech);
        System.out.println("Barter: " + barter);
        System.out.println("Gambling: " + gambling);
        System.out.println("Outdoors: " + outdoors);
        System.out.println();
    } //end method showSkills()

    public static void createSkills() {
        System.out.println("You have 3 Skills to Tag.");
        System.out.println("What skill would you like to Tag? (+25)");
        showCreateSkills();
        while (scan.hasNextLine()) {
            tag1 = scan.nextLine();
            if (tag1.equalsIgnoreCase("Small Guns") || tag1.equalsIgnoreCase("Big Guns") ||
                    tag1.equalsIgnoreCase("Energy Weapons") || tag1.equalsIgnoreCase("Unarmed") ||
                    tag1.equalsIgnoreCase("Melee Weapons") || tag1.equalsIgnoreCase("Throwing") ||
                    tag1.equalsIgnoreCase("First Aid") || tag1.equalsIgnoreCase("Doctor") ||
                    tag1.equalsIgnoreCase("Sneak") || tag1.equalsIgnoreCase("Lockpick") ||
                    tag1.equalsIgnoreCase("Steal") || tag1.equalsIgnoreCase("Traps") ||
                    tag1.equalsIgnoreCase("Science") || tag1.equalsIgnoreCase("Repair") ||
                    tag1.equalsIgnoreCase("Speech") || tag1.equalsIgnoreCase("Barter") ||
                    tag1.equalsIgnoreCase("Gambling") || tag1.equalsIgnoreCase("Outdoors"))
                break;
            else System.out.println("Please choose Small Guns, Big Guns, Energy Weapons, " +
                    "Unarmed, Melee Weapons, Throwing, First Aid, Doctor");
            System.out.println("Sneak, Lockpick, Steal, Traps, Science, Repair, " +
                    "Speech, Barter, Gambling or Outdoors?");
        } //end while
        if (tag1.equalsIgnoreCase("Small Guns")) {
            System.out.println("Small Guns Increased by 25!");
            smallGuns = smallGuns + 25;
            System.out.println("Small Guns: " + smallGuns);
        } else if (tag1.equalsIgnoreCase("Big Guns")) {
            System.out.println("Big Guns Increased by 25!");
            bigGuns = bigGuns + 25;
            System.out.println("Big Guns: " + bigGuns);
        } else if (tag1.equalsIgnoreCase("Energy Weapons")) {
            System.out.println("Energy Weapons Increased by 25!");
            energyWeapons = energyWeapons + 25;
            System.out.println("Energy Weapons: " + energyWeapons);
        } else if (tag1.equalsIgnoreCase("Unarmed")) {
            System.out.println("Unarmed Increased by 25!");
            unarmed = unarmed + 25;
            System.out.println("Unarmed: " + unarmed);
        } else if (tag1.equalsIgnoreCase("Melee Weapons")) {
            System.out.println("Melee Weapons Increased by 25!");
            meleeWeapons = meleeWeapons+ 25;
            System.out.println("Melee Weapons: " + meleeWeapons);
        } else if (tag1.equalsIgnoreCase("Throwing")) {
            System.out.println("Throwing Increased by 25!");
            throwing = throwing + 25;
            System.out.println("Throwing: " + throwing);
        } else if (tag1.equalsIgnoreCase("First Aid")) {
            System.out.println("First Aid Increased by 25!");
            firstAid = firstAid+ 25;
            System.out.println("First Aid: " + firstAid);
        } else if (tag1.equalsIgnoreCase("Doctor")) {
            System.out.println("Doctor Increased by 25!");
            doctor = doctor + 25;
            System.out.println("Doctor: " + doctor);
        } else if (tag1.equalsIgnoreCase("Sneak")) {
            System.out.println("Sneak Increased by 25!");
            sneak = sneak + 25;
            System.out.println("Sneak: " + sneak);
        } else if (tag1.equalsIgnoreCase("Lockpick")) {
            System.out.println("Lockpick Increased by 25!");
            lockpick = lockpick + 25;
            System.out.println("Lockpick: " + lockpick);
        } else if (tag1.equalsIgnoreCase("Steal")) {
            System.out.println("Steal Increased by 25!");
            steal = steal + 25;
            System.out.println("Steal: " + steal);
        } else if (tag1.equalsIgnoreCase("Traps")) {
            System.out.println("Traps Increased by 25!");
            traps = traps + 25;
            System.out.println("Traps: " + traps);
        } else if (tag1.equalsIgnoreCase("Science")) {
            System.out.println("Science Increased by 25!");
            science = science + 25;
            System.out.println("Science: " + science);
        } else if (tag1.equalsIgnoreCase("Repair")) {
            System.out.println("Repair Increased by 25!");
            repair = repair + 25;
            System.out.println("Repair: " + repair);
        } else if (tag1.equalsIgnoreCase("Speech")) {
            System.out.println("Speech Increased by 25!");
            speech = speech + 25;
            System.out.println("Speech: " + speech);
        } else if (tag1.equalsIgnoreCase("Barter")) {
            System.out.println("Barter Increased by 25!");
            barter = barter + 25;
            System.out.println("Barter: " + barter);
        } else if (tag1.equalsIgnoreCase("Gambling")) {
            System.out.println("Gambling Increased by 25!");
            gambling = gambling + 25;
            System.out.println("Gambling: " + gambling);
        } else if (tag1.equalsIgnoreCase("Outdoors")) {
            System.out.println("Outdoors Increased by 25!");
            outdoors = outdoors + 25;
            System.out.println("Outdoors: " + outdoors);
        } //end if
        System.out.println();
        System.out.println("You have 2 Skills to Tag.");
        System.out.println("What skill would you like to Tag? (+20)");
        showCreateSkills();
        while (scan.hasNextLine()) {
            tag2 = scan.nextLine();
            if (tag2.equalsIgnoreCase(tag1)){
                System.out.println("A Skill can only be Tagged once.");
            } else if (tag2.equalsIgnoreCase("Small Guns") || tag2.equalsIgnoreCase("Big Guns") ||  tag2.equalsIgnoreCase("Energy Weapons") || tag2.equalsIgnoreCase("Unarmed") ||  tag2.equalsIgnoreCase("Melee Weapons") || tag2.equalsIgnoreCase("Throwing") ||  tag2.equalsIgnoreCase("First Aid") || tag2.equalsIgnoreCase("Doctor") ||
                    tag2.equalsIgnoreCase("Sneak") || tag2.equalsIgnoreCase("Lockpick") ||
                    tag2.equalsIgnoreCase("Steal") || tag2.equalsIgnoreCase("Traps") ||
                    tag2.equalsIgnoreCase("Science") || tag2.equalsIgnoreCase("Repair") ||
                    tag2.equalsIgnoreCase("Speech") || tag2.equalsIgnoreCase("Barter") ||
                    tag2.equalsIgnoreCase("Gambling") || tag2.equalsIgnoreCase("Outdoors"))
                break;
            else System.out.println("Please choose Small Guns, Big Guns, Energy Weapons, " +
                        "Unarmed, Melee Weapons, Throwing, First Aid, Doctor");
            System.out.println("Sneak, Lockpick, Steal, Traps, Science, Repair, " +
                    "Speech, Barter, Gambling or Outdoors?");
        } //end while
        if (tag2.equalsIgnoreCase("Small Guns")) {
            System.out.println("Small Guns Increased by 20!");
            smallGuns = smallGuns + 20;
            System.out.println("Small Guns: " + smallGuns);
        } else if (tag2.equalsIgnoreCase("Big Guns")) {
            System.out.println("Big Guns Increased by 20!");
            bigGuns = bigGuns + 20;
            System.out.println("Big Guns: " + bigGuns);
        } else if (tag2.equalsIgnoreCase("Energy Weapons")) {
            System.out.println("Energy Weapons Increased by 20!");
            energyWeapons = energyWeapons + 20;
            System.out.println("Energy Weapons: " + energyWeapons);
        } else if (tag2.equalsIgnoreCase("Unarmed")) {
            System.out.println("Unarmed Increased by 20!");
            unarmed = unarmed + 20;
            System.out.println("Unarmed: " + unarmed);
        } else if (tag2.equalsIgnoreCase("Melee Weapons")) {
            System.out.println("Melee Weapons Increased by 20!");
            meleeWeapons = meleeWeapons+ 20;
            System.out.println("Melee Weapons: " + meleeWeapons);
        } else if (tag2.equalsIgnoreCase("Throwing")) {
            System.out.println("Throwing Increased by 20!");
            throwing = throwing + 20;
            System.out.println("Throwing: " + throwing);
        } else if (tag2.equalsIgnoreCase("First Aid")) {
            System.out.println("First Aid Increased by 20!");
            firstAid = firstAid+ 20;
            System.out.println("First Aid: " + firstAid);
        } else if (tag2.equalsIgnoreCase("Doctor")) {
            System.out.println("Doctor Increased by 20!");
            doctor = doctor + 20;
            System.out.println("Doctor: " + doctor);
        } else if (tag2.equalsIgnoreCase("Sneak")) {
            System.out.println("Sneak Increased by 20!");
            sneak = sneak + 20;
            System.out.println("Sneak: " + sneak);
        } else if (tag2.equalsIgnoreCase("Lockpick")) {
            System.out.println("Lockpick Increased by 20!");
            lockpick = lockpick + 20;
            System.out.println("Lockpick: " + lockpick);
        } else if (tag2.equalsIgnoreCase("Steal")) {
            System.out.println("Steal Increased by 20!");
            steal = steal + 20;
            System.out.println("Steal: " + steal);
        } else if (tag2.equalsIgnoreCase("Traps")) {
            System.out.println("Traps Increased by 20!");
            traps = traps + 20;
            System.out.println("Traps: " + traps);
        } else if (tag2.equalsIgnoreCase("Science")) {
            System.out.println("Science Increased by 20!");
            science = science + 20;
            System.out.println("Science: " + science);
        } else if (tag2.equalsIgnoreCase("Repair")) {
            System.out.println("Repair Increased by 20!");
            repair = repair + 20;
            System.out.println("Repair: " + repair);
        } else if (tag2.equalsIgnoreCase("Speech")) {
            System.out.println("Speech Increased by 20!");
            speech = speech + 20;
            System.out.println("Speech: " + speech);
        } else if (tag2.equalsIgnoreCase("Barter")) {
            System.out.println("Barter Increased by 20!");
            barter = barter + 20;
            System.out.println("Barter: " + barter);
        } else if (tag2.equalsIgnoreCase("Gambling")) {
            System.out.println("Gambling Increased by 20!");
            gambling = gambling + 20;
            System.out.println("Gambling: " + gambling);
        } else if (tag2.equalsIgnoreCase("Outdoors")) {
            System.out.println("Outdoors Increased by 20!");
            outdoors = outdoors + 20;
            System.out.println("Outdoors: " + outdoors);
        } //end if
        System.out.println();
        System.out.println("You have 1 Skill to Tag.");
        System.out.println("What skill would you like to Tag? (+15)");
        showCreateSkills();
        while (scan.hasNextLine()) {
            tag3 = scan.nextLine();
            if (tag3.equalsIgnoreCase(tag1) || tag3.equalsIgnoreCase(tag2)){
                System.out.println("A Skill can only be Tagged once.");
            } else if (tag3.equalsIgnoreCase("Small Guns") || tag3.equalsIgnoreCase("Big Guns") ||  tag3.equalsIgnoreCase("Energy Weapons") || tag3.equalsIgnoreCase("Unarmed") ||  tag3.equalsIgnoreCase("Melee Weapons") || tag3.equalsIgnoreCase("Throwing") ||  tag3.equalsIgnoreCase("First Aid") || tag3.equalsIgnoreCase("Doctor") ||
                    tag3.equalsIgnoreCase("Sneak") || tag3.equalsIgnoreCase("Lockpick") ||
                    tag3.equalsIgnoreCase("Steal") || tag3.equalsIgnoreCase("Traps") ||
                    tag3.equalsIgnoreCase("Science") || tag3.equalsIgnoreCase("Repair") ||
                    tag3.equalsIgnoreCase("Speech") || tag3.equalsIgnoreCase("Barter") ||
                    tag3.equalsIgnoreCase("Gambling") || tag3.equalsIgnoreCase("Outdoors"))
                break;
            else System.out.println("Please choose Small Guns, Big Guns, Energy Weapons, " +
                        "Unarmed, Melee Weapons, Throwing, First Aid, Doctor");
            System.out.println("Sneak, Lockpick, Steal, Traps, Science, Repair, " +
                    "Speech, Barter, Gambling or Outdoors?");
        } //end while
        if (tag3.equalsIgnoreCase("Small Guns")) {
            System.out.println("Small Guns Increased by 15!");
            smallGuns = smallGuns + 15;
            System.out.println("Small Guns: " + smallGuns);
        } else if (tag3.equalsIgnoreCase("Big Guns")) {
            System.out.println("Big Guns Increased by 15!");
            bigGuns = bigGuns + 15;
            System.out.println("Big Guns: " + bigGuns);
        } else if (tag3.equalsIgnoreCase("Energy Weapons")) {
            System.out.println("Energy Weapons Increased by 15!");
            energyWeapons = energyWeapons + 15;
            System.out.println("Energy Weapons: " + energyWeapons);
        } else if (tag3.equalsIgnoreCase("Unarmed")) {
            System.out.println("Unarmed Increased by 15!");
            unarmed = unarmed + 15;
            System.out.println("Unarmed: " + unarmed);
        } else if (tag3.equalsIgnoreCase("Melee Weapons")) {
            System.out.println("Melee Weapons Increased by 15!");
            meleeWeapons = meleeWeapons+ 15;
            System.out.println("Melee Weapons: " + meleeWeapons);
        } else if (tag3.equalsIgnoreCase("Throwing")) {
            System.out.println("Throwing Increased by 15!");
            throwing = throwing + 15;
            System.out.println("Throwing: " + throwing);
        } else if (tag3.equalsIgnoreCase("First Aid")) {
            System.out.println("First Aid Increased by 15!");
            firstAid = firstAid+ 15;
            System.out.println("First Aid: " + firstAid);
        } else if (tag3.equalsIgnoreCase("Doctor")) {
            System.out.println("Doctor Increased by 15!");
            doctor = doctor + 15;
            System.out.println("Doctor: " + doctor);
        } else if (tag3.equalsIgnoreCase("Sneak")) {
            System.out.println("Sneak Increased by 15!");
            sneak = sneak + 15;
            System.out.println("Sneak: " + sneak);
        } else if (tag3.equalsIgnoreCase("Lockpick")) {
            System.out.println("Lockpick Increased by 15!");
            lockpick = lockpick + 15;
            System.out.println("Lockpick: " + lockpick);
        } else if (tag3.equalsIgnoreCase("Steal")) {
            System.out.println("Steal Increased by 15!");
            steal = steal + 15;
            System.out.println("Steal: " + steal);
        } else if (tag3.equalsIgnoreCase("Traps")) {
            System.out.println("Traps Increased by 15!");
            traps = traps + 15;
            System.out.println("Traps: " + traps);
        } else if (tag3.equalsIgnoreCase("Science")) {
            System.out.println("Science Increased by 15!");
            science = science + 15;
            System.out.println("Science: " + science);
        } else if (tag3.equalsIgnoreCase("Repair")) {
            System.out.println("Repair Increased by 15!");
            repair = repair + 15;
            System.out.println("Repair: " + repair);
        } else if (tag3.equalsIgnoreCase("Speech")) {
            System.out.println("Speech Increased by 15!");
            speech = speech + 15;
            System.out.println("Speech: " + speech);
        } else if (tag3.equalsIgnoreCase("Barter")) {
            System.out.println("Barter Increased by 15!");
            barter = barter + 15;
            System.out.println("Barter: " + barter);
        } else if (tag3.equalsIgnoreCase("Gambling")) {
            System.out.println("Gambling Increased by 15!");
            gambling = gambling + 15;
            System.out.println("Gambling: " + gambling);
        } else if (tag3.equalsIgnoreCase("Outdoors")) {
            System.out.println("Outdoors Increased by 15!");
            outdoors = outdoors + 15;
            System.out.println("Outdoors: " + outdoors);
        } //end if
        System.out.println();
    } //end method createSkills()

    public static void declareBaseStats() {
        maxHP = ((endurance * 5) + strength);
        currentHP = ((endurance * 5) + strength);
        armorClass = ((endurance / 8) + (endurance / 9) + (endurance / 10) + (agility / 8) + (agility / 9) + (agility / 10));
        actionPoints = (agility + 2);
        maxCarryWeight = (strength * 30);
        meleeDamage = ((strength / 6) + (strength / 7) + (strength / 8) + (strength / 9) + (strength / 10) + (unarmed / 25));
        damageResis = 0;
        poisonResis = (endurance * 5);
        radResis = (endurance * 2);
        sequence = (((agility * 2) + (perception * 2)) - 4 );
        healingRate = ((endurance / 5) + (endurance / 6) + (endurance / 7) + (endurance / 8) + (endurance / 9) + (endurance / 10));
        critChance = (luck + (perception / 9) + (perception / 10));
    } //end method declareBaseStats()

    public static void showStats() {
        System.out.println("Your Statistics are:");
        System.out.println("Hitpoints: " + currentHP + "/" + maxHP);
        System.out.println("Armor Class: " + armorClass);
        System.out.println("Action Points: " + actionPoints);
        System.out.println("Carry Weight: " + currentCarryWeight + "/" + maxCarryWeight);
        System.out.println("Melee Damage: " + meleeDamage);
        System.out.println("Damage Resistance: " + damageResis);
        System.out.println("Poison Resistance: " + poisonResis);
        System.out.println("Radiation Resistance: " + radResis);
        System.out.println("Sequence: " + sequence);
        System.out.println("Healing Rate: " + healingRate);
        System.out.println("Critical Chance: " + critChance);
        System.out.println();
    } //end method showStats()
   
    public static void declareBaseTraits() {
        fastMetabolism = false;
        bruiser = false;
        smallFrame = false;
        oneHander = false;
        finesse = false;
        kamikaze = false;
        heavyHanded = false;
        fastShot = false;
        bloodyMess = false;
        jinxed = false;
        goodNatured = false;
        drugAddict = false;
        drugResistant = false;
        nightPerson = false;
        skilled = false;
        gifted = false;
    } //end method declareBaseTraits()
   
    public static void createTraits() {
        System.out.println("Please choose 0, 1 or 2 traits.");
        System.out.println("First Trait.");
        traitDescription();
        while (scan.hasNextLine()) {
            trait1 = scan.nextLine();
            if (trait1.equalsIgnoreCase("FM") || trait1.equalsIgnoreCase("B") ||
                    trait1.equalsIgnoreCase("SF") || trait1.equalsIgnoreCase("OH") ||
                    trait1.equalsIgnoreCase("F") || trait1.equalsIgnoreCase("K") ||
                    trait1.equalsIgnoreCase("HH") || trait1.equalsIgnoreCase("FS") ||
                    trait1.equalsIgnoreCase("BM") || trait1.equalsIgnoreCase("J") ||
                    trait1.equalsIgnoreCase("GN") || trait1.equalsIgnoreCase("DA") ||
                    trait1.equalsIgnoreCase("DR") || trait1.equalsIgnoreCase("NP") ||
                    trait1.equalsIgnoreCase("S") || trait1.equalsIgnoreCase("G") ||
                    trait1.equalsIgnoreCase("SKIP"))
                break;
            else System.out.println("Please choose FM, B, SF, OH, F, K, HH, FS" +
                    "BM, J, GN, DA, DR, NP, S, G or SKIP");
        } //end while
        if (trait1.equalsIgnoreCase("FM")) {
            System.out.println("You have inherited the Fast Metabolism trait!");
            fastMetabolism = true;
            System.out.println("-10 to Radiation and Poison Resistance. +4 to Healing Rate.");
            radResis = radResis - 10;
            poisonResis = poisonResis - 10;
            healingRate = healingRate + 4;
            System.out.println("Poison Resistance: " + poisonResis);
            System.out.println("Radiation Resistance: " + radResis);
            System.out.println("Healing Rate: " + healingRate);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("B")) {
            System.out.println("You have inherited the Bruiser trait!");
            bruiser = true;
            System.out.println("-2 to Action Points, +4 to Unarmed and Melee Damage.");
            actionPoints = actionPoints - 2;
            meleeDamage = meleeDamage + 4;
            System.out.println("Action Points: " + actionPoints);
            System.out.println("Melee Damage: " + meleeDamage);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("SF")) {
            System.out.println("You have inherited the Small Frame trait!");
            smallFrame = true;
            System.out.println("-50 Carry Weight, +1 Agility.");
            maxCarryWeight = maxCarryWeight - 50;
            agility = agility + 1;
            System.out.println("Carry Weight: " + currentCarryWeight + "/" + maxCarryWeight);
            System.out.println("Agility: " + agility);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("OH")) {
            System.out.println("You have inherited the One Hander trait!");
            oneHander = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("F")) {
            System.out.println("You have inherited the Finesse trait!");
            finesse = true;
            System.out.println("-2 Damage, +10 Critical Chance");
            critChance = critChance + 10;
            System.out.println("General Damage: -2");
            System.out.println("Critical Chance: " + critChance);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("K")) {
            System.out.println("You have inherited the Kamikaze trait!");
            kamikaze = true;
            System.out.println("Armor Class set to 0, +5 Sequence.");
            armorClass = armorClass * 0;
            sequence = sequence + 5;
            System.out.println("Armor Class: " + armorClass);
            System.out.println("Sequence: " + sequence);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("HH")) {
            System.out.println("You have inherited the Heavy Handed trait!");
            heavyHanded = true;
            System.out.println("-10 Crit Chance, +2 Melee Damage ");
            critChance = critChance - 10;
            meleeDamage = meleeDamage + 2;
            System.out.println("Critical Chance: " + critChance);
            System.out.println("Melee Damage: " + meleeDamage);
            System.out.println();
        } else if (trait1.equalsIgnoreCase("FS")) {
            System.out.println("You have inherited the Fast Shot trait!");
            fastShot = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("BM")) {
            System.out.println("You have inherited the Bloody Mess trait!");
            bloodyMess = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("J")) {
            System.out.println("You have inherited the Jinxed trait!");
            jinxed = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("GN")) {
            System.out.println("You have inherited the Good Natured trait!");
            goodNatured = true;
            System.out.println("-10 to all Combat Skills. +15 First Aid, Doctor, Speech and Barter.");
            smallGuns = smallGuns - 10;
            bigGuns = bigGuns - 10;
            energyWeapons = energyWeapons - 10;
            unarmed = unarmed - 10;
            meleeWeapons = meleeWeapons - 10;
            throwing = throwing - 10;
            firstAid = firstAid + 15;
            doctor = doctor + 15;
            speech = speech + 15;
            barter = barter + 15;
            System.out.println();
            pressEnter();
            showSkills();
            System.out.println();
        } else if (trait1.equalsIgnoreCase("DA")) {
            System.out.println("You have inherited the Drug Addict trait!");
            drugAddict = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("DR")) {
            System.out.println("You have inherited the Drug Resistant trait!");
            drugResistant = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("NP")) {
            System.out.println("You have inherited the Night Person trait!");
            nightPerson = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("S")) {
            System.out.println("You have inherited the Skilled trait!");
            skilled = true;
            System.out.println();
        } else if (trait1.equalsIgnoreCase("G")) {
            System.out.println("You have inherited the Gifted trait!");
            gifted = true;
            System.out.println("+1 All Attributes, -5 All Skills");
            strength ++;
            perception ++;
            endurance ++;
            charisma ++;
            intelligence ++;
            agility ++;
            luck ++;
            System.out.println();
            pressEnter();
            showAttributes();
            smallGuns = smallGuns - 5;
            bigGuns = bigGuns - 5;
            energyWeapons = energyWeapons - 5;
            unarmed = unarmed - 5;
            meleeWeapons = meleeWeapons - 5;
            throwing = throwing - 5;
            firstAid = firstAid - 5;
            doctor = doctor - 5;
            sneak = sneak - 5;
            lockpick = lockpick - 5;
            steal = steal - 5;
            traps = traps - 5;
            science = science - 5;
            repair = repair - 5;
            speech = speech - 5;
            barter = barter - 5;
            gambling = gambling - 5;
            outdoors = outdoors - 5;
            pressEnter();
            showSkills();
            System.out.println();
        } else if (trait1.equalsIgnoreCase("SKIP")) {
            System.out.println("No trait inherited.");
            System.out.println();
        } //end if
        pressEnter();
        System.out.println("Second Trait.");
        traitDescription();
        while (scan.hasNextLine()) {
            trait2 = scan.nextLine();
            if (trait2.equalsIgnoreCase(trait1)){
                System.out.println("A Trait can only be chosen once.");
            } else if (trait2.equalsIgnoreCase("FM") || trait2.equalsIgnoreCase("B") ||
                    trait2.equalsIgnoreCase("SF") || trait2.equalsIgnoreCase("OH") ||
                    trait2.equalsIgnoreCase("F") || trait2.equalsIgnoreCase("K") ||
                    trait2.equalsIgnoreCase("HH") || trait2.equalsIgnoreCase("FS") ||
                    trait2.equalsIgnoreCase("BM") || trait2.equalsIgnoreCase("J") ||
                    trait2.equalsIgnoreCase("GN") || trait2.equalsIgnoreCase("DA") ||
                    trait2.equalsIgnoreCase("DR") || trait2.equalsIgnoreCase("NP") ||
                    trait2.equalsIgnoreCase("S") || trait2.equalsIgnoreCase("G") ||
                    trait2.equalsIgnoreCase("SKIP"))
                break;
            else System.out.println("Please choose FM, B, SF, OH, F, K, HH, FS" +
                    "BM, J, GN, DA, DR, NP, S, G or SKIP");
        } //end while
        if (trait2.equalsIgnoreCase("FM")) {
            System.out.println("You have inherited the Fast Metabolism trait!");
            fastMetabolism = true;
            System.out.println("-10 to Radiation and Poison Resistance. +4 to Healing Rate.");
            radResis = radResis - 10;
            poisonResis = poisonResis - 10;
            healingRate = healingRate + 4;
            System.out.println("Poison Resistance: " + poisonResis);
            System.out.println("Radiation Resistance: " + radResis);
            System.out.println("Healing Rate: " + healingRate);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("B")) {
            System.out.println("You have inherited the Bruiser trait!");
            bruiser = true;
            System.out.println("-2 to Action Points, +4 to Unarmed and Melee Damage.");
            actionPoints = actionPoints - 2;
            meleeDamage = meleeDamage + 4;
            System.out.println("Action Points: " + actionPoints);
            System.out.println("Melee Damage: " + meleeDamage);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("SF")) {
            System.out.println("You have inherited the Small Frame trait!");
            smallFrame = true;
            System.out.println("-50 Carry Weight, +1 Agility.");
            maxCarryWeight = maxCarryWeight - 50;
            agility = agility + 1;
            System.out.println("Carry Weight: " + currentCarryWeight + "/" + maxCarryWeight);
            System.out.println("Agility: " + agility);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("OH")) {
            System.out.println("You have inherited the One Hander trait!");
            oneHander = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("F")) {
            System.out.println("You have inherited the Finesse trait!");
            finesse = true;
            System.out.println("-2 Damage, +10 Critical Chance");
            critChance = critChance + 10;
            System.out.println("General Damage: -2");
            System.out.println("Critical Chance: " + critChance);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("K")) {
            System.out.println("You have inherited the Kamikaze trait!");
            kamikaze = true;
            System.out.println("Armor Class set to 0, +5 Sequence.");
            armorClass = armorClass * 0;
            sequence = sequence + 5;
            System.out.println("Armor Class: " + armorClass);
            System.out.println("Sequence: " + sequence);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("HH")) {
            System.out.println("You have inherited the Heavy Handed trait!");
            heavyHanded = true;
            System.out.println("-10 Crit Chance, +2 Melee Damage ");
            critChance = critChance - 10;
            meleeDamage = meleeDamage + 2;
            System.out.println("Critical Chance: " + critChance);
            System.out.println("Melee Damage: " + meleeDamage);
            System.out.println();
        } else if (trait2.equalsIgnoreCase("FS")) {
            System.out.println("You have inherited the Fast Shot trait!");
            fastShot = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("BM")) {
            System.out.println("You have inherited the Bloody Mess trait!");
            bloodyMess = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("J")) {
            System.out.println("You have inherited the Jinxed trait!");
            jinxed = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("GN")) {
            System.out.println("You have inherited the Good Natured trait!");
            goodNatured = true;
            System.out.println("-10 to all Combat Skills. +15 First Aid, Doctor, Speech and Barter.");
            smallGuns = smallGuns - 10;
            bigGuns = bigGuns - 10;
            energyWeapons = energyWeapons - 10;
            unarmed = unarmed - 10;
            meleeWeapons = meleeWeapons - 10;
            throwing = throwing - 10;
            firstAid = firstAid + 15;
            doctor = doctor + 15;
            speech = speech + 15;
            barter = barter + 15;
            System.out.println();
            pressEnter();
            showSkills();
            System.out.println();
        } else if (trait2.equalsIgnoreCase("DA")) {
            System.out.println("You have inherited the Drug Addict trait!");
            drugAddict = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("DR")) {
            System.out.println("You have inherited the Drug Resistant trait!");
            drugResistant = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("NP")) {
            System.out.println("You have inherited the Night Person trait!");
            nightPerson = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("S")) {
            System.out.println("You have inherited the Skilled trait!");
            skilled = true;
            System.out.println();
        } else if (trait2.equalsIgnoreCase("G")) {
            System.out.println("You have inherited the Gifted trait!");
            gifted = true;
            System.out.println("+1 All Attributes, -5 All Skills");
            strength ++;
            perception ++;
            endurance ++;
            charisma ++;
            intelligence ++;
            agility ++;
            luck ++;
            System.out.println();
            pressEnter();
            showAttributes();
            smallGuns = smallGuns - 5;
            bigGuns = bigGuns - 5;
            energyWeapons = energyWeapons - 5;
            unarmed = unarmed - 5;
            meleeWeapons = meleeWeapons - 5;
            throwing = throwing - 5;
            firstAid = firstAid - 5;
            doctor = doctor - 5;
            sneak = sneak - 5;
            lockpick = lockpick - 5;
            steal = steal - 5;
            traps = traps - 5;
            science = science - 5;
            repair = repair - 5;
            speech = speech - 5;
            barter = barter - 5;
            gambling = gambling - 5;
            outdoors = outdoors - 5;
            pressEnter();
            showSkills();
            System.out.println();
        } else if (trait2.equalsIgnoreCase("SKIP")) {
            System.out.println("No trait inherited.");
            System.out.println();
        } //end if
    } //end method createTraits

    public static void traitDescription() {
        System.out.println();
        System.out.println("(FM) Fast Metabolism: Your metabolic rate is twice as normal.");
        System.out.println("     That means you are much less resistant to radiation and poison, but your body will heal faster.");
        System.out.println("(B) Bruiser: A little slower but a little bigger. You may not hit as often but enemies will feel it when you do!");
        System.out.println("     Your total action points are lowered but you do more melee damage.");
        System.out.println("(SF) Small Frame: You are not quite as big as other vault-dwellers, but that never slowed you down.");
        System.out.println("     You can't carry as much but you are more agile.");
        System.out.println("(OH) One Hander: One of your hands is very dominant.");
        System.out.println("     You excel with single handed weapons but two handed cause a problem.");
        System.out.println("(F) Finesse: Your attacks show a lot of finesse.");
        System.out.println("     You don't do as much damage but you cause more critical hits.");
        System.out.println("(K) Kamikaze: By not paying attention you can act a lot faster in a turn.");
        System.out.println("     This lowers your armor class to just what you're wearing, but you sequence much faster in combat turn.");
        System.out.println("(HH) Heavy Handed: You swing harder, not better. Your attacks are very brutal but lack finesse.");
        System.out.println("     You rarely cause a good critical hit but you always do more melee damage.");
        System.out.println("(FS) Fast Shot: You don't have time to aim for a targeted attack, because you attack faster than normal people.");
        System.out.println("     It costs you one less action point to use a weapon.");
        System.out.println("(BM) Bloody Mess: By some strange twist of fate, people around you die violently.");
        System.out.println("     You always see the worst way possible a person can die.");
        System.out.println("(J) Jinxed: The good thing is that everyone around you have more critical failures in combat.");
        System.out.println("     The bad thing is so do you.");
        System.out.println("(GN) Good Natured: You studied less combative skills as you were growing up.");
        System.out.println("     Your combat skills start at a lower level but First Aid, Doctor, Speech and Barter are substantially improved.");
        System.out.println("(DA) Drug Addict: You are more easily addicted to drugs.");
        System.out.println("     Your chance to be addicted by drug is twice normal, but you recover faster from their ill effects.");
        System.out.println("(DR) Drug Resistant: Drugs only affect you half as long as normal,");
        System.out.println("     but your chance to be addicted is also only at %50 of normal.");
        System.out.println("(NP) Night Person: As a night-time person you are more awake when the sun goes down.");
        System.out.println("     Your Intelligence and Perception are improved at night, but dulled during the day.");
        System.out.println("(S) Skilled: Since you spent more time improving your skills than a normal person, you gain more skill points.");
        System.out.println("     The tradeoff is that you do not gain as many extra abilities. You will gain a perk every 4 levels.");
        System.out.println("(G) Gifted: You have more innate abilities than most, so you have not spent as much time honing your skills.");
        System.out.println("     Your statistics are better than the average person, but your skills are lacking.");
        System.out.println("(SKIP) Skip: Do not choose a trait this round.");
    } //end method traitDescription()
   
    public static void showCreateSkills() {
        System.out.println("Small Guns, Big Guns, Energy Weapons, Unarmed, Melee Weapons, Throwing...");
        System.out.println("First Aid, Doctor, Sneak, Lockpick, Steal, Traps, Science, Repair...");
        System.out.println("Speech, Barter, Gambling or Outdoors?");
    } //end method showCreateSkills()
   
    public static void showTraits() {
        System.out.println("Your Traits are:");
        if (fastMetabolism == true) {
            System.out.println("Fast Metabolism");
        }
        if (bruiser == true) {
            System.out.println("Bruiser");
        }
        if (smallFrame == true) {
            System.out.println("Small Frame");
        }
        if (oneHander == true) {
            System.out.println("One Hander");
        }
        if (finesse == true) {
            System.out.println("Finesse");
        }
        if (kamikaze == true) {
            System.out.println("Kamikaze");
        }
        if (heavyHanded == true) {
            System.out.println("Heavy Handed");
        }
        if (fastShot == true) {
            System.out.println("Fast Shot");
        }
        if (bloodyMess == true) {
            System.out.println("Bloody Mess");
        }
        if (jinxed == true) {
            System.out.println("Jinxed");
        }
        if (goodNatured == true) {
            System.out.println("Good Natured");
        }
        if (drugAddict == true) {
            System.out.println("Drug Addict");
        }
        if (drugResistant == true) {
            System.out.println("Drug Resistant");
        }
        if (nightPerson == true) {
            System.out.println("Night Person");
        }
        if (skilled == true) {
            System.out.println("Skilled");
        }
        if (gifted == true) {
            System.out.println("Gifted");
        }
    } //end method showTraits()
   
    public static void character() {
        pressEnter();
        System.out.println("Name: " + name + ". Age: " + age + ". Gender: " + gender + ".");
        System.out.println();
        pressEnter();
        showAttributes();
        pressEnter();
        showSkills();
        pressEnter();
        showStats();
        pressEnter();
        showTraits();
    } //end method character()
   
} //end class Game
