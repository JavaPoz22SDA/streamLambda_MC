public class Track {
    private String name;
    private int length;

    public Track(String name, int time) {
        this.name = name;
        this.length = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int time) {
        this.length = time;
    }
}
