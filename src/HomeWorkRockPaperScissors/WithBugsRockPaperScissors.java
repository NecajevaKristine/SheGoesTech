package HomeWorkRockPaperScissors;

public class WithBugsRockPaperScissors {
    //fields
    public String rock;
    public String paper;
    public String scissors;
    public String choosePlayer1;
    public String choosePlayer2;
    //setter methods
    public void setRock(String rock) {
        this.rock = rock;
    }
    public void setPaper(String paper) {
        this.paper = paper;
    }
    public void setScissors(String scissors) {
        this.scissors = scissors;
    }

    public void setChoosePlayer1(String choosePlayer1) {
        this.choosePlayer1 = choosePlayer1;
    }
    public void setGetChoosePlayer2(String choosePlayer2) {
        this.choosePlayer2 = choosePlayer2;
    }
    //getter methods
    public String getRock() {
        return rock;
    }
    public String getPaper() {
        return paper;
    }
    public String getScissors() {
        return scissors;
    }

    public String getChoosePlayer1() {
        return choosePlayer1;
    }
    public String getChoosePlayer2() {
        return choosePlayer2;
    }
    //method
    public void printRockPaperScissors() {
        if (rock == rock) {
                System.out.println("TIE");
            } else if (paper == paper) {
                System.out.println("TTE");
            } else if (scissors == scissors) {
                System.out.println("TIE");
            }else if (rock == paper) {
                System.out.println("Player 2 wins");
            } else if (scissors == rock) {
                System.out.println("Player 2 wins");
            } else if (paper == scissors) {
                System.out.println("Player 2 wins");
            } else {
                 System.out.println("Player 1 wins");
            }
      }
}