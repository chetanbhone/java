
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFile {

    public static String userInput() throws BufferOverflowException, BufferUnderflowException {
        ByteBuffer buffer = ByteBuffer.allocate(256);
        try (ReadableByteChannel channel = Channels.newChannel(System.in)) {
            channel.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        buffer.flip();
        return StandardCharsets.UTF_8.decode(buffer).toString().trim();
    }

    public static void copyBytes() throws IOException {
        Path source = Paths.get("C:\\Users\\cheta\\OneDrive\\Desktop\\java\\NIOFile.java");
        Path dest = Paths.get("C:\\Users\\cheta\\OneDrive\\Desktop\\java\\NIOFile_Copy.java");

        if (!Files.exists(source)) {
            throw new FileNotFoundException("Source file does not exist: " + source);
        }

        try (FileChannel inChannel = FileChannel.open(source, StandardOpenOption.READ); FileChannel outChannel = FileChannel.open(dest, StandardOpenOption.WRITE,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            inChannel.transferTo(0, inChannel.size(), outChannel);
            System.out.println("Byte data transferred successfully.");

            for (String st : Files.readAllLines(dest, StandardCharsets.UTF_8)) {
                System.out.println(st);
            }
        }
    }

    public static void copyCharacters() throws IOException {
        Path source = Paths.get("C:\\Users\\cheta\\OneDrive\\Desktop\\java\\NIOFile.java");
        Path dest = Paths.get("C:\\Users\\cheta\\OneDrive\\Desktop\\java\\NIOFile_Copy.java");

        if (!Files.exists(source)) {
            throw new FileNotFoundException("Source file does not exist: " + source);
        }

        try {
            String content = Files.readString(source);
            Files.writeString(dest, content, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            for (String st1 : Files.readAllLines(dest, StandardCharsets.UTF_8)) {
                System.out.println(st1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileUsingFileChannel(Path path, String data) {
        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.WRITE,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            ByteBuffer buff = ByteBuffer.allocate(80);
            buff.put(data.getBytes(StandardCharsets.UTF_8));
            buff.flip();
            fileChannel.write(buff);
            System.out.println("Data written successfully in file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String userStr = userInput();
        System.out.println("User Entered: " + userStr);

        try {
            int var = Integer.parseInt(userStr.trim());
            System.out.println("User int value: " + var);
        } catch (NumberFormatException e) {
            System.out.println("Must enter a decimal number.");
        }

        Path obj = Paths.get("C:\\Users\\cheta\\OneDrive\\Desktop\\java\\NIOFile.java");
        if (Files.exists(obj)) {
            System.out.println("Is readable: " + Files.isReadable(obj));
            System.out.println("Is writable: " + Files.isWritable(obj));
            System.out.println("Is executable: " + Files.isExecutable(obj));
            System.out.println("Is directory: " + Files.isDirectory(obj));
            System.out.println("File name: " + obj.getFileName());
            System.out.println("Absolute path: " + obj.toAbsolutePath());

            try {
                System.out.println("File size: " + Files.size(obj) + " bytes");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
