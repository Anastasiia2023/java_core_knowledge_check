public class Task2 {


    public static String replaceAbbreviationsManually(String address) {
        String[] words = address.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");
            punctuation = punctuation.replace(".", "");

            switch (cleanedWord) {
                case "Ave":
                    result.append("Avenue").append(punctuation);
                    break;
                case "St":
                case "Str":
                    result.append("Street").append(punctuation);
                    break;
                default:
                    result.append(word);
            }

            result.append(" ");
        }

        return result.toString().trim();
    }


        public static String replaceAbbreviationsRegex (String address){
            return address.replaceAll("\\bAve\\.?([,\\s])", "Avenue$1")
                    .replaceAll("\\bStr\\.?([,\\s])", "Street$1")
                    .replaceAll("\\bSt\\.?([,\\s])", "Street$1");
        }


        public static void main (String[]args){


        String[] addressesManually = {
                "555 Straight Stave Ave, San Francisco, CA 94104",
                "444 Ave Maria Stairway St., San Francisco, CA 94104",
                "9032 Flave Steep Str, San Francisco, CA 94104"
        };

        for (String address : addressesManually) {
            System.out.println(replaceAbbreviationsManually(address));
        }


            String[] addressesRegex = {
                    "555 Straight Stave Ave, San Francisco, CA 94104",
                    "444 Ave Maria Stairway St., San Francisco, CA 94104",
                    "9032 Flave Steep Str, San Francisco, CA 94104"
            };

            for (String address : addressesRegex) {
                System.out.println(replaceAbbreviationsRegex(address));
            }


        }
    }
