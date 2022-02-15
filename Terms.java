package homework;
import java.util.ArrayList;
import java.util.HashMap;
public enum Terms {
    ADJECTIVENOUN1("Adjective", "noun", "a word or phrase naming an attribute, added to or grammatically related to a noun to modify or describe it."),
    ADJECTIVENOUN2("Adjective", "noun", "a word or phrase that modifies or qualifies an adjective, verb, or other adverb or a word group, expressing a relation of place, time, circumstance, manner, cause, degree, etc."),
    ADVERBNOUN1("Adverb", "noun", "a word or phrase naming an attribute, added to or grammatically related to a noun to modify or describe it."),
    ARROW1("Arrow", "noun", "Here is one arrow: <IMG> -=>> <\\IMG>"),
    BOOKNOUN1("Book", "noun", "A set of pages."),
    BOOKNOUN2("Book", "noun", "A written work published in printed or electronic form."),
    BOOKVERB1("Book", "verb", "To arrange for someone to have a seat on a plane."),
    BOOKVERB2("Book", "verb", "To arrange something on a particular date."),
    COMMANDNOUN1("Command", "noun", "An authoritative order."),
    COMMANDVERB1("Command", "verb", "To give an authoritative order."),
    COMMANDVERB2("Command", "verb", "To dominate (a strategic position) from a superior height"),
    CONJUNCTIONNOUN1("Conjunction", "noun", "a word used to connect clauses or sentences or to coordinate words in the same clause."),
    CONJUNCTIONNOUN2("Conjunction", "noun", "the action or an instance of two or more events or things occurring at the same point in time or space."),
    DEFINITIONNOUN1("Definition", "noun", "A statement of the exact meaning of a word, especially in a dictionary."),
    DEFINITIONNOUN2("Definition", "noun", "The degree of distinctness in outline of an object, image, or sound, especially of an image in a photograph or on a screen."),
    DICTIONARYNOUN1("Dictionary", "noun", "a book or electronic resource that lists the words of a language (typically in alphabetical order) and gives their meaning, or gives the equivalent words in a different language, often also providing information about pronunciation, origin, and usage."),
    DISTINCTADJECTIVE1("Distinct", "adjective", "Familiar. Worked in Java."),
    DISTINCTADJECTIVE2("Distinct", "adjective", "Unique. No Duplicates. Clearly different or of a different kind."),
    DISTINCTADVERB1("Distinct", "adverb", "Uniquely. Written \"Distinctly\"."),
    DISTINCTNOUN1("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN2("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN3("Distinct", "noun", "A keyword in this assignment."),
    DISTINCTNOUN4("Distinct", "noun", "An advanced search option."),
    DISTINCTNOUN5("Distinct", "noun", "Distinct is a parameter in this assignment."),
    EXITNOUN1("Exit", "noun", "An act of going out of or leaving a place."),
    HELPNOUN1("!help", "noun", "The action of helping someone to do something; assistance."),
    INTERJECTIONNOUN1("Interjection", "Noun", "An abrupt remark, made especially as an aside or interruption."),
    INTERJECTIONNOUN2("Interjection", "Noun", "An exclamation, especially as a part of speech (e.g. ah!, dear me! )"),
    PLACEHOLDERADJECTIVE1("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADJECTIVE2("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERADVERB1("Placeholder", "adverb", "To be updated..."),
    PLACEHOLDERCONJUNCTION1("Placeholder", "conjunction", "To be updated..."),
    PLACEHOLDERINTERJECTION1("Placeholder", "interjection", "To be updated..."),
    PLACEHOLDERNOUN1("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN2("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERNOUN3("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERPREPOSITION1("Placeholder", "preposition", "To be updated..."),
    PLACEHOLDERPRONOUN1("Placeholder", "pronoun", "To be updated..."),
    PLACEHOLDERPREVERB1("Placeholder", "verb", "To be updated..."),
    REVERSEADJECTIVE1("Reverse", "adjective", "On back side."),
    PREPOSITIONNOUN1("Preposition", "noun", "A word governing, and usually preceding, a noun or pronoun and expressing a relation to another word or element in the clause"),
    PRONOUNNNOUN1("Pronoun", "noun", "A word that can function by itself as a noun phrase and that refers either to the participants in the discourse (e.g., I, you ) or to someone or something mentioned elsewhere in the discourse."),
    REVERSEADJECTIVE2("Reverse", "adjective", "Opposite to usual or previous arrangement"),
    REVERSENOUN1("Reverse", "noun", "A dictionary program's parameter"),
    REVERSENOUN2("Reverse", "noun", "Change to opposite direction."),
    REVERSENOUN3("Reverse", "noun", "The opposite."),
    REVERSENOUN4("Reverse", "noun", "To be updated..."),
    REVERSENOUN5("Reverse", "noun", "To be updated..."),
    REVERSENOUN6("Reverse", "noun", "To be updated..."),
    REVERSENOUN7("Reverse", "noun", "To be updated..."),
    REVERSEVERB1("Reverse", "verb", "Change something to opposite."),
    REVERSEVERB2("Reverse", "verb", "Go back"),
    REVERSEVERB3("Reverse", "verb", "Revoke ruling."),
    REVERSEVERB4("Reverse", "verb", "To be updated..."),
    REVERSEVERB5("Reverse", "verb", "To be updated..."),
    REVERSEVERB6("Reverse", "verb", "Turn something inside out."),
    SEARCHVERB1("Search", "verb", "To try to find something by looking or otherwise seeking carefully and thoroughly."),
    SIMPLEADJECTIVE1("Simple", "adjective", "Easily understood or done; presenting no difficulty."),
    SIMPLEADJECTIVE2("Simple", "adjective", "Plain, basic, or uncomplicated in form, nature, or design."),
    SPEECHNOUN1("Speech", "noun", "The expression of or the ability to express thoughts and feelings by articulate sounds."),
    SPEECHNOUN2("Speech", "noun", "A formal address or discourse delivered to an audience");

    private String keyword;
    private String partOfSpeech;
    private String definition;
    private static int defCount = 0;
    private static int wordCount = 0;

    private Terms(String keyword, String partOfSpeech, String definition) {
        this.keyword = keyword;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }

    public static int getDefCount(){
        return defCount;
    }
    public static int getWordCount(){
        return wordCount;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return keyword + " [" + partOfSpeech + "] : " + definition;
    }
    public static HashMap<String, ArrayList<Terms>> createHash(){
        System.out.println("! Loading data...");
        HashMap<String, ArrayList<Terms>> hash = new HashMap<String, ArrayList<Terms>>();
        for (Terms term : Terms.values()){
            String keyword = term.getKeyword();
            ArrayList<Terms> list;
            //puts those with same keyword into the same array
            if(hash.containsKey(keyword)){ //if keyword has been added
                list = hash.get(keyword);
            } else{ // if this keyword has not been added yet
                list = new ArrayList<Terms>();
                wordCount++;
            }
            defCount++;
            list.add(term);
            hash.put(keyword, list);
        }
        System.out.println("! Loading completed...\n\n===== Dictionary 340 Java =====\n----- Keywords: " + getWordCount() + "\n----- Definitions: " + getDefCount());
        return hash;
    }
}