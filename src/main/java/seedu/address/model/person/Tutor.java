package seedu.address.model.person;

import seedu.address.model.tag.Tag;

import java.util.Set;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class Tutor extends Person{

    public Tutor(Name name, Phone phone, Email email, Address address, Set<Tag> tags) {
        super(name, phone, email, address, tags);
        requireAllNonNull(name, phone, email, address, tags);
        tags.add(new Tag("tutor"));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Tutor)) {
            return false;
        }

        Tutor otherTutor = (Tutor) other;
        return otherTutor.getName().equals(getName())
                && otherTutor.getPhone().equals(getPhone())
                && otherTutor.getEmail().equals(getEmail())
                && otherTutor.getAddress().equals(getAddress())
                && otherTutor.getTags().equals(getTags());
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getName())
                .append("; Phone: ")
                .append(getPhone())
                .append("; Email: ")
                .append(getEmail())
                .append("; Address: ")
                .append(getAddress())
                .append(" Tags: ");;

        getTags().forEach(builder::append);
        return builder.toString();
    }
}
