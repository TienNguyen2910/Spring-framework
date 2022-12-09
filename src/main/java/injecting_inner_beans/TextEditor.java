package injecting_inner_beans;

public class TextEditor {
    private SpellChecker spellChecker;
    // a setter method to Inject the depency
    public  void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }
    // a getter method to return spellChecker
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
