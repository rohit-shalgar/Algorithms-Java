import java.util.HashSet;
import java.util.Objects;

public static class Country {
    private String name;

    Country(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Country other = (Country) obj;
        return Objects.equals(other.name, name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

public static void main(String[] args) {
    HashSet set = new HashSet();
    String country1 = new String("France");
    String country2 = new String("France");
    Country c1 = new Country("Russia");
    Country c2 = new Country("Russia");
    set.add(country1);
    set.add(country2);
    set.add(c1);
    set.add(c2);
    System.out.println(set);
}

