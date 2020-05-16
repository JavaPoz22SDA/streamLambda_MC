import java.util.Comparator;
import java.util.List;
import java.util.Optional;


import static java.util.Arrays.asList;

public class MaxMin {
    public static void main(String[] args) {
        List<Track> tracks = asList(new Track("Bakai", 524),
                new Track("Violets for Your Furs", 378),
                new Track("Time Was", 451));

        Optional<Track> max = tracks.stream().max(Comparator.comparingInt(Track::getLength));
        System.out.println("Największy czas: " + max.get().getName());
        Optional<Track> max1 = tracks.stream().max(Comparator.comparingInt((it) -> it.getLength()));


        Optional<Track> min = tracks.stream().min(Comparator.comparingInt(Track::getLength));
        System.out.println("Najmniejszy czas: " + min.get().getName());




    }

}


