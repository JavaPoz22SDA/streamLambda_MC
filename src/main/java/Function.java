import javax.lang.model.type.ArrayType;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Function {


    public static List<String> getNamesAndOrigins(List<Artist> artists){
        Stream<String> stream1 = artists.stream().flatMap((v) -> Stream.of(v.getName(),v.getNationality()));
//        List<String> list = new ArrayList<>();
//        for (Artist a : artists) {
//            list.add(a.getName());
//            list.add(a.getNationality());
//        }

        return stream1.collect(Collectors.toList());
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        Stream<Album> stream = input.stream().filter(v -> v.getNumberOfTrack() <= 3);
        return stream.collect(Collectors.toList());
    }
    public static int countBandMembersInternal(List<Artist> artists) {
        int members = artists.stream().map(v -> v.getMembers()).reduce(0, (t, element) -> t + element);
        return members;
    }


    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("John Coltrane", "US", 1));
        artists.add(new Artist("John Lennon", "UK",1));
        artists.add(new Artist("The Beatles", "UK",5));
        System.out.println(Function.getNamesAndOrigins(artists));

        List<Album> albums = new ArrayList<>();
        albums.add(new Album("album1",20));
        albums.add(new Album("album2",2));
        albums.add(new Album("album3",3));
        albums.add(new Album("album4",10));
        albums.add(new Album("album5",1));

        System.out.println(Function.getAlbumsWithAtMostThreeTracks(albums).toString());

        System.out.println(Function.countBandMembersInternal(artists));
        Stream <List<Artist>> stringStream = Stream.of(artists);
        System.out.println(Arrays.toString(stringStream.toArray()));

    }

}
