public enum Days {
    MONDAY("Дүйшөнбү күнү - Инкапсуляция теория"),
    TUESDAY("Шейшемби күнү - Инкапсуляция практика"),
    WEDNESDAY("Шаршемби күнү - Полиморфизм теория "),
    THURSDAY("Бейшемби күнү - Полиморфизм практика"),
    FRIDAY("Жума күнү - Абстракт теория"),
    SATURDAY("Ишемби күнү - Англиский"),
    SUNDAY("Жекшемби күнү - Дем алыш ");
    private final String weeks;

    Days(String weeks) {
        this.weeks=weeks;
    }

    public String getWeeks() {
        return weeks;
    }

    @Override
    public String toString() {
        return weeks;
    }
}

