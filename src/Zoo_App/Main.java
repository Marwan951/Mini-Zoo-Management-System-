package Zoo_App;


import javax.swing.*;

public class Main {
    public static void main(String []args){
        SwingUtilities.invokeLater(Zoo_Menu_Screen::new);
    }

}


/*
        while (running){
            System.out.println("==================================");
            System.out.println("**    Zoo Management System    **");
            System.out.println("==================================");
            System.out.println("Choose an animal to iinteract with: \n");
            System.out.println("🐯 1. Tiger");
            System.out.println("🐬 2. Dolphin");
            System.out.println("🐧 3. Penguin");
            System.out.println("❌ 4. Exit");
            input = scanner.nextInt();
            Animal animal;
            switch (input){
                case 1:
                    animal = new Tiger("Tego",3,70);
                    animal = ((Tiger)animal);
                    animal.eat();
                    break;
                case 2:
                    animal = new Dolphin("Dolphy", 1,40);
                    animal = ((Dolphin)animal);
                    animal.eat();
                    break;
                case 3:
                    animal = new Penguin("Pengo",2,90);
                    animal = ((Penguin)animal);
                    animal.eat();
                default:
                    System.out.println("Invalid choice, try again.");

            }

        }

 */