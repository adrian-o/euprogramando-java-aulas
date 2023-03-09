package app.interfaces;

// 1. Interfaces cannot be instantiated directly.
// 2. An interface is not required to have any methods.
// 3. An interface may not be marked as final.
// 4. All top-level interfaces are assumed to have public or default access, and they must
//    include the abstract modifier in their definition. Therefore, marking an interface as
//    private, protected, or final will trigger a compiler error, since this is incompatible
//    with these assumptions.
// 5. All nondefault methods in an interface are assumed to have the modifiers abstract
//    and public in their definition. Therefore, marking a method as private, protected,
//    or final will trigger compiler errors as these are incompatible with the abstract and
//    public keywords.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingInterface {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new LinkedList<>();

        nomes.isEmpty();
        nomes2.isEmpty();
    }
}
