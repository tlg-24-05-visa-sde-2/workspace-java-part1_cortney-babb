/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: supported displays are + " + Arrays.toString(DisplayType.values());
            String note2 = "Volume must be from " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME;
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            System.out.println(note2);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
//        System.out.println("You provided " + args.length + " arguments");

        // STEP 1: convert argument strings into proper types for Television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]); // to parse from String into integer
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase()); // to parse from String into Enum type

        // STEP 2: create an instance of Television with these converted values
        Television tv = new Television(brand, volume, display);

        // STEP 3: print it (toString()) and congratulate them on their fine purchase
        System.out.println("Congratulations! Your custom Television is on its way!");
        System.out.println(tv);
    }
}