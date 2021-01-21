class Main {
  public static void main(String[] args) {

    // ask user for the words and store as message
    String message = Keyboard.getText("what is your message?");
    String output = (" ");

    // store the number of the letters as numberLetters
    int numbersLetters = message.length();
    // display "There are " + numberLetters + " in " + message
    output = ("There are " + numbersLetters + " in " + message);

    Screen.display(output, "message length");

  }
}
