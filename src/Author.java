import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return this.name + " " + this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return this.name.equals(author.name) && this.surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);

    }
}
