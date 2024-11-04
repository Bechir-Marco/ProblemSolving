package tag;

import java.util.Stack;

public class Sol {

    public static String checkTags(String input) {
        Stack<String> tagStack = new Stack<>();
        String[] tags = input.split("(?=<)|(?<=>)");
        boolean foundSingleError = false; // Track if a single correctable error is found

        for (String tag : tags) {
            if (tag.isEmpty() || tag.equals(">")) {
                continue;
            }
            if (tag.startsWith("<") && !tag.startsWith("</")) {
                // Opening tag
                tagStack.push(tag);
            } else if (tag.startsWith("</")) {
                // Closing tag
                if (!tagStack.isEmpty()) {
                    String openingTag = tagStack.pop();
                    String expectedClosingTag = "</" + openingTag.substring(1);

                    if (!tag.equals(expectedClosingTag)) {
                        // Mismatched closing tag
                        if (foundSingleError) {
                            return "false"; // Multiple errors, so return "false"
                        }
                        foundSingleError = true; // First mismatch found
                    }
                } else {
                    // Closing tag without a matching opening tag
                    if (foundSingleError) {
                        return "false"; // Multiple errors, so return "false"
                    }
                    foundSingleError = true; // First mismatch found
                }
            }
        }

        // If there are unclosed tags left
        if (!tagStack.isEmpty()) {
            if (foundSingleError || tagStack.size() > 1) {
                return "false"; // Multiple errors needed to fix
            }
            return tagStack.peek().substring(1, tagStack.peek().length() - 1); // One unclosed tag
        }

        // If everything matched correctly
        return foundSingleError ? tagStack.peek().substring(1, tagStack.peek().length() - 1) : "true";
    }


}
