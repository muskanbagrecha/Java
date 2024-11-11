package src.core;

import java.util.ArrayList;
import java.util.List;

final public class ImmutableClass { //so it cannot be extended/inherited
    private final int name;
    private final List<Integer> marks;

    public ImmutableClass(int name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getName() { //no setters
        return name;
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks); //return a copy so individual elements are not mutated.
    }
}
