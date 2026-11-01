//~~~~ Fig. 4.17 LOGICAL OPERATORS ~~~~//

public class LogicalOperators {
    public static void main(String[] args) {

        //----- NAMA & NPM -----//
        System.out.println(" ───────────────────────────");
        System.out.println("NAMA : ? ");
        System.out.println(" ──────────────────────────────");

        System.out.println(" ─────────");
        System.out.println("NPM : ? ");
        System.out.println(" ────────────");

        // buat tabel kebenaran untuk operator && (AND kondisional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Conditional AND (&&)", "false && false", (false && false),
            "false && true", (false && true),
            "true && false", (true && false),
            "true && true", (true && true));

        //buat tabel kebenaran untuk operator || (OR kondisional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Conditional OR (||)", "false || false", (false || false),
            "false || true", (false || true),
            "true || false", (true || false),
            "true || true", (true || true));
            
        //create truth table for & (boolean logical AND) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Boolean logical AND (&)", "false & false", (false & false),
            "false & true", (false & true),
            "true & false", (true & false),
            "true & true", (true & true));
        
        //buat tabel kebenaran untuk operator | (OR inklusif logika Boolean)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Boolean logical inclusive OR (|)",
            "false | false", (false | false),
            "false | true", (false | true),
            "true | false", (true | false),
            "true | true", (true | true));
        
        //buat tabel kebenaran untuk operator ^ (logika Boolean eksklusif OR)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
            "Boolean logical exclusive OR (^)",
            "false ^ false", (false ^ false),
            "false ^ true", (false ^ true),
            "true ^ false", (true ^ false),
            "true ^ true", (true ^ true));

        //buat tabel kebenaran untuk operator ! (negasi logika)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
            "!false", (!false), "!true", (!true));
    }
}
        
        