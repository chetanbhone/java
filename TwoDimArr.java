public class TwoDimArr {
    void MultiDimArr() {
        String[][] names = {
            {"Srushti", "Akanksha", "Sayali"},
            {"Patil", "Pawshe", "Ghode"}
        };

        // Using two loops to print first name + last name
        for (int i = 0; i < names[0].length; i++) { // Loop over first row
            for (int j = 0; j < names.length; j++) { // Loop over both rows
                System.out.print(names[j][i] + " "); // Print names in a row
            }
            System.out.println(); // Move to the next line after one full name
        }
    }

    public static void main(String args[]) {
        // Creating an object since MultiDimArr() is non-static
        TwoDimArr obj = new TwoDimArr();
        obj.MultiDimArr();
    }
}
