
package com.epam.mjc.io;

import java.util.Objects;

public class Profile {

    private String name;
    private int age;
    private String email;
    private long phone;

    public Profile() {
    }

    public Profile(String name, int age, String email, long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Profile profile = (Profile) o;

        return age == profile.age
                && phone == profile.phone
                && Objects.equals(name, profile.name)
                && Objects.equals(email, profile.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phone);
    }
}
