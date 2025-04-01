class Zip {
    int id;
    String name;
    double size; 
    String compressionType;
    boolean isEncrypted;
    boolean hasPassword;
    int numberOfFiles;
    String createdBy;
    String dateCreated;
    String format;

    public Zip(int id, String name, double size, String compressionType, boolean isEncrypted, boolean hasPassword, 
               int numberOfFiles, String createdBy, String dateCreated, String format) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.compressionType = compressionType;
        this.isEncrypted = isEncrypted;
        this.hasPassword = hasPassword;
        this.numberOfFiles = numberOfFiles;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.format = format;
    }

    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Size: " + size + " MB");
        System.out.println("Compression Type: " + compressionType);
        System.out.println("Is Encrypted: " + isEncrypted);
        System.out.println("Has Password: " + hasPassword);
        System.out.println("Number of Files: " + numberOfFiles);
        System.out.println("Created By: " + createdBy);
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Format: " + format);
        System.out.println("---------------------------");
}
}
