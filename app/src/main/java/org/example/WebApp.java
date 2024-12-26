package org.example;

import static spark.Spark.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebApp {
    public static void main(String[] args) {
        staticFiles.location("/static"); // Serve static files from resources/static

        // Endpoint to fetch chapters
        get("/api/chapters", (req, res) -> {
            res.type("application/json");
            return getChapters(); // Return JSON for chapters
        });

        // Other routes...
    }

    // Method to dynamically scan chapters and programs
    private static String getChapters() {
        Map<String, Object> chapters = new HashMap<>();
        File baseDir = new File("app/src/main/java/org/example/");

        if (baseDir.exists() && baseDir.isDirectory()) {
            File[] chapterDirs = baseDir.listFiles(File::isDirectory);

            if (chapterDirs != null) {
                for (File chapterDir : chapterDirs) {
                    Map<String, List<String>> chapterData = new HashMap<>();
                    List<String> programs = new ArrayList<>();
                    List<String> exercises = new ArrayList<>();

                    File[] files = chapterDir.listFiles();
                    if (files != null) {
                        for (File file : files) {
                            String fileName = file.getName();
                            if (fileName.endsWith(".java")) {
                                if (fileName.startsWith("Exercise")) {
                                    exercises.add(fileName.replace(".java", ""));
                                } else {
                                    programs.add(fileName.replace(".java", ""));
                                }
                            }
                        }
                    }
                    chapterData.put("programs", programs);
                    chapterData.put("exercises", exercises);
                    chapters.put(chapterDir.getName(), chapterData);
                }
            }
        }

        return new com.google.gson.Gson().toJson(chapters); // Convert to JSON
    }
}
