package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Dictionary {
    public static void processSearch(HashMap<String, ArrayList<Terms>> hash){
        int searchCount = 1;
        while(true) {
            System.out.print("Search [" + searchCount + "]: ");
            searchCount++;
            Scanner search = new Scanner(System.in);
            String input = search.nextLine();
            String[] splitSearch = input.split(" ");
            //catches blank input
            if (input.isBlank() || input.equals("!help") || splitSearch.length > 4) {
                System.out.println("\t|\n\t PARAMETER HOW-TO, please enter:\n\t 1. A search key -then 2. An optional part of speech -then\n\t 3. An optional 'distinct' -then 4. An optional 'reverse'\n\t| ");
                continue;
            }
            if(input.equals("!q")){
                break;
            }

            boolean distinct = false;
            String partOfSpeech = null;
            boolean reverse = false;
            String[] partsOfSpeech = {"noun", "verb", "adjective", "adverb", "conjunction", "interjection"};

            //makes input not case-sensitive when we retrieve from hashmap
            String word = splitSearch[0].toLowerCase();
            word = word.substring(0,1).toUpperCase() + word.substring(1);

            //check for search modifiers
            if(splitSearch.length > 1) {
                if (splitSearch[1].equalsIgnoreCase("distinct")) {
                    distinct = true;
                } else if (splitSearch[1].equalsIgnoreCase("reverse")) {
                    reverse = true;
                } else if (Arrays.asList(partsOfSpeech).contains(splitSearch[1].toLowerCase())) {
                    partOfSpeech = splitSearch[1];
                } else {
                    System.out.println("\t|\n\t <The entered 2nd parameter '" + splitSearch[1] + "' is NOT a part of speech.>");
                    System.out.println("\t <The entered 2nd parameter '" + splitSearch[1] + "' is NOT 'distinct'.>");
                    System.out.println("\t <The entered 2nd parameter '" + splitSearch[1] + "' is NOT 'reverse'.>");
                    System.out.println("\t <The entered 2nd parameter '" + splitSearch[1] + "' was disregarded.>");
                    System.out.println("\t <The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>\n\t|");
                }

                if (splitSearch.length > 2) {
                    if (splitSearch[2].equalsIgnoreCase("distinct")) {
                        distinct = true;
                    } else if (splitSearch[2].equalsIgnoreCase("reverse")) {
                        reverse = true;
                    } else if (Arrays.asList(partsOfSpeech).contains(splitSearch[2].toLowerCase())) {
                        partOfSpeech = splitSearch[2];
                    } else {
                        System.out.println("\t|\n\t <The entered 3rd parameter '" + splitSearch[2] + "' is NOT a part of speech.>");
                        System.out.println("\t <The entered 3rd parameter '" + splitSearch[2] + "' is NOT 'distinct'.>");
                        System.out.println("\t <The entered 3rd parameter '" + splitSearch[2] + "' is NOT 'reverse'.>");
                        System.out.println("\t <The entered 3rd parameter '" + splitSearch[2] + "' was disregarded.>");
                        System.out.println("\t <The 3th parameter should be 'distinct' or 'reverse.>\n\t|");
                    }

                    if (splitSearch.length > 3) {
                        if (splitSearch[3].equalsIgnoreCase("reverse")) {
                            reverse = true;
                        } else {
                            System.out.println("\t|\n\t <The entered 4th parameter '" + splitSearch[3] + "' is NOT 'reverse'.>");
                            System.out.println("\t <The entered 4th parameter '" + splitSearch[3] + "' was disregarded.>");
                            System.out.println("\t <The 4th parameter should be 'reverse'.>\n\t|");
                        }
                    }

                }
            }
            //creates arraylist consisting of terms with the same keyword as the search
            ArrayList<Terms> result = hash.get(word);
            //remove duplicates (same part of speech and same definition)
            if(distinct){
                result = returnDistinct(result);
            }
            //if part of speech modifier
            if(partOfSpeech != null){
                result = returnIfPartOfSpeech(result, partOfSpeech);
            }

            if(result == null || result.isEmpty()){
                System.out.println("\t|\n\t  <Not Found> To be considered for the next release. Thank you. \n\t|");
                System.out.println("\t|\n\t PARAMETER HOW-TO, please enter:\n\t 1. A search key -then 2. An optional part of speech -then\n\t 3. An optional 'distinct' -then 4. An optional 'reverse'\n\t| ");
                continue;
            }
            System.out.println("\t|");
            //alphabetical sort
            result.sort((term1, term2) -> term1.toString().compareTo(term2.toString()));
            //if reverse modifier, reverse order of listings
            if(!reverse){
                for(Terms listing: result){
                    System.out.print("\t " + listing + "\n");
                }
            } else {
                for(int i = result.size()- 1; i >= 0; i--) {
                    System.out.print("\t " + result.get(i) + "\n");
                }
            }
            System.out.println("\t|");
        }
        System.out.println("-----THANK YOU -----");
    }
    public static ArrayList<Terms> returnDistinct(ArrayList<Terms> termsList){
        HashMap<String, Terms> output = new HashMap<String, Terms>();
        if (termsList != null) {
            for(Terms dict : termsList) {
                //by mixing definition and part of speech into keyword, it ensures that only those with same part of speech and definition are excluded
                output.put((dict.getDefinition() + dict.getPartOfSpeech()), dict);
            }
        }
        return new ArrayList<Terms>(output.values());
    }

    public static ArrayList<Terms> returnIfPartOfSpeech(ArrayList<Terms> termsList, String partOfSpeech){
        ArrayList<Terms> output = new ArrayList<Terms>(termsList);
        //filters out terms that do not match part of speech
        output.removeIf(dict -> (!dict.getPartOfSpeech().equalsIgnoreCase(partOfSpeech)));
        return output;
    }
}
