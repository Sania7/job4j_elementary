package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("This element not found");
        }
        return rsl;
    }

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
        String[] value = {"first", "second", "third"};
        try {
            indexOf(value, "yyy");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
