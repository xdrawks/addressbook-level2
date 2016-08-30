package seedu.addressbook.ui;

import java.util.List;

/**
 * Formats the string to be printed by text ui class
 */
public class Formatter {
    
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();
    
    static String addLinePrefix(String string) {
        return LINE_PREFIX + string;
    }
    
    static String getCommandFeedback(String fullInputLine) {
        return "[Command entered:" + fullInputLine + "]";
    }
    
    static String formatOutputString(String output) {
        return LINE_PREFIX + output.replace("\n", LS + LINE_PREFIX);
    }

    /** Formats a list of strings as a viewable indexed list. */
    static String getIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + TextUi.DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(Formatter.getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }

    
    
}
