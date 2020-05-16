import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Refactor {
//    public Set<String> findLongTracks(List<Album> albums) {
//        Set<String> trackNames = new HashSet<>();
//        for(Album album : albums) {
//            for (Track track : album.getTrackList()) {
//                if (track.getLength() > 60) {
//                    String name = track.getName();
//                    trackNames.add(name);
//                }
//            }
//        }
//        return trackNames;
//    }

    public Set<String> findLongTracks(List<Albums> albums) {
        return albums.stream().flatMap(album -> album.getTrackList().stream()).
                filter(track -> track.getLength() > 60).map(track -> track.getName()).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Track> listOfTracks = List.of(new Track("track1", 200), new Track("track2", 40),
                new Track("track3",70));
        Albums album1 = new Albums("album1", listOfTracks);
        List<Track> listOfTracks2 = List.of(new Track("track21", 50), new Track("track22", 61),
                new Track("track23",10));
        Albums album2 = new Albums("album2", listOfTracks2);
        List<Track> listOfTracks3 = List.of(new Track("track31", 20), new Track("track32", 40),
                new Track("track33",70));
        Albums album3 = new Albums("album3", listOfTracks3);

        List<Albums> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        Set<String> set = new Refactor().findLongTracks(albums);
        System.out.println(set);

    }
}
class Albums {
    private String name;
    private List<Track> trackList;

    public Albums(String name, List<Track> trackList) {
        this.name = name;
        this.trackList = trackList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}

