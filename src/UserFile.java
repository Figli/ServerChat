import java.io.Serializable;



public class UserFile implements Serializable {

    private static final long serialVersionUID = 1L;

    public byte[] uFile = null;
    String uFileName = null;

    public UserFile(String name, byte[] file) {
        this.uFileName = name;
        this.uFile = file;
    }
}