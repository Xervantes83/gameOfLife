package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Main extends Application {

    static Stage PrimaryStage;
    private static Scene main;
    private static Scene gameBoardScreen;
    private static Scene ruleScreen;
    private static Scene questionScreen;
    private static Scene choiceScreen;
    private static String[] names;
    private static int[] lifeTiles;
    private static int[] academicTiles;
    private static int[] personalTiles;
    private static int[] summerTiles;
    public static ArrayList<ArrayList<String>> lifeQuestions;
    public static ArrayList<ArrayList<String>> academicQuestions;
    public static ArrayList<ArrayList<String>> personalQuestions;

    @Override
    public void start(Stage stage) throws Exception{
                int lifeTiles[] = {1, 4, 10, 13, 19, 22, 25, 28};
                this.lifeTiles = lifeTiles;
                int academicTiles[] = {2, 5, 11, 14, 17, 20, 26, 29};
                this.academicTiles = academicTiles;
                int personalTiles[] = {3, 6, 9, 12, 18, 21, 27, 30};
                this.personalTiles = personalTiles;
                int summerTiles[] = {7, 15, 23, 31};
                this.summerTiles = summerTiles;
                String[] names = {"Life Problems", "Academic Problems", "Personal Problems"};
                this.names = names;
                ArrayList<ArrayList<String>> lifeQuestions = new ArrayList<ArrayList<String>>();
                this.lifeQuestions = lifeQuestions;
                ArrayList<ArrayList<String>> academicQuestions = new ArrayList<ArrayList<String>>();
                this.academicQuestions = academicQuestions;
                ArrayList<ArrayList<String>> personalQuestions = new ArrayList<ArrayList<String>>();
                this.personalQuestions = personalQuestions;
                lifeQuestions.add(new ArrayList<String>());
                lifeQuestions.get(0).add("You discover that you need to work in order to attend college");
                lifeQuestions.get(0).add("A close family member falls ill and you go see your advisor");
                lifeQuestions.get(0).add("You are concerned about employment upon graduation");
                lifeQuestions.get(0).add("You are still evaluating your life's course options");
                lifeQuestions.get(0).add("You have a hard time making friends in the STEM major");
                lifeQuestions.get(0).add("Your parent(s) are really involved and it makes you uncomfortable.  Especially since they call the advisor every week.");
                lifeQuestions.get(0).add("You experience a death in the family");
                lifeQuestions.get(0).add("You develop a substance abuse problem");
                lifeQuestions.get(0).add("You have outbursts in the commons area, which intimidates other students in the vicinity");
                lifeQuestions.get(0).add("Your roommate is involved in some clandestine activity and it's making you nervous");
                lifeQuestions.get(0).add("You're getting married!");
                lifeQuestions.get(0).add("A seminal cohort event has just occurred.");
                lifeQuestions.get(0).add("You reveal to your advisor that you are a narcoleptic and cant get up for morning classes");
                lifeQuestions.get(0).add("You had a bad experience with an advisor and consequently, you don’t like/trust them");
                lifeQuestions.get(0).add("You are a student athlete whose team lost the big game");
                lifeQuestions.get(0).add("Your family home catches fire");
                lifeQuestions.get(0).add("Another student is harassing you");
                lifeQuestions.get(0).add("You are an Asian student who feels like making a B is unacceptable");
                lifeQuestions.get(0).add("You are a black student who feels ostracized");
                lifeQuestions.get(0).add("You are having problems with your girlfriend/boyfriend");
                lifeQuestions.get(0).add("You are a closeted LGBTQ individual who wants to come out");
                lifeQuestions.get(0).add("You are an older student getting re-acclaimated to college");
        lifeQuestions.add(new ArrayList<String>());
        lifeQuestions.get(1).add("The advisor suggests a class schedule for you with no regard for your work schedule because these are the classes a STEM major has to take\nGain one fear");
                lifeQuestions.get(1).add("The advisor empathizes with you and tells you things will get better, and also advises you on campus resources available.  They also follow up at a later time\nLose one fear");
                lifeQuestions.get(1).add("The advisor connects you with campus resources\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("The advisor says that's something you have to find out on your own\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor recommends different clubs and organizations you can look into based upon your interests.\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("Advisor to student: tell your parents to stop calling me!\n" +
                        "Gain one Fear");
                lifeQuestions.get(1).add("You tell the advisor, they extend their condolences, direct you to applicable campus resources,  and say let them know if you need any assistance\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("The advisor reminds you of the student code of conduct, and they also talk with you to find out what other resources they can recommend you to.\n" +
                        "Lose one Fear");
                lifeQuestions.get(1).add("The advisor does nothing because you are a safety hazard\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor contacts proper campus entities and also advises you on other things you can do regarding this situation.\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("Why would you want to get married?\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor listens to what's on your mind\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("They use this information to find ways to avoid early morning classes\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("You speak with the advisor to find out the root cause and if necessary, are referred to another advisor\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("Your advisor talks about the free throws you missed that could've won the game\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor contacts appropriate campus resources and maybe other resources off campus that can help\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("The advisor says it's just a crush and it will wear off\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor recognizes that stereotypes are causing you pressure and therefore assuages you in countering the stereotypes, as well as linking you to available resources.\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("The advisor feels like this is your personal standard and therefore doesn’t say anything\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor listens to what's on your mind\n" +
                        "Lose one fear");
                lifeQuestions.get(1).add("The advisor is uncomfortable with this subject\n" +
                        "Gain one fear");
                lifeQuestions.get(1).add("The advisor takes the time to show you some different things regarding the institution\n" +
                        "Lose one Fear");
        lifeQuestions.add(new ArrayList<String>());
        lifeQuestions.get(2).add("The advisor takes into account your work obligations and provides you with suggestions as how to manage\n" +
                    "Lose one fear");
                lifeQuestions.get(2).add("Your advisor empathizes with you and tells you things will get better, but not much else is done.\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor says there are resources on campus to help you, but they cannot tell you about them because they don’t know.\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor helps you brainstorm different interests and helps you expand upon those\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("Hahaha!\nGain one fear");
                lifeQuestions.get(2).add("Advisor to parents: I'm sorry, but I can only provide you general information per the guidelines of FERPA\n" +
                        "Lose one Fear");
                lifeQuestions.get(2).add("You tell the advisor, they extend their condolences and say let them know if you need any assistance\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor reminds you of the student code of conduct and how alcohol related infractions can lead to dismissal.\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor follows the established protocol for this, including contacting the on site representative qualified to dissipate the situation\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor says that's housing's problem, not theirs.\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor provides you with information regarding any potential impact and congratulates you on this life changing event.\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor says they cannot discuss this because it isnt related to school.\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("They recommend you take the 8 am calculus class\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("No problem.  Don’t come back!\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("Your advisor helps console you regarding what transpires and reminds you that they are a resource\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor sends their condolences but there's nothing they can do\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor provides information about your options regarding resources that can help with your situation\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor feels like this is your personal standard and therefore doesn’t say anything\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor recognizes that stereotypes are causing you pressure and therefore assuages you in countering the stereotypes, as well as linking you to available resources.\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor cant speak with you regarding personal matters\n" +
                        "Gain one fear");
                lifeQuestions.get(2).add("The advisor listens to your situation and links you with campus resources.\n" +
                        "Lose one fear");
                lifeQuestions.get(2).add("The advisor shows you a litany of websites containing information that you should read\n" +
                        "Gain one fear");

                academicQuestions.add(new ArrayList<String>());
                academicQuestions.add(new ArrayList<String>());
                academicQuestions.add(new ArrayList<String>());
                academicQuestions.get(0).add("You have switched into a STEM major and found it difficult");
                academicQuestions.get(0).add("You are stuggling with the core class in the curriculum and have had a hard time reaching professors and TA's for support");
                academicQuestions.get(0).add("You are taking the introductory course for the STEM major and find yourself woefully underprepared. The concepts are over your head and you confide in your advisor.");
                academicQuestions.get(0).add("You are unaware of the courses being offered for the semester,");
                academicQuestions.get(0).add("You are seeking a summer internship");
                academicQuestions.get(0).add("You feel you are taking too many classes");
                academicQuestions.get(0).add("You have transferred from another institution to this one and they are vastly different");
                academicQuestions.get(0).add("You are intimidated by the class you take taught by the Baron Doctor Telsa, PhD, one of the worlds foremost leaders in STEM");
                academicQuestions.get(0).add("You are across the country and need help with registration");
                academicQuestions.get(0).add("You do not know how to use the campus systems, like course management");
                academicQuestions.get(0).add("You have heard Physics is the toughest course in the curriculum and it's causing you apprehension");
                academicQuestions.get(0).add("You have an upcoming interview with Big STEM company and you are nervous");
                academicQuestions.get(1).add("In the advisor visit, you and the advisor work to find a balanced schedule\n" +
                        "Lose one Fear");
                academicQuestions.get(1).add("The advisor tells you to keep trying to reach them\n" +
                        "Gain one Fear");
                academicQuestions.get(1).add("The advisor says 'Everyone struggles in STEM 101.  You'll get through' and refers you to academic support which can include tutoring, TA's, and/or Professors.\n" +
                        "Lose one fear");
                academicQuestions.get(1).add("The advisor tells you they are available online and you should look for them.\n" +
                        "Gain one fear");
                academicQuestions.get(1).add("The advisor doesn’t have any nor any information of any kind\n" +
                        "Gain one fear");
                academicQuestions.get(1).add("The advisor provides you with options that can help you better manage your courseload\n" +
                        "Lose one fear");
                academicQuestions.get(1).add("The advisor hands you a manual about this institution and that's all\n" +
                        "Gain one fear");
                academicQuestions.get(1).add("The advisor recommends you go to office hours to meet with him one on one and offers to go with you\n" +
                        "Lose one fear");
                academicQuestions.get(1).add("The advisor says because you cant come to the office, they cant help you.\n" +
                        "Gain one fear");
                academicQuestions.get(1).add("The advisor sits with you and briefly demos what you need to know\n" +
                        "Lose one fear");
                academicQuestions.get(1).add("Good luck!\n" +
                        "Gain one fear");
                academicQuestions.get(1).add("The advisor consoles you, connects you with career services, and follows up with you afterward to see if it went well\n" +
                        "Lose one fear");
                academicQuestions.get(2).add("In the advisor visit, you are told to take the required courses\n" +
                        "Gain one Fear");
                academicQuestions.get(2).add("The advisor helps you find out the details of the professors and TA's schedule\n" +
                        "Lose One Fear");
                academicQuestions.get(2).add("The advisor says 'Everyone struggles in STEM 101.  You'll get through' and does nothing else.\n" +
                        "Gain one fear");
                academicQuestions.get(2).add("The advisor shows you how you can find the information online.\n" +
                        "Lose one fear");
                academicQuestions.get(2).add("The advisor provides you with informaiton regarding people you can talk to so that you can find an internship\n" +
                        "Lose one Fear");
                academicQuestions.get(2).add("The advisor admonishes you for time management\n" +
                        "Gain one fear");
                academicQuestions.get(2).add("The advisor talks with you regarding this institution and contacts you occaisionally during the semester.\n" +
                        "Lose one fear");
                academicQuestions.get(2).add("When you bring it to the advisor's attention, they tell you that they are scared of him too.\n" +
                        "Gain one fear");
                academicQuestions.get(2).add("The advisor employs alternative means of providing advice so that you can be informed during registration.\n" +
                        "Lose one fear");
                academicQuestions.get(2).add("Phone a friend!\n" +
                        "Gain one fear");
                academicQuestions.get(2).add("The advisor shows you a syllabus so you can see what the expectations are\n" +
                        "Lose one fear");
                academicQuestions.get(2).add("The advisor says 'you'll be fine' and that's the end of the conversation\n" +
                        "Gain one fear");

        personalQuestions.add(new ArrayList<String>());
                personalQuestions.add(new ArrayList<String>());
                personalQuestions.add(new ArrayList<String>());

        personalQuestions.get(0).add("You are living along for the first time");
                personalQuestions.get(0).add("You are feeling overwhelmed and you would like someone to talk to");
                personalQuestions.get(0).add("You find yourself bored in school");
                personalQuestions.get(0).add("You have missed several classes that result in your grade dropping");
                personalQuestions.get(0).add("You find there is not enough time for you to finish your tasks");
                personalQuestions.get(0).add("The collegiate grind has you fatigued");
                personalQuestions.get(0).add("You lose your scholarship due to academic performance");
                personalQuestions.get(0).add("English is not your first language");
                personalQuestions.get(0).add("You get caught cheating on the test and the advisor is notified");
                personalQuestions.get(0).add("You want to change out of the STEM Major");
                personalQuestions.get(0).add("You want to know of some outcomes regarding STEM pursuits");
                personalQuestions.get(0).add("You are interested in graduate school");
                personalQuestions.get(0).add("You are not from this city");

                personalQuestions.get(1).add("The Advisor tells you to suck it up\n" +
                        "Gain one Fear");
                personalQuestions.get(1).add("You tell the advisor that you are overwhelemed, and they see you at their next available time to recommend campus resourses.\n" +
                        "Lose one Fear");
                personalQuestions.get(1).add("The advisor helps you brainstorm different ways that you can apply yourself\n" +
                        "Lose One Fear");
                personalQuestions.get(1).add("The advisor has been notified.  But, you are an adult, so you're allowed to sink your own ship\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("The advisor tells you that you need to adjust to college better.\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("The advisor reminds you that you can do it and that they are there to help in any way they can.\n" +
                        "Lose one fear");
                personalQuestions.get(1).add("You probably should figure out what you need to do to get it back!\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("The advisor helps you to find resources, including connecting you with an individual who can help.\n" +
                        "Lose one fear");
                personalQuestions.get(1).add("The advisor lets the Institution's due process handle this matter completely.\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("Prior to signing the form, the advisor counsels you and finds out why you want to change majors as maybe it's something that could be helped.\n" +
                        "Lose one fear");
                personalQuestions.get(1).add("Your advisor says life is what you make it\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("me too!\n" +
                        "Gain one fear");
                personalQuestions.get(1).add("The advisor says that this is common for students like you and you'll get over it\n" +
                        "Gain one fear");

                personalQuestions.get(2).add("The advisor introduces you to other students in your situation\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("You tell the advisor that you are overwhelmed; because it is noon, they go to lunch and tell you to schedule an appointment\n" +
                        "Gain one fear");
                personalQuestions.get(2).add("The advisor tells you that you need to mature\n" +
                        "Gain one fear");
                personalQuestions.get(2).add("The advisor has been notified and they reach out to you to see what's going on.\n" +
                        "Lose one Fear");
                personalQuestions.get(2).add("The advisor recommends youstart homework early, create a schedule and stick to it.They even show you an example or two.\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("The advisor tell you that you will fail if you don’t pick it up!\n" +
                        "Gain one fear");
                personalQuestions.get(2).add("The advisor helps you have a customized academic support plan which includes tutoring and other mechanisms designed to help you do better.\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("Kanye Strug\n" +
                        "Gain one fear");
                personalQuestions.get(2).add("The advisor has a conversation with you about why you felt the need to cheat and helps provide some strategies to avoid such actions in the future (academic support, professor outreach, etc)\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("The advisor signs your form.  You're someone else's problem now\n" +
                        "Gain one fear");
                personalQuestions.get(2).add("Your advisor shows you information regarding employment of alums\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("The advisor talks with you about graduate school and connects you with an expert\n" +
                        "Lose one fear");
                personalQuestions.get(2).add("The advisor introduces you to other students in your situation\n" +
                        "Lose one fear");


        Parent root = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
        Parent gameBoard = FXMLLoader.load(getClass().getResource("gameBoard.fxml"));
        Parent rule = FXMLLoader.load(getClass().getResource("ruleScreen.fxml"));
        Parent question = FXMLLoader.load(getClass().getResource("questionScreen.fxml"));
        Parent choice = FXMLLoader.load(getClass().getResource("choiceScreen.fxml"));

        main = new Scene(root);
        gameBoardScreen = new Scene(gameBoard);
        ruleScreen = new Scene(rule);
        questionScreen = new Scene(question);
        choiceScreen = new Scene(choice);


        PrimaryStage = stage;
        PrimaryStage.setTitle("The Game of Life");
        PrimaryStage.setScene(main);
        PrimaryStage.show();
    }


    public static String getQuestionTitle (int key) {
        for (int i : lifeTiles ) {
            if (i == key) {
                return names[0];
            }
        }
        for (int i : academicTiles ) {
            if (i == key) {
                return names[1];
            }
        }
        for (int i : personalTiles ) {
            if (i == key) {
                return names[2];
            }
        }
        for (int i : summerTiles ) {
            if (i == key) {
                return names[2];
            }
        }
        return "New School Year";
    }

    /**
     * sets the scene to the boardGame scene
     */
    public static void setBoardScene() {
        PrimaryStage.setScene(gameBoardScreen);
    }

    /**
     * sets the scene to the rule scene
     */
    public static void setRuleScene() {
        PrimaryStage.setScene(ruleScreen);
    }

    /**
     * sets the scene to the startScreen scene
     */
    public static void setStartScreenScene() {
        PrimaryStage.setScene(main);
    }

    /**
     * sets the scene to the questionScreen scene
     */
    public static void setQuestionScreenScene() {
        PrimaryStage.setScene(questionScreen);
    }

    /**
     * sets the scene to the choiceScreen scene
     */
    public static void setChoiceScreenScene() {
        PrimaryStage.setScene(choiceScreen);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
