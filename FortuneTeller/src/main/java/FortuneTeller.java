
    import java.util.Scanner;



        public class FortuneTeller {
            public static void main(String[] args) {
                Scanner userInput = new Scanner(System.in);

                System.out.println("Please enter your first name:");
                String firstName = userInput.nextLine();
                //System.out.println(firstName);

                System.out.println("Please enter your age");
                int age = userInput.nextInt();
                userInput.nextLine();
                //System.out.println(age);

                System.out.println("Please enter your last name:");
                String lastName = userInput.nextLine();
                //System.out.println(lastName);

                System.out.println(" Please enter birth month as an int");
                int birthMonth = userInput.nextInt();
                userInput.nextLine();
                //System.out.println(birthMonth);

                System.out.println("Please enter your favorite color (Type help for valid colors)");
                String favoriteColor = userInput.nextLine();
                System.out.println(favoriteColor);
                if (favoriteColor.equalsIgnoreCase("help")) {
                    System.out.println("The valid colors are red, yellow orange, blue, green, indigo, and violet");
                    System.out.println("Please enter your favorite color");
                    favoriteColor = userInput.nextLine();
                }

                System.out.println(" Please enter how many siblings you have ");
                int siblings = userInput.nextInt();
                userInput.nextLine();
                //system.out.println(siblings);

                int retirementYears = 0;
                if (age % 2 == 0) {
                    retirementYears = 12;
                } else {
                    retirementYears = 14;
                }

                System.out.println(" Retirement years; " + retirementYears);

                String retirementLocation = "";
                if (siblings == 0) {
                    retirementLocation = " Boca Raton, FL ";
                } else if (siblings == 1) {
                    retirementLocation = " Nassau, Bahamas ";
                } else if (siblings == 2) {
                    retirementLocation = " Ponta Negra, Brazil ";
                } else if (siblings == 3) {
                    retirementLocation = " Baton Rouge, LA ";
                }

                System.out.println("retirement location: " + retirementLocation);


                String vehicle = "";
                switch (favoriteColor.toLowerCase()) {
                    case "red":
                        vehicle = " Maserati ";
                        break;
                    case "orange":
                        vehicle = " Stallion ";
                        break;
                    case "yellow":
                        vehicle = " Chariot ";
                        break;
                    case "green":
                        vehicle = " Taxi ";
                        break;
                    case "blue":
                        vehicle = " Rickshaw ";
                        break;
                    case "indigo":
                        vehicle = " Motor Scooter ";
                        break;
                    case "violet":
                        vehicle = " Flying Saucer ";
                        break;
                    default:
                        vehicle = " Bicycle ";
                }

                float bankBalance = 0;
                if (birthMonth <= 4 && birthMonth >= 1) {
                    bankBalance = 256000.76f;

                } else if (birthMonth <= 8 && birthMonth >= 5) {
                    bankBalance = 3687105.42f;
                } else if (birthMonth <= 12 && birthMonth >= 9) {
                    bankBalance = 86.23f;
                }
                System.out.println(" Bank Balance: " + bankBalance);

                System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with " + bankBalance
                        + " in the bank, a vacation home in" + retirementLocation + ", and travel by " + vehicle);
            }
        }
