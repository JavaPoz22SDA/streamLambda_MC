public class Artist {
    private String name;
    private String nationality;
    private int members;

    public Artist(String name, String nationality, int members) {
        this.name = name;
        this.nationality = nationality;
        this.members = members;

    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getMembers() {
        return members;
    }
}
