package rpg.story.game;

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
public class RPGStoryGame {

    public static void displayIntro() {

        System.out.println("This is a work in progross.\nNote: "
                + "You get one life, endless tries.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println(name + " was summoned into a new world from"
                + " unknown sources of light.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("You look around to find yourself inside a forest.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("As you look up, you see smoke in the distance."
                + " (Area 1 found)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("As you turn back, you see a cave. (Area 2 found)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }
        System.out.println("Will you go towards the smoke (1) or towards the "
                + "cave (2)?");
    }

    public static int exploreOne(int choice) {
        Scanner in = new Scanner(System.in);
        choice = 0;

        while (choice != 1 && choice != 2) {
            System.out.println("Which area will you go (1 or 2)");

            choice = in.nextInt();

        }

        return choice;
    }

    public static void decideOne(int choice) {
        Scanner in = new Scanner(System.in);
        int quickTime = 0;
        System.out.println("You approach to your destination...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        if (choice == 1) {
            System.out.println("It is windy and ... warmer?");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("awakened prematurely");
            }

            System.out.println("At a glance, you spot Lvl 75 forest fire spreading"
                    + " your way! "
                    + "\nYou also found shelter that leads downstairs. ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("awakened prematurely");
            }

            while (quickTime != 1 && quickTime != 2) {

                System.out.println("Continue forward like a boss and try "
                        + "to resist the flames (1) or coward back into the "
                        + "hidden shelter (2)?");
                System.out.println("What will you do (1 or 2)?");
                quickTime = in.nextInt();

            }

            if (quickTime == 2) {
                double luck = Math.ceil(Math.random() * 2);

                if (choice == luck) {
                    System.out.println("You found a unknown Lvl 20 magic scroll of the "
                            + "dark arts and 10 gold coins at the hidden shelter."
                            + " \nYou waited until the fire passes away. "
                            + "\nGained 6 bonus EXP!");

                } else {
                    System.out.println("You found 10 gold coins at the hidden shelter."
                            + " You waited until the fire passes away.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("awakened prematurely");
                    }

                    System.out.println("As you get out, everything within a 100 yard "
                            + "radius were burned turning the place into sand.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("awakened prematurely");
                    }
                    System.out.println("You notice a shiny object under the sand in "
                            + "front of the shelter.");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("awakened prematurely");
                    }

                    System.out.println("You picked up a Lvl 10 poisoned dagger! "
                            + "Gained 6 bonus EXP! \n ");
                }

            }
            if (quickTime == 1) {

                System.out.println("...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("awakened prematurely");
                }
                System.out.println("You think you hot stuff?");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("awakened prematurely");
                }
                System.out.println("Since you have zero resistance against"
                        + " magic and or spell negation effects...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("awakened prematurely");
                }

                System.out.println("You burned to death.\nGameplay Over\nHp = -75%");
                Scanner qd = new Scanner(System.in);
                String playAgain = "yes";
                System.out.println("Do you want to play again? (yes or no)");
                playAgain = qd.nextLine();
                if (playAgain.equals("yes")) {
                    boolean play = true;
                    while (play) {
                        displayIntro();
                        int choiceNumberOne = exploreOne(choice);
                        decideOne(choiceNumberOne);
                        levelTwoDialogue();
                        int choiceClassChange = levelTwoClassChange();
                        classDecide(choiceClassChange);
                        statusLevelTwoDialogue();
                    }
                    System.out.println("Do you want to play again? (yes or no)");
                    playAgain = qd.nextLine();
                    if (playAgain.equals("yes")) {
                        play = true;
                    } else {
                        play = false;
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }

            }
        }

        if (choice == 2) {
            System.out.println("It is cold and ... slippery?");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("awakened prematurely");
            }

            System.out.println("You found a giant chest blocking your way. \nTo "
                    + "continue your path, you open the chest.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("awakened prematurely");
            }

            double luck = Math.ceil(Math.random() * 2);

            if (choice == luck) {
                System.out.println("You found a Lvl 20 Ruby Sword! The chest "
                        + "disappears into the mist. \nGained 6 bonus EXP!");
            } else {
                System.out.println("Upon touching the giant chest, it disappears "
                        + "into the mist. You found 20 enchanted explosive arrows "
                        + "lying on the ground! \nGained 6 bonus EXP!");
            }

        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

    }

    public static void levelTwoDialogue() {
        System.out.println("You became level 2. \nYou get to decide which class "
                + "you wanted to take for this play.");
        System.out.println("\nThese are general class stats (Equipments or"
                + " item/area effects, debuff or buff effects are not included"
                + " in these stats.):");
        System.out.println("\nWarrior(option 1) - High DEF, Med ATK, "
                + "Special Skill - Stunning Bash at Lvl 1");
        System.out.println("\nArcher(option 2) - High Range, High ATK, Low DEF,"
                + " Special Skill - Concentrated Critical Hit at Lvl 1");
        System.out.println("\nMage(option 3) - Med Range, Med ATK, Med DEF,"
                + " Special Skill - Heal at Lvl 1");
        System.out.println("\nRogue(option 4) - High ATK, Med DEF, Special Skill"
                + " - Steal at Lvl 1");
        System.out.println("\nRandom Class(option 5) - Random stats repectively"
                + " to their own class. Chance at gaining other special classes.\n");

    }

    public static int levelTwoClassChange() {
        Scanner classChange1 = new Scanner(System.in);
        int choiceClassChange = 0;

        while (choiceClassChange != 1 && choiceClassChange != 2
                && choiceClassChange != 3 && choiceClassChange != 4 && choiceClassChange != 5 && choiceClassChange != 7777777) {
            System.out.println("Which class will you go for (1 or 2 or 3 or 4 or 5)");

            choiceClassChange = classChange1.nextInt();

        }

        return choiceClassChange;
    }

    public static void classDecide(int choiceClassChange) {
        if (choiceClassChange == 5) {

            choiceClassChange = (int) (Math.random() * (6 - 0) + 0);

        }
        if (choiceClassChange == 1) {
            System.out.println("You have chosen the way of the warrior.\nGained special "
                    + "skill - Stunning Bash.");
        }
        if (choiceClassChange == 2) {
            System.out.println("You have chosen the way of the archer.\nGained special "
                    + "skill - Concentrated Critical Hit.");
        }
        if (choiceClassChange == 3) {
            System.out.println("You have chosen the way of the mage.\nGained special "
                    + "skill - Heal.");
        }
        if (choiceClassChange == 4) {
            System.out.println("You have chosen the way of the rogue.\nGained special "
                    + "skill - Steal.");

        }
        if (choiceClassChange == 7777777) {
            System.out.println("You have been granted to ancient holy class the way of the Immortal Ancient Dragon Emperor.\nGained special "
                    + "skill - Control and Conquer. Immediate secondary skill - revive.");
        }
    }

    public static void statusLevelTwoDialogue() {
        System.out.println("You are now level 2. Required 5 more EXP until "
                + "next level.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }
        System.out.println("Note: Special skills can be used in battle only,and"
                + " not in outside environments except when certain criteria "
                + "are met. ");
    }

    public static void displayIntroTwo() {

        //try {
        //    Thread.sleep(2000);
        //} catch (InterruptedException e) {
        //    System.out.println("awakened prematurely");
        //}

        //printToFile.println("Current Status: Healthy\nLvl 2.\nHealth: 100%\nRequired 5 "
        //        + "exp until next level.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("You look around to find yourself inside a forest.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("As you look up, you see many smoke in the distance."
                + " (Area 1 found)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("awakened prematurely");
        }

        System.out.println("As you turn back, you see a cave. (Area 2 found)");
        System.out.println("Will you go towards the smoke (1) or towards the "
                + "cave (2)?");
    }

    public static int exploreTwo(int choice) {
        Scanner in = new Scanner(System.in);
        choice = 0;

        if (choice == 1) {
            System.out.println("Which area will you go (1 or 2)?");

            choice = in.nextInt();
        }
        if (choice == 2) {
            System.out.println("Which area will you go (1 or 2)?");

            choice = in.nextInt();

        }

        return choice;
    }
    
    public static int amountOfLives(int lifeCount){
        switch (lifeCount) {
            case 3:
                lifeCount--;
                return lifeCount;
                //System.out.println("You have " + lifeCount + ". \nResume "
                //        + "from where you left off? Or Restart?");
                
            case 2:
                lifeCount--;
                return lifeCount;
                //System.out.println("You have " + lifeCount + ". \nResume "
                //        + "from where you left off? Or Restart?");
                
            case 1:
                lifeCount--;
                return lifeCount;
                //System.out.println("You have " + lifeCount + ". \nResume "
                //        + "from where you left off? Or Restart?");
                
            case 0:
                return lifeCount;
                //System.out.println("You have " + lifeCount + ". \nYou "
                //        + "have ran out of lives. Restart?");
                //System.exit(lifeCount);
            default:
                break;
        }
        return lifeCount;
    }
    
    public static void dataRecorder(Scanner printToFile){
        
    }
    public static void printStream() throws Exception {
        printToFile = new PrintStream("pastRecords.txt"); //prints current data to file
    }
    
    public static void askUserResumeFromPast(Scanner pastRecords){
        
    }
    public int levelSystem(boolean EXPconditions){
        if (EXPconditions = true){
            level++;
        }
        return level;
    }
    public int grantedAmount(int givenAmount){
        
        
        return givenAmount;
    }
    public boolean EXPconditions(int grantedAmount){
        int requiredAmount;
        boolean confirm = false;
        if (level == 2){
            requiredAmount = 30;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 3){
            requiredAmount = 40;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 4){
            requiredAmount = 50;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 5){
            requiredAmount = 60;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 6){
            requiredAmount = 70;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 7){
            requiredAmount = 80;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 8){
            requiredAmount = 90;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 9){
            requiredAmount = 100;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        } if (level == 10){
            requiredAmount = 110;
            if (grantedAmount > requiredAmount){
            confirm = true;
            } else {
            confirm = false;
            }
        }
        
        return confirm;
    }
    
    
    
    public boolean eventCheck(boolean eventType){
        boolean confirm = false;
        if (eventType == true){
            
            confirm = true;
        }
        return confirm;
    }
    
    public static void playerBase(){
        System.out.println("Name: " + name + "\nCurrent Status: Healthy\nLvl 1 .\nHealth: 100%\nRequired 1 "
                + "exp until next level.");
        printToFile.println("Name: " + name + "\nCurrent Status: Healthy\nLvl 1 .\nHealth: 100%\nRequired 1 "
                + "exp until next level.");

    }
    
    public void levelUpText(){
        
        if (level == 2){
            System.out.println("You became level 2. \nYou get to decide which class "
                + "you wanted to take for this play.");
        System.out.println("\nThese are general class stats (Equipments or"
                + " item/area effects, debuff or buff effects are not included"
                + " in these stats.):");
        System.out.println("\nWarrior(option 1) - High DEF, Med ATK, "
                + "Special Skill - Stunning Bash at Lvl 1");
        System.out.println("\nArcher(option 2) - High Range, High ATK, Low DEF,"
                + " Special Skill - Concentrated Critical Hit at Lvl 1");
        System.out.println("\nMage(option 3) - Med Range, Med ATK, Med DEF,"
                + " Special Skill - Heal at Lvl 1");
        System.out.println("\nRogue(option 4) - High ATK, Med DEF, Special Skill"
                + " - Steal at Lvl 1");
        System.out.println("\nRandom Class(option 5) - Random stats repectively"
                + " to their own class. Chance at gaining other special classes.\n");
        
        classDecide(levelTwoClassChange());
        } if (level == 3){
            
            
        } if (level == 4){
            
        } if (level == 5){
            
        } if (level == 6){
            
        } if (level == 7){
            
        } if (level == 8){
            
        } if (level == 9){
            
        } if (level == 10){
            
        }
        
        
        
    }
    
    public static PrintStream printToFile;
    private double health, stamina, EXPGranter;
    private int level = 1;
    private static String name;
    private static String levelUpText;
    private boolean eventChecker;
    private static int choiceClassChange1;
    
    
    public static void main(String[] args) throws Exception{
        Scanner pastRecords = new Scanner("pastRecords.txt");
        //PrintStream printToFile = new PrintStream("another.txt");
        Scanner inner = new Scanner(System.in);
        Scanner askName = new Scanner(System.in);
        Scanner playerDataDecide = new Scanner(System.in);
        String playAgain = "yes";
        boolean expEvent = false;
        boolean displayEvent = false;
        boolean play = true, dead = false, continueWithPastData = false, playerDecision;
        int choice = 0, lifeCount = 1, ExpRequired, numericalDataDecide, stageNumber = 0;
        double hp = 100;
        
        while (play && lifeCount > -1) {
            //checkpoint system
            if(pastRecords.hasNext()){
                String pastName = pastRecords.nextLine();
            name = pastName.substring(6, 15);
            System.out.println("Previous Data found.\nPlayer name: " +
                    name + "found.\nContinue with previous game(1) or restart(0)");
            
            numericalDataDecide = playerDataDecide.nextInt();
            
            if(numericalDataDecide == 1){
            System.out.println("Welcome, " + name);
            //not finished. This should continue your last play from where you 
            //left off whether you stop program or ran out of lives.
            } else if(numericalDataDecide == 0){
                continue;
            }
            }
            
            
            System.out.println("What's your name player?");
            name = askName.next();
            System.out.println("Welcome, " + name);
            printStream();
            playerBase();
            displayIntro();
            int choiceNumberOne = exploreOne(choice);
            decideOne(choiceNumberOne);
            levelTwoDialogue();
            int choiceClassChange = levelTwoClassChange();
            classDecide(choiceClassChange);
            statusLevelTwoDialogue();

            System.out.println("Do you want to play again? It costs one life to continue. You have "+ lifeCount +" lives/life. (yes or no)");
            playAgain = inner.nextLine();
            if (playAgain.equals("yes")) {
                play = true;
                lifeCount--;
            } else {
                play = false;
                System.exit(0);
            }
        }
         if (lifeCount == 0) {
        System.out.println("Game Over. You ran out of hp.");
        System.exit(0);
         }
        if (hp == 0) {
            dead = true;
            //if(dead == true){
            //    amountOfLives(int lifeCount);
            //}
            if (dead) {
                while (play) {
                    displayIntro();
                    int choiceNumberOne = exploreOne(choice);
                    decideOne(choiceNumberOne);
                    levelTwoDialogue();
                    int choiceClassChange = levelTwoClassChange();
                    classDecide(choiceClassChange);
                    statusLevelTwoDialogue();

                    System.out.println("Do you want to play again? (yes or no)");
                    playAgain = inner.nextLine();
                    if (playAgain.equals("yes")) {
                        play = true;
                    } else {
                        play = false;
                        pastRecords.close();
                        printToFile.close();
                        System.exit(0);
                        break;
}
                }

            }
        }

        }
    }

