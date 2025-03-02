package internal;


/**
 * 
 * A helper class that helps users print text-based UI.
 */
public class Prompt {
  private final String logo;
  private final String title;
  private final String inputSymbol;

  private final StringBuilder builder;

  public Prompt(String title, String[] options, String inputSymbol) {
    this.logo = "";
    this.title = title.trim();
    this.inputSymbol = inputSymbol.trim();
    this.builder = processOptions(options);
  }

  public Prompt(String logo, String title, String[] options, String inputSymbol) {
    this.logo = logo;
    this.title = title;
    this.inputSymbol = inputSymbol;
    this.builder = processOptions(options);
  }

  private StringBuilder processOptions(String[] options) {
    StringBuilder sb = new StringBuilder();
    sb.append("|");
    for (int i = 0; i < options.length; i++) {
      sb.append(String.format(" %d.%s |", i + 1, options[i].trim()));
      if (i == options.length - 1) {
        sb.append(String.format(" %d.%s ", i + 1, options[i].trim()));
      }
    }
    sb.append("|");
    return sb;
  }

  public void printTitle() {
    System.out.println(title);
  }

  public void printOptions() {
    System.out.println(builder);
  }

  public void printInputSymbol() {
    System.out.print(inputSymbol + " ");
  }

  public void ask(String question) {
    if (question.contains(":"))
      question = question.replace(":", "");
    System.out.println(question + " " + inputSymbol);
  }
}
