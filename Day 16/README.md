Date : 06-05-2026
Day : 16
Video number : 19
Video link : https://youtu.be/svLv3q-_Fl0?si=a-UPGgAEuDfsWfz_
Topic : Managing directories in JAVA

Example -1 :
~~~
import java.io.File;

public class DirectoryManagement1 {

    public static void main(String[] args) {

        // Create single directory
        File dir1 = new File("JavaFolder");

        if (dir1.mkdir()) {
            System.out.println("Single directory created");
        } else {
            System.out.println("Directory already exists");
        }

        // Create nested directories
        File dir2 = new File("Parent/Child/SubChild");

        if (dir2.mkdirs()) {
            System.out.println("Nested directories created");
        } else {
            System.out.println("Nested directories already exist");
        }

        // Check existence
        if (dir1.exists()) {
            System.out.println("JavaFolder exists");
        }

        // Check if it is directory
        if (dir1.isDirectory()) {
            System.out.println("It is a directory");
        }

        // List all files and folders
        File current = new File(".");

        String[] list = current.list();

        System.out.println("\nContents of current directory:");

        for (String name : list) {
            System.out.println(name);
        }

        // Rename directory
        File renamed = new File("RenamedFolder");

        if (dir1.renameTo(renamed)) {
            System.out.println("\nDirectory renamed successfully");
        }

        // Delete empty directory
        if (renamed.delete()) {
            System.out.println("Directory deleted");
        } else {
            System.out.println("Cannot delete directory");
        }
    }
}
~~~
Example -2 :
~~~
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class DirectoryManagement2 {

    public static void main(String[] args) {

        try {

            // Create directory
            Path dirPath = Paths.get("StudentData");

            Files.createDirectories(dirPath);

            System.out.println("Directory created");

            // Create file inside directory
            Path filePath = dirPath.resolve("info.txt");

            Files.write(filePath,
                    List.of(
                            "Name: Saiba",
                            "Department: CSE",
                            "University: XYZ"
                    ));

            System.out.println("File created and data written");

            // Read directory contents
            System.out.println("\nDirectory Contents:");

            DirectoryStream<Path> stream =
                    Files.newDirectoryStream(dirPath);

            for (Path p : stream) {
                System.out.println(p.getFileName());
            }

            // Copy file
            Path copyPath = dirPath.resolve("copy_info.txt");

            Files.copy(filePath, copyPath,
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("\nFile copied");

            // Move/Rename file
            Path movedPath = dirPath.resolve("student_info.txt");

            Files.move(copyPath, movedPath,
                    StandardCopyOption.REPLACE_EXISTING);

            System.out.println("File moved/renamed");

            // Delete files
            Files.delete(movedPath);
            Files.delete(filePath);

            System.out.println("Files deleted");

            // Delete directory
            Files.delete(dirPath);

            System.out.println("Directory deleted");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
~~~
