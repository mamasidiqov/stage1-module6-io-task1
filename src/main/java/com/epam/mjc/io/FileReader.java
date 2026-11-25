
package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReader {

    public Profile getDataFromFile(File file) {

        Map<String, String> profileData = new HashMap<>();

        try (BufferedReader reader =
                     new BufferedReader(new java.io.FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(":", 2);

                if (parts.length == 2) {
                    String key = parts[0].trim();
                    String value = parts[1].trim();

                    profileData.put(key, value);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException("Could not read file", e);
        }

        Profile profile = new Profile();

        profile.setName(profileData.get("Name"));
        profile.setAge(Integer.parseInt(profileData.get("Age")));
        profile.setEmail(profileData.get("Email"));
        profile.setPhone(Long.parseLong(profileData.get("Phone")));

        return profile;
    }
}
