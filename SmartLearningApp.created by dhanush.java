
import java.util.*;

public class SmartLearningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SmartLearning!");

        boolean running = true;
        while (running) {
            System.out.println("1. Take a Quiz");
            System.out.println("2. View Progress");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    takeQuiz();
                    break;
                case 2:
                    viewProgress();
                    break;
                case 3:
                    System.out.println("Exiting SmartLearning. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"What is Java?", "Explain OOP principles.", "What is polymorphism?"};
        String[] answers = {"Java is a programming language.", "Object-Oriented Programming.", "Ability to take many forms."};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }
        System.out.println("Quiz complete! Your score: " + score + "/" + questions.length);
    }

    public static void viewProgress() {
        System.out.println("Feature coming soon! Track your progress on different subjects.");
    }
}
