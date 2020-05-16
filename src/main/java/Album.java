public class Album {
    private String name;
    private int numberOfTrack;

    public Album(String name, int numberOfTrack) {
        this.name = name;
        this.numberOfTrack = numberOfTrack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTrack() {
        return numberOfTrack;
    }

    public void setNumberOfTrack(int numberOfTrack) {
        this.numberOfTrack = numberOfTrack;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", numberOfTrack=" + numberOfTrack +
                '}';
    }
}
